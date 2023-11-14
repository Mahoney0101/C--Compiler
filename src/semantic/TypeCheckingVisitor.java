package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public <TP, TR> TR visit(WriteStatement writeStatement, TP param) {
        writeStatement.getExpression().accept(this, null);
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
    public <TP, TR> TR visit(ReadStatement readStatement, TP param) {
        readStatement.getExpression().accept(this, null);

        if (!readStatement.getExpression().isLValue())
            new ErrorType("Read Statements must be provided valid l-value", readStatement.getExpression());
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
    public <TP, TR> TR visit(CastExpression exp, TP param) {
        exp.getExpression().accept(this,null);
        exp.setType(exp.getExpression().getType().cast(exp.getTargetType(), exp));
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
        for (Expression ex: functionCallExpression.getArguments()) {
            ex.accept(this,null);
        }

        functionCallExpression.setType(
                functionCallExpression.getFunctionName().getDefinition().getType().comparison(
                        functionCallExpression.getFunctionName().getDefinition().getType(), functionCallExpression));

        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param) {

        functionCallStatement.getFunctionCallExpression().accept(this, null);

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

        funcDecl.getType().equivalent(funcDecl.getFunctionType().getReturnType(), funcDecl);

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
            new ErrorType("Conditions for while statements most be integer values", condition);
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
            new ErrorType("Conditions for if statements most be integer values", condition);
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
    public <TP, TR> TR visit(ArrayAccessExpression exp, TP param) {

        exp.getOperand1().accept(this, null);
        exp.getOperand2().accept(this, null);

        exp.setType(exp.getOperand1().getType().squareBrackets(exp.getOperand2().getType(), exp));

        return null;
    }

    @Override
    public <TP, TR> TR visit(StructFieldAccessExpression exp, TP param) {
        exp.getStructure().accept(this, null);
        exp.setType(exp.getDefinition().getType());

        return null;
    }
}
