package ast;

import ast.statements.Block;
import visitor.Visitor;


public class MainFunctionDeclaration extends AbstractASTNode {
    private String returnType;
    private String functionName;
    private Block functionBody;

    public MainFunctionDeclaration(int line, int column, String returnType, String functionName, Block functionBody) {
        super(line, column);
        this.returnType = returnType;
        this.functionName = functionName;
        this.functionBody = functionBody;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getFunctionName() {
        return functionName;
    }


    public Block getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        return returnType + " " + functionName + " " + functionBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
