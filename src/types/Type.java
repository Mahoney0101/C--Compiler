package types;

import ast.ASTNode;
public interface Type extends ASTNode {
    /************** Semantic Analysis ********************/
    Type squareBrackets(Type type, ASTNode node);
    Type arithmetic(Type type, ASTNode astNode);
    Type comparison(Type type, ASTNode astNode);
    Type assignment(Type type, ASTNode astNode);
    Type cast(Type type, ASTNode astNode);
    Type equivalent(Type type, ASTNode node);

    /************** Code Generation ********************/

    char suffix();
    int numberOfBytes();
}
