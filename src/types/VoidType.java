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
        throw new UnsupportedOperationException("Void type does not have a suffix");
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public String toString() {
        return "void";
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
