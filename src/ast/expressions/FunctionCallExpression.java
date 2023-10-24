package ast.expressions;

import visitor.Visitor;

import java.util.List;

public class FunctionCallExpression extends AbstractExpression {

    private VariableExpression functionName;
    private List<Expression> arguments;

    public FunctionCallExpression(int line, int column, VariableExpression functionName, List<Expression> arguments) {
        super(line, column);
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public VariableExpression getFunctionName() {
        return this.functionName;
    }

    public List<Expression> getArguments() {
        return this.arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(functionName.getName());
        sb.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i));
            if (i < arguments.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
