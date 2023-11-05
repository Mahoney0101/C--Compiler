package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends AbstractASTNode implements Statement {

    private Expression condition;
    private List<Statement> ifBlockStatements;
    private List<Statement> elseBlockStatements;

    public IfStatement(int line,
                       int column,
                       Expression condition,
                       List<Statement> ifBlockStatements,
                       List<Statement> elseBlockStatements) {
        super(line, column);
        this.condition = condition;
        this.ifBlockStatements = ifBlockStatements;
        this.elseBlockStatements = elseBlockStatements;
    }

    public Expression getCondition() {
        return this.condition;
    }


    public List<Statement> getIfBlockStatements() {
        return ifBlockStatements;
    }


    public List<Statement> getElseBlockStatements() {
        if (this.elseBlockStatements!= null){ return elseBlockStatements;} else return new ArrayList<>();
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }


    public void setIfBlockStatements(List<Statement> ifBlockStatements) {
        this.ifBlockStatements = ifBlockStatements;
    }


    public void setElseBlockStatements(List<Statement> elseBlockStatements) {
        this.elseBlockStatements = elseBlockStatements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("if (");
        sb.append(condition.toString());
        sb.append(") {");
        ifBlockStatements.forEach(stmt -> sb.append("\n\t").append(stmt.toString()));
        sb.append("\n}");
        if (elseBlockStatements != null && !elseBlockStatements.isEmpty()) {
            sb.append(" else {");
            elseBlockStatements.forEach(stmt -> sb.append("\n\t").append(stmt.toString()));
            sb.append("\n}");
        }
        return sb.toString();
    }
}
