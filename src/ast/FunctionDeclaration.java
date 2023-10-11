package ast;

import java.util.List;
import visitor.Visitor;
import types.*;
import ast.statements.*;

public class FunctionDeclaration extends AbstractASTNode {
    private Type returnType;
    private String functionName;
    private List<Parameter> parameters;
    private Block functionBody;

    public FunctionDeclaration(int line, int column, Type returnType, String functionName, List<Parameter> parameters, Block functionBody) {
        super(line, column);
        this.returnType = returnType;
        this.functionName = functionName;
        this.parameters = parameters;
        this.functionBody = functionBody;
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

    public Block getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        return returnType + " " + functionName + "(" + parameters + ")" + " " + functionBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
