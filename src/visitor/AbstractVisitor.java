package visitor;

import ast.Definition;
import ast.Program;
import ast.VarDeclaration;
import ast.statements.*;
import ast.expressions.*;
import types.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor {

    @Override
    public <TP, TR> TR visit(Program program, TP param) {

        for (Definition def : program.getdefinitions()) {
            def.accept(this, null);
        }

        return null;
    }

    @Override
    public <TP, TR>TR visit(IntLiteralExpression intLiteral, TP param) {
        return null;
    }

    @Override
    public <TP, TR>TR visit(DoubleLiteralExpression doubleLiteralExpression, TP param) {
        return null;
    }

    @Override
    public <TP, TR>TR visit(CharLiteralExpression charLiteralExpression, TP param) {
        return null;
    }

    public abstract <TP, TR> TR visit(FunctionCallExpression functionCallExpression, TP param);

    public abstract <TP2, TR2> TR2 visit(VarDeclaration var, TP2 param);

    public abstract <TP2, TR2> TR2 visit(ReturnStatement returnStatement, TP2 param);

    public abstract <TP, TR> TR visit(ArithmeticExpression arithmeticExpression, TP param);

    public abstract <TP2, TR2> TR2 visit(AssignmentStatement assignment, TP2 param);

    public <TP, TR> TR visit(WriteStatement write, TP param){
        return null;
    }

    public <TP, TR> TR visit(StructFieldAccessExpression structFieldAccessExpression, TP param){return null;}

    public <TP, TR> TR visit(LogicalNegationExpression logicalNegation, TP param){return null;}

    public <TP, TR>TR visit(StructType structType, TP param){return null;}

    public <TP, TR> TR visit(CastExpression castExpression, TP param){return null;}

    public <TP, TR> TR visit(ReadStatement readStatement, TP param){return null;}

    public <TP, TR> TR visit(FunctionCallStatement functionCallStatement, TP param){return null;}
}
