package types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.expressions.AbstractBinaryExpression;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return new ErrorType("An arithmetic expression cannot be performed with the types "
                + this.getClass().getSimpleName() + " and " + type.getClass().getSimpleName() + ".", node);
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType("Assignments require left- and right-hand sides to have the same type", node);
    }

    @Override
    public Type squareBrackets(Type t, ASTNode node) {
        return new ErrorType(String.format("The type %s cannot be used as an index", t), node);
    }

    public Type comparison(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        return new ErrorType(String.format(
                "Comparison operations of integers do not allow comparisons with type %s", type),
                node);
    }

    /******** Code Generation ***************/

    @Override
    public abstract char suffix();

    @Override
    public abstract int numberOfBytes();

    public String toString() {
        return getClass().getSimpleName();
    }
}
