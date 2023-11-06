package types;

import ast.ASTNode;
import ast.FunctionDeclaration;
import ast.VarDeclaration;
import ast.expressions.AbstractBinaryExpression;
import ast.expressions.AbstractUnaryExpression;
import ast.expressions.FunctionCallExpression;
import ast.statements.ReturnStatement;
import ast.statements.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VarDeclaration> parameters;

    public FunctionType(int line, int column, Type returnType, List<VarDeclaration> parameters) {
        super(line, column);
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VarDeclaration> getParameters() {
        return parameters;
    }

    public Type arithmetic(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        if (node instanceof AbstractBinaryExpression) {
            AbstractBinaryExpression binaryNode = (AbstractBinaryExpression) node;
            String operator = binaryNode.getOperator();

            if ("%".equals(operator)) {
                return new ErrorType("Modulus operator '%' cannot be applied to function call expressions", node);
            }
            if ("&&".equals(operator) || "||".equals(operator)) {
                return new ErrorType(
                        String.format("Logical operator '%s' cannot be applied to function call expressions", operator),
                        node);
            }
        }

        if (node instanceof AbstractUnaryExpression) {
            AbstractUnaryExpression unaryNode = (AbstractUnaryExpression) node;
            String operator = unaryNode.getOperator();

            if ("!".equals(operator)) {
                return new ErrorType("Logical negation operator '!' cannot be applied to function call expressions",
                        node);
            }
        }

        if (type instanceof DoubleType) {
            return this;
        }

        return new ErrorType(String.format("Arithmetic not allowed on type %s", type), node);
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type instanceof ErrorType) {
            return type;
        }

        if (type instanceof FunctionType) {
            var argumentCount = ((FunctionCallExpression) node).getArguments().size();

            if (((FunctionType) type).getParameters().size() != argumentCount) {
                return new ErrorType("FunctionCallExpression must have the same argument count as functionDeclaration",
                        node);
            }

            var parameters = ((FunctionType) type).getParameters();
            var arguments = ((FunctionCallExpression) node).getArguments();

            for (int i = 0; i < parameters.size(); i++) {
                if (parameters.get(i).getType() != arguments.get(i).getType()) {
                    new ErrorType(
                            String.format("FunctionCallExpression argument %s and parameter %s must be the same type",
                                    parameters.get(i).getType(), arguments.get(i).getType()),
                            node);
                }
            }
            return getReturnType();
        }

        return new ErrorType(String.format("Comparison checks not allowed on type %s", type), node);
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        return super.assignment(type, node);
    }

    @Override
    public Type equivalent(Type type, ASTNode node) {
        if (type instanceof ErrorType)
            return type;
        var x = ((FunctionDeclaration) node).getStatements();
        Type returnType = null;
        for (Statement stmt : x) {
            if (stmt instanceof ReturnStatement) {
                ReturnStatement returnStmt = (ReturnStatement) stmt;
                returnType = returnStmt.getExpression().getType();

                break;
            }
        }
        if (type.equals(returnType)) {
            return type;
        }
        if (returnType == null && type instanceof VoidType) {
            return type;
        }
        return new ErrorType(String.format("No implicit conversion from %s to %s", returnType, type), node);
    }

    public String getParametersAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i));
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public char suffix() {
        return returnType.suffix();
    }

    @Override
    public int numberOfBytes() {
        return returnType.numberOfBytes();
    }

    @Override
    public String toString() {
        return "FunctionType: " + returnType + "(" + getParametersAsString() + ")";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return null;
    }

}