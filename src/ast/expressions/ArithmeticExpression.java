package ast.expressions;

import types.Type;
import visitor.Visitor;

public class ArithmeticExpression extends AbstractBinaryExpression {

    public ArithmeticExpression(int line, int column, Expression operand1, String operator, Expression operand2) {
        super(line, column, operand1, operator, operand2);
    }

    @Override
    public String toString() {
        return ""+this.getOperand1()+this.getOperator()+this.getOperand2();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }

    @Override
    public Type accept(Visitor typeCheckingVisitor, Void param) {
        return null;
    }
}
