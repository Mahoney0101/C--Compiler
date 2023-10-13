package ast.statements;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import visitor.Visitor;

public class AssignmentStatement extends AbstractASTNode implements Statement{

    private Expression leftHandSide;
    public Expression getLeftHandSide() {
        return this.leftHandSide;
    }

    private Expression rightHandSide;
    public Expression getRightHandSide() {
        return this.rightHandSide;
    }


    public AssignmentStatement(int line, int column, Expression lhs, Expression rhs) {
        super(line, column);
        this.leftHandSide=lhs;
        this.rightHandSide=rhs;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return ""+leftHandSide+" = "+rightHandSide;
    }
}
