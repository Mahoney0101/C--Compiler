package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class WhileStatement extends AbstractASTNode implements Statement {

    private Expression condition;
    private Statement loopBlock;

    public WhileStatement(int line, int column, Expression condition, Statement loopBlock) {
        super(line, column);
        this.condition = condition;
        this.loopBlock = loopBlock;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Statement getLoopBlock() {
        return this.loopBlock;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
