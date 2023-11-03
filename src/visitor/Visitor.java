package visitor;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import ast.VarDeclaration;
import types.*;
import types.ErrorType;

public interface Visitor<TP, TR> {

    <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param);

    <TP, TR> TR visit(VariableExpression variable, TP param);

    <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param);

    <TP, TR> TR visit(DoubleLiteralExpression doubleLiteralExpression, TP param);

    <TP, TR>TR visit(CharLiteralExpression charLiteralExpression, TP param);

    TR visit(RealLiteralExpression realLiteral, TP param);

    // ************ Statements ***************


    <TP, TR> TR visit(AssignmentStatement assignment, TP param);


    // ************ Program ****************

    // ************ Types ****************

    TR visit(IntType intType, TP param);

    TR visit(ErrorType errorType, TP param);

    TR visit(LogicalNegationExpression logicalNegation, TP param);

    TR visit(UnaryMinusExpression unaryMinus, TP param);

    <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param);

    <TP, TR> TR visit(EqualityExpression logical, TP param);

    <TP, TR> TR visit(CastExpression castExpression, TP param);

    <TP, TR> TR   visit(ReturnStatement returnStatement, TP param);

    <TP, TR> TR visit(WhileStatement whileStatement, TP param);

    <TP, TR> TR visit(ReadStatement readExpression, TP param);

    <TP, TR> TR visit(IfStatement ifStatement, TP param);

    <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param);

    <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param);

    TR visit(CharType charType, TP param);

    TR visit(ArrayType arrayType, TP param);

    TR visit(DoubleType doubleType, TP param);

    <TP, TR>TR visit(StructType structType, TP param);

    <TP, TR>TR visit(StructFieldAccessExpression nestedStructFieldExpression, TP param);

    TR visit(VoidType voidType, TP param);

    TR visit(Parameter parameter, TP param);

    TR visit(LogicalExpression logicalExpression, TP param);

    <TP, TR> TR visit(Program program, TP param);

    <TP, TR> TR visit(FunctionDeclaration functionDeclaration, TP param);

    <TP, TR> TR visit(VarDeclaration varDeclaration, TP param);

    <TP, TR> TR  visit(WriteStatement writeStatement, TP param);
}
