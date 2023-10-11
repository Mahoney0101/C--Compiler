package ast.expressions;

import visitor.Visitor;

public class LogicalNegationExpression extends AbstractUnaryExpression {

    public LogicalNegationExpression(int line, int column, Expression operand) {
        super(line, column, "!", operand);
    }

    @Override
    public String toString() {
        return "!" + this.getOperand();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
