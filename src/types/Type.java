package types;

import ast.ASTNode;
public interface Type extends ASTNode {
    /************** Semantic Analysis ********************/

    public Type arithmetic(Type type, ASTNode astNode);
    public Type assignment(Type type, ASTNode astNode);

    /************** Code Generation ********************/

    public char suffix();
    public int numberOfBytes();
}
