package ast;

import ast.statements.VarDeclaration;
import visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {

    private List<VarDeclaration> varDeclarations;
    private List<FunctionDeclaration> functionDefinitions;
    private MainFunctionDeclaration mainStatements; // Statements within the 'main' function

    public Program(int line, int column,
                   List<VarDeclaration> varDeclarations,
                   List<FunctionDeclaration> functionDefinitions,
                   MainFunctionDeclaration mainfunction) {
        super(line, column);
        this.varDeclarations = varDeclarations;
        this.functionDefinitions = functionDefinitions;
        this.mainStatements = mainfunction;
    }


    public List<VarDeclaration> getVarDefinitions() {
        return this.varDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDefinitions() {
        return this.functionDefinitions;
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
        return String.format("Program with %d variable definitions, %d function definitions and %s main statements.",
                this.varDeclarations.size(),
                this.functionDefinitions.size(),
                this.mainStatements.toString());
    }
}
