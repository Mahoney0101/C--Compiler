package codegenerator;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.ArrayType;
import types.CharType;
import types.StructType;
import types.VoidType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;

	public ValueCGVisitor(CG cg) {
		super(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}

	@Override
    public <TP, TR> TR visit(ArithmeticExpression arithmetic, TP param) {
		arithmetic.getOperand1().accept(this, null);
		arithmetic.getOperand2().accept(this, null);
		cg.arithmetic(arithmetic.getOperator(), arithmetic.getType());
		return null;
	}

	@Override
    public <TP, TR> TR visit(VariableExpression variable, TP param) {
		variable.accept(this.addressCGVisitor, null);
		cg.load(variable.getType());
		return null;
	}

	@Override
    public <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param) {
		cg.push(intLiteral.value);
		return null;
	}

	@Override
    public <TP, TR> TR visit(DoubleLiteralExpression realLiteral, TP param) {
		cg.push(realLiteral.value);
		return null;
	}

	@Override
	public <TP, TR> TR visit(CharLiteralExpression charLiteralExpression, TP param) {
		cg.push(charLiteralExpression.value);
		return null;
	}

	@Override
	public <TP, TR> TR visit(LogicalNegationExpression logicalNegation, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(EqualityExpression logical, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(CastExpression castExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(ReturnStatement returnStatement, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(WhileStatement whileStatement, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(ReadStatement readExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(IfStatement ifStatement, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(StructType structType, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(StructFieldAccessExpression nestedStructFieldExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(LogicalExpression logicalExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(FunctionDeclaration functionDeclaration, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(RealLiteralExpression realLiteralExpression, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(ArrayType arrayType, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(CharType charType, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(VoidType voidType, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(Parameter parameter, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(UnaryMinusExpression unaryMinusExpression, TP param) {
		return null;
	}
}
