package ast;

import ast.statements.Statement;
import ast.statements.VarDeclaration;
import types.StructType;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {

    private List<VarDeclaration> varDeclarations;
    private List<FunctionDeclaration> functionDefinitions;
    private List<StructType> structDefinitions;
    private MainFunctionDeclaration mainStatements; // Statements within the 'main' function

    public Program(int line, int column,
                   List<VarDeclaration> varDeclarations,
                   List<FunctionDeclaration> functionDefinitions,
                   List<StructType> structDefinitions,
                   MainFunctionDeclaration mainfunction) {
        super(line, column);
        this.varDeclarations = varDeclarations;
        this.functionDefinitions = functionDefinitions;
        this.structDefinitions = structDefinitions;
        this.mainStatements = mainStatements;
    }


    public List<VarDeclaration> getVarDefinitions() {
        return this.varDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDefinitions() {
        return this.functionDefinitions;
    }

    public List<StructType> getStructDefinitions() {
        return this.structDefinitions;
    }

    public MainFunctionDeclaration getMainStatements() {
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
                this.mainStatements.toString());
    }
}
