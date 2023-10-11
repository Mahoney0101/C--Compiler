package ast;

import ast.statements.Statement;
import ast.statements.VarDeclaration;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {

    private List<VarDeclaration> varDeclarations;
    private List<FuncDefinition> functionDefinitions;
    private List<StructDefinition> structDefinitions;
    private List<Statement> mainStatements; // Statements within the 'main' function

    public Program(int line, int column,
                   List<VarDeclaration> varDeclarations,
                   List<FuncDefinition> functionDefinitions,
                   List<StructDefinition> structDefinitions,
                   List<Statement> mainStatements) {
        super(line, column);
        this.varDeclarations = varDeclarations;
        this.functionDefinitions = functionDefinitions;
        this.structDefinitions = structDefinitions;
        this.mainStatements = mainStatements;
    }

    public List<VarDeclaration> getVarDefinitions() {
        return this.varDeclarations;
    }

    public List<FuncDefinition> getFunctionDefinitions() {
        return this.functionDefinitions;
    }

    public List<StructDefinition> getStructDefinitions() {
        return this.structDefinitions;
    }

    public List<Statement> getMainStatements() {
        return this.mainStatements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return String.format("Program with %d variable definitions, %d function definitions, %d struct definitions, and %d main statements.",
                this.varDeclarations.size(),
                this.functionDefinitions.size(),
                this.structDefinitions.size(),
                this.mainStatements.size());
    }
}
