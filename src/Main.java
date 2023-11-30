import codegenerator.CG;
import codegenerator.ExecuteCGVisitor;
import errorlistener.ErrorHandler;
import errorlistener.Listener;
import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import org.antlr.v4.runtime.*;
import parser.CmmLexer;
import parser.CmmParser;

import semantic.IdentityVisitor;
import semantic.LValueVisitor;
import codegenerator.OffsetVisitor;
import semantic.TypeCheckingVisitor;

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


			ast.accept(new LValueVisitor(), null);
			ast.accept(new IdentityVisitor(), null);
			ast.accept(new TypeCheckingVisitor(), null);

			if (ErrorHandler.getErrorHandler().anyError()) {
				ErrorHandler.getErrorHandler().showErrors(System.err);
				System.err.println("Program with semantic errors, no code will be generated");
			}
			else {
				ast.accept(new OffsetVisitor(), null);
				ast.accept(new ExecuteCGVisitor(new CG("output.txt", "input.txt")), null);
			}
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
