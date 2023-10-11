package ast.statements;

import ast.ASTNode;
import visitor.Visitor;

public interface Statement extends ASTNode {

    @Override
    <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}
