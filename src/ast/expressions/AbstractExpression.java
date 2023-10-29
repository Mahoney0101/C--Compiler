package ast.expressions;

import ast.AbstractASTNode;
import types.Type;
import visitor.Visitor;

abstract class AbstractExpression extends AbstractASTNode implements Expression {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
    private boolean lvalue;

    @Override
    public boolean isLValue() {
        return this.lvalue;
    }

    @Override
    public void setLValue(boolean value) {
        this.lvalue = value;
    }

    private Type type;

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public Type accept(Visitor typeCheckingVisitor, Void param){
        return null;
    }


}
