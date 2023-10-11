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
program : (varDeclaration | functionDeclaration | structDeclaration)* mainFunction EOF;
mainFunction : VOID MAIN LPAREN RPAREN block;

// ** Declarations **
varDeclaration returns [VarDeclaration ast]
    : t=typeOrStruct ad=arrayDimensions? ids=idList SEMI
        {
            Type finalType = $t.ast;
            int line = $t.line;
            int col = $t.col;

            if ($ad.size > 0) { //Ensure $ad.size > 0 is valid for your case
                finalType = new ArrayType(line, col, finalType, $ad.size);
            }

            $ast = new VarDeclaration(line, col, $ids.ast, finalType);
        }
    ;

typeOrStruct returns [Type ast, int line, int col]
    : t1=type
        {
            $ast = $t1.ast;
            $line = $t1.start.getLine();
            $col = $t1.start.getCharPositionInLine() + 1;
        }
    | t2=structTypeDeclaration
        {
            $ast = $t2.ast;
            $line = $t2.start.getLine();
            $col = $t2.start.getCharPositionInLine() + 1;
        }
    ;

fieldDeclaration returns [List<FieldDeclaration> ast]
    : t=typeOrStruct ad=arrayDimensions? ids=idList SEMI
        {
            $ast = new ArrayList<>();
            Type finalType = $t.ast;

            // Handling array dimensions if provided.
            if ($ad.size > 0) {
                finalType = new ArrayType($t.line, $t.col, finalType, $ad.size);
            }

            // Construct FieldDeclaration objects and add them to the ast.
            for(String id : $ids.ast) {
                FieldDeclaration field = new FieldDeclaration($t.line, $t.col, finalType, id);
                $ast.add(field);
            }
        }
    ;


structTypeDeclaration returns [Type ast]
    : STRUCT id=ID? LBRACE fds=fieldDeclaration+ RBRACE
        {
            $ast = new StructType($start.getLine(), $start.getCharPositionInLine()+1, $fds.ast);
        }
    ;



structDeclaration returns [StructDefinition ast]
    : STRUCT LBRACE fds=fieldDeclaration+ RBRACE (ad=arrayDimensions)? ID? SEMI
        {
            String structName = $ID != null ? $ID.text : null;
            $ast = new StructDefinition($start.getLine(),
                                        $start.getCharPositionInLine()+1,
                                        structName,
                                        $fds.ast,
                                        $ad.size);
        }
    ;

functionDeclaration returns [FunctionDeclaration ast]
    : t=type n=ID LPAREN p=paramList? RPAREN b=block
    {
        $ast = new FunctionDeclaration($t.start.getLine(), $t.start.getCharPositionInLine()+1, $t.ast, $n.text, $p.ast != null ? $p.ast : Collections.emptyList(), $b.ast);
    }
    ;

// ** Statements and Blocks **
statement returns [Statement ast]
          : vd=varDeclaration                      { $ast = $vd.ast; }
          | assign=assignment                      { $ast = $assign.ast; }
          | ifstmnt=ifStatement                    { $ast = $ifstmnt.ast; }
          | whilestmnt=whileStatement              { $ast = $whilestmnt.ast; }
          | ret=returnStatement                    { $ast = $ret.ast; }
          | write=writeStatement                   { $ast = $write.ast; }
          | read=readStatement                     { $ast = $read.ast; }
          | es=expressionStatement                 { $ast = $es.ast; }
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
ifStatement returns [IfStatement ast]
    : IF LPAREN expr1=expr RPAREN block1=block (ELSE block2=block)?
        {
            $ast = new IfStatement($IF.getLine(),
                                   $IF.getCharPositionInLine() + 1,
                                   $expr1.ast,
                                   $block1.ast,
                                   ($block2.ast != null) ? $block2.ast : null);
        }
    ;


assignment returns [Statement ast] : lhs=expr ASSIGN rhs=expr SEMI{$ast = new AssignmentStatement($start.getLine(),$start.getCharPositionInLine()+1,$lhs.ast,$rhs.ast);};
whileStatement returns [Statement ast] : WHILE LPAREN condition=expr RPAREN blk=block { $ast = new WhileStatement($start.getLine(), $start.getCharPositionInLine()+1, $condition.ast, $blk.ast); };
returnStatement returns [Statement ast] : RETURN exp=expr SEMI { $ast = new ReturnStatement($start.getLine(), $start.getCharPositionInLine()+1, $exp.ast); };

writeStatement returns [Statement ast]
: WRITE exprs=exprList SEMI
    { $ast = new WriteStatement($start.getLine(), $start.getCharPositionInLine()+1, $exprs.expressions); }
;

