package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import errorlistener.ErrorHandler;
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
    public  <TP, TR> TR visit(AssignmentStatement assignment, TP param) {
        assignment.getLeftHandSide().accept(this, null);
        if (!assignment.getLeftHandSide().isLValue()) {
            String errorMsg = "The expression on the left-hand side of the assignment at line: " +
                    assignment.getLine() + " and column: " +
                    assignment.getColumn() + " is not a valid l-value.";
            ErrorType error = new ErrorType(errorMsg, assignment);
            ErrorHandler.getErrorHandler().addError(error);
        }
        return null;
    }

    @Override
    public Void visit(IntLiteralExpression intLiteral, Type param) {
        return null;
    }

    @Override
    public Void visit(RealLiteralExpression realLiteral, Type param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(WriteStatement write, TP param) {
        return null;
    }


    @Override
    public <TP, TR> TR visit(Definition defintion, TP param){
        return null;
    }

    @Override
    public Void visit(IntType intType, Type param) {
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Type param) {
        return null;
    }

    @Override
    public Void visit(LogicalNegationExpression logicalNegation, Type param) {
        return null;
    }

    @Override
    public Void visit(UnaryMinusExpression unaryMinus, Type param) {
        return null;
    }

    @Override
    public Void visit(DoubleLiteralExpression doubleLiteral, Type param) {
        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteral, Type param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(EqualityExpression logical, TP param) {
        return null;
    }

    @Override
    public Void visit(ReadStatement readExpression, Type param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(IfStatement ifStatement, TP param) {
        return null;
    }

    @Override
    public Void visit(FunctionCallStatement functionCallStatement, Type param) {
        return null;
    }

    @Override
    public Void visit(CharType charType, Type param) {
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Type param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Type param) {
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Type param) {
        return null;
    }

    @Override
    public Void visit(Parameter parameter, Type param) {
        return null;
    }


    @Override
    public Void visit(LogicalExpression logicalExpression, Type param) {
        return null;
    }
}

