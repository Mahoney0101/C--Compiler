// Generated from C:/Users/hoooc/IdeaProjects/lab5_ast/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;

	import ast.*;
	import ast.expressions.*;
	import ast.statements.*;
	import types.*;
	import java.util.ArrayList;
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, VOID=4, MAIN=5, WRITE=6, STRUCT=7, INT=8, DOUBLE=9, 
		CHAR=10, READ=11, RETURN=12, ASSIGN=13, LBRACE=14, RBRACE=15, LPAREN=16, 
		RPAREN=17, LBRACKET=18, RBRACKET=19, SEMI=20, COMMA=21, ADD=22, SUB=23, 
		MUL=24, DIV=25, MOD=26, GT=27, GTE=28, LT=29, LTE=30, NEQ=31, EQ=32, AND=33, 
		OR=34, NOT=35, DOT=36, ID=37, CHAR_CONSTANT=38, DOUBLE_CONSTANT=39, INT_CONSTANT=40, 
		ONE_LINE_COMMENT=41, MULTI_LINE_COMMENT=42, WS=43;
	public static final int
		RULE_program = 0, RULE_mainFunction = 1, RULE_varDeclaration = 2, RULE_fieldDeclaration = 3, 
		RULE_structType = 4, RULE_functionDeclaration = 5, RULE_statement = 6, 
		RULE_statements = 7, RULE_block = 8, RULE_ifStatement = 9, RULE_assignment = 10, 
		RULE_whileStatement = 11, RULE_returnStatement = 12, RULE_writeStatement = 13, 
		RULE_readStatement = 14, RULE_expressionStatement = 15, RULE_expr = 16, 
		RULE_exprList = 17, RULE_paramList = 18, RULE_param = 19, RULE_type = 20, 
		RULE_idList = 21, RULE_arrayDimensions = 22, RULE_functionCall = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFunction", "varDeclaration", "fieldDeclaration", "structType", 
			"functionDeclaration", "statement", "statements", "block", "ifStatement", 
			"assignment", "whileStatement", "returnStatement", "writeStatement", 
			"readStatement", "expressionStatement", "expr", "exprList", "paramList", 
			"param", "type", "idList", "arrayDimensions", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'void'", "'main'", "'write'", "'struct'", 
			"'int'", "'double'", "'char'", "'read'", "'return'", "'='", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "';'", "','", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'!'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "VOID", "MAIN", "WRITE", "STRUCT", "INT", 
			"DOUBLE", "CHAR", "READ", "RETURN", "ASSIGN", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "GT", "GTE", "LT", "LTE", "NEQ", "EQ", "AND", "OR", "NOT", 
			"DOT", "ID", "CHAR_CONSTANT", "DOUBLE_CONSTANT", "INT_CONSTANT", "ONE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<StructTypeContext> structType() {
			return getRuleContexts(StructTypeContext.class);
		}
		public StructTypeContext structType(int i) {
			return getRuleContext(StructTypeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(48);
						varDeclaration();
						}
						break;
					case 2:
						{
						setState(49);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(50);
						structType();
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			mainFunction();
			setState(57);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VOID);
			setState(60);
			match(MAIN);
			setState(61);
			match(LPAREN);
			setState(62);
			match(RPAREN);
			setState(63);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration ast;
		public TypeContext t1;
		public IdListContext ids1;
		public TypeContext t;
		public ArrayDimensionsContext ad;
		public IdListContext ids;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((VarDeclarationContext)_localctx).t1 = type();
				setState(66);
				((VarDeclarationContext)_localctx).ids1 = idList();
				setState(67);
				match(SEMI);

				            Type finalType = ((VarDeclarationContext)_localctx).t1.ast;

				            ((VarDeclarationContext)_localctx).ast =  new VarDeclaration((((VarDeclarationContext)_localctx).t1!=null?(((VarDeclarationContext)_localctx).t1.start):null).getLine(), (((VarDeclarationContext)_localctx).t1!=null?(((VarDeclarationContext)_localctx).t1.start):null).getCharPositionInLine() + 1, ((VarDeclarationContext)_localctx).ids1.ast, finalType);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((VarDeclarationContext)_localctx).t = type();
				setState(71);
				((VarDeclarationContext)_localctx).ad = arrayDimensions();
				setState(72);
				((VarDeclarationContext)_localctx).ids = idList();
				setState(73);
				match(SEMI);

				            Type finalType = ((VarDeclarationContext)_localctx).t.ast;

				            finalType = new ArrayType((((VarDeclarationContext)_localctx).t!=null?(((VarDeclarationContext)_localctx).t.start):null).getLine(), (((VarDeclarationContext)_localctx).t!=null?(((VarDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, finalType, ((VarDeclarationContext)_localctx).ad.size);

				            ((VarDeclarationContext)_localctx).ast =  new VarDeclaration((((VarDeclarationContext)_localctx).t!=null?(((VarDeclarationContext)_localctx).t.start):null).getLine(), (((VarDeclarationContext)_localctx).t!=null?(((VarDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, ((VarDeclarationContext)_localctx).ids.ast, finalType);
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> ast = new ArrayList<FieldDeclaration>();
		public TypeContext t;
		public ArrayDimensionsContext ad;
		public IdListContext ids;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((FieldDeclarationContext)_localctx).t = type();
				setState(79);
				((FieldDeclarationContext)_localctx).ad = arrayDimensions();
				setState(80);
				((FieldDeclarationContext)_localctx).ids = idList();
				setState(81);
				match(SEMI);

				            Type finalType = ((FieldDeclarationContext)_localctx).t.ast;

				            finalType = new ArrayType((((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getLine(), (((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, finalType, ((FieldDeclarationContext)_localctx).ad.size);

				            for(String id : ((FieldDeclarationContext)_localctx).ids.ast) {
				                FieldDeclaration field = new FieldDeclaration((((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getLine(), (((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, finalType, id);
				                _localctx.ast.add(field);
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((FieldDeclarationContext)_localctx).t = type();
				setState(85);
				((FieldDeclarationContext)_localctx).ids = idList();
				setState(86);
				match(SEMI);

				            Type finalType = ((FieldDeclarationContext)_localctx).t.ast;

				            for(String id : ((FieldDeclarationContext)_localctx).ids.ast) {
				                FieldDeclaration field = new FieldDeclaration((((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getLine(), (((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, finalType, id);
				                _localctx.ast.add(field);
				            }
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeContext extends ParserRuleContext {
		public Type ast;
		public FieldDeclarationContext fds;
		public Token id;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STRUCT);
			setState(92);
			match(LBRACE);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				((StructTypeContext)_localctx).fds = fieldDeclaration();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955408L) != 0) );
			setState(98);
			match(RBRACE);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				((StructTypeContext)_localctx).id = match(ID);
				}
				break;
			}

			            ((StructTypeContext)_localctx).ast =  new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((StructTypeContext)_localctx).fds.ast);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration ast;
		public TypeContext t;
		public Token n;
		public ParamListContext p;
		public BlockContext b;
		public TypeContext t1;
		public Token n1;
		public Token l1;
		public Token r1;
		public BlockContext b1;
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((FunctionDeclarationContext)_localctx).t = type();
				setState(105);
				((FunctionDeclarationContext)_localctx).n = match(ID);
				setState(106);
				match(LPAREN);
				setState(107);
				((FunctionDeclarationContext)_localctx).p = paramList();
				setState(108);
				match(RPAREN);
				setState(109);
				((FunctionDeclarationContext)_localctx).b = block();

				            ((FunctionDeclarationContext)_localctx).ast =  new FunctionDeclaration((((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getCharPositionInLine()+1, ((FunctionDeclarationContext)_localctx).t.ast, (((FunctionDeclarationContext)_localctx).n!=null?((FunctionDeclarationContext)_localctx).n.getText():null), ((FunctionDeclarationContext)_localctx).p.ast != null ? ((FunctionDeclarationContext)_localctx).p.ast : Collections.emptyList(), ((FunctionDeclarationContext)_localctx).b.ast);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((FunctionDeclarationContext)_localctx).t1 = type();
				setState(113);
				((FunctionDeclarationContext)_localctx).n1 = match(ID);
				setState(114);
				((FunctionDeclarationContext)_localctx).l1 = match(LPAREN);
				setState(115);
				((FunctionDeclarationContext)_localctx).r1 = match(RPAREN);
				setState(116);
				((FunctionDeclarationContext)_localctx).b1 = block();

				        ((FunctionDeclarationContext)_localctx).ast =  new FunctionDeclaration((((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getCharPositionInLine()+1, ((FunctionDeclarationContext)_localctx).t1.ast, (((FunctionDeclarationContext)_localctx).n1!=null?((FunctionDeclarationContext)_localctx).n1.getText():null), Collections.emptyList(), ((FunctionDeclarationContext)_localctx).b1.ast);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public VarDeclarationContext vd;
		public AssignmentContext assign;
		public IfStatementContext ifstmnt;
		public WhileStatementContext whilestmnt;
		public ReturnStatementContext ret;
		public WriteStatementContext write;
		public ReadStatementContext read;
		public ExpressionStatementContext es;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((StatementContext)_localctx).vd = varDeclaration();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).vd.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((StatementContext)_localctx).assign = assignment();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).assign.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				((StatementContext)_localctx).ifstmnt = ifStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifstmnt.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				((StatementContext)_localctx).whilestmnt = whileStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).whilestmnt.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				((StatementContext)_localctx).ret = returnStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ret.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				((StatementContext)_localctx).write = writeStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).write.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				((StatementContext)_localctx).read = readStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).read.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				((StatementContext)_localctx).es = expressionStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).es.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast;
		public StatementContext stmt;
		public StatementsContext stmts;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statements);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case VOID:
			case WRITE:
			case STRUCT:
			case INT:
			case DOUBLE:
			case CHAR:
			case READ:
			case RETURN:
			case LPAREN:
			case SUB:
			case NOT:
			case ID:
			case CHAR_CONSTANT:
			case DOUBLE_CONSTANT:
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((StatementsContext)_localctx).stmt = statement();
				setState(148);
				((StatementsContext)_localctx).stmts = statements();

				            ((StatementsContext)_localctx).ast =  new ArrayList<>();
				            _localctx.ast.add(((StatementsContext)_localctx).stmt.ast);
				            _localctx.ast.addAll(((StatementsContext)_localctx).stmts.ast);
				        
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{

				            ((StatementsContext)_localctx).ast =  new ArrayList<>();
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public Block ast;
		public StatementsContext stmts;
		public StatementContext stmt;
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(LBRACE);
				setState(155);
				((BlockContext)_localctx).stmts = statements();
				setState(156);
				match(RBRACE);

				        ((BlockContext)_localctx).ast =  new Block(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((BlockContext)_localctx).stmts.ast);
				    
				}
				break;
			case IF:
			case WHILE:
			case VOID:
			case WRITE:
			case STRUCT:
			case INT:
			case DOUBLE:
			case CHAR:
			case READ:
			case RETURN:
			case LPAREN:
			case SUB:
			case NOT:
			case ID:
			case CHAR_CONSTANT:
			case DOUBLE_CONSTANT:
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((BlockContext)_localctx).stmt = statement();

				        ((BlockContext)_localctx).ast =  new Block((((BlockContext)_localctx).stmt!=null?(((BlockContext)_localctx).stmt.start):null).getLine(), (((BlockContext)_localctx).stmt!=null?(((BlockContext)_localctx).stmt.start):null).getCharPositionInLine()+1, Arrays.asList(((BlockContext)_localctx).stmt.ast));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatement ast;
		public Token IF;
		public ExprContext expr1;
		public BlockContext block1;
		public BlockContext block2;
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(165);
			match(LPAREN);
			setState(166);
			((IfStatementContext)_localctx).expr1 = expr(0);
			setState(167);
			match(RPAREN);
			setState(168);
			((IfStatementContext)_localctx).block1 = block();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(169);
				match(ELSE);
				setState(170);
				((IfStatementContext)_localctx).block2 = block();
				}
				break;
			}
			((IfStatementContext)_localctx).ast =  new IfStatement(((IfStatementContext)_localctx).IF.getLine(),((IfStatementContext)_localctx).IF.getCharPositionInLine() + 1,((IfStatementContext)_localctx).expr1.ast,((IfStatementContext)_localctx).block1.ast,(((IfStatementContext)_localctx).block2.ast != null) ? ((IfStatementContext)_localctx).block2.ast : null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Statement ast;
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((AssignmentContext)_localctx).lhs = expr(0);
			setState(176);
			match(ASSIGN);
			setState(177);
			((AssignmentContext)_localctx).rhs = expr(0);
			setState(178);
			match(SEMI);
			((AssignmentContext)_localctx).ast =  new AssignmentStatement(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((AssignmentContext)_localctx).lhs.ast,((AssignmentContext)_localctx).rhs.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public Statement ast;
		public ExprContext condition;
		public BlockContext blk;
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			match(LPAREN);
			setState(183);
			((WhileStatementContext)_localctx).condition = expr(0);
			setState(184);
			match(RPAREN);
			setState(185);
			((WhileStatementContext)_localctx).blk = block();
			 ((WhileStatementContext)_localctx).ast =  new WhileStatement(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((WhileStatementContext)_localctx).condition.ast, ((WhileStatementContext)_localctx).blk.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public Statement ast;
		public ExprContext exp;
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(RETURN);
			setState(189);
			((ReturnStatementContext)_localctx).exp = expr(0);
			setState(190);
			match(SEMI);
			 ((ReturnStatementContext)_localctx).ast =  new ReturnStatement(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ReturnStatementContext)_localctx).exp.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatementContext extends ParserRuleContext {
		public Statement ast;
		public ExprListContext exprs;
		public TerminalNode WRITE() { return getToken(CmmParser.WRITE, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WRITE);
			setState(194);
			((WriteStatementContext)_localctx).exprs = exprList();
			setState(195);
			match(SEMI);
			 ((WriteStatementContext)_localctx).ast =  new WriteStatement(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((WriteStatementContext)_localctx).exprs.expressions); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends ParserRuleContext {
		public Statement ast;
		public ExprListContext exprs;
		public TerminalNode READ() { return getToken(CmmParser.READ, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(READ);
			setState(199);
			((ReadStatementContext)_localctx).exprs = exprList();
			setState(200);
			match(SEMI);
			 ((ReadStatementContext)_localctx).ast =  new ReadStatement(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ReadStatementContext)_localctx).exprs.expressions); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public Statement ast;
		public ExprContext expr1;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((ExpressionStatementContext)_localctx).expr1 = expr(0);
			setState(204);
			match(SEMI);
			((ExpressionStatementContext)_localctx).ast =  new ExpressionStatement((((ExpressionStatementContext)_localctx).expr1!=null?(((ExpressionStatementContext)_localctx).expr1.start):null).getLine(),(((ExpressionStatementContext)_localctx).expr1!=null?(((ExpressionStatementContext)_localctx).expr1.start):null).getCharPositionInLine() + 1,((ExpressionStatementContext)_localctx).expr1.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext e1;
		public Token SUB;
		public ExprContext e;
		public Token NOT;
		public Token LPAREN;
		public Token INT_CONSTANT;
		public Token DOUBLE_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public TypeContext t;
		public ExprContext e2;
		public TerminalNode SUB() { return getToken(CmmParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode DOUBLE_CONSTANT() { return getToken(CmmParser.DOUBLE_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode EQ() { return getToken(CmmParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CmmParser.NEQ, 0); }
		public TerminalNode LTE() { return getToken(CmmParser.LTE, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode GTE() { return getToken(CmmParser.GTE, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public TerminalNode ADD() { return getToken(CmmParser.ADD, 0); }
		public TerminalNode MUL() { return getToken(CmmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CmmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CmmParser.MOD, 0); }
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public TerminalNode LBRACKET() { return getToken(CmmParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CmmParser.RBRACKET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(208);
				((ExprContext)_localctx).SUB = match(SUB);
				setState(209);
				((ExprContext)_localctx).e = expr(11);
				 ((ExprContext)_localctx).ast =  new UnaryMinusExpression(((ExprContext)_localctx).SUB.getLine(), ((ExprContext)_localctx).SUB.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 2:
				{
				setState(212);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(213);
				((ExprContext)_localctx).e = expr(10);
				 ((ExprContext)_localctx).ast =  new LogicalNegationExpression(((ExprContext)_localctx).NOT.getLine(), ((ExprContext)_localctx).NOT.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 3:
				{
				setState(216);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(217);
				((ExprContext)_localctx).e = expr(0);
				setState(218);
				match(RPAREN);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).e.ast; 
				}
				break;
			case 4:
				{
				setState(221);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntLiteralExpression(((ExprContext)_localctx).INT_CONSTANT.getLine(), ((ExprContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(223);
				((ExprContext)_localctx).DOUBLE_CONSTANT = match(DOUBLE_CONSTANT);
				 ((ExprContext)_localctx).ast =  new DoubleLiteralExpression(((ExprContext)_localctx).DOUBLE_CONSTANT.getLine(), ((ExprContext)_localctx).DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExprContext)_localctx).DOUBLE_CONSTANT!=null?((ExprContext)_localctx).DOUBLE_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(225);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharLiteralExpression(((ExprContext)_localctx).CHAR_CONSTANT.getLine(), ((ExprContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(227);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new VariableExpression(((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine()+1, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 8:
				{
				setState(229);
				functionCall();
				}
				break;
			case 9:
				{
				setState(230);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(231);
				((ExprContext)_localctx).t = type();
				setState(232);
				match(RPAREN);
				setState(233);
				((ExprContext)_localctx).e = expr(1);
				 ((ExprContext)_localctx).ast =  new CastExpression(((ExprContext)_localctx).LPAREN.getLine(), ((ExprContext)_localctx).LPAREN.getCharPositionInLine()+1, ((ExprContext)_localctx).t.ast, ((ExprContext)_localctx).e.ast);     
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(239);
						match(OR);
						setState(240);
						((ExprContext)_localctx).e2 = expr(25);
						 ((ExprContext)_localctx).ast =  new LogicalOrExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(244);
						match(AND);
						setState(245);
						((ExprContext)_localctx).e2 = expr(24);
						 ((ExprContext)_localctx).ast =  new LogicalAndExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(249);
						match(EQ);
						setState(250);
						((ExprContext)_localctx).e2 = expr(23);
						 ((ExprContext)_localctx).ast =  new EqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(254);
						match(NEQ);
						setState(255);
						((ExprContext)_localctx).e2 = expr(22);
						 ((ExprContext)_localctx).ast =  new NotEqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(259);
						match(LTE);
						setState(260);
						((ExprContext)_localctx).e2 = expr(21);
						 ((ExprContext)_localctx).ast =  new LessThanOrEqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(264);
						match(LT);
						setState(265);
						((ExprContext)_localctx).e2 = expr(20);
						 ((ExprContext)_localctx).ast =  new LessThanExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(269);
						match(GTE);
						setState(270);
						((ExprContext)_localctx).e2 = expr(19);
						 ((ExprContext)_localctx).ast =  new GreaterThanOrEqualExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(274);
						match(GT);
						setState(275);
						((ExprContext)_localctx).e2 = expr(18);
						 ((ExprContext)_localctx).ast =  new GreaterThanExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(279);
						match(ADD);
						setState(280);
						((ExprContext)_localctx).e2 = expr(17);
						 ((ExprContext)_localctx).ast =  new AddExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(284);
						((ExprContext)_localctx).SUB = match(SUB);
						setState(285);
						((ExprContext)_localctx).e2 = expr(16);
						 ((ExprContext)_localctx).ast =  new SubtractExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(289);
						match(MUL);
						setState(290);
						((ExprContext)_localctx).e2 = expr(15);
						 ((ExprContext)_localctx).ast =  new MultiplyExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(294);
						match(DIV);
						setState(295);
						((ExprContext)_localctx).e2 = expr(14);
						 ((ExprContext)_localctx).ast =  new DivideExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(299);
						match(MOD);
						setState(300);
						((ExprContext)_localctx).e2 = expr(13);
						 ((ExprContext)_localctx).ast =  new ModulusExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(DOT);
						setState(305);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new NestedStructFieldAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(308);
						match(LBRACKET);
						setState(309);
						((ExprContext)_localctx).e2 = expr(0);
						setState(310);
						match(RBRACKET);
						 ((ExprContext)_localctx).ast =  new ArrayAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<Expression> expressions = new ArrayList<Expression>();
		public ExprContext e;
		public ExprContext exp;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((ExprListContext)_localctx).e = expr(0);
			_localctx.expressions.add(((ExprListContext)_localctx).e.ast);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(320);
				match(COMMA);
				setState(321);
				((ExprListContext)_localctx).exp = expr(0);
				_localctx.expressions.add(((ExprListContext)_localctx).exp.ast);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<Parameter> ast = new ArrayList<Parameter>();
		public ParamContext p;
		public ParamContext p1;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((ParamListContext)_localctx).p = param();

			        _localctx.ast.add(((ParamListContext)_localctx).p.ast);
			      
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331);
				match(COMMA);
				setState(332);
				((ParamListContext)_localctx).p1 = param();
				 _localctx.ast.add(((ParamListContext)_localctx).p1.ast); 
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public Parameter ast;
		public TypeContext t;
		public Token n;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((ParamContext)_localctx).t = type();
			setState(341);
			((ParamContext)_localctx).n = match(ID);
			 ((ParamContext)_localctx).ast =  new Parameter((((ParamContext)_localctx).t!=null?(((ParamContext)_localctx).t.start):null).getLine(), (((ParamContext)_localctx).t!=null?(((ParamContext)_localctx).t.start):null).getCharPositionInLine()+1, (((ParamContext)_localctx).n!=null?((ParamContext)_localctx).n.getText():null), ((ParamContext)_localctx).t.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token ID;
		public StructTypeContext t;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CmmParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CmmParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(INT);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(DOUBLE);
				 ((TypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(CHAR);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(VOID);
				 ((TypeContext)_localctx).ast =  VoidType.getInstance(); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				((TypeContext)_localctx).ID = match(ID);
				 ((TypeContext)_localctx).ast =  new UserDefinedType(((TypeContext)_localctx).ID.getLine(), ((TypeContext)_localctx).ID.getCharPositionInLine(), (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null)); 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				((TypeContext)_localctx).t = structType();

				            ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).t.ast;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token a;
		public Token b;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<ArrayDimensionsContext> arrayDimensions() {
			return getRuleContexts(ArrayDimensionsContext.class);
		}
		public ArrayDimensionsContext arrayDimensions(int i) {
			return getRuleContext(ArrayDimensionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((IdListContext)_localctx).a = match(ID);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(360);
				arrayDimensions();
				}
			}

			 _localctx.ast.add((((IdListContext)_localctx).a!=null?((IdListContext)_localctx).a.getText():null)); 
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				((IdListContext)_localctx).b = match(ID);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(366);
					arrayDimensions();
					}
				}

				 _localctx.ast.add((((IdListContext)_localctx).b!=null?((IdListContext)_localctx).b.getText():null)); 
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDimensionsContext extends ParserRuleContext {
		public int size = 0;
		public Token ic;
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public ArrayDimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimensions; }
	}

	public final ArrayDimensionsContext arrayDimensions() throws RecognitionException {
		ArrayDimensionsContext _localctx = new ArrayDimensionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayDimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				match(LBRACKET);
				setState(376);
				((ArrayDimensionsContext)_localctx).ic = match(INT_CONSTANT);
				setState(377);
				match(RBRACKET);
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			 ((ArrayDimensionsContext)_localctx).size =  Integer.parseInt((((ArrayDimensionsContext)_localctx).ic!=null?((ArrayDimensionsContext)_localctx).ic.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Expression ast;
		public Token ID;
		public ExprListContext el;
		public Token i1;
		public Token l1;
		public Token r1;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				((FunctionCallContext)_localctx).ID = match(ID);
				setState(385);
				match(LPAREN);
				setState(386);
				((FunctionCallContext)_localctx).el = exprList();
				setState(387);
				match(RPAREN);

				        ((FunctionCallContext)_localctx).ast =  new FunctionCallExpression(
				            ((FunctionCallContext)_localctx).ID.getLine(),
				            ((FunctionCallContext)_localctx).ID.getCharPositionInLine() + 1,
				            ((FunctionCallContext)_localctx).ID.getText(),
				            ((FunctionCallContext)_localctx).el.expressions
				        );
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((FunctionCallContext)_localctx).i1 = match(ID);
				setState(391);
				((FunctionCallContext)_localctx).l1 = match(LPAREN);
				setState(392);
				((FunctionCallContext)_localctx).r1 = match(RPAREN);

				            ((FunctionCallContext)_localctx).ast =  new FunctionCallExpression(
				                ((FunctionCallContext)_localctx).i1.getLine(),
				                ((FunctionCallContext)_localctx).i1.getCharPositionInLine() + 1,
				                ((FunctionCallContext)_localctx).i1.getText(),
				                Collections.emptyList()
				            );
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u018d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004_\b\u0004\u000b\u0004\f\u0004`\u0001\u0004\u0001"+
		"\u0004\u0003\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0099"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00ac\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00ed\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u013a\b\u0010"+
		"\n\u0010\f\u0010\u013d\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0145\b\u0011\n\u0011\f\u0011"+
		"\u0148\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0150\b\u0012\n\u0012\f\u0012\u0153\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0166"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u016a\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0170\b\u0015\u0001\u0015"+
		"\u0005\u0015\u0173\b\u0015\n\u0015\f\u0015\u0176\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0004\u0016\u017b\b\u0016\u000b\u0016\f\u0016\u017c"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u018b\b\u0017\u0001\u0017\u0000\u0001 \u0018\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.\u0000\u0000\u01a9\u00005\u0001\u0000\u0000\u0000\u0002;\u0001"+
		"\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000"+
		"\u0000\b[\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0091\u0001"+
		"\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000\u0000\u0010\u00a2\u0001"+
		"\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00af\u0001"+
		"\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000\u0018\u00bc\u0001"+
		"\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000\u0000\u001c\u00c6\u0001"+
		"\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 \u00ec\u0001\u0000"+
		"\u0000\u0000\"\u013e\u0001\u0000\u0000\u0000$\u0149\u0001\u0000\u0000"+
		"\u0000&\u0154\u0001\u0000\u0000\u0000(\u0165\u0001\u0000\u0000\u0000*"+
		"\u0167\u0001\u0000\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u018a\u0001"+
		"\u0000\u0000\u000004\u0003\u0004\u0002\u000014\u0003\n\u0005\u000024\u0003"+
		"\b\u0004\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000089\u0003\u0002\u0001\u00009:\u0005\u0000\u0000\u0001:\u0001\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0004\u0000\u0000<=\u0005\u0005\u0000\u0000"+
		"=>\u0005\u0010\u0000\u0000>?\u0005\u0011\u0000\u0000?@\u0003\u0010\b\u0000"+
		"@\u0003\u0001\u0000\u0000\u0000AB\u0003(\u0014\u0000BC\u0003*\u0015\u0000"+
		"CD\u0005\u0014\u0000\u0000DE\u0006\u0002\uffff\uffff\u0000EM\u0001\u0000"+
		"\u0000\u0000FG\u0003(\u0014\u0000GH\u0003,\u0016\u0000HI\u0003*\u0015"+
		"\u0000IJ\u0005\u0014\u0000\u0000JK\u0006\u0002\uffff\uffff\u0000KM\u0001"+
		"\u0000\u0000\u0000LA\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000"+
		"M\u0005\u0001\u0000\u0000\u0000NO\u0003(\u0014\u0000OP\u0003,\u0016\u0000"+
		"PQ\u0003*\u0015\u0000QR\u0005\u0014\u0000\u0000RS\u0006\u0003\uffff\uffff"+
		"\u0000SZ\u0001\u0000\u0000\u0000TU\u0003(\u0014\u0000UV\u0003*\u0015\u0000"+
		"VW\u0005\u0014\u0000\u0000WX\u0006\u0003\uffff\uffff\u0000XZ\u0001\u0000"+
		"\u0000\u0000YN\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000Z\u0007"+
		"\u0001\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000\\^\u0005\u000e\u0000"+
		"\u0000]_\u0003\u0006\u0003\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bd\u0005\u000f\u0000\u0000ce\u0005%\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0006\u0004\uffff\uffff\u0000g\t\u0001\u0000\u0000\u0000hi\u0003(\u0014"+
		"\u0000ij\u0005%\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0003$\u0012\u0000"+
		"lm\u0005\u0011\u0000\u0000mn\u0003\u0010\b\u0000no\u0006\u0005\uffff\uffff"+
		"\u0000ox\u0001\u0000\u0000\u0000pq\u0003(\u0014\u0000qr\u0005%\u0000\u0000"+
		"rs\u0005\u0010\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0003\u0010\b\u0000"+
		"uv\u0006\u0005\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wh\u0001\u0000"+
		"\u0000\u0000wp\u0001\u0000\u0000\u0000x\u000b\u0001\u0000\u0000\u0000"+
		"yz\u0003\u0004\u0002\u0000z{\u0006\u0006\uffff\uffff\u0000{\u0092\u0001"+
		"\u0000\u0000\u0000|}\u0003\u0014\n\u0000}~\u0006\u0006\uffff\uffff\u0000"+
		"~\u0092\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0012\t\u0000\u0080"+
		"\u0081\u0006\u0006\uffff\uffff\u0000\u0081\u0092\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u0084\u0006\u0006\uffff\uffff"+
		"\u0000\u0084\u0092\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0018\f\u0000"+
		"\u0086\u0087\u0006\u0006\uffff\uffff\u0000\u0087\u0092\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0003\u001a\r\u0000\u0089\u008a\u0006\u0006\uffff\uffff"+
		"\u0000\u008a\u0092\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u001c\u000e"+
		"\u0000\u008c\u008d\u0006\u0006\uffff\uffff\u0000\u008d\u0092\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0003\u001e\u000f\u0000\u008f\u0090\u0006\u0006"+
		"\uffff\uffff\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091y\u0001\u0000"+
		"\u0000\u0000\u0091|\u0001\u0000\u0000\u0000\u0091\u007f\u0001\u0000\u0000"+
		"\u0000\u0091\u0082\u0001\u0000\u0000\u0000\u0091\u0085\u0001\u0000\u0000"+
		"\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000"+
		"\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0003\f\u0006\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095"+
		"\u0096\u0006\u0007\uffff\uffff\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0006\u0007\uffff\uffff\u0000\u0098\u0093\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u000f\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c\u0003\u000e\u0007"+
		"\u0000\u009c\u009d\u0005\u000f\u0000\u0000\u009d\u009e\u0006\b\uffff\uffff"+
		"\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\f\u0006\u0000"+
		"\u00a0\u00a1\u0006\b\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000"+
		"\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7"+
		"\u00a8\u0005\u0011\u0000\u0000\u00a8\u00ab\u0003\u0010\b\u0000\u00a9\u00aa"+
		"\u0005\u0002\u0000\u0000\u00aa\u00ac\u0003\u0010\b\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0006\t\uffff\uffff\u0000\u00ae\u0013\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0\u00b1\u0005\r"+
		"\u0000\u0000\u00b1\u00b2\u0003 \u0010\u0000\u00b2\u00b3\u0005\u0014\u0000"+
		"\u0000\u00b3\u00b4\u0006\n\uffff\uffff\u0000\u00b4\u0015\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000"+
		"\u0000\u00b7\u00b8\u0003 \u0010\u0000\u00b8\u00b9\u0005\u0011\u0000\u0000"+
		"\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb\u0006\u000b\uffff\uffff\u0000"+
		"\u00bb\u0017\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\f\u0000\u0000\u00bd"+
		"\u00be\u0003 \u0010\u0000\u00be\u00bf\u0005\u0014\u0000\u0000\u00bf\u00c0"+
		"\u0006\f\uffff\uffff\u0000\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0006\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c4\u0005"+
		"\u0014\u0000\u0000\u00c4\u00c5\u0006\r\uffff\uffff\u0000\u00c5\u001b\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0003"+
		"\"\u0011\u0000\u00c8\u00c9\u0005\u0014\u0000\u0000\u00c9\u00ca\u0006\u000e"+
		"\uffff\uffff\u0000\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003"+
		" \u0010\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00ce\u0006\u000f"+
		"\uffff\uffff\u0000\u00ce\u001f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006"+
		"\u0010\uffff\uffff\u0000\u00d0\u00d1\u0005\u0017\u0000\u0000\u00d1\u00d2"+
		"\u0003 \u0010\u000b\u00d2\u00d3\u0006\u0010\uffff\uffff\u0000\u00d3\u00ed"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005#\u0000\u0000\u00d5\u00d6\u0003"+
		" \u0010\n\u00d6\u00d7\u0006\u0010\uffff\uffff\u0000\u00d7\u00ed\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u0010\u0000\u0000\u00d9\u00da\u0003"+
		" \u0010\u0000\u00da\u00db\u0005\u0011\u0000\u0000\u00db\u00dc\u0006\u0010"+
		"\uffff\uffff\u0000\u00dc\u00ed\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"(\u0000\u0000\u00de\u00ed\u0006\u0010\uffff\uffff\u0000\u00df\u00e0\u0005"+
		"\'\u0000\u0000\u00e0\u00ed\u0006\u0010\uffff\uffff\u0000\u00e1\u00e2\u0005"+
		"&\u0000\u0000\u00e2\u00ed\u0006\u0010\uffff\uffff\u0000\u00e3\u00e4\u0005"+
		"%\u0000\u0000\u00e4\u00ed\u0006\u0010\uffff\uffff\u0000\u00e5\u00ed\u0003"+
		".\u0017\u0000\u00e6\u00e7\u0005\u0010\u0000\u0000\u00e7\u00e8\u0003(\u0014"+
		"\u0000\u00e8\u00e9\u0005\u0011\u0000\u0000\u00e9\u00ea\u0003 \u0010\u0001"+
		"\u00ea\u00eb\u0006\u0010\uffff\uffff\u0000\u00eb\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ec\u00cf\u0001\u0000\u0000\u0000\u00ec\u00d4\u0001\u0000\u0000"+
		"\u0000\u00ec\u00d8\u0001\u0000\u0000\u0000\u00ec\u00dd\u0001\u0000\u0000"+
		"\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec\u00e1\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ed\u013b\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\n\u0018\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000"+
		"\u00f0\u00f1\u0003 \u0010\u0019\u00f1\u00f2\u0006\u0010\uffff\uffff\u0000"+
		"\u00f2\u013a\u0001\u0000\u0000\u0000\u00f3\u00f4\n\u0017\u0000\u0000\u00f4"+
		"\u00f5\u0005!\u0000\u0000\u00f5\u00f6\u0003 \u0010\u0018\u00f6\u00f7\u0006"+
		"\u0010\uffff\uffff\u0000\u00f7\u013a\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\n\u0016\u0000\u0000\u00f9\u00fa\u0005 \u0000\u0000\u00fa\u00fb\u0003"+
		" \u0010\u0017\u00fb\u00fc\u0006\u0010\uffff\uffff\u0000\u00fc\u013a\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\n\u0015\u0000\u0000\u00fe\u00ff\u0005\u001f"+
		"\u0000\u0000\u00ff\u0100\u0003 \u0010\u0016\u0100\u0101\u0006\u0010\uffff"+
		"\uffff\u0000\u0101\u013a\u0001\u0000\u0000\u0000\u0102\u0103\n\u0014\u0000"+
		"\u0000\u0103\u0104\u0005\u001e\u0000\u0000\u0104\u0105\u0003 \u0010\u0015"+
		"\u0105\u0106\u0006\u0010\uffff\uffff\u0000\u0106\u013a\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\n\u0013\u0000\u0000\u0108\u0109\u0005\u001d\u0000\u0000"+
		"\u0109\u010a\u0003 \u0010\u0014\u010a\u010b\u0006\u0010\uffff\uffff\u0000"+
		"\u010b\u013a\u0001\u0000\u0000\u0000\u010c\u010d\n\u0012\u0000\u0000\u010d"+
		"\u010e\u0005\u001c\u0000\u0000\u010e\u010f\u0003 \u0010\u0013\u010f\u0110"+
		"\u0006\u0010\uffff\uffff\u0000\u0110\u013a\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\n\u0011\u0000\u0000\u0112\u0113\u0005\u001b\u0000\u0000\u0113\u0114"+
		"\u0003 \u0010\u0012\u0114\u0115\u0006\u0010\uffff\uffff\u0000\u0115\u013a"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\n\u0010\u0000\u0000\u0117\u0118\u0005"+
		"\u0016\u0000\u0000\u0118\u0119\u0003 \u0010\u0011\u0119\u011a\u0006\u0010"+
		"\uffff\uffff\u0000\u011a\u013a\u0001\u0000\u0000\u0000\u011b\u011c\n\u000f"+
		"\u0000\u0000\u011c\u011d\u0005\u0017\u0000\u0000\u011d\u011e\u0003 \u0010"+
		"\u0010\u011e\u011f\u0006\u0010\uffff\uffff\u0000\u011f\u013a\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\n\u000e\u0000\u0000\u0121\u0122\u0005\u0018\u0000"+
		"\u0000\u0122\u0123\u0003 \u0010\u000f\u0123\u0124\u0006\u0010\uffff\uffff"+
		"\u0000\u0124\u013a\u0001\u0000\u0000\u0000\u0125\u0126\n\r\u0000\u0000"+
		"\u0126\u0127\u0005\u0019\u0000\u0000\u0127\u0128\u0003 \u0010\u000e\u0128"+
		"\u0129\u0006\u0010\uffff\uffff\u0000\u0129\u013a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\n\f\u0000\u0000\u012b\u012c\u0005\u001a\u0000\u0000\u012c"+
		"\u012d\u0003 \u0010\r\u012d\u012e\u0006\u0010\uffff\uffff\u0000\u012e"+
		"\u013a\u0001\u0000\u0000\u0000\u012f\u0130\n\u0003\u0000\u0000\u0130\u0131"+
		"\u0005$\u0000\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u013a\u0006\u0010"+
		"\uffff\uffff\u0000\u0133\u0134\n\u0002\u0000\u0000\u0134\u0135\u0005\u0012"+
		"\u0000\u0000\u0135\u0136\u0003 \u0010\u0000\u0136\u0137\u0005\u0013\u0000"+
		"\u0000\u0137\u0138\u0006\u0010\uffff\uffff\u0000\u0138\u013a\u0001\u0000"+
		"\u0000\u0000\u0139\u00ee\u0001\u0000\u0000\u0000\u0139\u00f3\u0001\u0000"+
		"\u0000\u0000\u0139\u00f8\u0001\u0000\u0000\u0000\u0139\u00fd\u0001\u0000"+
		"\u0000\u0000\u0139\u0102\u0001\u0000\u0000\u0000\u0139\u0107\u0001\u0000"+
		"\u0000\u0000\u0139\u010c\u0001\u0000\u0000\u0000\u0139\u0111\u0001\u0000"+
		"\u0000\u0000\u0139\u0116\u0001\u0000\u0000\u0000\u0139\u011b\u0001\u0000"+
		"\u0000\u0000\u0139\u0120\u0001\u0000\u0000\u0000\u0139\u0125\u0001\u0000"+
		"\u0000\u0000\u0139\u012a\u0001\u0000\u0000\u0000\u0139\u012f\u0001\u0000"+
		"\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c!\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0003 \u0010\u0000\u013f\u0146\u0006\u0011\uffff\uffff"+
		"\u0000\u0140\u0141\u0005\u0015\u0000\u0000\u0141\u0142\u0003 \u0010\u0000"+
		"\u0142\u0143\u0006\u0011\uffff\uffff\u0000\u0143\u0145\u0001\u0000\u0000"+
		"\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147#\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0003&\u0013\u0000\u014a\u0151\u0006\u0012\uffff\uffff\u0000"+
		"\u014b\u014c\u0005\u0015\u0000\u0000\u014c\u014d\u0003&\u0013\u0000\u014d"+
		"\u014e\u0006\u0012\uffff\uffff\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014b\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152%\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0003(\u0014\u0000\u0155\u0156\u0005%\u0000\u0000\u0156\u0157\u0006"+
		"\u0013\uffff\uffff\u0000\u0157\'\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\b\u0000\u0000\u0159\u0166\u0006\u0014\uffff\uffff\u0000\u015a\u015b\u0005"+
		"\t\u0000\u0000\u015b\u0166\u0006\u0014\uffff\uffff\u0000\u015c\u015d\u0005"+
		"\n\u0000\u0000\u015d\u0166\u0006\u0014\uffff\uffff\u0000\u015e\u015f\u0005"+
		"\u0004\u0000\u0000\u015f\u0166\u0006\u0014\uffff\uffff\u0000\u0160\u0161"+
		"\u0005%\u0000\u0000\u0161\u0166\u0006\u0014\uffff\uffff\u0000\u0162\u0163"+
		"\u0003\b\u0004\u0000\u0163\u0164\u0006\u0014\uffff\uffff\u0000\u0164\u0166"+
		"\u0001\u0000\u0000\u0000\u0165\u0158\u0001\u0000\u0000\u0000\u0165\u015a"+
		"\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165\u015e"+
		"\u0001\u0000\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0162"+
		"\u0001\u0000\u0000\u0000\u0166)\u0001\u0000\u0000\u0000\u0167\u0169\u0005"+
		"%\u0000\u0000\u0168\u016a\u0003,\u0016\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u0174\u0006\u0015\uffff\uffff\u0000\u016c\u016d\u0005\u0015"+
		"\u0000\u0000\u016d\u016f\u0005%\u0000\u0000\u016e\u0170\u0003,\u0016\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0006\u0015\uffff\uffff"+
		"\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175+\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005\u0012\u0000\u0000\u0178\u0179\u0005(\u0000\u0000\u0179"+
		"\u017b\u0005\u0013\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0006\u0016\uffff\uffff\u0000\u017f-\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0005%\u0000\u0000\u0181\u0182\u0005\u0010\u0000\u0000\u0182\u0183"+
		"\u0003\"\u0011\u0000\u0183\u0184\u0005\u0011\u0000\u0000\u0184\u0185\u0006"+
		"\u0017\uffff\uffff\u0000\u0185\u018b\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0005%\u0000\u0000\u0187\u0188\u0005\u0010\u0000\u0000\u0188\u0189\u0005"+
		"\u0011\u0000\u0000\u0189\u018b\u0006\u0017\uffff\uffff\u0000\u018a\u0180"+
		"\u0001\u0000\u0000\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018b/\u0001"+
		"\u0000\u0000\u0000\u001635LY`dw\u0091\u0098\u00a2\u00ab\u00ec\u0139\u013b"+
		"\u0146\u0151\u0165\u0169\u016f\u0174\u017c\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}