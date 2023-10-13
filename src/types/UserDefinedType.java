package types;

import ast.ASTNode;
import visitor.Visitor;

public class UserDefinedType extends AbstractType {

    private String typeName;

    public UserDefinedType(int line, int column, String typeName) {
        super(line, column);
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        // Example: Perhaps your user-defined types don't support arithmetic,
        // or perhaps they do depending on the type they represent.
        // Adapt this method to your language semantics.
        return new ErrorType(
                String.format("Arithmetic operations not allowed on user-defined type %s", typeName),
                node);
    }

    // Implement other type-checking methods similarly, adapting them
    // to the semantics of your language for user-defined types.

    @Override
    public int numberOfBytes() {
        // This could vary depending on the actual type being represented.
        // You might need additional information about the user-defined type.
        return 4; // Example value
    }

    @Override
    public String toString() {
        return typeName;
    }

    @Override
    public char suffix() {
        return 's'; // just a placeholder
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
