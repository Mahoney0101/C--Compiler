package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import ast.expressions.FunctionCallExpression;
import ast.statements.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionCallStatement extends AbstractASTNode implements Statement {

    private FunctionCallExpression functionCallExpr;

    public FunctionCallStatement(int line, int column, String functionName, List<Expression> arguments) {
        super(line, column);
        this.functionCallExpr = new FunctionCallExpression(line, column, functionName, arguments);
    }

    public String getFunctionName() {
        return this.functionCallExpr.getFunctionName();
    }

    public List<Expression> getArguments() {
        return this.functionCallExpr.getArguments();
    }

    @Override
    public String toString() {
        return functionCallExpr.toString() + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
