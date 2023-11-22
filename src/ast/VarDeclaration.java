package ast;

import ast.statements.*;
import types.Type;
import visitor.Visitor;

public class VarDeclaration extends AbstractASTNode implements Statement, Definition {

    private int scope;
    private int offset;

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }
    public int getScope() {
        return this.scope;
    }

    private String name;

    private Type type;

    public Type getType() {
        return this.type;
    }

    public VarDeclaration(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s; // offset: %d.", this.getType(), name, this.getOffset());
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}