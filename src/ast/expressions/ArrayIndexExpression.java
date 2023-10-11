package ast.expressions;

import visitor.Visitor;

public class ArrayIndexExpression extends AbstractBinaryExpression {

    public ArrayIndexExpression(int line, int column, Expression arrayExpr, Expression indexExpr) {
        super(line, column, arrayExpr, "[]", indexExpr);
    }

    @Override
    public String toString() {
        return getOperand1() + "[" + getOperand2() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
