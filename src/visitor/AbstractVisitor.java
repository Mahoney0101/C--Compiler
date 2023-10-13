//package visitor;
//
//import ast.FunctionDeclaration;
//import ast.MainFunctionDeclaration;
//import ast.Program;
//import ast.statements.*;
//import ast.expressions.*;
//import types.*;
//
//public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
//
//    @Override
//    public TR visit(Program program, TP param) {
//        for(VarDeclaration varDeclaration: program.getVarDefinitions())
//            varDeclaration.accept(this, param);
//        for(FunctionDeclaration functionDeclaration: program.getFunctionDefinitions())
//            functionDeclaration.accept(this, param);
//        for(Statement statement: program.getMainStatements().getFunctionBody().getStatements())
//            statement.accept(this, param);
//        return null;
//    }
//
//    @Override
//    public TR visit(VariableExpression variable, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(IntLiteralExpression intLiteral, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(RealLiteralExpression realLiteral, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(AssignmentStatement assignment, TP param) {
//        assignment.getLeftHandSide().accept(this, param);
//        assignment.getRightHandSide().accept(this, param);
//        return null;
//    }
//
//
//    @Override
//    public TR visit(VarDefinition varDefinition, TP param) {
//        varDefinition.getType().accept(this, param);
//        return null;
//    }
//
//
//    @Override
//    public TR visit(IntType intType, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(ErrorType errorType, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(RealType realType, TP param) {
//        return null;
//    }
//
//    @Override
//    public TR visit(ArithmeticExpression arithmeticExpression, TP param) {
//        arithmeticExpression.getOperand1().accept(this, param);
//        arithmeticExpression.getOperand2().accept(this, param);
//        return null;
//    }
//
//}
