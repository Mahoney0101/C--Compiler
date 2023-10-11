package ast.statements;

import ast.AbstractASTNode;
import visitor.Visitor;

import java.util.List;

public class Block extends AbstractASTNode implements Statement {

    private List<Statement> statements;

    public Block(int line, int column, List<Statement> statements) {
        super(line, column);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (Statement stmt : statements) {
            sb.append(stmt).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
