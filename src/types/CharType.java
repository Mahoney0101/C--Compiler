package types;

import ast.ASTNode;
import visitor.Visitor;

public class CharType extends AbstractType {

    private CharType() {
        super(0, 0);
    }

    private static CharType instance = new CharType();

    public static CharType getInstance() {
        return instance;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return new ErrorType("Arithmetic operations on char type is not supported.", node);
    }

    @Override
    public char suffix() {
        return 'c';
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
