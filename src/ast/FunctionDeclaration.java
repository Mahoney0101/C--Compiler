package ast;

import java.net.http.WebSocket;
import java.util.List;
import visitor.Visitor;
import types.*;
import ast.statements.*;

public class FunctionDeclaration extends AbstractASTNode {
    private Type returnType;
    private String functionName;
    private List<Parameter> parameters;
    private List<VarDeclaration> vars;
    private List<Statement> statements;

    public FunctionDeclaration(int line, int column, Type returnType, String functionName, List<Parameter> parameters, List<VarDeclaration> vars, List<Statement> statemets) {
        super(line, column);
        this.returnType = returnType;
        this.functionName = functionName;
        this.parameters = parameters;
        this.vars = vars;
        this.statements = statemets;
    }

    public Type getReturnType() {
        return returnType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Parameter> getParameters() {
        return parameters;
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
        sb.append(returnType).append(" ").append(functionName).append("(");

        // Append parameters
        for(int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i));
            if(i < parameters.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(") {\n");

        // Append variable declarations
        for(VarDeclaration varDecl : vars) {
            sb.append("    ").append(varDecl).append("\n");
        }

        // Append statements
        for(Statement stmt : statements) {
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
