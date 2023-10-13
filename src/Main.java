import errorlistener.Listener;
import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import org.antlr.v4.runtime.*;
import parser.CmmLexer;
import parser.CmmParser;

import org.antlr.v4.gui.Trees;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			String file = "input.txt";

			CharStream input = CharStreams.fromFileName(file);
			CmmLexer lexer = new CmmLexer(input);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CmmParser parser = new CmmParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(new Listener());

			CmmParser.ProgramContext tree = parser.program();
			Program ast = tree.ast;

			Trees.inspect(tree, parser);

			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
