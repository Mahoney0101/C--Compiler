package visitor;

import ast.*;
import ast.expressions.*;
import ast.statements.*;
import types.*;
import types.ErrorType;

public interface Visitor<TP, TR> {

    // ********* Expressions **********

    TR visit(ArithmeticExpression arithmeticExpression, TP param);

    TR visit(VariableExpression variable, TP param);

    TR visit(IntLiteralExpression intLiteral, TP param);

    TR visit(RealLiteralExpression realLiteral, TP param);

    // ************ Statements ***************

    TR visit(WriteStatement write, TP param);

    TR visit(AssignmentStatement assignment, TP param);

    TR visit(VarDeclaration varDeclaration, TP param);


    // ************ Program ****************

    TR visit(Program program, TP param);

    // ************ Types ****************

    TR visit(IntType intType, TP param);

    TR visit(ErrorType errorType, TP param);

    TR visit(RealType realType, TP param);

    TR visit(LogicalNegationExpression logicalNegation, TP param);

    TR visit(RelationalExpression relational, TP param);

    TR visit(UnaryMinusExpression unaryMinus, TP param);

    TR visit(DoubleLiteralExpression doubleLiteral, TP param);

    TR visit(ArrayAccessExpression arrayAccess, TP param);

    TR visit(CharLiteralExpression charLiteral, TP param);

    TR visit(LogicalExpression logical, TP param);

    TR visit(CastExpression castExpression, TP param);

    TR visit(Block block, TP param);

    TR visit(ReturnStatement returnStatement, TP param);

    TR visit(WhileStatement whileStatement, TP param);

    TR visit(ReadStatement readExpression, TP param);

    TR visit(IfStatement ifStatement, TP param);

    TR visit(IdentifierExpression identifierExpression, TP param);
    
    TR visit(FuncDefinition funcDefinition, TP param);

    TR visit(FunctionCallExpression functionCallExpression, TP param);

    TR visit(FunctionCallStatement functionCallStatement, TP param);

    TR visit(CharType charType, TP param);

    TR visit(ArrayType arrayType, TP param);

    TR visit(DoubleType doubleType, TP param);

    TR visit(FieldAccessExpression fieldAccessExpression, TP param);

    TR visit(StructType structType, TP param);

    TR visit(StructDefinition structDefinition, TP param);

    TR visit(NestedStructFieldAccessExpression nestedStructFieldExpression, TP param);

    TR visit(ArrayIndexExpression arrayIndexExpression, TP param);

    TR visit(FieldDeclaration fieldDeclaration, TP param);

    TR visit(ElseStatement elseStatement, TP param);

    TR visit(ModulusExpression modulusExpression, TP param);

    TR visit(MultiplyExpression multiplyExpression, TP param);

    TR visit(SubtractExpression subtractExpression, TP param);

    TR visit(DivideExpression divideExpression, TP param);

    TR visit(GreaterThanExpression greaterThanExpression, TP param);

    TR visit(GreaterThanOrEqualExpression greaterThanOrEqualExpression, TP param);

    TR visit(AddExpression addExpression, TP param);

    TR visit(LessThanExpression lessThanExpression, TP param);

    TR visit(LessThanOrEqualsExpression lessThanOrEqualsExpression, TP param);

    TR visit(EqualsExpression equalsExpression, TP param);

    TR visit(NotEqualsExpression notEqualsExpression, TP param);

    TR visit(LogicalAndExpression logicalAndExpression, TP param);

    TR visit(LogicalOrExpression logicalOrExpression, TP param);

    TR visit(UserDefinedType userDefinedType, TP param);

    TR visit(VoidType voidType, TP param);

    TR visit(Parameter parameter, TP param);

    TR visit(FunctionDeclaration functionDeclaration, TP param);

    TR visit(ExpressionStatement expressionStatement, TP param);

    TR visit(MainFunctionDeclaration mainFunctionDeclaration, TP param);
}
