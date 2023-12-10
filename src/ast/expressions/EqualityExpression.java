package ast.expressions;

import visitor.Visitor;

public class EqualityExpression extends AbstractBinaryExpression {

    public EqualityExpression(int line, int column, Expression operand1, String operator, Expression operand2) {
        super(line, column, operand1, operator, operand2);
    }

    @Override
    public String getOperator() {
        return super.getOperator();
    }

    @Override
    public String toString() {
        return ""+this.getOperand1()+this.getOperator()+this.getOperand2();
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
