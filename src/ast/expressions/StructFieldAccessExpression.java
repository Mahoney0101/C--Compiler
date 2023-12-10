package ast.expressions;

import ast.Definition;
import visitor.Visitor;

public class StructFieldAccessExpression extends AbstractExpression {

    private Expression structure;
    private String nestedField;

    private Definition fieldDefinition;

    public StructFieldAccessExpression(int line, int column, Expression structure, String nestedField) {
        super(line, column);
        this.structure = structure;
        this.nestedField = nestedField;
    }

    public void setDefinition(Definition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }

    public Definition getDefinition() {
        return fieldDefinition;
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
    public <TP, TR> TR accept(Visitor visitor, TP param) {

        return visitor.visit(this, param);
    }
}
