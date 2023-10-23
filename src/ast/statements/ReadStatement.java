package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class ReadStatement extends AbstractASTNode implements Statement {

    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "read " + this.expression + ";";
    }

    public ReadStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
