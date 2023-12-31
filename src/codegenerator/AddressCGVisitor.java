package codegenerator;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CG cg;
    private ExecuteCGVisitor executeVisitor;

    public AddressCGVisitor(CG cg, ExecuteCGVisitor executeVisitor) {
        super(cg);
        this.cg = cg;
        this.executeVisitor = executeVisitor;
    }

    @Override
    public <TP, TR> TR visit(VariableExpression variable, TP param) {
        var type = variable.getType();
        if (type instanceof ArrayType) {
            type.accept(this, null);
            type = ((ArrayType) type).getBaseType();
        }

        if (((VarDeclaration) variable.getDefinition()).getScope() == 0) {
            cg.pushAddress(variable);
        } else if (((VarDeclaration) variable.getDefinition()).getScope() == 1) {
            cg.pushbp();
            cg.push(((VarDeclaration) variable.getDefinition()).getOffset());

            cg.add(IntType.getInstance());
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(ArithmeticExpression arithmeticExpr, TP param) {
        arithmeticExpr.getOperand1().accept(this, null);

        arithmeticExpr.getOperand2().accept(this, null);

        cg.arithmetic(arithmeticExpr.getOperator(), arithmeticExpr.getType());

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
        arrayAccess.getOperand1().accept(this, null);

        arrayAccess.getOperand2().accept(this.executeVisitor.getValueCGVisitor(), null);

        cg.push(arrayAccess.getType().numberOfBytes());
        cg.mul(IntType.getInstance());
        cg.add(IntType.getInstance());

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
    public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccess, TP param) {
        structFieldAccess.getStructure().accept(this, null);

        int offset = structFieldAccess.getDefinition().getType().numberOfBytes();
        cg.push(offset);
        cg.add(IntType.getInstance());

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
    public <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param) {
        cg.push(intLiteral.value);
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
    public <TP, TR> TR visit(UnaryMinusExpression unaryMinusExpression, TP param) {
        return null;
    }
}
