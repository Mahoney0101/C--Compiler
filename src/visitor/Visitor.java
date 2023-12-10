package visitor;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import ast.VarDeclaration;
import types.*;
import types.ErrorType;

public interface Visitor {

    <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param);

    <TP, TR> TR visit(VariableExpression variable, TP param);

    <TP, TR> TR visit(IntLiteralExpression intLiteral, TP param);

    <TP, TR> TR visit(DoubleLiteralExpression doubleLiteralExpression, TP param);

    <TP, TR>TR visit(CharLiteralExpression charLiteralExpression, TP param);

    <TP, TR> TR visit(AssignmentStatement assignment, TP param);

    <TP, TR> TR visit(LogicalNegationExpression logicalNegation, TP param);

    <TP, TR> TR visit(ArrayAccessExpression arrayAccess, TP param);

    <TP, TR> TR visit(EqualityExpression logical, TP param);

    <TP, TR> TR visit(CastExpression castExpression, TP param);

    <TP, TR> TR   visit(ReturnStatement returnStatement, TP param);

    <TP, TR> TR visit(WhileStatement whileStatement, TP param);

    <TP, TR> TR visit(ReadStatement readExpression, TP param);

    <TP, TR> TR visit(IfStatement ifStatement, TP param);

    <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param);

    <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param);

    <TP, TR>TR visit(StructType structType, TP param);

    <TP, TR>TR visit(StructFieldAccessExpression structFieldExpression, TP param);

    <TP, TR> TR visit(LogicalExpression logicalExpression, TP param);

    <TP, TR> TR visit(Program program, TP param);

    <TP, TR> TR visit(FunctionDeclaration functionDeclaration, TP param);

    <TP, TR> TR visit(VarDeclaration varDeclaration, TP param);

    <TP, TR> TR  visit(WriteStatement writeStatement, TP param);

    <TP, TR> TR visit(RealLiteralExpression realLiteralExpression, TP param);

    <TP, TR> TR visit(ArrayType arrayType, TP param);

    <TP, TR> TR visit(CharType charType, TP param);

    <TP, TR> TR visit(DoubleType doubleType, TP param);

    <TP, TR> TR visit(ErrorType errorType, TP param);

    <TP, TR> TR visit(IntType intType, TP param);

    <TP, TR> TR visit(VoidType voidType, TP param);

    <TP, TR> TR visit(UnaryMinusExpression unaryMinusExpression, TP param);
}
