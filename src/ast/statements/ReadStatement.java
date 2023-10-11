package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class ReadStatement extends AbstractASTNode implements Statement {

    /**
     * List of targets to be read
     */
    private List<Expression> targets;

    public List<Expression> getTargets() {
        return targets;
    }

    @Override
    public String toString() {
        // Use Java streams to concatenate all targets with commas in between
        String allTargets = targets.stream()
                .map(Expression::toString)
                .collect(Collectors.joining(", "));
        return "read " + allTargets + ";";
    }

    public ReadStatement(int line, int column, List<Expression> targets) {
        super(line, column);
        this.targets = targets;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
