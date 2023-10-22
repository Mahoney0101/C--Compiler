package ast;

import ast.VarDeclaration;
import visitor.Visitor;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<VarDeclaration> varDeclarations;
    private List<FunctionDeclaration> functionDefinitions;

    public Program(int line, int column,
                   List<VarDeclaration> varDeclarations,
                   List<FunctionDeclaration> functionDefinitions) {
        super(line, column);
        this.varDeclarations = varDeclarations;
        this.functionDefinitions = functionDefinitions;
    }

    public List<VarDeclaration> getVarDeclarations() {
        return this.varDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDefinitions() {
        return this.functionDefinitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return String.format("Program with %d variable declarations and %d function definitions.",
                this.varDeclarations.size(),
                this.functionDefinitions.size());
    }
}
