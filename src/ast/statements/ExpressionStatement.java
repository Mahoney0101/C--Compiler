package ast.statements;

import visitor.Visitor;
import ast.*;
import ast.expressions.*;

public class ExpressionStatement extends AbstractASTNode implements Statement {

    private Expression expression;

    // Constructor for ExpressionStatement.
    // It takes the line and column number (for error reporting), and the expression itself.
    public ExpressionStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    // Getter for the expression.
    public Expression getExpression() {
        return expression;
    }

    // Convert the ExpressionStatement to a string.
    // This is helpful for debugging and pretty-printing the AST.
    @Override
    public String toString() {
        return expression.toString() + ";";
    }

    // Accept method for Visitor pattern.
    // It typically invokes the appropriate method on the visitor object
    // and passes `this` as an argument.
    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
