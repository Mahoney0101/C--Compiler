package types;

import ast.ASTNode;
import ast.VarDeclaration;
import visitor.Visitor;
import java.util.List;

public class StructType extends AbstractType{

    private List<VarDeclaration> fields;

    public StructType(int line, int column, List<VarDeclaration> fields) {
        super(line, column);
        this.fields = fields;
    }

    @Override
    public Type assignment(Type type, ASTNode node) {
        return super.assignment(type, node);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return super.arithmetic(type, node);
    }

    public List<VarDeclaration> getFields() {
        return fields;
    }

    @Override
    public char suffix() {
        return 's';
    }

    @Override
    public int numberOfBytes() {
        int bytes = 0;
        for(VarDeclaration field : fields) {
            bytes += field.getType().numberOfBytes();
        }
        return bytes;
    }

    @Override
    public String toString() {
        return "struct";
    }

    @Override
    public <TP, TR> TR accept(Visitor visitor, TP param) {
        return visitor.visit(this, param);
    }
}

