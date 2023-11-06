package types;

import ast.ASTNode;
import ast.expressions.AbstractBinaryExpression;
import ast.expressions.AbstractUnaryExpression;
import visitor.Visitor;

import java.util.Objects;

public class CharType extends AbstractType {

    private CharType() {
        super(0, 0);
    }

    private static CharType instance = new CharType();

    public static CharType getInstance() {
        return instance;
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof CharType)
            return type;
        if (type instanceof ArrayType)
            return new ErrorType("Arrays can not be assigned", node);
        return new ErrorType(String.format("Cannot assign %s to Char type", type), node);
    }

    @Override
    public Type cast(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof CharType)
            return type;
        if (type instanceof IntType)
            return IntType.getInstance();
        if (type instanceof DoubleType)
            return DoubleType.getInstance();
        return new ErrorType(String.format("Cannot cast %s to Char type", type), node);
    }

    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        if (node instanceof AbstractBinaryExpression) {
            AbstractBinaryExpression binaryNode = (AbstractBinaryExpression) node;
            String operator = binaryNode.getOperator();

            if ("%".equals(operator)) {
                return new ErrorType("Modulus operator '%' cannot be applied to char expressions", node);
            }
            if ("&&".equals(operator) || "||".equals(operator)) {
                return new ErrorType(String.format("Logical operator '%s' cannot be applied to char expressions", operator), node);
            }
        }

        if (node instanceof AbstractUnaryExpression) {
            AbstractUnaryExpression unaryNode = (AbstractUnaryExpression) node;
            String operator = unaryNode.getOperator();

            if ("!".equals(operator)) {
                return new ErrorType("Logical negation operator '!' cannot be applied to char expressions", node);
            }
        }

        if (type instanceof CharType) {
            return IntType.getInstance();
        }

        return new ErrorType(String.format("Arithmetic operations of char expressions do not allow a second operand with type %s", type), node);
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        if (node instanceof AbstractBinaryExpression) {
            AbstractBinaryExpression binaryNode = (AbstractBinaryExpression) node;
            String operator = binaryNode.getOperator();

            if (">".equals(operator) || "<".equals(operator) ||
                    ">=".equals(operator) || "<=".equals(operator) ||
                    "==".equals(operator) || "!=".equals(operator)) {

                if (type instanceof CharType) {
                    return IntType.getInstance();
                } else {
                    return new ErrorType(String.format("Comparison operator '%s' is not applicable between '%s' and '%s'", operator, this, type), node);
                }
            }
        }

        return new ErrorType(String.format(
                "Comparison operations of chars do not allow comparisons with type %s",  type),
                node);
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
