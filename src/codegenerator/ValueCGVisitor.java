package codegenerator;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	private CG cg;
	private ExecuteCGVisitor executeVisitor;

	private boolean isReturnValueUsed = false;

	public void setReturnValueUsage(boolean usage) {
		this.isReturnValueUsed = usage;
	}

	public ValueCGVisitor(CG cg, ExecuteCGVisitor executeVisitor) {
		super(cg);
		this.cg = cg;
		this.executeVisitor = executeVisitor;
	}

	@Override
	public <TP, TR> TR visit(ArithmeticExpression arithmetic, TP param) {
		setReturnValueUsage(true);
		Expression operand1 = arithmetic.getOperand1();
		Expression operand2 = arithmetic.getOperand2();
		if (operand1 instanceof CharLiteralExpression) {
			operand1.accept(this, null);
			cg.castCharToInt();
		} else {
			operand1.accept(this, null);
		}

		if (operand2 instanceof CharLiteralExpression) {
			operand2.accept(this, null);
			cg.castCharToInt();
		} else {
			operand2.accept(this, null);
		}

		cg.arithmetic(arithmetic.getOperator(), arithmetic.getType());
		setReturnValueUsage(false);
		return null;
	}

	@Override
	public <TP, TR> TR visit(VariableExpression variable, TP param) {
		variable.accept(this.executeVisitor.getAddressCGVisitor(), null);
		var type = variable.getType();
		if (type instanceof ArrayType) {
			type.accept(this, null);
			type = IntType.getInstance();
		}
		cg.load(type);
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
		logicalNegation.getOperand().accept(this, null);
		cg.not();

		return null;
	}

	@Override
	public <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param) {
		arrayAccess.accept(this.executeVisitor.getAddressCGVisitor(), null);
		var type = arrayAccess.getType();
		if (type instanceof ArrayType) {
			type.accept(this, null);
			type = ((ArrayType) type).getBaseType();
		}
		cg.load(type);
		return null;
	}

	@Override
	public <TP, TR> TR visit(EqualityExpression logical, TP param) {
		setReturnValueUsage(true);
		logical.getOperand1().accept(this, null);
		logical.getOperand2().accept(this, null);
		setReturnValueUsage(false);
		cg.relational(logical.getOperator(), logical.getOperand1().getType());

		return null;
	}

	@Override
	public <TP, TR> TR visit(CastExpression castExpression, TP param) {
		castExpression.getExpression().accept(this, null);

		Type currentType = castExpression.getExpression().getType();
		Type targetType = castExpression.getTargetType();

		if (currentType instanceof IntType && targetType instanceof DoubleType) {
			cg.castIntToDouble();
		} else if (currentType instanceof IntType && targetType instanceof CharType) {
			cg.castIntToChar();
		} else if (currentType instanceof DoubleType && targetType instanceof IntType) {
			cg.castDoubleToInt();
		} else if (currentType instanceof CharType && targetType instanceof DoubleType) {
			cg.castCharToInt();
			cg.castIntToDouble();
		} else if (currentType instanceof CharType && targetType instanceof IntType) {
			cg.castCharToInt();
		}
		return null;
	}

	@Override
	public <TP, TR> TR visit(ReturnStatement returnStmt, TP param) {
		returnStmt.getExpression().accept(this, null);

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
	public <TP, TR> TR visit(FunctionCallExpression functionCall, TP param) {

		for (Expression arg : functionCall.getArguments()) {
			arg.accept(this, null);
		}

		cg.call(functionCall.getFunctionName().getName());

		Type returnType = ((FunctionDeclaration) functionCall.getFunctionName().getDefinition()).getFunctionType()
				.getReturnType();

		if (!(returnType instanceof VoidType) && !isReturnValueUsed) {
			cg.pop(((FunctionDeclaration) functionCall.getFunctionName().getDefinition()).getFunctionType()
					.getReturnType());
		}

		return null;
	}


	@Override
	public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param) {
		functionCallStatement.getFunctionCallExpression().accept(this, null);
		return null;
	}

	@Override
	public <TP, TR> TR visit(StructType structType, TP param) {
		return null;
	}

	@Override
	public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccess, TP param) {
		structFieldAccess.accept(this.executeVisitor.getValueCGVisitor(), null);

		Type fieldType = structFieldAccess.getDefinition().getType();
		cg.load(fieldType);

		return null;
	}

	@Override
	public <TP, TR> TR visit(LogicalExpression logicalExpression, TP param) {
		setReturnValueUsage(true);
		logicalExpression.getOperand1().accept(this, null);
		logicalExpression.getOperand2().accept(this, null);
		setReturnValueUsage(false);

		cg.logical(logicalExpression.getOperator());

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
