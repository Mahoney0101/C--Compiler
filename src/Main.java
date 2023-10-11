import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.CmmLexer;
import parser.CmmParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.gui.Trees;

public class Main {
			public static void main(String[] args) throws Exception {
				String file = "C:\\Users\\hoooc\\IdeaProjects\\lab4_syntax_recognition\\input.txt";

				// Create a lexer that feeds off of input CharStream
				CharStream input = CharStreams.fromFileName(file);
				CmmLexer lexer = new CmmLexer(input);

				// Create a parser that feeds off the tokens buffer
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				CmmParser parser = new CmmParser(tokens);

				// Start parsing at the 'program' rule
				CmmParser.ProgramContext tree = parser.program();

				// Convert Parse tree to DOT language and visualize it.
				String dotString = toDot(tree, parser);
				System.out.println(dotString);

				saveDotToFile(dotString, "output.dot");
				Trees.inspect(tree, parser);
			}

	// ... (other methods as previously provided) ...

	/**
	 * Saves the DOT language representation to a file.
	 *
	 * @param dotString The DOT language representation string.
	 * @param filePath The file path to save the DOT string.
	 */
	public static void saveDotToFile(String dotString, String filePath) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(dotString);
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}

			/**
			 * Converts a parse tree to the DOT language representation
			 * for visualization with tools like Graphviz.
			 */
			public static String toDot(ParseTree tree, Parser parser) {
				StringBuilder builder = new StringBuilder();
				builder.append("digraph ParseTree {\n");
				traverse(tree, builder, 0, parser);
				builder.append("}\n");
				return builder.toString();
			}

			/**
			 * Recursive function to traverse the parse tree and generate
			 * DOT language representation.
			 */
			private static int traverse(ParseTree tree, StringBuilder builder, int index, Parser parser) {
				int currentIndex = index++;
				String nodeName = getNodeName(tree, parser);
				builder.append("  ").append(currentIndex).append(" [label=\"").append(nodeName).append("\"];\n");

				for (int i = 0; i < tree.getChildCount(); i++) {
					ParseTree child = tree.getChild(i);
					int childIndex = index++;
					builder.append("  ").append(currentIndex).append(" -> ").append(childIndex).append(";\n");
					index = traverse(child, builder, index, parser);
				}

				return index;
			}

			/**
			 * Extracts the node name from the parse tree for visualization.
			 */
			private static String getNodeName(ParseTree tree, Parser parser) {
				if (tree instanceof TerminalNode) {
					Token token = ((TerminalNode) tree).getSymbol();
					return token.getText();
				} else {
					String ruleName = parser.getRuleNames()[((RuleNode) tree).getRuleContext().getRuleIndex()];
					return ruleName;
				}
			}
		}
