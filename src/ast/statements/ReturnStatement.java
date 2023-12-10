package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class ReturnStatement extends AbstractASTNode implements Statement {

    private Expression expression;

    public ReturnStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String toString() {
        return "return " + expression + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
