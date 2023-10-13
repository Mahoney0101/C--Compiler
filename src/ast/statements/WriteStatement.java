package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class WriteStatement extends AbstractASTNode implements Statement {

    private List<Expression> expressions;

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        String allExpressions = expressions.stream()
                .map(Expression::toString)
                .collect(Collectors.joining(", "));
        return "write " + allExpressions;
    }

    public WriteStatement(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}
