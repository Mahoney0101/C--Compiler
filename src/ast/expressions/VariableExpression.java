package ast.expressions;

import ast.Definition;
import visitor.Visitor;

public class VariableExpression extends AbstractExpression {

    private String name;
    public String getName() {
        return name;
    }

    private Definition definition;
    public Definition getDefinition() {
        return definition;
    }
    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public VariableExpression(int line, int column, String name) {
        super(line, column);
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this,param);
    }
}
