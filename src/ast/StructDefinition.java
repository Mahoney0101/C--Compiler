package ast;

import ast.statements.VarDeclaration;
import visitor.Visitor;

import java.util.List;

public class StructDefinition extends AbstractASTNode implements Definition {

    private String structName;
    private List<FieldDeclaration> fieldDefinitions;

    private int arraySize;

    public StructDefinition(int line, int column,
                            String structName,
                            List<FieldDeclaration> fieldDefinitions,
                            int arraySize) {
        super(line, column);
        this.structName = structName;
        this.fieldDefinitions = fieldDefinitions;
        this.arraySize = arraySize;
    }

    public int getArraySize() {
        return this.arraySize;
    }


    @Override
    public String getName() {
        return this.structName;
    }

    public String getStructName() {
        return this.structName;
    }

    public List<FieldDeclaration> getFieldDefinitions() {
        return this.fieldDefinitions;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("struct " + structName + " {\n");
        for (FieldDeclaration var : fieldDefinitions) {
            sb.append("\t" + var.toString() + "\n");
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
