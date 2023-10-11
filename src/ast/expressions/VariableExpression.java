package ast.expressions;

import ast.statements.VarDeclaration;
import visitor.Visitor;

public class VariableExpression extends AbstractExpression {

    private String name;
    public String getName() {
        return name;
    }

    private VarDeclaration definition;
    public VarDeclaration getDefinition() {
        return definition;
    }
    public void setDefinition(VarDeclaration definition) {
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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}
