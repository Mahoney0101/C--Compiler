package ast.expressions;

import ast.ASTNode;
import types.Type;


public interface Expression extends ASTNode {

    /**
     * The type of the expression
     */
    Type getType();
    void setType(Type tipo);
}