readStatement returns [Statement ast]
: READ exprs=exprList SEMI
    { $ast = new ReadStatement($start.getLine(), $start.getCharPositionInLine()+1, $exprs.expressions); }
;

expressionStatement returns [Statement ast]
    : expr1=expr SEMI
        {
            $ast = new ExpressionStatement($expr1.start.getLine(),
                                            $expr1.start.getCharPositionInLine() + 1,
                                            $expr1.ast);
        }
    ;


// ** Expressions and Types **
expr returns [Expression ast]
     : e1=expr OR e2=expr             { $ast = new LogicalOrExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr AND e2=expr            { $ast = new LogicalAndExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr EQ e2=expr             { $ast = new EqualsExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr NEQ e2=expr            { $ast = new NotEqualsExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr LTE e2=expr            { $ast = new LessThanOrEqualsExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr LT e2=expr             { $ast = new LessThanExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr GTE e2=expr            { $ast = new GreaterThanOrEqualExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr GT e2=expr             { $ast = new GreaterThanExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr ADD e2=expr            { $ast = new AddExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr SUB e2=expr            { $ast = new SubtractExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr MUL e2=expr            { $ast = new MultiplyExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr DIV e2=expr            { $ast = new DivideExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | e1=expr MOD e2=expr            { $ast = new ModulusExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | SUB e=expr                     { $ast = new UnaryMinusExpression($SUB.getLine(), $SUB.getCharPositionInLine()+1, $e.ast); }
     | NOT e=expr                     { $ast = new LogicalNegationExpression($NOT.getLine(), $NOT.getCharPositionInLine()+1, $e.ast); }
     | LPAREN e=expr RPAREN           { $ast = $e.ast; }
     | INT_CONSTANT                   { $ast = new IntLiteralExpression($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
     | DOUBLE_CONSTANT                { $ast = new DoubleLiteralExpression($DOUBLE_CONSTANT.getLine(), $DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($DOUBLE_CONSTANT.text)); }
     | CHAR_CONSTANT                  { $ast = new CharLiteralExpression($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
     | ID                             { $ast = new VariableExpression($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
     | functionCall
     | e1=expr DOT ID                 { $ast = new NestedStructFieldAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $ID.text); }
     | e1=expr LBRACKET e2=expr RBRACKET { $ast = new ArrayAccessExpression($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
     | LPAREN t=type RPAREN e=expr     { $ast = new CastExpression($LPAREN.getLine(), $LPAREN.getCharPositionInLine()+1, $t.ast, $e.ast);     };




exprList returns [List<Expression> expressions]
    : e+=expr (COMMA e+=expr)*
    {
        $expressions = new ArrayList<>();
        for (ExprContext ec : $e) {
            $expressions.add(ec.ast);
        }
    }
    | { $expressions = Collections.emptyList(); }
    ;




paramList returns [List<Parameter> ast]
    : p=param {
        $ast = new ArrayList<>();
        $ast.add($p.ast);
      }
      (COMMA p1=param { $ast.add($p1.ast); })*
    | { $ast = Collections.emptyList(); }
    ;

param returns [Parameter ast]
    : t=type n=ID
      { $ast = new Parameter($t.start.getLine(), $t.start.getCharPositionInLine()+1, $n.text, $t.ast); }
    ;


type returns [Type ast]
    : bt=baseType
        { $ast = $bt.ast; } // Return the AST node created in baseType
    | ID
         { $ast = new UserDefinedType($ID.getLine(), $ID.getCharPositionInLine(), $ID.text); }
    ;

baseType returns [Type ast]
    : INT
        { $ast = IntType.getInstance(); } // Assuming you have a similar singleton for IntType
    | DOUBLE
        { $ast = DoubleType.getInstance(); } // Use the singleton instance
    | CHAR
        { $ast = CharType.getInstance(); } // Assuming you have a similar singleton for CharType
    | VOID
        { $ast = VoidType.getInstance(); } // Assuming you have a similar singleton for VoidType
    ;


// ** Variable and Function Handling **
idList returns [List<String> ast]
    : a=ID arrayDimensions? { $ast = new ArrayList<>(); $ast.add($a.text); }
      (COMMA b=ID arrayDimensions? { $ast.add($b.text); })*
    ;

arrayDimensions returns [int size]
    : (LBRACKET ic=INT_CONSTANT RBRACKET)+ { $size = Integer.parseInt($ic.text); }
    | { $size = 0; }
    ;



functionCall returns [Expression ast]
    : ID LPAREN el=exprList? RPAREN
    {
        $ast = new FunctionCallExpression(
            $ID.getLine(),
            $ID.getCharPositionInLine() + 1,
            $ID.getText(),
            $el.expressions
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

