package ast.statements;

import ast.AbstractASTNode;
import ast.VarDeclaration;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class WhileStatement extends AbstractASTNode implements Statement {

    private Expression condition;
    private List<VarDeclaration> varDeclarations;
    private List<Statement> statements;

    public WhileStatement(int line,
                          int column,
                          Expression condition,
                          List<VarDeclaration> varDeclarations,
                          List<Statement> statements) {
        super(line, column);
        this.condition = condition;
        this.varDeclarations = varDeclarations;
        this.statements = statements;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public List<VarDeclaration> getVarDeclarations() {
        return this.varDeclarations;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public void setVarDeclarations(List<VarDeclaration> varDeclarations) {
        this.varDeclarations = varDeclarations;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("while (")
                .append(condition.toString())
                .append(") {\n");
        varDeclarations.forEach(decl -> builder.append("\t").append(decl.toString()).append("\n"));
        statements.forEach(stmt -> builder.append("\t").append(stmt.toString()).append("\n"));
        builder.append("}");
        return builder.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
