package ast.expressions;

import visitor.Visitor;

public class IdentifierExpression extends AbstractExpression {

    private String identifier;

    public IdentifierExpression(int line, int column, String identifier) {
        super(line, column);
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
