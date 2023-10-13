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
// ** Program Structure **
program returns [Program ast]
    :
    {
        List<VarDeclaration> varDecls = new ArrayList<>();
        List<FunctionDeclaration> funcDefs = new ArrayList<>();
        MainFunctionDeclaration mainFnc = null;
    }
    ( v=varDeclaration      { varDecls.add($v.ast); }
    | f=functionDeclaration { funcDefs.add($f.ast); } )*
    m=mainFunction { mainFnc = $m.ast; }
    EOF { $ast = new Program($start.getLine(), $start.getCharPositionInLine()+1, varDecls, funcDefs, mainFnc); }
    ;

mainFunction returns [MainFunctionDeclaration ast]:
    v=VOID m=MAIN lp=LPAREN lp=RPAREN b=block
    {
            $ast = new MainFunctionDeclaration($v.getLine(), $v.getCharPositionInLine()+1, $v.text, $m.text, $b.ast);
    }
    ;

// ** Declarations **
varDeclaration returns [VarDeclaration ast]
    : t1=type ids1=idList SEMI
        {
            Type finalType = $t1.ast;
            $ast = new VarDeclaration($t1.start.getLine(), $t1.start.getCharPositionInLine() + 1, $ids1.ast, finalType);
        }
    | t=type ad=arrayDimensions ids=idList SEMI
        {
            Type finalType = $t.ast;
            finalType = new ArrayType($t.start.getLine(), $t.start.getCharPositionInLine() + 1, finalType, $ad.size);
            $ast = new VarDeclaration($t.start.getLine(), $t.start.getCharPositionInLine() + 1, $ids.ast, finalType);
        }
    ;

fieldDeclaration returns [List<FieldDeclaration> ast = new ArrayList<FieldDeclaration>()]
    : t=type ad=arrayDimensions ids=idList SEMI
        {
            Type finalType = $t.ast;
            finalType = new ArrayType($t.start.getLine(), $t.start.getCharPositionInLine() + 1, finalType, $ad.size);
            for(String id : $ids.ast) {
                FieldDeclaration field = new FieldDeclaration($t.start.getLine(), $t.start.getCharPositionInLine() + 1, finalType, id);
                $ast.add(field);
            }
        }
        | t=type ids=idList SEMI
        {
            Type finalType = $t.ast;
            for(String id : $ids.ast) {
                FieldDeclaration field = new FieldDeclaration($t.start.getLine(), $t.start.getCharPositionInLine() + 1, finalType, id);
                $ast.add(field);
            }
        }
    ;

structType returns [StructType ast]
    : STRUCT  LBRACE fds=fieldDeclaration+ RBRACE id=ID?
        {
            $ast = new StructType($start.getLine(), $start.getCharPositionInLine()+1, $fds.ast);
        }
    ;

functionDeclaration returns [FunctionDeclaration ast]
    : t=type n=ID LPAREN p=paramList RPAREN b=block
    {
        $ast = new FunctionDeclaration($t.start.getLine(), $t.start.getCharPositionInLine()+1, $t.ast, $n.text, $p.ast != null ? $p.ast : Collections.emptyList(), $b.ast);
    }
    |t1=type n1=ID l1=LPAREN r1=RPAREN b1=block
    {
        $ast = new FunctionDeclaration($t1.start.getLine(), $t1.start.getCharPositionInLine()+1, $t1.ast, $n1.text, Collections.emptyList(), $b1.ast);
    }
    ;

// ** Statements and Blocks **
statement returns [Statement ast]
          : f=functionCallStatement                { $ast = $f.ast; }
          | vd=varDeclaration                      { $ast = $vd.ast; }
          | assign=assignment                      { $ast = $assign.ast; }
          | ifstmnt=ifStatement                    { $ast = $ifstmnt.ast; }
          | whilestmnt=whileStatement              { $ast = $whilestmnt.ast; }
          | ret=returnStatement                    { $ast = $ret.ast; }
          | write=writeStatement                   { $ast = $write.ast; }
          | read=readStatement                     { $ast = $read.ast; }
          ;

statements returns [List<Statement> ast]
    : stmt=statement stmts=statements
        {
            $ast = new ArrayList<>();
            $ast.add($stmt.ast);
            $ast.addAll($stmts.ast);
        }
    |
        {
            $ast = new ArrayList<>();
        }
    ;

block returns [Block ast]
    : LBRACE stmts=statements RBRACE
        {
            $ast = new Block($start.getLine(), $start.getCharPositionInLine()+1, $stmts.ast);
        }
    | stmt=statement
        {
            $ast = new Block($stmt.start.getLine(), $stmt.start.getCharPositionInLine()+1, Arrays.asList($stmt.ast));
        }
    ;

// ** Specific Statement Types **
ifStatement returns [IfStatement ast]: IF LPAREN expr1=expr RPAREN block1=block (ELSE block2=block)? {$ast = new IfStatement($IF.getLine(),$IF.getCharPositionInLine() + 1,$expr1.ast,$block1.ast,($block2.ast != null) ? $block2.ast : null);};
whileStatement returns [Statement ast] : WHILE LPAREN condition=expr RPAREN blk=block { $ast = new WhileStatement($start.getLine(), $start.getCharPositionInLine()+1, $condition.ast, $blk.ast); };
returnStatement returns [Statement ast] : RETURN exp=expr SEMI { $ast = new ReturnStatement($start.getLine(), $start.getCharPositionInLine()+1, $exp.ast); };
writeStatement returns [Statement ast]: WRITE exprs=exprList SEMI { $ast = new WriteStatement($start.getLine(), $start.getCharPositionInLine()+1, $exprs.expressions); };
readStatement returns [Statement ast]: READ exprs=exprList SEMI { $ast = new ReadStatement($start.getLine(), $start.getCharPositionInLine()+1, $exprs.expressions); };
assignment returns [Statement ast] : lhs=expr ASSIGN rhs=expr SEMI{$ast = new AssignmentStatement($start.getLine(),$start.getCharPositionInLine()+1,$lhs.ast,$rhs.ast);};


