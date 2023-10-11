package ast.expressions;

abstract class AbstractUnaryExpression extends AbstractExpression implements Expression {

    private String operator;
    private Expression operand;

    public String getOperator() {
        return operator;
    }

    public Expression getOperand() {
        return operand;
    }

    public AbstractUnaryExpression(int line, int column, String operator, Expression operand) {
        super(line, column);
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public String toString() {
        return operator + operand;
    }
}
