package semantic;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import errorlistener.ErrorHandler;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

//    @Override
//    public Void visit(Arithmetic exp, Void param) {
//        exp.getOperand1().accept(this,null);
//        exp.getOperand2().accept(this,null);
//        exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
//        return null;
//    }
//
    @Override
    public <TP, TR> TR visit(VariableExpression variable, TP param) {
        System.out.println("variable typechecking");
        variable.setType(variable.getDefinition().getType());
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

//    @Override
//    public Void visit(Assignment assignment, Void param) {
//        assignment.getLeftHandSide().accept(this,null);
//        assignment.getRightHandSide().accept(this,null);
//        assignment.getLeftHandSide().getType()
//                .assignment(assignment.getRightHandSide().getType(), assignment);
//        return null;
//    }


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
    public Void visit(LogicalExpression logicalExpression, Void param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(Program program, TP param) {
        System.out.println("program typechecking");
        for (Definition def : program.getdefinitions()) {
            def.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR> TR visit(FunctionDeclaration funcDecl, TP param) {

        System.out.println("function type checking");
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
    public <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param) {
        return null;
    }

    @Override
    public <TP, TR> TR visit(EqualityExpression logical, TP param) {
        return null;
    }
}
