package ast.statements;

import ast.AbstractASTNode;
import ast.VarDeclaration;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class IfStatement extends AbstractASTNode implements Statement {

    private Expression condition;
    private List<VarDeclaration> ifBlockVarDeclarations;
    private List<Statement> ifBlockStatements;
    private List<VarDeclaration> elseBlockVarDeclarations;
    private List<Statement> elseBlockStatements;

    public IfStatement(int line,
                       int column,
                       Expression condition,
                       List<VarDeclaration> ifBlockVarDeclarations,
                       List<Statement> ifBlockStatements,
                       List<VarDeclaration> elseBlockVarDeclarations,
                       List<Statement> elseBlockStatements) {
        super(line, column);
        this.condition = condition;
        this.ifBlockVarDeclarations = ifBlockVarDeclarations;
        this.ifBlockStatements = ifBlockStatements;
        this.elseBlockVarDeclarations = elseBlockVarDeclarations;
        this.elseBlockStatements = elseBlockStatements;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public List<VarDeclaration> getIfBlockVarDeclarations() {
        return ifBlockVarDeclarations;
    }

    public List<Statement> getIfBlockStatements() {
        return ifBlockStatements;
    }

    public List<VarDeclaration> getElseBlockVarDeclarations() {
        return elseBlockVarDeclarations;
    }

    public List<Statement> getElseBlockStatements() {
        return elseBlockStatements;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public void setIfBlockVarDeclarations(List<VarDeclaration> ifBlockVarDeclarations) {
        this.ifBlockVarDeclarations = ifBlockVarDeclarations;
    }

    public void setIfBlockStatements(List<Statement> ifBlockStatements) {
        this.ifBlockStatements = ifBlockStatements;
    }

    public void setElseBlockVarDeclarations(List<VarDeclaration> elseBlockVarDeclarations) {
        this.elseBlockVarDeclarations = elseBlockVarDeclarations;
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
        ifBlockVarDeclarations.forEach(decl -> sb.append("\n\t").append(decl.toString()));
        ifBlockStatements.forEach(stmt -> sb.append("\n\t").append(stmt.toString()));
        sb.append("\n}");
        if (elseBlockStatements != null && !elseBlockStatements.isEmpty()) {
            sb.append(" else {");
            elseBlockVarDeclarations.forEach(decl -> sb.append("\n\t").append(decl.toString()));
            elseBlockStatements.forEach(stmt -> sb.append("\n\t").append(stmt.toString()));
            sb.append("\n}");
        }
        return sb.toString();
    }
}
