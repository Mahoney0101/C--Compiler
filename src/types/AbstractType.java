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
        return new ErrorType(String.format("Assignments not supported for type %s", type), node);
    }

    @Override
    public Type cast(Type type, ASTNode node){
        return new ErrorType(String.format("Cannot cast %s type", type), node);
    }

    @Override
    public Type squareBrackets(Type t, ASTNode node) {
        if (t instanceof ErrorType) {
            return t;
        }

        if (!(t instanceof IntType)) {
            return new ErrorType(String.format("The type %s cannot be used as an index", t), node);
        }
        return t;
    }

    public Type comparison(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        return new ErrorType(
                "Comparison operations require left- and right-hand sides to have the same type",
                node);
    }

    public Type equivalent(Type type, ASTNode node){
        return new ErrorType(String.format("Equivalent checks not allowed on type %s", type), node);
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
