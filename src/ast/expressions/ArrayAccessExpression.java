package ast.expressions;

import visitor.Visitor;

public class ArrayAccessExpression extends AbstractBinaryExpression {

    public ArrayAccessExpression(int line, int column, Expression arrayName, Expression index) {
        super(line, column, arrayName, "[]", index);
    }

    @Override
    public String toString() {
        return this.getOperand1() + "[" + this.getOperand2() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
