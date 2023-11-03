package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import errorlistener.ErrorHandler;
import types.*;
import visitor.*;

public class IdentityVisitor extends AbstractVisitor<Void, Void> {

    private final SymbolTable symbolTable;

    @Override
    public <TP, TR> TR visit(VarDeclaration varDecl, TP param) {
        if(!symbolTable.insert(varDecl)) {
            String errorMsg = "\"VarDeclaration symbol already exists: " + varDecl.getName() +
                    ": Line: " + varDecl.getLine() + " and column: "
                    + varDecl.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, varDecl);
            ErrorHandler.getErrorHandler().addError(error);
        }

        if(varDecl.getType() instanceof  ArrayType){
            ((ArrayType) varDecl.getType()).getBaseType().accept(this, null);
        }
        varDecl.getType().accept(this, null);

        return null;
    }

    public IdentityVisitor() {
        this.symbolTable = new SymbolTable();
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
        if(!symbolTable.insert(funcDecl)) {
            String errorMsg = "\"Function symbol already exists: " + funcDecl.getFunctionName() +
                    ": Line: " + funcDecl.getLine() + " and column: "
                    + funcDecl.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, funcDecl);
            ErrorHandler.getErrorHandler().addError(error);
        }
        symbolTable.set();

        for (VarDeclaration var : funcDecl.getFunctionType().getParameters()) {
            var.accept(this, null);
        }

        for (VarDeclaration var : funcDecl.getVars()) {
            var.accept(this, null);
        }

        for (Statement stmt : funcDecl.getStatements()) {
            stmt.accept(this, null);
        }

        symbolTable.reset();
        return null;
    }

    @Override
    public <TP, TR> TR  visit(VariableExpression variable, TP param) {
        Definition definition = symbolTable.find(variable.getName());
        if (definition != null) {
            variable.setDefinition(definition);
        } else {
            String errorMsg = "Variable not declared: " + variable.getName() +
                    ": Line: " + variable.getLine() + " and column: "
                    + variable.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, variable);
            ErrorHandler.getErrorHandler().addError(error);
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(WriteStatement write, TP param) {
        write.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ReturnStatement returnStatement, TP param) {
        returnStatement.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        arithmeticExpression.getOperand1().accept(this,null);
        arithmeticExpression.getOperand2().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param) {
        Definition definition = symbolTable.find(functionCallExpression.getFunctionName().getName());
        if (definition != null) {
            functionCallExpression.getFunctionName().setDefinition(definition);
        } else {
            String errorMsg = "Variable not declared: " + functionCallExpression.getFunctionName() +
                    ": Line: " + functionCallExpression.getLine() + " and column: "
                    + functionCallExpression.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, functionCallExpression);
            ErrorHandler.getErrorHandler().addError(error);
        }

        return null;
    }


    @Override
    public <TP2, TR2> TR2 visit(AssignmentStatement assignment, TP2 param) {
        assignment.getLeftHandSide().accept(this, null);
        assignment.getRightHandSide().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(EqualityExpression logical, TP param) {
        logical.getOperand1().accept(this, null);
        logical.getOperand2().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(IfStatement ifStatement, TP param) {

        ifStatement.getCondition().accept(this,null);

        for (Statement stmt : ifStatement.getIfBlockStatements()) {
            stmt.accept(this, null);
        }

        for (Statement stmt : ifStatement.getElseBlockStatements()) {
            stmt.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(WhileStatement whileStatement, TP param) {

        whileStatement.getCondition().accept(this,null);

        for (Statement stmt : whileStatement.getStatements()) {
            stmt.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(ArrayAccessExpression arrayAccessExpression, TP param) {

        arrayAccessExpression.getOperand1().accept(this, null);
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
    public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccessExpression, TP param) {

        Definition definition = symbolTable.find(structFieldAccessExpression.getNestedField());
        if (definition != null) {
            structFieldAccessExpression.setDefinition(definition);
        } else {
            String errorMsg = "StructField not declared: " + structFieldAccessExpression.getNestedField() +
                    ": Line: " + structFieldAccessExpression.getLine() + " and column: "
                    + structFieldAccessExpression.getColumn() + ".";
            ErrorType error = new ErrorType(errorMsg, structFieldAccessExpression);
            ErrorHandler.getErrorHandler().addError(error);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(CastExpression castExpression, TP param) {

        castExpression.getExpression().accept(this,null);

        return null;
    }

    @Override
    public <TP, TR> TR visit(ReadStatement readStatement, TP param) {

        readStatement.getExpression().accept(this,null);

        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param) {

        functionCallStatement.getFunctionCallExpression().accept(this, null);
        return null;
    }

    @Override
    public Void visit(LogicalNegationExpression logicalNegation, Void param) {
        return null;
    }

    @Override
    public Void visit(UnaryMinusExpression unaryMinus, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleLiteralExpression doubleLiteral, Void param) {
        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteral, Void param) {
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
    public Void visit(LogicalExpression logicalExpression, Void param) {
        return null;
    }
}
