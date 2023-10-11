package types;

import ast.ASTNode;
import visitor.Visitor;

public class ArrayType extends AbstractType {

    private Type baseType;
    private int size;

    public ArrayType(int line, int column, Type baseType, int size) {
        super(line, column);
        this.baseType = baseType;
        this.size = size;
    }

    public Type getBaseType() {
        return baseType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return new ErrorType("Arithmetic operations on array type is not supported.", node);
    }

    @Override
    public char suffix() {
        return 'a'; // This is arbitrary; you can choose any other character for array.
    }

    @Override
    public int numberOfBytes() {
        return baseType.numberOfBytes() * size;
    }

    @Override
    public String toString() {
        return baseType.toString() + "[" + size + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
