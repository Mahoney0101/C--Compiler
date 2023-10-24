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
		RULE_program = 0, RULE_varDeclaration = 1, RULE_fieldDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_statement = 4, RULE_functionCallStatement = 5, 
		RULE_statements = 6, RULE_varDeclarations = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, 
		RULE_returnStatement = 10, RULE_writeStatement = 11, RULE_readStatement = 12, 
		RULE_assignment = 13, RULE_expr = 14, RULE_exprList = 15, RULE_paramList = 16, 
		RULE_param = 17, RULE_structType = 18, RULE_arrayType = 19, RULE_functionType = 20, 
		RULE_type = 21, RULE_baseType = 22, RULE_idList = 23, RULE_arrayDimensions = 24, 
		RULE_functionCallExpression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDeclaration", "fieldDeclaration", "functionDeclaration", 
			"statement", "functionCallStatement", "statements", "varDeclarations", 
			"ifStatement", "whileStatement", "returnStatement", "writeStatement", 
			"readStatement", "assignment", "expr", "exprList", "paramList", "param", 
			"structType", "arrayType", "functionType", "type", "baseType", "idList", 
			"arrayDimensions", "functionCallExpression"
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
		public Program ast;
		public VarDeclarationContext v;
		public FunctionDeclarationContext f;
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        List<Definition> definitions = new ArrayList<>();
			    
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1936L) != 0)) {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(53);
					((ProgramContext)_localctx).v = varDeclaration();
					 definitions.addAll(((ProgramContext)_localctx).v.ast); 
					}
					break;
				case 2:
					{
					setState(56);
					((ProgramContext)_localctx).f = functionDeclaration();
					 definitions.add(((ProgramContext)_localctx).f.ast); 
					}
					break;
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, definitions); 
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
		public List<VarDeclaration> ast = new ArrayList<VarDeclaration>();;
		public TypeContext t1;
		public IdListContext ids1;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((VarDeclarationContext)_localctx).t1 = type();
			setState(68);
			((VarDeclarationContext)_localctx).ids1 = idList();
			setState(69);
			match(SEMI);

			            Type finalType = ((VarDeclarationContext)_localctx).t1.ast;
			            for(String id : ((VarDeclarationContext)_localctx).ids1.ast) {
			                _localctx.ast.add(new VarDeclaration((((VarDeclarationContext)_localctx).t1!=null?(((VarDeclarationContext)_localctx).t1.start):null).getLine(), (((VarDeclarationContext)_localctx).t1!=null?(((VarDeclarationContext)_localctx).t1.start):null).getCharPositionInLine() + 1, id, finalType));
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> ast = new ArrayList<FieldDeclaration>();
		public TypeContext t;
		public IdListContext ids;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 4, RULE_fieldDeclaration);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((FieldDeclarationContext)_localctx).t = type();
				setState(73);
				((FieldDeclarationContext)_localctx).ids = idList();
				setState(74);
				match(SEMI);

				            Type finalType = ((FieldDeclarationContext)_localctx).t.ast;
				            for(String id : ((FieldDeclarationContext)_localctx).ids.ast) {
				                FieldDeclaration field = new FieldDeclaration((((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getLine(), (((FieldDeclarationContext)_localctx).t!=null?(((FieldDeclarationContext)_localctx).t.start):null).getCharPositionInLine() + 1, ((FieldDeclarationContext)_localctx).t.ast, id);
				                _localctx.ast.add(field);
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((FieldDeclarationContext)_localctx).t = type();
				setState(78);
				((FieldDeclarationContext)_localctx).ids = idList();
				setState(79);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration ast;
		public TypeContext t;
		public Token n;
		public ParamListContext p;
		public VarDeclarationsContext vd;
		public StatementsContext stmts;
		public TypeContext t1;
		public Token n1;
		public Token l1;
		public Token r1;
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public VarDeclarationsContext varDeclarations() {
			return getRuleContext(VarDeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((FunctionDeclarationContext)_localctx).t = type();
				setState(85);
				((FunctionDeclarationContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAIN || _la==ID) ) {
					((FunctionDeclarationContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				match(LPAREN);
				setState(87);
				((FunctionDeclarationContext)_localctx).p = paramList();
				setState(88);
				match(RPAREN);
				setState(89);
				match(LBRACE);
				setState(90);
				((FunctionDeclarationContext)_localctx).vd = varDeclarations();
				setState(91);
				((FunctionDeclarationContext)_localctx).stmts = statements();
				setState(92);
				match(RBRACE);

				        ((FunctionDeclarationContext)_localctx).ast =  new FunctionDeclaration((((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getCharPositionInLine()+1, new FunctionType((((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getCharPositionInLine()+1, ((FunctionDeclarationContext)_localctx).t.ast, ((FunctionDeclarationContext)_localctx).p.ast != null ? ((FunctionDeclarationContext)_localctx).p.ast : Collections.emptyList()), (((FunctionDeclarationContext)_localctx).n!=null?((FunctionDeclarationContext)_localctx).n.getText():null), ((FunctionDeclarationContext)_localctx).vd.ast, ((FunctionDeclarationContext)_localctx).stmts.ast);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((FunctionDeclarationContext)_localctx).t1 = type();
				setState(96);
				((FunctionDeclarationContext)_localctx).n1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAIN || _la==ID) ) {
					((FunctionDeclarationContext)_localctx).n1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				((FunctionDeclarationContext)_localctx).l1 = match(LPAREN);
				setState(98);
				((FunctionDeclarationContext)_localctx).r1 = match(RPAREN);
				setState(99);
				match(LBRACE);
				setState(100);
				((FunctionDeclarationContext)_localctx).vd = varDeclarations();
				setState(101);
				((FunctionDeclarationContext)_localctx).stmts = statements();
				setState(102);
				match(RBRACE);

				        ((FunctionDeclarationContext)_localctx).ast =  new FunctionDeclaration((((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getCharPositionInLine()+1, new FunctionType((((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t1!=null?(((FunctionDeclarationContext)_localctx).t1.start):null).getCharPositionInLine()+1, ((FunctionDeclarationContext)_localctx).t1.ast, Collections.emptyList()), (((FunctionDeclarationContext)_localctx).n1!=null?((FunctionDeclarationContext)_localctx).n1.getText():null), ((FunctionDeclarationContext)_localctx).vd.ast, ((FunctionDeclarationContext)_localctx).stmts.ast);
				    
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
		public List<Statement> ast = new ArrayList<Statement>();
		public FunctionCallStatementContext f;
		public AssignmentContext assign;
		public IfStatementContext ifstmnt;
		public WhileStatementContext whilestmnt;
		public ReturnStatementContext ret;
		public WriteStatementContext write;
		public ReadStatementContext read;
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((StatementContext)_localctx).f = functionCallStatement();
				 _localctx.ast.add(((StatementContext)_localctx).f.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((StatementContext)_localctx).assign = assignment();
				 _localctx.ast.add(((StatementContext)_localctx).assign.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				((StatementContext)_localctx).ifstmnt = ifStatement();
				 _localctx.ast.add(((StatementContext)_localctx).ifstmnt.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				((StatementContext)_localctx).whilestmnt = whileStatement();
				 _localctx.ast.add(((StatementContext)_localctx).whilestmnt.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				((StatementContext)_localctx).ret = returnStatement();
				 _localctx.ast.add(((StatementContext)_localctx).ret.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				((StatementContext)_localctx).write = writeStatement();
				 _localctx.ast.addAll(((StatementContext)_localctx).write.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				((StatementContext)_localctx).read = readStatement();
				 _localctx.ast.addAll(((StatementContext)_localctx).read.ast); 
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
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStatement ast;
		public FunctionCallExpressionContext fce;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((FunctionCallStatementContext)_localctx).fce = functionCallExpression();
			setState(131);
			match(SEMI);
			 ((FunctionCallStatementContext)_localctx).ast =  new FunctionCallStatement(((FunctionCallStatementContext)_localctx).fce.ast.getLine(), ((FunctionCallStatementContext)_localctx).fce.ast.getColumn() + 1, ((FunctionCallStatementContext)_localctx).fce.ast); 
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
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((StatementsContext)_localctx).stmt = statement();
				setState(135);
				((StatementsContext)_localctx).stmts = statements();

				            ((StatementsContext)_localctx).ast =  new ArrayList<>();
				            _localctx.ast.addAll(((StatementsContext)_localctx).stmt.ast);
				            _localctx.ast.addAll(((StatementsContext)_localctx).stmts.ast);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				            ((StatementsContext)_localctx).ast =  new ArrayList<>();
				        
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
	public static class VarDeclarationsContext extends ParserRuleContext {
		public List<VarDeclaration> ast;
		public VarDeclarationContext vd;
		public VarDeclarationsContext vds;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationsContext varDeclarations() {
			return getRuleContext(VarDeclarationsContext.class,0);
		}
		public VarDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarations; }
	}

	public final VarDeclarationsContext varDeclarations() throws RecognitionException {
		VarDeclarationsContext _localctx = new VarDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclarations);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case STRUCT:
			case INT:
			case DOUBLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((VarDeclarationsContext)_localctx).vd = varDeclaration();
				setState(142);
				((VarDeclarationsContext)_localctx).vds = varDeclarations();

				            ((VarDeclarationsContext)_localctx).ast =  new ArrayList<>();
				            _localctx.ast.addAll(((VarDeclarationsContext)_localctx).vd.ast);
				            _localctx.ast.addAll(((VarDeclarationsContext)_localctx).vds.ast);
				        
				}
				break;
			case IF:
			case WHILE:
			case WRITE:
			case READ:
			case RETURN:
			case RBRACE:
			case LPAREN:
			case SUB:
			case NOT:
			case ID:
			case CHAR_CONSTANT:
			case DOUBLE_CONSTANT:
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{

				            ((VarDeclarationsContext)_localctx).ast =  new ArrayList<>();
				        
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
		public StatementsContext stmts;
		public StatementsContext stmts2;
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(CmmParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CmmParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CmmParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CmmParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(149);
			match(LPAREN);
			setState(150);
			((IfStatementContext)_localctx).expr1 = expr(0);
			setState(151);
			match(RPAREN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(152);
				match(LBRACE);
				}
			}

			setState(155);
			((IfStatementContext)_localctx).stmts = statements();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(156);
				match(RBRACE);
				}
				break;
			}

			          ((IfStatementContext)_localctx).ast =  new IfStatement(((IfStatementContext)_localctx).IF.getLine(), ((IfStatementContext)_localctx).IF.getCharPositionInLine() + 1, ((IfStatementContext)_localctx).expr1.ast, ((IfStatementContext)_localctx).stmts.ast, null);
			      
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(160);
				match(ELSE);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(161);
					match(LBRACE);
					}
				}

				setState(164);
				((IfStatementContext)_localctx).stmts2 = statements();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(165);
					match(RBRACE);
					}
					break;
				}

				          _localctx.ast.setElseBlockStatements(((IfStatementContext)_localctx).stmts2.ast);
				      
				}
				break;
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
	public static class WhileStatementContext extends ParserRuleContext {
		public Statement ast;
		public Token WHILE;
		public ExprContext condition;
		public StatementsContext stmts;
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			setState(173);
			match(LPAREN);
			setState(174);
			((WhileStatementContext)_localctx).condition = expr(0);
			setState(175);
			match(RPAREN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(176);
				match(LBRACE);
				}
			}

			setState(179);
			((WhileStatementContext)_localctx).stmts = statements();
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(180);
				match(RBRACE);
				}
				break;
			}

			        ((WhileStatementContext)_localctx).ast =  new WhileStatement(((WhileStatementContext)_localctx).WHILE.getLine(), ((WhileStatementContext)_localctx).WHILE.getCharPositionInLine()+1, ((WhileStatementContext)_localctx).condition.ast, ((WhileStatementContext)_localctx).stmts.ast);
			    
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
		public Token RETURN;
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
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(186);
			((ReturnStatementContext)_localctx).exp = expr(0);
			setState(187);
			match(SEMI);
			 ((ReturnStatementContext)_localctx).ast =  new ReturnStatement(((ReturnStatementContext)_localctx).RETURN.getLine(), ((ReturnStatementContext)_localctx).RETURN.getCharPositionInLine()+1, ((ReturnStatementContext)_localctx).exp.ast); 
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
		public List<Statement> ast = new ArrayList<Statement>();
		public Token WRITE;
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
		enterRule(_localctx, 22, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((WriteStatementContext)_localctx).WRITE = match(WRITE);
			setState(191);
			((WriteStatementContext)_localctx).exprs = exprList();
			setState(192);
			match(SEMI);

			        for(Expression expr : ((WriteStatementContext)_localctx).exprs.expressions) {
			            _localctx.ast.add(new WriteStatement(((WriteStatementContext)_localctx).WRITE.getLine(), ((WriteStatementContext)_localctx).WRITE.getCharPositionInLine()+1, expr));
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
	public static class ReadStatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public Token READ;
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
		enterRule(_localctx, 24, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((ReadStatementContext)_localctx).READ = match(READ);
			setState(196);
			((ReadStatementContext)_localctx).exprs = exprList();
			setState(197);
			match(SEMI);

			        for(Expression expr : ((ReadStatementContext)_localctx).exprs.expressions) {
			            _localctx.ast.add(new ReadStatement(((ReadStatementContext)_localctx).READ.getLine(), ((ReadStatementContext)_localctx).READ.getCharPositionInLine()+1, expr));
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((AssignmentContext)_localctx).lhs = expr(0);
			setState(201);
			match(ASSIGN);
			setState(202);
			((AssignmentContext)_localctx).rhs = expr(0);
			setState(203);
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
	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext e1;
		public Token INT_CONSTANT;
		public Token DOUBLE_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public Token LPAREN;
		public ExprContext e;
		public Token SUB;
		public Token NOT;
		public FunctionCallExpressionContext f;
		public TypeContext t;
		public Token op;
		public ExprContext e2;
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode DOUBLE_CONSTANT() { return getToken(CmmParser.DOUBLE_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CmmParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CmmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CmmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CmmParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(CmmParser.ADD, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public TerminalNode GTE() { return getToken(CmmParser.GTE, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode LTE() { return getToken(CmmParser.LTE, 0); }
		public TerminalNode NEQ() { return getToken(CmmParser.NEQ, 0); }
		public TerminalNode EQ() { return getToken(CmmParser.EQ, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(207);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntLiteralExpression(((ExprContext)_localctx).INT_CONSTANT.getLine(), ((ExprContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 2:
				{
				setState(209);
				((ExprContext)_localctx).DOUBLE_CONSTANT = match(DOUBLE_CONSTANT);
				 ((ExprContext)_localctx).ast =  new DoubleLiteralExpression(((ExprContext)_localctx).DOUBLE_CONSTANT.getLine(), ((ExprContext)_localctx).DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExprContext)_localctx).DOUBLE_CONSTANT!=null?((ExprContext)_localctx).DOUBLE_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(211);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharLiteralExpression(((ExprContext)_localctx).CHAR_CONSTANT.getLine(), ((ExprContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(213);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new VariableExpression(((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine()+1, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 5:
				{
				setState(215);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(216);
				((ExprContext)_localctx).e = expr(0);
				setState(217);
				match(RPAREN);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).e.ast; 
				}
				break;
			case 6:
				{
				setState(220);
				((ExprContext)_localctx).SUB = match(SUB);
				setState(221);
				((ExprContext)_localctx).e = expr(10);
				 ((ExprContext)_localctx).ast =  new UnaryMinusExpression(((ExprContext)_localctx).SUB.getLine(), ((ExprContext)_localctx).SUB.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 7:
				{
				setState(224);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(225);
				((ExprContext)_localctx).e = expr(9);
				 ((ExprContext)_localctx).ast =  new LogicalNegationExpression(((ExprContext)_localctx).NOT.getLine(), ((ExprContext)_localctx).NOT.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 8:
				{
				setState(228);
				((ExprContext)_localctx).f = functionCallExpression();
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).f.ast; 
				}
				break;
			case 9:
				{
				setState(231);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(232);
				((ExprContext)_localctx).t = type();
				setState(233);
				match(RPAREN);
				setState(234);
				((ExprContext)_localctx).e = expr(1);
				 ((ExprContext)_localctx).ast =  new CastExpression(((ExprContext)_localctx).LPAREN.getLine(), ((ExprContext)_localctx).LPAREN.getCharPositionInLine()+1, ((ExprContext)_localctx).t.ast, ((ExprContext)_localctx).e.ast);     
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(240);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						((ExprContext)_localctx).e2 = expr(9);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						((ExprContext)_localctx).e2 = expr(8);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(250);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						((ExprContext)_localctx).e2 = expr(7);
						 ((ExprContext)_localctx).ast =  new EqualityExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(255);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						((ExprContext)_localctx).e2 = expr(6);
						 ((ExprContext)_localctx).ast =  new LogicalExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(260);
						match(DOT);
						setState(261);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new NestedStructFieldAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(LBRACKET);
						setState(265);
						((ExprContext)_localctx).e2 = expr(0);
						setState(266);
						match(RBRACKET);
						 ((ExprContext)_localctx).ast =  new ArrayAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 30, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((ExprListContext)_localctx).e = expr(0);
			_localctx.expressions.add(((ExprListContext)_localctx).e.ast);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				((ExprListContext)_localctx).exp = expr(0);
				_localctx.expressions.add(((ExprListContext)_localctx).exp.ast);
				}
				}
				setState(284);
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
		enterRule(_localctx, 32, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((ParamListContext)_localctx).p = param();
			 _localctx.ast.add(((ParamListContext)_localctx).p.ast); 
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				((ParamListContext)_localctx).p1 = param();
				 _localctx.ast.add(((ParamListContext)_localctx).p1.ast); 
				}
				}
				setState(295);
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
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((ParamContext)_localctx).t = type();
			setState(297);
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
	public static class StructTypeContext extends ParserRuleContext {
		public StructType ast;
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
		enterRule(_localctx, 36, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(STRUCT);
			setState(301);
			match(LBRACE);
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302);
				((StructTypeContext)_localctx).fds = fieldDeclaration();
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1936L) != 0) );
			setState(307);
			match(RBRACE);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(308);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public Type ast;
		public BaseTypeContext baseType;
		public ArrayDimensionsContext dims;
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ArrayTypeContext)_localctx).baseType = baseType();
			setState(314);
			((ArrayTypeContext)_localctx).dims = arrayDimensions();
			 ((ArrayTypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ArrayTypeContext)_localctx).baseType.ast, ((ArrayTypeContext)_localctx).dims.sizes); 
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
	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionType ast;
		public BaseTypeContext returnType;
		public ParamListContext params;
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((FunctionTypeContext)_localctx).returnType = baseType();
			setState(318);
			match(LPAREN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1936L) != 0)) {
				{
				setState(319);
				((FunctionTypeContext)_localctx).params = paramList();
				}
			}

			setState(322);
			match(RPAREN);
			 ((FunctionTypeContext)_localctx).ast =  new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((FunctionTypeContext)_localctx).returnType.ast, ((FunctionTypeContext)_localctx).params.ast); 
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
		public ArrayTypeContext a;
		public StructTypeContext t;
		public FunctionTypeContext f;
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CmmParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CmmParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((TypeContext)_localctx).a = arrayType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).a.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(INT);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(DOUBLE);
				 ((TypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(CHAR);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				match(VOID);
				 ((TypeContext)_localctx).ast =  VoidType.getInstance(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				((TypeContext)_localctx).t = structType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).t.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				((TypeContext)_localctx).f = functionType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).f.ast; 
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
	public static class BaseTypeContext extends ParserRuleContext {
		public Type ast;
		public StructTypeContext t;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CmmParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CmmParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_baseType);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(INT);
				 ((BaseTypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(DOUBLE);
				 ((BaseTypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(CHAR);
				 ((BaseTypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(VOID);
				 ((BaseTypeContext)_localctx).ast =  VoidType.getInstance(); 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				((BaseTypeContext)_localctx).t = structType();
				 ((BaseTypeContext)_localctx).ast =  ((BaseTypeContext)_localctx).t.ast; 
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
		enterRule(_localctx, 46, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((IdListContext)_localctx).a = match(ID);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(358);
				arrayDimensions();
				}
			}

			 _localctx.ast.add((((IdListContext)_localctx).a!=null?((IdListContext)_localctx).a.getText():null)); 
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				((IdListContext)_localctx).b = match(ID);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(364);
					arrayDimensions();
					}
				}

				 _localctx.ast.add((((IdListContext)_localctx).b!=null?((IdListContext)_localctx).b.getText():null)); 
				}
				}
				setState(372);
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
		public List<Integer> sizes = new ArrayList<>();;
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
		enterRule(_localctx, 48, RULE_arrayDimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(373);
				match(LBRACKET);
				setState(374);
				((ArrayDimensionsContext)_localctx).ic = match(INT_CONSTANT);
				setState(375);
				match(RBRACKET);
				 _localctx.sizes.add(Integer.parseInt((((ArrayDimensionsContext)_localctx).ic!=null?((ArrayDimensionsContext)_localctx).ic.getText():null))); 
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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
	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public FunctionCallExpression ast;
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
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCallExpression);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				((FunctionCallExpressionContext)_localctx).ID = match(ID);
				setState(382);
				match(LPAREN);
				setState(383);
				((FunctionCallExpressionContext)_localctx).el = exprList();
				setState(384);
				match(RPAREN);

				        ((FunctionCallExpressionContext)_localctx).ast =  new FunctionCallExpression(
				            ((FunctionCallExpressionContext)_localctx).ID.getLine(),
				            ((FunctionCallExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				            new VariableExpression(
				                        ((FunctionCallExpressionContext)_localctx).ID.getLine(),
				                        ((FunctionCallExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				                        ((FunctionCallExpressionContext)_localctx).ID.getText()),
				            ((FunctionCallExpressionContext)_localctx).el.expressions
				        );
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				((FunctionCallExpressionContext)_localctx).i1 = match(ID);
				setState(388);
				((FunctionCallExpressionContext)_localctx).l1 = match(LPAREN);
				setState(389);
				((FunctionCallExpressionContext)_localctx).r1 = match(RPAREN);

				            ((FunctionCallExpressionContext)_localctx).ast =  new FunctionCallExpression(
				                ((FunctionCallExpressionContext)_localctx).i1.getLine(),
				                ((FunctionCallExpressionContext)_localctx).i1.getCharPositionInLine() + 1,
				            new VariableExpression(
				                        ((FunctionCallExpressionContext)_localctx).i1.getLine(),
				                        ((FunctionCallExpressionContext)_localctx).i1.getCharPositionInLine() + 1,
				                        ((FunctionCallExpressionContext)_localctx).i1.getText()),
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u018a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003j\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0081\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008c\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0093\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009a\b"+
		"\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a3"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\b\u0001\b\u0003\b\u00ab\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00b6\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00ee\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u010e\b\u000e"+
		"\n\u000e\f\u000e\u0111\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0119\b\u000f\n\u000f\f\u000f"+
		"\u011c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0124\b\u0010\n\u0010\f\u0010\u0127\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0130\b\u0012\u000b\u0012\f\u0012\u0131\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0136\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0141\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0157\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0164\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0168\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016e\b\u0017\u0001"+
		"\u0017\u0005\u0017\u0171\b\u0017\n\u0017\f\u0017\u0174\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u017a\b\u0018\u000b\u0018"+
		"\f\u0018\u017b\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0188\b\u0019\u0001\u0019\u0000\u0001\u001c\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0005\u0002\u0000\u0005\u0005%%\u0001\u0000\u0018\u001a\u0001"+
		"\u0000\u0016\u0017\u0001\u0000\u001b \u0001\u0000!\"\u01a4\u00004\u0001"+
		"\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000"+
		"\u0000\u0006i\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000\u0000\u0000"+
		"\n\u0082\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000\u000e"+
		"\u0092\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000\u0012"+
		"\u00ac\u0001\u0000\u0000\u0000\u0014\u00b9\u0001\u0000\u0000\u0000\u0016"+
		"\u00be\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000\u0000\u0000\u001a"+
		"\u00c8\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000\u0000\u001e"+
		"\u0112\u0001\u0000\u0000\u0000 \u011d\u0001\u0000\u0000\u0000\"\u0128"+
		"\u0001\u0000\u0000\u0000$\u012c\u0001\u0000\u0000\u0000&\u0139\u0001\u0000"+
		"\u0000\u0000(\u013d\u0001\u0000\u0000\u0000*\u0156\u0001\u0000\u0000\u0000"+
		",\u0163\u0001\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u00000\u0179"+
		"\u0001\u0000\u0000\u00002\u0187\u0001\u0000\u0000\u00004=\u0006\u0000"+
		"\uffff\uffff\u000056\u0003\u0002\u0001\u000067\u0006\u0000\uffff\uffff"+
		"\u00007<\u0001\u0000\u0000\u000089\u0003\u0006\u0003\u00009:\u0006\u0000"+
		"\uffff\uffff\u0000:<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000"+
		";8\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0000\u0000\u0001AB\u0006\u0000\uffff\uffff\u0000"+
		"B\u0001\u0001\u0000\u0000\u0000CD\u0003*\u0015\u0000DE\u0003.\u0017\u0000"+
		"EF\u0005\u0014\u0000\u0000FG\u0006\u0001\uffff\uffff\u0000G\u0003\u0001"+
		"\u0000\u0000\u0000HI\u0003*\u0015\u0000IJ\u0003.\u0017\u0000JK\u0005\u0014"+
		"\u0000\u0000KL\u0006\u0002\uffff\uffff\u0000LS\u0001\u0000\u0000\u0000"+
		"MN\u0003*\u0015\u0000NO\u0003.\u0017\u0000OP\u0005\u0014\u0000\u0000P"+
		"Q\u0006\u0002\uffff\uffff\u0000QS\u0001\u0000\u0000\u0000RH\u0001\u0000"+
		"\u0000\u0000RM\u0001\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000"+
		"TU\u0003*\u0015\u0000UV\u0007\u0000\u0000\u0000VW\u0005\u0010\u0000\u0000"+
		"WX\u0003 \u0010\u0000XY\u0005\u0011\u0000\u0000YZ\u0005\u000e\u0000\u0000"+
		"Z[\u0003\u000e\u0007\u0000[\\\u0003\f\u0006\u0000\\]\u0005\u000f\u0000"+
		"\u0000]^\u0006\u0003\uffff\uffff\u0000^j\u0001\u0000\u0000\u0000_`\u0003"+
		"*\u0015\u0000`a\u0007\u0000\u0000\u0000ab\u0005\u0010\u0000\u0000bc\u0005"+
		"\u0011\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0003\u000e\u0007\u0000"+
		"ef\u0003\f\u0006\u0000fg\u0005\u000f\u0000\u0000gh\u0006\u0003\uffff\uffff"+
		"\u0000hj\u0001\u0000\u0000\u0000iT\u0001\u0000\u0000\u0000i_\u0001\u0000"+
		"\u0000\u0000j\u0007\u0001\u0000\u0000\u0000kl\u0003\n\u0005\u0000lm\u0006"+
		"\u0004\uffff\uffff\u0000m\u0081\u0001\u0000\u0000\u0000no\u0003\u001a"+
		"\r\u0000op\u0006\u0004\uffff\uffff\u0000p\u0081\u0001\u0000\u0000\u0000"+
		"qr\u0003\u0010\b\u0000rs\u0006\u0004\uffff\uffff\u0000s\u0081\u0001\u0000"+
		"\u0000\u0000tu\u0003\u0012\t\u0000uv\u0006\u0004\uffff\uffff\u0000v\u0081"+
		"\u0001\u0000\u0000\u0000wx\u0003\u0014\n\u0000xy\u0006\u0004\uffff\uffff"+
		"\u0000y\u0081\u0001\u0000\u0000\u0000z{\u0003\u0016\u000b\u0000{|\u0006"+
		"\u0004\uffff\uffff\u0000|\u0081\u0001\u0000\u0000\u0000}~\u0003\u0018"+
		"\f\u0000~\u007f\u0006\u0004\uffff\uffff\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080k\u0001\u0000\u0000\u0000\u0080n\u0001\u0000\u0000\u0000"+
		"\u0080q\u0001\u0000\u0000\u0000\u0080t\u0001\u0000\u0000\u0000\u0080w"+
		"\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0080}\u0001\u0000"+
		"\u0000\u0000\u0081\t\u0001\u0000\u0000\u0000\u0082\u0083\u00032\u0019"+
		"\u0000\u0083\u0084\u0005\u0014\u0000\u0000\u0084\u0085\u0006\u0005\uffff"+
		"\uffff\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087\u0003\b\u0004"+
		"\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0006\u0006\uffff\uffff"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u008c\u0006\u0006\uffff"+
		"\uffff\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0002\u0001"+
		"\u0000\u008e\u008f\u0003\u000e\u0007\u0000\u008f\u0090\u0006\u0007\uffff"+
		"\uffff\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0093\u0006\u0007"+
		"\uffff\uffff\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0001\u0000\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0097\u0003"+
		"\u001c\u000e\u0000\u0097\u0099\u0005\u0011\u0000\u0000\u0098\u009a\u0005"+
		"\u000e\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0003"+
		"\f\u0006\u0000\u009c\u009e\u0005\u000f\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00aa\u0006\b\uffff\uffff\u0000\u00a0\u00a2\u0005\u0002"+
		"\u0000\u0000\u00a1\u00a3\u0005\u000e\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0003\f\u0006\u0000\u00a5\u00a7\u0005\u000f\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\b\uffff\uffff"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0011\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000"+
		"\u0000\u00ae\u00af\u0003\u001c\u000e\u0000\u00af\u00b1\u0005\u0011\u0000"+
		"\u0000\u00b0\u00b2\u0005\u000e\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0003\f\u0006\u0000\u00b4\u00b6\u0005\u000f\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\t\uffff\uffff\u0000"+
		"\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\f\u0000\u0000\u00ba"+
		"\u00bb\u0003\u001c\u000e\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc"+
		"\u00bd\u0006\n\uffff\uffff\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0\u0003\u001e\u000f\u0000\u00c0"+
		"\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0006\u000b\uffff\uffff\u0000"+
		"\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000b\u0000\u0000"+
		"\u00c4\u00c5\u0003\u001e\u000f\u0000\u00c5\u00c6\u0005\u0014\u0000\u0000"+
		"\u00c6\u00c7\u0006\f\uffff\uffff\u0000\u00c7\u0019\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0003\u001c\u000e\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca"+
		"\u00cb\u0003\u001c\u000e\u0000\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc"+
		"\u00cd\u0006\r\uffff\uffff\u0000\u00cd\u001b\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0006\u000e\uffff\uffff\u0000\u00cf\u00d0\u0005(\u0000\u0000\u00d0"+
		"\u00ee\u0006\u000e\uffff\uffff\u0000\u00d1\u00d2\u0005\'\u0000\u0000\u00d2"+
		"\u00ee\u0006\u000e\uffff\uffff\u0000\u00d3\u00d4\u0005&\u0000\u0000\u00d4"+
		"\u00ee\u0006\u000e\uffff\uffff\u0000\u00d5\u00d6\u0005%\u0000\u0000\u00d6"+
		"\u00ee\u0006\u000e\uffff\uffff\u0000\u00d7\u00d8\u0005\u0010\u0000\u0000"+
		"\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00da\u0005\u0011\u0000\u0000"+
		"\u00da\u00db\u0006\u000e\uffff\uffff\u0000\u00db\u00ee\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0017\u0000\u0000\u00dd\u00de\u0003\u001c\u000e"+
		"\n\u00de\u00df\u0006\u000e\uffff\uffff\u0000\u00df\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005#\u0000\u0000\u00e1\u00e2\u0003\u001c\u000e\t"+
		"\u00e2\u00e3\u0006\u000e\uffff\uffff\u0000\u00e3\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u00032\u0019\u0000\u00e5\u00e6\u0006\u000e\uffff\uffff"+
		"\u0000\u00e6\u00ee\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0010\u0000"+
		"\u0000\u00e8\u00e9\u0003*\u0015\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000"+
		"\u00ea\u00eb\u0003\u001c\u000e\u0001\u00eb\u00ec\u0006\u000e\uffff\uffff"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ed\u00d1\u0001\u0000\u0000\u0000\u00ed\u00d3\u0001\u0000\u0000"+
		"\u0000\u00ed\u00d5\u0001\u0000\u0000\u0000\u00ed\u00d7\u0001\u0000\u0000"+
		"\u0000\u00ed\u00dc\u0001\u0000\u0000\u0000\u00ed\u00e0\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ee\u010f\u0001\u0000\u0000\u0000\u00ef\u00f0\n\b\u0000\u0000"+
		"\u00f0\u00f1\u0007\u0001\u0000\u0000\u00f1\u00f2\u0003\u001c\u000e\t\u00f2"+
		"\u00f3\u0006\u000e\uffff\uffff\u0000\u00f3\u010e\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\n\u0007\u0000\u0000\u00f5\u00f6\u0007\u0002\u0000\u0000\u00f6"+
		"\u00f7\u0003\u001c\u000e\b\u00f7\u00f8\u0006\u000e\uffff\uffff\u0000\u00f8"+
		"\u010e\u0001\u0000\u0000\u0000\u00f9\u00fa\n\u0006\u0000\u0000\u00fa\u00fb"+
		"\u0007\u0003\u0000\u0000\u00fb\u00fc\u0003\u001c\u000e\u0007\u00fc\u00fd"+
		"\u0006\u000e\uffff\uffff\u0000\u00fd\u010e\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\n\u0005\u0000\u0000\u00ff\u0100\u0007\u0004\u0000\u0000\u0100\u0101"+
		"\u0003\u001c\u000e\u0006\u0101\u0102\u0006\u000e\uffff\uffff\u0000\u0102"+
		"\u010e\u0001\u0000\u0000\u0000\u0103\u0104\n\u0003\u0000\u0000\u0104\u0105"+
		"\u0005$\u0000\u0000\u0105\u0106\u0005%\u0000\u0000\u0106\u010e\u0006\u000e"+
		"\uffff\uffff\u0000\u0107\u0108\n\u0002\u0000\u0000\u0108\u0109\u0005\u0012"+
		"\u0000\u0000\u0109\u010a\u0003\u001c\u000e\u0000\u010a\u010b\u0005\u0013"+
		"\u0000\u0000\u010b\u010c\u0006\u000e\uffff\uffff\u0000\u010c\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u00ef\u0001\u0000\u0000\u0000\u010d\u00f4\u0001"+
		"\u0000\u0000\u0000\u010d\u00f9\u0001\u0000\u0000\u0000\u010d\u00fe\u0001"+
		"\u0000\u0000\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u0107\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u001d\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0003"+
		"\u001c\u000e\u0000\u0113\u011a\u0006\u000f\uffff\uffff\u0000\u0114\u0115"+
		"\u0005\u0015\u0000\u0000\u0115\u0116\u0003\u001c\u000e\u0000\u0116\u0117"+
		"\u0006\u000f\uffff\uffff\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118"+
		"\u0114\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u001f\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0003\"\u0011\u0000\u011e\u0125\u0006\u0010\uffff\uffff\u0000\u011f"+
		"\u0120\u0005\u0015\u0000\u0000\u0120\u0121\u0003\"\u0011\u0000\u0121\u0122"+
		"\u0006\u0010\uffff\uffff\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u011f\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"!\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0003*\u0015\u0000\u0129\u012a\u0005%\u0000\u0000\u012a\u012b\u0006\u0011"+
		"\uffff\uffff\u0000\u012b#\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0007"+
		"\u0000\u0000\u012d\u012f\u0005\u000e\u0000\u0000\u012e\u0130\u0003\u0004"+
		"\u0002\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0005\u000f"+
		"\u0000\u0000\u0134\u0136\u0005%\u0000\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0006\u0012\uffff\uffff\u0000\u0138%\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0003,\u0016\u0000\u013a\u013b\u00030\u0018\u0000\u013b"+
		"\u013c\u0006\u0013\uffff\uffff\u0000\u013c\'\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0003,\u0016\u0000\u013e\u0140\u0005\u0010\u0000\u0000\u013f\u0141"+
		"\u0003 \u0010\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"\u0011\u0000\u0000\u0143\u0144\u0006\u0014\uffff\uffff\u0000\u0144)\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0003&\u0013\u0000\u0146\u0147\u0006\u0015"+
		"\uffff\uffff\u0000\u0147\u0157\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"\b\u0000\u0000\u0149\u0157\u0006\u0015\uffff\uffff\u0000\u014a\u014b\u0005"+
		"\t\u0000\u0000\u014b\u0157\u0006\u0015\uffff\uffff\u0000\u014c\u014d\u0005"+
		"\n\u0000\u0000\u014d\u0157\u0006\u0015\uffff\uffff\u0000\u014e\u014f\u0005"+
		"\u0004\u0000\u0000\u014f\u0157\u0006\u0015\uffff\uffff\u0000\u0150\u0151"+
		"\u0003$\u0012\u0000\u0151\u0152\u0006\u0015\uffff\uffff\u0000\u0152\u0157"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0003(\u0014\u0000\u0154\u0155\u0006"+
		"\u0015\uffff\uffff\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0145"+
		"\u0001\u0000\u0000\u0000\u0156\u0148\u0001\u0000\u0000\u0000\u0156\u014a"+
		"\u0001\u0000\u0000\u0000\u0156\u014c\u0001\u0000\u0000\u0000\u0156\u014e"+
		"\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0153"+
		"\u0001\u0000\u0000\u0000\u0157+\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\b\u0000\u0000\u0159\u0164\u0006\u0016\uffff\uffff\u0000\u015a\u015b\u0005"+
		"\t\u0000\u0000\u015b\u0164\u0006\u0016\uffff\uffff\u0000\u015c\u015d\u0005"+
		"\n\u0000\u0000\u015d\u0164\u0006\u0016\uffff\uffff\u0000\u015e\u015f\u0005"+
		"\u0004\u0000\u0000\u015f\u0164\u0006\u0016\uffff\uffff\u0000\u0160\u0161"+
		"\u0003$\u0012\u0000\u0161\u0162\u0006\u0016\uffff\uffff\u0000\u0162\u0164"+
		"\u0001\u0000\u0000\u0000\u0163\u0158\u0001\u0000\u0000\u0000\u0163\u015a"+
		"\u0001\u0000\u0000\u0000\u0163\u015c\u0001\u0000\u0000\u0000\u0163\u015e"+
		"\u0001\u0000\u0000\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0164-\u0001"+
		"\u0000\u0000\u0000\u0165\u0167\u0005%\u0000\u0000\u0166\u0168\u00030\u0018"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0172\u0006\u0017\uffff"+
		"\uffff\u0000\u016a\u016b\u0005\u0015\u0000\u0000\u016b\u016d\u0005%\u0000"+
		"\u0000\u016c\u016e\u00030\u0018\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0171\u0006\u0017\uffff\uffff\u0000\u0170\u016a\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173/\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0012\u0000\u0000"+
		"\u0176\u0177\u0005(\u0000\u0000\u0177\u0178\u0005\u0013\u0000\u0000\u0178"+
		"\u017a\u0006\u0018\uffff\uffff\u0000\u0179\u0175\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c1\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0005%\u0000\u0000\u017e\u017f\u0005\u0010\u0000\u0000\u017f\u0180"+
		"\u0003\u001e\u000f\u0000\u0180\u0181\u0005\u0011\u0000\u0000\u0181\u0182"+
		"\u0006\u0019\uffff\uffff\u0000\u0182\u0188\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005%\u0000\u0000\u0184\u0185\u0005\u0010\u0000\u0000\u0185\u0186"+
		"\u0005\u0011\u0000\u0000\u0186\u0188\u0006\u0019\uffff\uffff\u0000\u0187"+
		"\u017d\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000\u0000\u0188"+
		"3\u0001\u0000\u0000\u0000\u001d;=Ri\u0080\u008b\u0092\u0099\u009d\u00a2"+
		"\u00a6\u00aa\u00b1\u00b5\u00ed\u010d\u010f\u011a\u0125\u0131\u0135\u0140"+
		"\u0156\u0163\u0167\u016d\u0172\u017b\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}