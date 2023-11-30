package types;

import ast.ASTNode;
import ast.expressions.AbstractBinaryExpression;
import ast.expressions.AbstractUnaryExpression;
import ast.expressions.Expression;
import visitor.Visitor;

import java.util.Objects;

public class DoubleType extends AbstractType {

    private DoubleType() {
        super(0, 0);
    }

    private static DoubleType instance = new DoubleType();

    public static DoubleType getInstance() {
        return instance;
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof DoubleType)
            return type;
        if (type instanceof ArrayType)
            return new ErrorType("Arrays can not be assigned", node);
        return new ErrorType(String.format("Cannot assign %s to Double type", type), node);
    }

    @Override
    public Type cast(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof CharType)
            return CharType.getInstance();
        if (type instanceof IntType)
            return IntType.getInstance();
        if (type instanceof DoubleType)
            return type;
        return new ErrorType(String.format("Cannot cast %s to Char type", type), node);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        if (node instanceof AbstractBinaryExpression) {
            AbstractBinaryExpression binaryNode = (AbstractBinaryExpression) node;
            String operator = binaryNode.getOperator();

            if ("%".equals(operator)) {
                return new ErrorType("Modulus operator '%' cannot be applied to double expressions", node);
            }
            if ("&&".equals(operator) || "||".equals(operator)) {
                return new ErrorType(String.format("Logical operator '%s' cannot be applied to double expressions", operator), node);
            }
        }

        if (node instanceof AbstractUnaryExpression) {
            AbstractUnaryExpression unaryNode = (AbstractUnaryExpression) node;
            String operator = unaryNode.getOperator();

            if ("!".equals(operator)) {
                return new ErrorType("Logical negation operator '!' cannot be applied to double expressions", node);
            }
        }

        if (type instanceof DoubleType) {
            return this;
        }

        return new ErrorType(String.format("Arithmetic operations of double expressions do not allow a second operand with type %s", type), node);
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

                if (type instanceof DoubleType) {
                    return IntType.getInstance();
                } else {
                    return new ErrorType(String.format("Comparison operator '%s' is not applicable between '%s' and '%s'", operator, this, type), node);
                }
            }
        }

        return new ErrorType(String.format(
                "Comparison operations of dubles do not allow comparisons with type %s",  type),
                node);
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public int numberOfBytes() {
        return 4;
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
