package types;

import ast.ASTNode;
import ast.expressions.AbstractBinaryExpression;
import visitor.Visitor;

public class IntType extends AbstractType {

    private IntType()  {
        super(0, 0);
    }

    private static IntType instance=new IntType();


    public static IntType getInstance() { return instance; }


    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof IntType)
            return this;
        return new ErrorType(String.format(
                "Arithmetic operations of integers do not allow a second operand with type %s",  type),
                node);
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

                if (type instanceof IntType) {
                    return IntType.getInstance();
                } else {
                    return new ErrorType(String.format("Comparison operator '%s' is not applicable between '%s' and '%s'", operator, this, type), node);
                }
            }
        }

        return new ErrorType(String.format(
                "Comparison operations of integers do not allow comparisons with type %s",  type),
                node);
    }


    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }


    @Override
    public String toString() {
        return "int";
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        return super.assignment(type, node);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}
