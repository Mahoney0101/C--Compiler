grammar Cmm;

@header {
	import ast.*;
	import ast.expressions.*;
	import ast.statements.*;
	import types.*;
	import java.util.ArrayList;
	import java.util.*;
}
// ** PARSER RULES **
program returns [Program ast]
    :
    {
        List<Definition> definitions = new ArrayList<>();
    }
    ( v=varDeclaration      { definitions.addAll($v.ast); }
    | f=functionDeclaration { definitions.add($f.ast); } )*
    EOF { $ast = new Program($start.getLine(), $start.getCharPositionInLine()+1, definitions); }
    ;

varDeclaration returns [List<VarDeclaration> ast = new ArrayList<VarDeclaration>();]
    : t1=type ids1=idList SEMI
        {
            Type finalType = $t1.ast;
            for(String id : $ids1.ast) {
                $ast.add(new VarDeclaration($t1.start.getLine(), $t1.start.getCharPositionInLine() + 1, id, finalType));
            }
        }
    ;

varDeclarations returns [List<VarDeclaration> ast]
    : vd=varDeclaration vds=varDeclarations
        {
            $ast = new ArrayList<>();
            $ast.addAll($vd.ast);
            $ast.addAll($vds.ast);
        }
    |
        {
            $ast = new ArrayList<>();
        }
    ;


fieldDeclaration returns [List<VarDeclaration> ast = new ArrayList<VarDeclaration>()]
    : t=type ids=idList {
            Type finalType = $t.ast;
            for(String id : $ids.ast) {
                $ast.add(new VarDeclaration($t.start.getLine(), $t.start.getCharPositionInLine() + 1, id, finalType));
            }
      }
      (COMMA t1=type ids1=idList {
            finalType = $t1.ast;
            for(String id : $ids1.ast) {
                $ast.add(new VarDeclaration($t1.start.getLine(), $t1.start.getCharPositionInLine() + 1, id, finalType));
            }
      })*
      SEMI
    ;

functionDeclaration returns [FunctionDeclaration ast]
    : t=type n=(ID|MAIN) LPAREN p=paramList RPAREN LBRACE vd=varDeclarations stmts=statements RBRACE
    {
        $ast = new FunctionDeclaration($t.start.getLine(), $t.start.getCharPositionInLine()+1, new FunctionType($t.start.getLine(), $t.start.getCharPositionInLine()+1, $t.ast, $p.ast != null ? $p.ast : Collections.emptyList()), $n.text, $vd.ast, $stmts.ast);
    }
    |t1=type n1=(ID | MAIN) l1=LPAREN r1=RPAREN LBRACE vd=varDeclarations stmts=statements RBRACE
    {
        $ast = new FunctionDeclaration($t1.start.getLine(), $t1.start.getCharPositionInLine()+1, new FunctionType($t1.start.getLine(), $t1.start.getCharPositionInLine()+1, $t1.ast, Collections.emptyList()), $n1.text, $vd.ast, $stmts.ast);
    }
    ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]
          : f=functionCallStatement                { $ast.add($f.ast); }
          | assign=assignment                      { $ast.add($assign.ast); }
          | ifstmnt=ifStatement                    { $ast.add($ifstmnt.ast); }
          | whilestmnt=whileStatement              { $ast.add($whilestmnt.ast); }
          | ret=returnStatement                    { $ast.add($ret.ast); }
          | write=writeStatement                   { $ast.addAll($write.ast); }
          | read=readStatement                     { $ast.addAll($read.ast); }
          ;

functionCallStatement returns [FunctionCallStatement ast]
    : fce=functionCallExpression SEMI { $ast = new FunctionCallStatement($fce.ast.getLine(), $fce.ast.getColumn() + 1, $fce.ast); }
    ;

statements returns [List<Statement> ast]
    : stmt=statement stmts=statements
        {
            $ast = new ArrayList<>();
            $ast.addAll($stmt.ast);
            $ast.addAll($stmts.ast);
        }
    |
        {
            $ast = new ArrayList<>();
        }
    ;

// ** Specific Statement Types **

