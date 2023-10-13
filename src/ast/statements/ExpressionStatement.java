package ast.statements;

import visitor.Visitor;
import ast.*;
import ast.expressions.*;

public class ExpressionStatement extends AbstractASTNode implements Statement {

    private Expression expression;

    public ExpressionStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return expression.toString() + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
