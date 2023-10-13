package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class IfStatement extends AbstractASTNode implements Statement {

    private Expression condition;
    private Statement ifBlock;
    private Statement elseBlock;

    public IfStatement(int line, int column, Expression condition, Statement ifBlock, Statement elseBlock) {
        super(line, column);
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Statement getIfBlock() {
        return this.ifBlock;
    }

    public Statement getElseBlock() {
        return this.elseBlock;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("if (");
        sb.append(condition.toString());
        sb.append(") ");
        sb.append(ifBlock.toString());
        if (elseBlock != null) {
            sb.append(" else ");
            sb.append(elseBlock.toString());
        }
        return sb.toString();
    }
}