ifStatement returns [IfStatement ast]
    : IF LPAREN expr1=expr RPAREN LBRACE? stmts=statements RBRACE?
      {
          $ast = new IfStatement($IF.getLine(), $IF.getCharPositionInLine() + 1, $expr1.ast, $stmts.ast, null);
      }
      (ELSE LBRACE? stmts2=statements RBRACE?
      {
          $ast.setElseBlockStatements($stmts2.ast);
      })?
    ;

whileStatement returns [Statement ast]
    : WHILE LPAREN condition=expr RPAREN LBRACE? stmts=statements RBRACE?
    {
        $ast = new WhileStatement($WHILE.getLine(), $WHILE.getCharPositionInLine()+1, $condition.ast, $stmts.ast);
    }
    ;

returnStatement returns [Statement ast] : RETURN exp=expr SEMI { $ast = new ReturnStatement($RETURN.getLine(), $RETURN.getCharPositionInLine()+1, $exp.ast); };

writeStatement returns [List<Statement> ast = new ArrayList<Statement>()]
    : WRITE exprs=exprList SEMI
    {
        for(Expression expr : $exprs.expressions) {
            $ast.add(new WriteStatement($WRITE.getLine(), $WRITE.getCharPositionInLine()+1, expr));
        }
    }
    ;

readStatement returns [List<Statement> ast = new ArrayList<>()]
    : READ exprs=exprList SEMI
    {
        for(Expression expr : $exprs.expressions) {
            $ast.add(new ReadStatement($READ.getLine(), $READ.getCharPositionInLine()+1, expr));
        }
    }
    ;

assignment returns [Statement ast] : lhs=expr ASSIGN rhs=expr SEMI{$ast = new AssignmentStatement($start.getLine(),$start.getCharPositionInLine()+1,$lhs.ast,$rhs.ast);};

