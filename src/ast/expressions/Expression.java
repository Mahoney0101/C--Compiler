package ast.expressions;

import ast.ASTNode;
import semantic.LValueVisitor;
import types.Type;
import visitor.Visitor;


public interface Expression extends ASTNode {

    /**
     * The type of the expression
     */
    boolean isLValue();
    void setLValue(boolean value);
    Type getType();
    void setType(Type tipo);

    <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);
}
