package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import errorlistener.ErrorHandler;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public <TP, TR> TR visit(WriteStatement writeStatement, TP param) {
        writeStatement.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ReadStatement readStatement, TP param) {
        readStatement.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(AssignmentStatement assignment, TP param) {
        assignment.getLeftHandSide().accept(this,null);
        assignment.getRightHandSide().accept(this,null);
        assignment.getLeftHandSide().getType()
                .assignment(assignment.getRightHandSide().getType(), assignment);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ArithmeticExpression exp, TP param) {
        exp.getOperand1().accept(this,null);
        exp.getOperand2().accept(this,null);
        exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
        return null;
    }

    @Override
    public <TP, TR> TR visit(LogicalExpression exp, TP param) {
        exp.getOperand1().accept(this,null);
        exp.getOperand2().accept(this,null);
        exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
        return null;
    }

    @Override
    public <TP, TR> TR visit(LogicalNegationExpression exp, TP param) {
        exp.getOperand().accept(this, null);
        exp.setType(exp.getOperand().getType().arithmetic(exp.getOperand().getType(), exp));

        return null;
    }

    @Override
    public <TP, TR> TR visit(EqualityExpression exp, TP param) {
        exp.getOperand1().accept(this,null);
        exp.getOperand2().accept(this,null);

        if (exp.getOperand1().getType() != null && exp.getOperand2().getType() != null) {
            exp.setType(exp.getOperand1().getType().comparison(exp.getOperand2().getType(), exp));
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(VariableExpression variable, TP param) {

        if (variable.getDefinition() != null) {
            variable.setType(variable.getDefinition().getType());
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param) {
        intLiteral.setType(IntType.getInstance());
        return null;
    }

    @Override
    public <TP, TR> TR visit(DoubleLiteralExpression realLiteral, TP param) {
        realLiteral.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public <TP, TR> TR visit(CharLiteralExpression charLiteralExpression, TP param) {
        charLiteralExpression.setType(CharType.getInstance());
        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(Parameter parameter, Void param) {
        return null;
    }


    @Override
    public <TP, TR> TR visit(Program program, TP param) {
        for (Definition def : program.getdefinitions()) {
            def.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionDeclaration funcDecl, TP param) {

        for (VarDeclaration var : funcDecl.getFunctionType().getParameters()) {
            var.accept(this, null);
        }

        for (VarDeclaration var : funcDecl.getVars()) {
            var.accept(this, null);
        }

        for (Statement stmt : funcDecl.getStatements()) {
            stmt.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(ReturnStatement returnStatement, TP param) {
        returnStatement.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(VarDeclaration var, TP2 param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(WhileStatement whileStatement, TP param) {

        whileStatement.getCondition().accept(this,null);

        var condition = whileStatement.getCondition();
        if(condition.getType() != IntType.getInstance()){
            String errorMsg = "\"Conditions for while statements most be integer values: " + condition +
                    ": Line: " + condition.getLine() + " and column: "
                    + condition.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, condition);
            ErrorHandler.getErrorHandler().addError(error);
        }

        for (Statement statement :whileStatement.getStatements()) {
            statement.accept(this,null);
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(IfStatement ifStatement, TP param) {

        ifStatement.getCondition().accept(this, null);

        var condition = ifStatement.getCondition();
        if(condition.getType() != IntType.getInstance()){
            String errorMsg = "\"Conditions for if statements most be integer values: " + condition +
                    ": Line: " + condition.getLine() + " and column: "
                    + condition.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, condition);
            ErrorHandler.getErrorHandler().addError(error);
        }

        for (Statement statement : ifStatement.getIfBlockStatements()) {
            statement.accept(this,null);
        }

        for (Statement statement : ifStatement.getElseBlockStatements()) {
            statement.accept(this,null);
        }
        return null;
    }

    @Override
    public Void visit(UnaryMinusExpression unaryMinus, Void param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param) {
        return null;
    }
}