// ** Expressions and Types **
expr returns [Expression ast]
     : INT_CONSTANT                                 { $ast = new IntLiteralExpression($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
     | DOUBLE_CONSTANT                              { $ast = new DoubleLiteralExpression($DOUBLE_CONSTANT.getLine(), $DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($DOUBLE_CONSTANT.text)); }
     | CHAR_CONSTANT                                { $ast = new CharLiteralExpression($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
     | ID                                           { $ast = new VariableExpression($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
     | LPAREN e=expr RPAREN                         { $ast = $e.ast; }
     | SUB e=expr                                   { $ast = new UnaryMinusExpression($SUB.getLine(), $SUB.getCharPositionInLine()+1, $e.ast); }
     | NOT e=expr                                   { $ast = new LogicalNegationExpression($NOT.getLine(), $NOT.getCharPositionInLine()+1, $e.ast); }
     | e1=expr op=(MUL|DIV|MOD) e2=expr             { $ast = new ArithmeticExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(ADD|SUB)e2=expr                  { $ast = new ArithmeticExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(GT|GTE|LT|LTE|NEQ|EQ) e2=expr    { $ast = new EqualityExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(AND|OR) e2=expr                  { $ast = new LogicalExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | f=functionCallExpression                     { $ast = $f.ast; }
     | e1=expr DOT ID                               { $ast = new StructFieldAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $ID.text); }
     | e1=expr LBRACKET e2=expr RBRACKET            { $ast = new ArrayAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | LPAREN t=type RPAREN e=expr                  { $ast = new CastExpression($LPAREN.getLine(), $LPAREN.getCharPositionInLine()+1, $t.ast, $e.ast);     }
     ;

exprList returns [List<Expression> expressions = new ArrayList<Expression>()]
    : e=expr            {$expressions.add($e.ast);}
    (COMMA exp=expr     {$expressions.add($exp.ast);})*
    ;

paramList returns [List<Parameter> ast = new ArrayList<Parameter>()]
    : p=param           { $ast.add($p.ast); }
    (COMMA p1=param     { $ast.add($p1.ast); })*
    ;

param returns [Parameter ast]
    : t=type n=ID       { $ast = new Parameter($t.start.getLine(), $t.start.getCharPositionInLine()+1, $n.text, $t.ast); }
    ;

structType returns [StructType ast]
    : STRUCT LBRACE fds=fieldDeclarations RBRACE { $ast = new StructType($start.getLine(), $start.getCharPositionInLine()+1, $fds.ast); }
    ;

fieldDeclarations returns [List<VarDeclaration> ast = new ArrayList<VarDeclaration>()]
    : (fd=fieldDeclaration { $ast.addAll($fd.ast); } )+
    ;

arrayType returns [Type ast]
    : baseType dims=arrayDimensions         { $ast = new ArrayType($start.getLine(), $start.getCharPositionInLine()+1, $baseType.ast, $dims.sizes); }
    ;

functionType returns [FunctionType ast]
    : returnType=baseType LPAREN params=paramList? RPAREN { $ast = new FunctionType($start.getLine(), $start.getCharPositionInLine()+1, $returnType.ast, $params.ast); }
    ;

type returns [Type ast]
    : a=arrayType                           { $ast = $a.ast; }
    | INT                                   { $ast = IntType.getInstance(); }
    | DOUBLE                                { $ast = DoubleType.getInstance(); }
    | CHAR                                  { $ast = CharType.getInstance(); }
    | VOID                                  { $ast = VoidType.getInstance(); }
    | t=structType                          { $ast = $t.ast; }
    | f=functionType                        { $ast = $f.ast; }
    ;

baseType returns [Type ast]
    : INT                                   { $ast = IntType.getInstance(); }
    | DOUBLE                                { $ast = DoubleType.getInstance(); }
    | CHAR                                  { $ast = CharType.getInstance(); }
    | VOID                                  { $ast = VoidType.getInstance(); }
    | t=structType                          { $ast = $t.ast; }
    ;

idList returns [List<String> ast = new ArrayList<String>()]
    : a=ID arrayDimensions?                 { $ast.add($a.text); }
      (COMMA b=ID arrayDimensions?          { $ast.add($b.text); })*
    ;

arrayDimensions returns [List<Integer> sizes = new ArrayList<>();]
    : (LBRACKET ic=INT_CONSTANT RBRACKET { $sizes.add(Integer.parseInt($ic.text)); } )+
    ;

functionCallExpression returns [FunctionCallExpression ast]
    : ID LPAREN el=exprList RPAREN
    {
        $ast = new FunctionCallExpression(
            $ID.getLine(),
            $ID.getCharPositionInLine() + 1,
            new VariableExpression(
                        $ID.getLine(),
                        $ID.getCharPositionInLine() + 1,
                        $ID.getText()),
            $el.expressions
        );
    }
    | i1=ID l1=LPAREN r1=RPAREN
    {
            $ast = new FunctionCallExpression(
                $i1.getLine(),
                $i1.getCharPositionInLine() + 1,
            new VariableExpression(
                        $i1.getLine(),
                        $i1.getCharPositionInLine() + 1,
                        $i1.getText()),
                Collections.emptyList()
            );
    }
    ;

// ** LEXER RULES **
IF : 'if';
ELSE : 'else';
WHILE : 'while';
VOID : 'void';
MAIN : 'main';
WRITE : 'write';
STRUCT : 'struct';
INT : 'int';
DOUBLE : 'double';
CHAR : 'char';
READ : 'read';
RETURN : 'return';
ASSIGN : '=';
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
SEMI : ';';
COMMA : ',';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';
NEQ : '!=';
EQ : '==';
AND : '&&';
OR : '||';
NOT : '!';
DOT : '.';

// ** Identifiers and Literals **
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;
CHAR_CONSTANT : '\'' ( ESCAPE_SEQUENCE | '\\' INT_CONSTANT | ~('\'' | '\\') ) '\'';
DOUBLE_CONSTANT : INT_CONSTANT '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;
INT_CONSTANT : '0' | [1-9][0-9]* ;

fragment ESCAPE_SEQUENCE : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\');
fragment EXPONENT : [eE] [+-]? INT_CONSTANT;

// ** Comments and Whitespace **
ONE_LINE_COMMENT : '//' ~('\n')* '\n'? -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;

