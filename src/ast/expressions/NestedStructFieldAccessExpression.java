package ast.expressions;

import visitor.Visitor;

public class NestedStructFieldAccessExpression extends AbstractExpression {

    private Expression structure;
    private String nestedField;

    public NestedStructFieldAccessExpression(int line, int column, Expression structure, String nestedField) {
        super(line, column);
        this.structure = structure;
        this.nestedField = nestedField;
    }

    public Expression getStructure() {
        return this.structure;
    }

    public String getNestedField() {
        return this.nestedField;
    }

    @Override
    public String toString() {
        return this.getStructure() + "." + this.getNestedField();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
