package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.FunctionCallExpression;
import visitor.Visitor;

public class FunctionCallStatement extends AbstractASTNode implements Statement {

    private FunctionCallExpression functionCallExpression;

    public FunctionCallStatement(int line, int column, FunctionCallExpression functionCallExpression) {
        super(line, column);
        this.functionCallExpression = functionCallExpression;
    }

    public FunctionCallExpression getFunctionCallExpression() {
        return functionCallExpression;
    }

    @Override
    public String toString() {
        return functionCallExpression.toString() + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}
