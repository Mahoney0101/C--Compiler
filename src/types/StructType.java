package types;

import ast.ASTNode;
import ast.FieldDeclaration;
import ast.VarDeclaration;
import visitor.Visitor;

import java.util.List;

public class StructType extends AbstractType implements Type{

    private List<FieldDeclaration> fields;

    public StructType(int line, int column, List<FieldDeclaration> fields) {
        super(line, column);
        this.fields = fields;
    }

    public List<FieldDeclaration> getFields() {
        return fields;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        return new ErrorType("Arithmetic operations are not allowed on structs", node);
    }

    @Override
    public char suffix() {
        return 's';
    }

    @Override
    public int numberOfBytes() {
        int bytes = 0;
        for(FieldDeclaration field : fields) {
            bytes += field.getType().numberOfBytes();
        }
        return bytes;
    }

    @Override
    public String toString() {
        return "struct";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}

