package ast;

import visitor.Visitor;
import types.*;

public class FieldDeclaration extends AbstractASTNode {
    private Type type; // Assuming you have a Type class to represent types
    private String fieldNames; // Assuming a field can have one or more names

    public FieldDeclaration(int line, int column, Type type, String fieldNames) {
        super(line, column);
        this.type = type;
        this.fieldNames = fieldNames;
    }

    public Type getType() {
        return type;
    }

    public String getFieldNames() {
        return fieldNames;
    }

    @Override
    public String toString() {
        // Convert the list of field names into a string, and concatenate with the type
        return type.toString() + " " + String.join(", ", fieldNames) + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
