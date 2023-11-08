package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;
import visitor.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor<Type, Void> {

    @Override
    public <TP, TR> TR visit(Program program, TP param) {
        for (Definition def : program.getdefinitions()) {
            def.accept(this, null);
        }
        return null;
    }
    @Override
    public <TP, TR> TR  visit(VarDeclaration var, TP param) {

        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(ReturnStatement returnStatement, TP2 param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(WhileStatement whileStatement, TP param) {
        return null;
    }


    @Override
    public <TP, TR> TR visit(FunctionDeclaration functionDeclaration, TP param) {
        for (VarDeclaration var : functionDeclaration.getVars()) {
            var.accept(this, null);
        }
        for (Statement statement: functionDeclaration.getStatements()) {
            statement.accept(this, null);
        }
        return null;
    }

    @Override
    public <TP, TR> TR  visit(VariableExpression variable, TP param) {
        variable.setLValue(true);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ArrayAccessExpression node, TP param) {
        node.setLValue(true);
        return null;
    }


    @Override
    public <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        arithmeticExpression.setLValue(false);
        return null;
    }

    @Override
    public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccessExpression, TP param) {
        structFieldAccessExpression.setLValue(true);
        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(LogicalExpression logicalExpression, TP2 param) {
        return null;
    }

    @Override
    public  <TP, TR> TR visit(AssignmentStatement assignment, TP param) {
        assignment.getLeftHandSide().accept(this, null);
        if (!assignment.getLeftHandSide().isLValue()) {
            new ErrorType("The expression is not a valid l-value", assignment.getLeftHandSide());
        }
        return null;
    }

    @Override
    public <TP, TR> TR  visit(IntLiteralExpression intLiteral, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(WriteStatement write, TP param) {

        write.getExpression().accept(this, null);
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
    public <TP, TR> TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(IntType intType, TP param) {
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

    @Override
    public <TP, TR> TR  visit(DoubleLiteralExpression doubleLiteral, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(EqualityExpression logical, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(ReadStatement readExpression, TP param) {

        readExpression.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(IfStatement ifStatement, TP param) {
        return null;
    }
}

