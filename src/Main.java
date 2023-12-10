import codegenerator.CG;
import codegenerator.ExecuteCGVisitor;
import errorlistener.ErrorHandler;
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
			if (args.length<2) {
				System.err.println("Please, pass me the input and output file names.");
				return;
			}

			CharStream input = CharStreams.fromFileName(args[0]);
			CmmLexer lexer = new CmmLexer(input);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CmmParser parser = new CmmParser(tokens);
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
				ast.accept(new ExecuteCGVisitor(new CG(args[1], args[0])), null);
			}
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorTree("Introspector", model);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
