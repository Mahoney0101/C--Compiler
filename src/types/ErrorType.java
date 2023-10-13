package types;


import ast.ASTNode;
import errorlistener.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;


    public ErrorType(String message, ASTNode astNode) {
        super(astNode.getLine(), astNode.getColumn());
        this.message=message;
        ErrorHandler.getErrorHandler().addError(this);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return this;
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        return this;
    }

    @Override
    public String toString() {
        return String.format("Type error in line %d and column %d: %s.",
                this.getLine(), this.getColumn(), this.message);
    }

    @Override
    public int numberOfBytes() {
        throw new RuntimeException("Do not call numberOfBytes on error types");
    }

    @Override
    public char suffix() {
        throw new RuntimeException("Do not call suffix on error types");
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }

}
