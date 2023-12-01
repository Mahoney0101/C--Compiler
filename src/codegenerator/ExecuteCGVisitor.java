package codegenerator;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;

	private ValueCGVisitor valueCGVisitor;

	public ExecuteCGVisitor(CG cg) {
		super(cg);
		this.valueCGVisitor = new ValueCGVisitor(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}

	@Override
    public <TP, TR> TR visit(WriteStatement write, TP param) {
		cg.comment("Write");
		write.getExpression().accept(this.valueCGVisitor,null);
		cg.output(write.getExpression().getType());
		return null;
	}

    @Override
    public <TP, TR> TR visit(ReadStatement read, TP param) {
        cg.comment("Read");

        Expression variable = read.getExpression();
        variable.accept(this.addressCGVisitor, null);

        cg.input(variable.getType());
        cg.store(variable.getType());

        return null;
    }

	@Override
    public <TP, TR> TR visit(Program program, TP param) {
		// * Global variables
		cg.comment("Variable definitions");
		program.getdefinitions().forEach(def -> def.accept(this, null));
		cg.newLine();
        //program.getdefinitions().forEach(def -> def.accept(this, null));

//        program.getStatements().forEach(stmt -> {
//			cg.line(stmt);
//			stmt.accept(this, null);
//			});
		return null;
	}

	@Override
    public <TP, TR> TR visit(VarDeclaration varDefinition, TP param) {
		cg.declaration(varDefinition);
		return null;
	}

	@Override
    public <TP, TR> TR visit(AssignmentStatement assignment, TP param) {
		cg.comment("Assignment");
        assignment.getLeftHandSide().accept(this.addressCGVisitor, null); // * lvalue

        System.out.println(assignment.getRightHandSide().getType().toString());

        assignment.getRightHandSide().accept(this.valueCGVisitor, null); // * rvalue
		cg.store(assignment.getLeftHandSide().getType());
		return null;
	}


    @Override
    public <TP, TR> TR visit(CharLiteralExpression charLiteralExpression, TP param) {
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
        functionDeclaration.getVars().forEach(stmt -> {
            cg.line(stmt);
            stmt.accept(this, null);
        });
        functionDeclaration.getFunctionType().getParameters().forEach(stmt -> {
            cg.line(stmt);
            stmt.accept(this, null);
        });
        functionDeclaration.getStatements().forEach(stmt -> {
			cg.line(stmt);
			stmt.accept(this, null);
			});
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
