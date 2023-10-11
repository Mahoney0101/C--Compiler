//package visitor;
//
//import ast.Program;
//import ast.VarDefinition;
//import ast.expressions.ArithmeticExpression;
//import ast.expressions.IntLiteralExpression;
//import ast.expressions.RealLiteralExpression;
//import ast.expressions.VariableExpression;
//import ast.statements.AssignmentStatement;
//import ast.statements.Statement;
//import types.*;
//
//public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
//
//    @Override
//    public TR visit(Program program, TP param) {
//        for(VarDefinition varDefinition: program.getVarDefinitions())
//            varDefinition.accept(this, param);
//        for(Statement statement: program.getStatements())
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
