package ast.expressions;

import types.Type;
import visitor.Visitor;

public class CastExpression extends AbstractExpression {

    private Type targetType;
    private Expression expression;

    public CastExpression(int line, int column, Type targetType, Expression expression) {
        super(line, column);
        this.targetType = targetType;
        this.expression = expression;
    }

    public Type getTargetType() {
        return this.targetType;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String toString() {
        return "(" + targetType + ") " + expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
