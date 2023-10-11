package types;

import ast.ASTNode;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    private DoubleType() {
        super(0, 0);
    }

    private static DoubleType instance = new DoubleType();

    public static DoubleType getInstance() {
        return instance;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof DoubleType)
            return this;
        return new ErrorType(String.format(
                "Arithmetic operations of double expressions do not allow a second operand with type %s", type),
                node);
    }

    @Override
    public char suffix() {
        return 'd';
    }

    @Override
    public int numberOfBytes() {
        return 8;
    }

    @Override
    public String toString() {
        return "double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
