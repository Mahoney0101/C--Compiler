package ast;

import visitor.Visitor;
import types.*;
import ast.statements.*;

import java.util.List;

public class FunctionDeclaration extends AbstractASTNode {
    private FunctionType functionType;
    private String functionName;
    private List<VarDeclaration> vars;
    private List<Statement> statements;

    public FunctionDeclaration(int line,
                               int column,
                               FunctionType functionType,
                               String functionName,
                               List<VarDeclaration> vars,
                               List<Statement> statements) {
        super(line, column);
        this.functionType = functionType;
        this.functionName = functionName;
        this.vars = vars;
        this.statements = statements;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<VarDeclaration> getVars() {
        return vars;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionType).append(" ").append(functionName).append("(").append(functionType.getParametersAsString()).append(") {\n");

        for (VarDeclaration varDecl : vars) {
            sb.append("    ").append(varDecl).append("\n");
        }
        for (Statement stmt : statements) {
            sb.append("    ").append(stmt).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}