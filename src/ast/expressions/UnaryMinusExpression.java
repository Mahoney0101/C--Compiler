package ast.expressions;

import visitor.Visitor;

public class UnaryMinusExpression extends AbstractUnaryExpression {

    public UnaryMinusExpression(int line, int column, Expression operand) {
        super(line, column, "-", operand);
    }

    @Override
    public String toString() {
        return "-" + this.getOperand();
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
