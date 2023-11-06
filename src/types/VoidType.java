package types;

import ast.ASTNode;
import visitor.Visitor;

public class VoidType extends AbstractType {

    private VoidType()  {
        super(0, 0);
    }

    private static VoidType instance=new VoidType();


    public static VoidType getInstance() { return instance; }

    @Override
    public Type assignment(Type type, ASTNode node) {
        return super.assignment(type, node);
    }

    @Override
    public char suffix() {
        // Void type typically does not need a suffix when used in generated code, considering its non-instantiable nature.
        // If your language requires it for some reason, you might add a suffix here.
        throw new UnsupportedOperationException("Void type does not have a suffix");
    }

    @Override
    public int numberOfBytes() {
        // Void type should not have a size since it does not represent a value and thus cannot be stored.
        // Depending on your language specifications, this might throw an error or return 0.
        return 0;
    }

    @Override
    public String toString() {
        return "void";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
