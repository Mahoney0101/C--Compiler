package visitor;

import ast.Definition;
import ast.FunctionDeclaration;
import ast.Program;
import ast.VarDeclaration;
import ast.statements.*;
import ast.expressions.*;
import types.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(IntLiteralExpression intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(RealLiteralExpression realLiteral, TP param) {
        return null;
    }

    public abstract <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param);

    public <TP, TR> TR visit(Definition defintion, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    public abstract <TP2, TR2> TR2 visit(VarDeclaration var, TP2 param);

    public abstract <TP2, TR2> TR2 visit(ReturnStatement returnStatement, TP2 param);

    public abstract <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param);

    public Void visit(StructFieldAccessExpression structFieldAccessExpression, Type param){return null;}

    public abstract <TP2, TR2> TR2 visit(AssignmentStatement assignment, TP2 param);

    public <TP, TR> TR visit(WriteStatement write, TP param){
        return null;
    }

    public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccessExpression, TP param){return null;}
    public <TP, TR>TR visit(StructType structType, TP param){return null;}

    public <TP, TR> TR visit(CastExpression castExpression, TP param){return null;}

    public <TP, TR> TR visit(ReadStatement readStatement, TP param){return null;}

    public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param){return null;}
}
