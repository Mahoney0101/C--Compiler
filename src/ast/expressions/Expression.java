package ast.expressions;

import ast.ASTNode;
import types.Type;
import visitor.Visitor;


public interface Expression extends ASTNode {

    boolean isLValue();
    void setLValue(boolean value);
    Type getType();
    void setType(Type tipo);

    <TP, TR> TR accept(Visitor visitor, TP param);
}
