package ast.statements;

import ast.AbstractASTNode;
import visitor.Visitor;

public class ElseStatement extends AbstractASTNode implements Statement {

    private Statement block;

    public ElseStatement(int line, int column, Statement block) {
        super(line, column);
        this.block = block;
    }

    public Statement getBlock() {
        return block;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return block.toString();
    }
}

