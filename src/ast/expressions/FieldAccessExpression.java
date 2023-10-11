package ast.expressions;

import visitor.Visitor;

public class FieldAccessExpression extends AbstractExpression {
    private Expression structure; // The expression that evaluates to a struct
    private String fieldName;

    public FieldAccessExpression(int line, int column, Expression structure, String fieldName) {
        super(line, column);
        this.structure = structure;
        this.fieldName = fieldName;
    }

    public Expression getStructure() {
        return structure;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return structure.toString() + "." + fieldName;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
