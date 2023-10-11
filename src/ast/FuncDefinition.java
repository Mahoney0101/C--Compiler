package ast;

import ast.statements.Statement;
import ast.statements.VarDeclaration;
import types.Type;
import visitor.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractASTNode implements Definition{

    private Type returnType;
    private String functionName;
    private List<VarDeclaration> parameters;
    private List<VarDeclaration> localVariables;
    private List<Statement> bodyStatements;

    public FuncDefinition(int line, int column, Type returnType, String functionName, List<VarDeclaration> parameters, List<VarDeclaration> localVariables, List<Statement> bodyStatements) {
        super(line, column);
        this.returnType = returnType;
        this.functionName = functionName;
        this.parameters = parameters;
        this.localVariables = localVariables;
        this.bodyStatements = bodyStatements;
    }
    
    @Override
    public String getName() {
        return this.functionName;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public List<VarDeclaration> getParameters() {
        return this.parameters;
    }

    public List<VarDeclaration> getLocalVariables() {
        return this.localVariables;
    }

    public List<Statement> getBodyStatements() {
        return this.bodyStatements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(returnType.toString() + " " + functionName + "(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i));
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") {\n");
        for (VarDeclaration var : localVariables) {
            sb.append("\t" + var.toString() + "\n");
        }
        for (Statement stmt : bodyStatements) {
            sb.append("\t" + stmt.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
