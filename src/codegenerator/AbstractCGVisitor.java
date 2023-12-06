package codegenerator;

import ast.expressions.ArithmeticExpression;
import ast.expressions.DoubleLiteralExpression;
import ast.expressions.IntLiteralExpression;
import ast.expressions.VariableExpression;
import ast.statements.AssignmentStatement;
import ast.statements.WriteStatement;
import types.*;
import visitor.Visitor;
import ast.*;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

	/**
	 * Handles the code generation responsibilities
	 */
	protected CG cg;

	public CG getCG() {
		return this.cg;
	}

	public AbstractCGVisitor(CG cg) {
		this.cg=cg;
	}
	
	@Override
	public <TP, TR> TR visit(VariableExpression variable, TP param) {
		throw new IllegalStateException("Code generation template \"Variable\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"IntLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(DoubleLiteralExpression realLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"RealLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public <TP, TR> TR visit(AssignmentStatement assignment, TP param) {
		throw new IllegalStateException("Code generation template \"Assignment\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(WriteStatement write, TP param) {
		throw new IllegalStateException("Code generation template \"Write\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(Program program, TP param) {
		throw new IllegalStateException("Code generation template \"Program\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(VarDeclaration varDefinition, TP param) {
		throw new IllegalStateException("Code generation template \"VarDefinition\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public <TP, TR> TR visit(IntType intType, TP param) {
		throw new IllegalStateException("Code generation template \"IntType\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public <TP, TR> TR visit(ErrorType errorType, TP param) {
		throw new IllegalStateException("Code generation template \"ErrorType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public <TP, TR> TR visit(DoubleType realType, TP param) {
		throw new IllegalStateException("Code generation template \"RealType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public <TP, TR> TR visit(ArithmeticExpression arithmetic, TP param) {
		throw new IllegalStateException("Code generation template \"Arithmetic\" not defined for the code function " +
				this.getClass().getName()); 
	}
}
