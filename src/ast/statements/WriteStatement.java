package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class WriteStatement extends AbstractASTNode implements Statement {

    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "write " + expression.toString();
    }

    public WriteStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}
