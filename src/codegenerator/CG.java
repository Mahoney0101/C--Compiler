package codegenerator;

import java.io.*;

import ast.*;
import ast.expressions.VariableExpression;
import types.*;

public class CG {

    private PrintWriter out;

    public CG(String outputFilename, String sourceFilename) {
        try {
            this.out=new PrintWriter(outputFilename);
        }
        catch (IOException e) {
            System.err.println("Error opening the file "+outputFilename+".");
            System.exit(-1);
        }
        this.source(sourceFilename);

        this.comment("\tInvocation to the main function");
        this.callMain();
        this.halt();
    }

    public void output(Type type) {
        out.println("\tout"+type.suffix());
        out.flush();
    }

    public void input(Type type) {
        out.println("\tin"+type.suffix());
        out.flush();
    }

    private int labelCounter = 0;

    public String generateNewLabel() {
        return "label" + (labelCounter++);
    }

    public void label(String labelName) {
        out.println(" "+labelName + ":");
        out.flush();
    }

    public void enter(int constant) {
        out.println("\tenter: " + constant);
        out.flush();
    }

    public void ret(int returnValueSize, int localVariableSize, int parameterVariableSize) {
        out.println("\tret " + returnValueSize +", "+localVariableSize+", "+parameterVariableSize);
        out.flush();
    }

    public void jump(String label) {
        out.println("\tjmp " + label);
        out.flush();
    }

    public void callMain() {
        out.println("\tcall main");
        out.flush();
    }

    public void halt() {
        out.println("\thalt");
        out.flush();
    }

    public void jumpIfFalse(String label) {
        out.println("\tjz " + label);
        out.flush();
    }

    public void loopConditionCheck(String endLabel) {
        out.println("\tjz " + endLabel);
        out.flush();
    }

    public void pusha(int offset) {
        out.println("\tpusha\t"+offset+"");
        out.flush();
    }

    public void pushbp() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void load(Type type) {
        out.println("\tload"+type.suffix());
        out.flush();
    }

    public void store(Type type) {
        out.println("\tstore"+type.suffix());
        out.flush();
    }

    public void castCharToInt() {
        out.println("\tb2i");
        out.flush();
    }

    public void castIntToDouble() {
        out.println("\ti2f");
        out.flush();
    }

    public void castDoubleToInt() {
        out.println("\ti2f");
        out.flush();
    }

    public void add(Type type) {
        out.println("\tadd"+type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tsub"+type.suffix());
        out.flush();
    }


    public void mul(Type type) {
        out.println("\tmul"+type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("\tdiv"+type.suffix());
        out.flush();
    }

    public void gt(Type type) {
        out.println("\tgt"+type.suffix());
        out.flush();
    }

    public void gte(Type type) {
        out.println("\tge"+type.suffix());
        out.flush();
    }

    public void lt(Type type) {
        out.println("\tlt"+type.suffix());
        out.flush();
    }

    public void lte(Type type) {
        out.println("\tle"+type.suffix());
        out.flush();
    }

    public void eq(Type type) {
        out.println("\teq"+type.suffix());
        out.flush();
    }

    public void neq(Type type) {
        out.println("\tneq"+type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        out.println("\tmod"+type.suffix());
        out.flush();
    }

    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public void debug() {
        out.println("\tdebug\t");
        out.flush();
    }

    public void push(int constant) {
        out.println("\tpushi\t"+constant+"");
        out.flush();
    }

    public void push(double constant) {
        out.println("\tpushf\t"+constant+"");
        out.flush();
    }

    public void push(char constant) {
        out.println("\tpushb\t"+(int)constant+"");
        out.flush();
    }

    public void newLine() {
        out.println();
        out.flush();
    }
    public void comment(String message) {
        out.println("\t' * "+message+"");
        out.flush();
    }

    public void declaration(VarDeclaration varDefinition) {
        comment(varDefinition.getType().toString()+" "+varDefinition.getName()+" (offset "+varDefinition.getOffset()+")");
        out.flush();
    }

    public void pushAddress(VariableExpression variable) {
        VarDeclaration varDefinition = (VarDeclaration) variable.getDefinition();
        pusha(varDefinition.getOffset());
    }

    public void line(ASTNode nodo) {
        out.println("\n#line\t"+nodo.getLine());
        out.flush();
    }

    private void source(String infilename) {
        out.println("\n#source\t\""+infilename+"\"\n");
        out.flush();
    }

    public void arithmetic(String operator, Type type) {
        switch (operator.charAt(0)) {
            case '+': this.add(type); break;
            case '-': this.sub(type); break;
            case '/': this.div(type); break;
            case '*': this.mul(type); break;
            case '%': this.mod(type); break;
            default: assert false :"Unknown arithmetic operator";
        }
    }

    public void logical(String operator) {
        switch (operator) {
            case "&&": this.and(); break;
            case "||": this.or(); break;
            default: assert false :"Unknown logical operator";
        }
    }

    public void relational(String operator, Type type) {
        switch (operator) {
            case ">": this.gt(type); break;
            case ">=": this.gte(type); break;
            case "<": this.lt(type); break;
            case "<=": this.lte(type); break;
            case "==": this.eq(type); break;
            case "!=": this.neq(type); break;
            default: assert false :"Unknown relational operator";
        }
    }
}
