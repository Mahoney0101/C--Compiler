package codegenerator;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public <TP, TR> TR visit(Program program, TP param) {
        for (Definition def : program.getdefinitions()) {
            def.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(LogicalExpression logicalExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionDeclaration functionDeclaration, TP param) {
        for (VarDeclaration var : functionDeclaration.getFunctionType().getParameters()) {
            var.accept(this, null);
        }

        for (VarDeclaration var : functionDeclaration.getVars()) {
            var.accept(this, null);
        }

        for (Statement stmt : functionDeclaration.getStatements()) {
            stmt.accept(this, null);
        }



        return null;
    }

    @Override
    public <TP, TR> TR visit(ArrayAccessExpression exp, TP param) {

        exp.getOperand1().accept(this, null);
        exp.getOperand2().accept(this, null);

        return null;
    }

    @Override
    public <TP, TR> TR visit(StructType struct, TP param) {

        for (VarDeclaration field: struct.getFields()) {
            field.accept(this,null);
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(StructFieldAccessExpression exp, TP param) {
        exp.getStructure().accept(this, null);
        exp.accept(this, null);
        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(VarDeclaration var, TP2 param) {
        if(var.getType() instanceof  ArrayType){
            ((ArrayType) var.getType()).getBaseType().accept(this, null);
        }
        var.getType().accept(this, null);
        var.setOffset(var.getType().numberOfBytes());
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
    public <TP2, TR2> TR2 visit(ReturnStatement returnStatement, TP2 param) {
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
    public <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(VariableExpression variable, TP param) {
        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(AssignmentStatement assignment, TP2 param) {
        return null;
    }


    @Override
    public <TP, TR> TR visit(EqualityExpression logical, TP param) {
        return null;
    }
}
