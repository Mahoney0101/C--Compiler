package ast.statements;

import ast.AbstractASTNode;
import ast.statements.Statement;
import types.Type;
import visitor.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class VarDeclaration extends AbstractASTNode implements Statement {

    /**
     * The offset of the variable
     */
    private int offset;

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * List of variable names
     */
    private List<String> names;


    private Type type;

    public Type getType() {
        return this.type;
    }

    public VarDeclaration(int line, int column, List<String> names, Type type) {
        super(line, column);
        this.names = names;
        this.type = type;
    }

    @Override
    public String toString() {
        // Use Java streams to concatenate all names with commas in between
        String allNames = String.join(", ", names);
        return String.format("%s %s; // offset: %d.", this.getType(), allNames, this.getOffset());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}