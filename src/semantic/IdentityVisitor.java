package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;
import visitor.*;

public class IdentityVisitor extends AbstractVisitor<Void, Void> {

    private final SymbolTable symbolTable;

    @Override
    public <TP, TR> TR visit(VarDeclaration varDecl, TP param) {
        if(!symbolTable.insert(varDecl)) {
            System.out.println("Symbol already exists: " + varDecl.getName());
        }
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
            System.out.println("Function symbol already exists: " + funcDecl.getFunctionName());
        }
        symbolTable.set(); // Enter a new scope

        for (VarDeclaration var : funcDecl.getFunctionType().getParameters()) {
            System.out.println("Adding param variables: " + funcDecl.getFunctionType().getParameters());
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
            System.out.println("Setting definition for: "+ variable.getName());
            variable.setDefinition(definition);
        } else {
            System.err.println("Variable not declared: " + variable.getName());
        }
        return null;
    }

    @Override
    public <TP, TR> TR visit(WriteStatement write, TP param) {
        System.out.println("Here: "+write.getExpression());

        write.getExpression().accept(this, null);
        return null;
    }

    @Override
    public <TP, TR> TR visit(ReturnStatement returnStatement, TP param) {
        System.out.println("Here: "+returnStatement.getExpression());
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
            System.out.println("Setting definition for: "+ functionCallExpression.getFunctionName());
            functionCallExpression.getFunctionName().setDefinition(definition);
        } else {
            System.err.println("Variable not declared: " + functionCallExpression.getFunctionName());
        }

        return null;
    }


    @Override
    public <TP2, TR2> TR2 visit(Definition defintion, TP2 param) {
        return null;
    }

    @Override
    public <TP2, TR2> TR2 visit(AssignmentStatement assignment, TP2 param) {
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
    public <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param) {
        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteral, Void param) {
        return null;
    }

    @Override
    public Void visit(EqualityExpression logical, Void param) {
        return null;
    }

    @Override
    public Void visit(CastExpression castExpression, Void param) {
        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement, Void param) {
        return null;
    }

    @Override
    public Void visit(ReadStatement readExpression, Void param) {
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionCallStatement functionCallStatement, Void param) {
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
    public Void visit(StructType structType, Void param) {
        return null;
    }

    @Override
    public Void visit(StructFieldAccessExpression structFieldAccessExpression, Void param) {
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration, Void param) {
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