// ** Expressions and Types **
expr returns [Expression ast]
     : INT_CONSTANT                                 { $ast = new IntLiteralExpression($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
     | DOUBLE_CONSTANT                              { $ast = new DoubleLiteralExpression($DOUBLE_CONSTANT.getLine(), $DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($DOUBLE_CONSTANT.text)); }
     | CHAR_CONSTANT                                { $ast = new CharLiteralExpression($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
     | ID                                           { $ast = new VariableExpression($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
     | LPAREN e=expr RPAREN                         { $ast = $e.ast; }
     | LBRACKET e=expr RBRACKET                     { $ast = $e.ast; }
     | SUB e=expr                                   { $ast = new UnaryMinusExpression($SUB.getLine(), $SUB.getCharPositionInLine()+1, $e.ast); }
     | NOT e=expr                                   { $ast = new LogicalNegationExpression($NOT.getLine(), $NOT.getCharPositionInLine()+1, $e.ast); }
     | e1=expr op=(MUL|DIV|MOD) e2=expr             { $ast = new ArithmeticExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(ADD|SUB)e2=expr                  { $ast = new ArithmeticExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(GT|GTE|LT|LTE|NEQ|EQ) e2=expr    { $ast = new EqualityExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | e1=expr op=(AND|OR) e2=expr                  { $ast = new LogicalExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
     | f=functionCallExpression                     { $ast = $f.ast; }
     | e1=expr DOT ID                               { $ast = new NestedStructFieldAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $ID.text); }
     | e1=expr LBRACKET e2=expr RBRACKET            { $ast = new ArrayAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | LPAREN t=type RPAREN e=expr                  { $ast = new CastExpression($LPAREN.getLine(), $LPAREN.getCharPositionInLine()+1, $t.ast, $e.ast);     }
     ;

exprList returns [List<Expression> expressions = new ArrayList<Expression>()]
    : e=expr            {$expressions.add($e.ast);}
    (COMMA exp=expr     {$expressions.add($exp.ast);})*
    ;

paramList returns [List<Parameter> ast = new ArrayList<Parameter>()]
    : p=param
    { $ast.add($p.ast); }
    (COMMA p1=param { $ast.add($p1.ast); })*
    ;

param returns [Parameter ast]
    : t=type n=ID
    { $ast = new Parameter($t.start.getLine(), $t.start.getCharPositionInLine()+1, $n.text, $t.ast); }
    ;

type returns [Type ast]
    : INT           { $ast = IntType.getInstance(); }
    | DOUBLE        { $ast = DoubleType.getInstance(); }
    | CHAR          { $ast = CharType.getInstance(); }
    | VOID          { $ast = VoidType.getInstance(); }
    | ID            { $ast = new UserDefinedType($ID.getLine(), $ID.getCharPositionInLine(), $ID.text); }
    | t=structType  { $ast = $t.ast; }
    ;


idList returns [List<String> ast = new ArrayList<String>()]
    : a=ID arrayDimensions?             { $ast.add($a.text); }
      (COMMA b=ID arrayDimensions?      { $ast.add($b.text); })*
    ;

arrayDimensions returns [int size = 0 ]
    : (LBRACKET ic=INT_CONSTANT RBRACKET)+ { $size = Integer.parseInt($ic.text); }
    ;

functionCallStatement returns [FunctionCallStatement ast]
    : fce=functionCallExpression SEMI { $ast = new FunctionCallStatement($fce.ast.getLine(), $fce.ast.getColumn() + 1, $fce.ast); }
    ;

functionCallExpression returns [FunctionCallExpression ast]
    : ID LPAREN el=exprList RPAREN
    {
        $ast = new FunctionCallExpression(
            $ID.getLine(),
            $ID.getCharPositionInLine() + 1,
            $ID.getText(),
            $el.expressions
        );
    }
    | i1=ID l1=LPAREN r1=RPAREN
    {
            $ast = new FunctionCallExpression(
                $i1.getLine(),
                $i1.getCharPositionInLine() + 1,
                $i1.getText(),
                Collections.emptyList()
            );
    }
    ;

// ** LEXER RULES **

// ** Keywords and Special Symbols **
IF : 'if';
ELSE : 'else';
WHILE : 'while';
VOID : 'void';
MAIN : 'main';  // 'main' function identifier.
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
CHAR_CONSTANT : '\'' ( ESCAPE_SEQUENCE | ~('\'' | '\\') ) '\'';
DOUBLE_CONSTANT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;
INT_CONSTANT : '0' | [1-9][0-9]* ;

fragment ESCAPE_SEQUENCE : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\') | '\\' [0-7] [0-7]? [0-7]?;
fragment EXPONENT : [eE] [+-]? [0-9]+;

// ** Comments and Whitespace **
ONE_LINE_COMMENT : '//' ~('\n')* -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;

