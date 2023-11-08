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
            new ErrorType(errorMsg, varDecl);
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
            new ErrorType("Function already declared", funcDecl);
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
            new ErrorType("Variable not declared", variable);
        }
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
            new ErrorType("Function not declared", functionCallExpression);
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
    public <TP, TR> TR visit(LogicalExpression logicalExpression, TP param) {
        logicalExpression.getOperand1().accept(this, null);
        logicalExpression.getOperand2().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(LogicalNegationExpression logicalNegation, TP param) {

        logicalNegation.getOperand().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(IfStatement ifStatement, TP param) {

        ifStatement.getCondition().accept(this,null);

        for (Statement stmt : ifStatement.getIfBlockStatements()) {
            stmt.accept(this, null);
        }

        if(!ifStatement.getElseBlockStatements().isEmpty()) {
            for (Statement stmt : ifStatement.getElseBlockStatements()) {
                stmt.accept(this, null);
            }
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
        arrayAccessExpression.getOperand2().accept(this, null);
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
        structFieldAccessExpression.getStructure().accept(this,null);
        if (definition != null) {
            structFieldAccessExpression.setDefinition(definition);
        } else {
            new ErrorType("StructField not declared.", structFieldAccessExpression);
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

}
