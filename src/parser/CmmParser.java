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
		RULE_program = 0, RULE_mainFunction = 1, RULE_varDeclaration = 2, RULE_typeOrStruct = 3, 
		RULE_fieldDeclaration = 4, RULE_structTypeDeclaration = 5, RULE_structDeclaration = 6, 
		RULE_functionDeclaration = 7, RULE_statement = 8, RULE_statements = 9, 
		RULE_block = 10, RULE_ifStatement = 11, RULE_assignment = 12, RULE_whileStatement = 13, 
		RULE_returnStatement = 14, RULE_writeStatement = 15, RULE_readStatement = 16, 
		RULE_expressionStatement = 17, RULE_expr = 18, RULE_exprList = 19, RULE_paramList = 20, 
		RULE_param = 21, RULE_type = 22, RULE_baseType = 23, RULE_idList = 24, 
		RULE_arrayDimensions = 25, RULE_functionCall = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFunction", "varDeclaration", "typeOrStruct", "fieldDeclaration", 
			"structTypeDeclaration", "structDeclaration", "functionDeclaration", 
			"statement", "statements", "block", "ifStatement", "assignment", "whileStatement", 
			"returnStatement", "writeStatement", "readStatement", "expressionStatement", 
			"expr", "exprList", "paramList", "param", "type", "baseType", "idList", 
			"arrayDimensions", "functionCall"
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
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(54);
						varDeclaration();
						}
						break;
					case 2:
						{
						setState(55);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(56);
						structDeclaration();
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			mainFunction();
			setState(63);
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
			setState(65);
			match(VOID);
			setState(66);
			match(MAIN);
			setState(67);
			match(LPAREN);
			setState(68);
			match(RPAREN);
			setState(69);
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
		public TypeOrStructContext t;
		public ArrayDimensionsContext ad;
		public IdListContext ids;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeOrStructContext typeOrStruct() {
			return getRuleContext(TypeOrStructContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((VarDeclarationContext)_localctx).t = typeOrStruct();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				((VarDeclarationContext)_localctx).ad = arrayDimensions();
				}
				break;
			}
			setState(75);
			((VarDeclarationContext)_localctx).ids = idList();
			setState(76);
			match(SEMI);

			            Type finalType = ((VarDeclarationContext)_localctx).t.ast;
			            int line = ((VarDeclarationContext)_localctx).t.line;
			            int col = ((VarDeclarationContext)_localctx).t.col;

			            if (((VarDeclarationContext)_localctx).ad.size > 0) { //Ensure ((VarDeclarationContext)_localctx).ad.size > 0 is valid for your case
			                finalType = new ArrayType(line, col, finalType, ((VarDeclarationContext)_localctx).ad.size);
			            }

			            ((VarDeclarationContext)_localctx).ast =  new VarDeclaration(line, col, ((VarDeclarationContext)_localctx).ids.ast, finalType);
			        
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
	public static class TypeOrStructContext extends ParserRuleContext {
		public Type ast;
		public int line;
		public int col;
		public TypeContext t1;
		public StructTypeDeclarationContext t2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructTypeDeclarationContext structTypeDeclaration() {
			return getRuleContext(StructTypeDeclarationContext.class,0);
		}
		public TypeOrStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrStruct; }
	}

	public final TypeOrStructContext typeOrStruct() throws RecognitionException {
		TypeOrStructContext _localctx = new TypeOrStructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeOrStruct);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case DOUBLE:
			case CHAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((TypeOrStructContext)_localctx).t1 = type();

				            ((TypeOrStructContext)_localctx).ast =  ((TypeOrStructContext)_localctx).t1.ast;
				            ((TypeOrStructContext)_localctx).line =  (((TypeOrStructContext)_localctx).t1!=null?(((TypeOrStructContext)_localctx).t1.start):null).getLine();
				            ((TypeOrStructContext)_localctx).col =  (((TypeOrStructContext)_localctx).t1!=null?(((TypeOrStructContext)_localctx).t1.start):null).getCharPositionInLine() + 1;
				        
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((TypeOrStructContext)_localctx).t2 = structTypeDeclaration();

				            ((TypeOrStructContext)_localctx).ast =  ((TypeOrStructContext)_localctx).t2.ast;
				            ((TypeOrStructContext)_localctx).line =  (((TypeOrStructContext)_localctx).t2!=null?(((TypeOrStructContext)_localctx).t2.start):null).getLine();
				            ((TypeOrStructContext)_localctx).col =  (((TypeOrStructContext)_localctx).t2!=null?(((TypeOrStructContext)_localctx).t2.start):null).getCharPositionInLine() + 1;
				        
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldDeclaration> ast;
		public TypeOrStructContext t;
		public ArrayDimensionsContext ad;
		public IdListContext ids;
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TypeOrStructContext typeOrStruct() {
			return getRuleContext(TypeOrStructContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((FieldDeclarationContext)_localctx).t = typeOrStruct();
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(88);
				((FieldDeclarationContext)_localctx).ad = arrayDimensions();
				}
				break;
			}
			setState(91);
			((FieldDeclarationContext)_localctx).ids = idList();
			setState(92);
			match(SEMI);

			            ((FieldDeclarationContext)_localctx).ast =  new ArrayList<>();
			            Type finalType = ((FieldDeclarationContext)_localctx).t.ast;

			            // Handling array dimensions if provided.
			            if (((FieldDeclarationContext)_localctx).ad.size > 0) {
			                finalType = new ArrayType(((FieldDeclarationContext)_localctx).t.line, ((FieldDeclarationContext)_localctx).t.col, finalType, ((FieldDeclarationContext)_localctx).ad.size);
			            }

			            // Construct FieldDeclaration objects and add them to the ast.
			            for(String id : ((FieldDeclarationContext)_localctx).ids.ast) {
			                FieldDeclaration field = new FieldDeclaration(((FieldDeclarationContext)_localctx).t.line, ((FieldDeclarationContext)_localctx).t.col, finalType, id);
			                _localctx.ast.add(field);
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
	public static class StructTypeDeclarationContext extends ParserRuleContext {
		public Type ast;
		public Token id;
		public FieldDeclarationContext fds;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structTypeDeclaration; }
	}

	public final StructTypeDeclarationContext structTypeDeclaration() throws RecognitionException {
		StructTypeDeclarationContext _localctx = new StructTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(STRUCT);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(96);
				((StructTypeDeclarationContext)_localctx).id = match(ID);
				}
			}

			setState(99);
			match(LBRACE);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				((StructTypeDeclarationContext)_localctx).fds = fieldDeclaration();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955408L) != 0) );
			setState(105);
			match(RBRACE);

			            ((StructTypeDeclarationContext)_localctx).ast =  new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((StructTypeDeclarationContext)_localctx).fds.ast);
			        
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDefinition ast;
		public FieldDeclarationContext fds;
		public ArrayDimensionsContext ad;
		public Token ID;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(STRUCT);
			setState(109);
			match(LBRACE);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				((StructDeclarationContext)_localctx).fds = fieldDeclaration();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955408L) != 0) );
			setState(115);
			match(RBRACE);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(116);
				((StructDeclarationContext)_localctx).ad = arrayDimensions();
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(119);
				((StructDeclarationContext)_localctx).ID = match(ID);
				}
			}

			setState(122);
			match(SEMI);

			            String structName = ((StructDeclarationContext)_localctx).ID != null ? (((StructDeclarationContext)_localctx).ID!=null?((StructDeclarationContext)_localctx).ID.getText():null) : null;
			            ((StructDeclarationContext)_localctx).ast =  new StructDefinition(_localctx.start.getLine(),
			                                        _localctx.start.getCharPositionInLine()+1,
			                                        structName,
			                                        ((StructDeclarationContext)_localctx).fds.ast,
			                                        ((StructDeclarationContext)_localctx).ad.size);
			        
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
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((FunctionDeclarationContext)_localctx).t = type();
			setState(126);
			((FunctionDeclarationContext)_localctx).n = match(ID);
			setState(127);
			match(LPAREN);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(128);
				((FunctionDeclarationContext)_localctx).p = paramList();
				}
				break;
			}
			setState(131);
			match(RPAREN);
			setState(132);
			((FunctionDeclarationContext)_localctx).b = block();

			        ((FunctionDeclarationContext)_localctx).ast =  new FunctionDeclaration((((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getLine(), (((FunctionDeclarationContext)_localctx).t!=null?(((FunctionDeclarationContext)_localctx).t.start):null).getCharPositionInLine()+1, ((FunctionDeclarationContext)_localctx).t.ast, (((FunctionDeclarationContext)_localctx).n!=null?((FunctionDeclarationContext)_localctx).n.getText():null), ((FunctionDeclarationContext)_localctx).p.ast != null ? ((FunctionDeclarationContext)_localctx).p.ast : Collections.emptyList(), ((FunctionDeclarationContext)_localctx).b.ast);
			    
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((StatementContext)_localctx).vd = varDeclaration();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).vd.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((StatementContext)_localctx).assign = assignment();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).assign.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				((StatementContext)_localctx).ifstmnt = ifStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifstmnt.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((StatementContext)_localctx).whilestmnt = whileStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).whilestmnt.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				((StatementContext)_localctx).ret = returnStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ret.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				((StatementContext)_localctx).write = writeStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).write.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				((StatementContext)_localctx).read = readStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).read.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
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
		enterRule(_localctx, 18, RULE_statements);
		try {
			setState(166);
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
				setState(161);
				((StatementsContext)_localctx).stmt = statement();
				setState(162);
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
		enterRule(_localctx, 20, RULE_block);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(LBRACE);
				setState(169);
				((BlockContext)_localctx).stmts = statements();
				setState(170);
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
				setState(173);
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
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(179);
			match(LPAREN);
			setState(180);
			((IfStatementContext)_localctx).expr1 = expr(0);
			setState(181);
			match(RPAREN);
			setState(182);
			((IfStatementContext)_localctx).block1 = block();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				match(ELSE);
				setState(184);
				((IfStatementContext)_localctx).block2 = block();
				}
				break;
			}

			            ((IfStatementContext)_localctx).ast =  new IfStatement(((IfStatementContext)_localctx).IF.getLine(),
			                                   ((IfStatementContext)_localctx).IF.getCharPositionInLine() + 1,
			                                   ((IfStatementContext)_localctx).expr1.ast,
			                                   ((IfStatementContext)_localctx).block1.ast,
			                                   (((IfStatementContext)_localctx).block2.ast != null) ? ((IfStatementContext)_localctx).block2.ast : null);
			        
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((AssignmentContext)_localctx).lhs = expr(0);
			setState(190);
			match(ASSIGN);
			setState(191);
			((AssignmentContext)_localctx).rhs = expr(0);
			setState(192);
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
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			setState(196);
			match(LPAREN);
			setState(197);
			((WhileStatementContext)_localctx).condition = expr(0);
			setState(198);
			match(RPAREN);
			setState(199);
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
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(RETURN);
			setState(203);
			((ReturnStatementContext)_localctx).exp = expr(0);
			setState(204);
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
		enterRule(_localctx, 30, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WRITE);
			setState(208);
			((WriteStatementContext)_localctx).exprs = exprList();
			setState(209);
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
		enterRule(_localctx, 32, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(READ);
			setState(213);
			((ReadStatementContext)_localctx).exprs = exprList();
			setState(214);
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
		enterRule(_localctx, 34, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ExpressionStatementContext)_localctx).expr1 = expr(0);
			setState(218);
			match(SEMI);

			            ((ExpressionStatementContext)_localctx).ast =  new ExpressionStatement((((ExpressionStatementContext)_localctx).expr1!=null?(((ExpressionStatementContext)_localctx).expr1.start):null).getLine(),
			                                            (((ExpressionStatementContext)_localctx).expr1!=null?(((ExpressionStatementContext)_localctx).expr1.start):null).getCharPositionInLine() + 1,
			                                            ((ExpressionStatementContext)_localctx).expr1.ast);
			        
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(222);
				((ExprContext)_localctx).SUB = match(SUB);
				setState(223);
				((ExprContext)_localctx).e = expr(11);
				 ((ExprContext)_localctx).ast =  new UnaryMinusExpression(((ExprContext)_localctx).SUB.getLine(), ((ExprContext)_localctx).SUB.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 2:
				{
				setState(226);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(227);
				((ExprContext)_localctx).e = expr(10);
				 ((ExprContext)_localctx).ast =  new LogicalNegationExpression(((ExprContext)_localctx).NOT.getLine(), ((ExprContext)_localctx).NOT.getCharPositionInLine()+1, ((ExprContext)_localctx).e.ast); 
				}
				break;
			case 3:
				{
				setState(230);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(231);
				((ExprContext)_localctx).e = expr(0);
				setState(232);
				match(RPAREN);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).e.ast; 
				}
				break;
			case 4:
				{
				setState(235);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntLiteralExpression(((ExprContext)_localctx).INT_CONSTANT.getLine(), ((ExprContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 5:
				{
				setState(237);
				((ExprContext)_localctx).DOUBLE_CONSTANT = match(DOUBLE_CONSTANT);
				 ((ExprContext)_localctx).ast =  new DoubleLiteralExpression(((ExprContext)_localctx).DOUBLE_CONSTANT.getLine(), ((ExprContext)_localctx).DOUBLE_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExprContext)_localctx).DOUBLE_CONSTANT!=null?((ExprContext)_localctx).DOUBLE_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(239);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharLiteralExpression(((ExprContext)_localctx).CHAR_CONSTANT.getLine(), ((ExprContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(241);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).ast =  new VariableExpression(((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine()+1, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case 8:
				{
				setState(243);
				functionCall();
				}
				break;
			case 9:
				{
				setState(244);
				((ExprContext)_localctx).LPAREN = match(LPAREN);
				setState(245);
				((ExprContext)_localctx).t = type();
				setState(246);
				match(RPAREN);
				setState(247);
				((ExprContext)_localctx).e = expr(1);
				 ((ExprContext)_localctx).ast =  new CastExpression(((ExprContext)_localctx).LPAREN.getLine(), ((ExprContext)_localctx).LPAREN.getCharPositionInLine()+1, ((ExprContext)_localctx).t.ast, ((ExprContext)_localctx).e.ast);     
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(253);
						match(OR);
						setState(254);
						((ExprContext)_localctx).e2 = expr(25);
						 ((ExprContext)_localctx).ast =  new LogicalOrExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(258);
						match(AND);
						setState(259);
						((ExprContext)_localctx).e2 = expr(24);
						 ((ExprContext)_localctx).ast =  new LogicalAndExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(263);
						match(EQ);
						setState(264);
						((ExprContext)_localctx).e2 = expr(23);
						 ((ExprContext)_localctx).ast =  new EqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(268);
						match(NEQ);
						setState(269);
						((ExprContext)_localctx).e2 = expr(22);
						 ((ExprContext)_localctx).ast =  new NotEqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(273);
						match(LTE);
						setState(274);
						((ExprContext)_localctx).e2 = expr(21);
						 ((ExprContext)_localctx).ast =  new LessThanOrEqualsExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(278);
						match(LT);
						setState(279);
						((ExprContext)_localctx).e2 = expr(20);
						 ((ExprContext)_localctx).ast =  new LessThanExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(283);
						match(GTE);
						setState(284);
						((ExprContext)_localctx).e2 = expr(19);
						 ((ExprContext)_localctx).ast =  new GreaterThanOrEqualExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(288);
						match(GT);
						setState(289);
						((ExprContext)_localctx).e2 = expr(18);
						 ((ExprContext)_localctx).ast =  new GreaterThanExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(293);
						match(ADD);
						setState(294);
						((ExprContext)_localctx).e2 = expr(17);
						 ((ExprContext)_localctx).ast =  new AddExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(298);
						((ExprContext)_localctx).SUB = match(SUB);
						setState(299);
						((ExprContext)_localctx).e2 = expr(16);
						 ((ExprContext)_localctx).ast =  new SubtractExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(303);
						match(MUL);
						setState(304);
						((ExprContext)_localctx).e2 = expr(15);
						 ((ExprContext)_localctx).ast =  new MultiplyExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(308);
						match(DIV);
						setState(309);
						((ExprContext)_localctx).e2 = expr(14);
						 ((ExprContext)_localctx).ast =  new DivideExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(313);
						match(MOD);
						setState(314);
						((ExprContext)_localctx).e2 = expr(13);
						 ((ExprContext)_localctx).ast =  new ModulusExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						match(DOT);
						setState(319);
						((ExprContext)_localctx).ID = match(ID);
						 ((ExprContext)_localctx).ast =  new NestedStructFieldAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(LBRACKET);
						setState(323);
						((ExprContext)_localctx).e2 = expr(0);
						setState(324);
						match(RBRACKET);
						 ((ExprContext)_localctx).ast =  new ArrayAccessExpression((((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getLine(), (((ExprContext)_localctx).e1!=null?(((ExprContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).e1.ast, ((ExprContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<Expression> expressions;
		public ExprContext expr;
		public List<ExprContext> e = new ArrayList<ExprContext>();
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
		enterRule(_localctx, 38, RULE_exprList);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case SUB:
			case NOT:
			case ID:
			case CHAR_CONSTANT:
			case DOUBLE_CONSTANT:
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((ExprListContext)_localctx).expr = expr(0);
				((ExprListContext)_localctx).e.add(((ExprListContext)_localctx).expr);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					((ExprListContext)_localctx).expr = expr(0);
					((ExprListContext)_localctx).e.add(((ExprListContext)_localctx).expr);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        ((ExprListContext)_localctx).expressions =  new ArrayList<>();
				        for (ExprContext ec : ((ExprListContext)_localctx).e) {
				            _localctx.expressions.add(ec.ast);
				        }
				    
				}
				break;
			case RPAREN:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExprListContext)_localctx).expressions =  Collections.emptyList(); 
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
	public static class ParamListContext extends ParserRuleContext {
		public List<Parameter> ast;
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
		enterRule(_localctx, 40, RULE_paramList);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case DOUBLE:
			case CHAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((ParamListContext)_localctx).p = param();

				        ((ParamListContext)_localctx).ast =  new ArrayList<>();
				        _localctx.ast.add(((ParamListContext)_localctx).p.ast);
				      
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					((ParamListContext)_localctx).p1 = param();
					 _localctx.ast.add(((ParamListContext)_localctx).p1.ast); 
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				 ((ParamListContext)_localctx).ast =  Collections.emptyList(); 
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
		enterRule(_localctx, 42, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((ParamContext)_localctx).t = type();
			setState(360);
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
		public BaseTypeContext bt;
		public Token ID;
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case DOUBLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				((TypeContext)_localctx).bt = baseType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).bt.ast; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((TypeContext)_localctx).ID = match(ID);
				 ((TypeContext)_localctx).ast =  new UserDefinedType(((TypeContext)_localctx).ID.getLine(), ((TypeContext)_localctx).ID.getCharPositionInLine(), (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null)); 
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
	public static class BaseTypeContext extends ParserRuleContext {
		public Type ast;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CmmParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CmmParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_baseType);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(INT);
				 ((BaseTypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(DOUBLE);
				 ((BaseTypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(CHAR);
				 ((BaseTypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(VOID);
				 ((BaseTypeContext)_localctx).ast =  VoidType.getInstance(); 
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
		public List<String> ast;
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
		enterRule(_localctx, 48, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((IdListContext)_localctx).a = match(ID);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(381);
				arrayDimensions();
				}
				break;
			}
			 ((IdListContext)_localctx).ast =  new ArrayList<>(); _localctx.ast.add((((IdListContext)_localctx).a!=null?((IdListContext)_localctx).a.getText():null)); 
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				setState(386);
				((IdListContext)_localctx).b = match(ID);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(387);
					arrayDimensions();
					}
					break;
				}
				 _localctx.ast.add((((IdListContext)_localctx).b!=null?((IdListContext)_localctx).b.getText():null)); 
				}
				}
				setState(395);
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
		public int size;
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
		enterRule(_localctx, 50, RULE_arrayDimensions);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(396);
					match(LBRACKET);
					setState(397);
					((ArrayDimensionsContext)_localctx).ic = match(INT_CONSTANT);
					setState(398);
					match(RBRACKET);
					}
					}
					setState(401); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				 ((ArrayDimensionsContext)_localctx).size =  Integer.parseInt((((ArrayDimensionsContext)_localctx).ic!=null?((ArrayDimensionsContext)_localctx).ic.getText():null)); 
				}
				break;
			case SEMI:
			case COMMA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				 ((ArrayDimensionsContext)_localctx).size =  0; 
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
	public static class FunctionCallContext extends ParserRuleContext {
		public Expression ast;
		public Token ID;
		public ExprListContext el;
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
		enterRule(_localctx, 52, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((FunctionCallContext)_localctx).ID = match(ID);
			setState(408);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(409);
				((FunctionCallContext)_localctx).el = exprList();
				}
				break;
			}
			setState(412);
			match(RPAREN);

			        ((FunctionCallContext)_localctx).ast =  new FunctionCallExpression(
			            ((FunctionCallContext)_localctx).ID.getLine(),
			            ((FunctionCallContext)_localctx).ID.getCharPositionInLine() + 1,
			            ((FunctionCallContext)_localctx).ID.getText(),
			            ((FunctionCallContext)_localctx).el.expressions
			        );
			    
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
		case 18:
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
		"\u0004\u0001+\u01a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005f\b\u0005\u000b\u0005\f\u0005g\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006p\b\u0006\u000b\u0006\f\u0006q\u0001\u0006\u0001\u0006\u0003\u0006"+
		"v\b\u0006\u0001\u0006\u0003\u0006y\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a0\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a7\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ba"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0148"+
		"\b\u0012\n\u0012\f\u0012\u014b\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0150\b\u0013\n\u0013\f\u0013\u0153\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0158\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0160\b\u0014\n"+
		"\u0014\f\u0014\u0163\t\u0014\u0001\u0014\u0003\u0014\u0166\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0171\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u017b\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u017f"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0185"+
		"\b\u0018\u0001\u0018\u0005\u0018\u0188\b\u0018\n\u0018\f\u0018\u018b\t"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0190\b\u0019\u000b"+
		"\u0019\f\u0019\u0191\u0001\u0019\u0001\u0019\u0003\u0019\u0196\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u019b\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0001$\u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\u0000\u01bf\u0000;\u0001\u0000\u0000\u0000\u0002A\u0001"+
		"\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000"+
		"\u0000\bW\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fl\u0001"+
		"\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000"+
		"\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000"+
		"\u0000\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00bd\u0001\u0000"+
		"\u0000\u0000\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000"+
		"\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000"+
		"\u0000\"\u00d9\u0001\u0000\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000"+
		"&\u0157\u0001\u0000\u0000\u0000(\u0165\u0001\u0000\u0000\u0000*\u0167"+
		"\u0001\u0000\u0000\u0000,\u0170\u0001\u0000\u0000\u0000.\u017a\u0001\u0000"+
		"\u0000\u00000\u017c\u0001\u0000\u0000\u00002\u0195\u0001\u0000\u0000\u0000"+
		"4\u0197\u0001\u0000\u0000\u00006:\u0003\u0004\u0002\u00007:\u0003\u000e"+
		"\u0007\u00008:\u0003\f\u0006\u000096\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0005\u0000\u0000"+
		"\u0001@\u0001\u0001\u0000\u0000\u0000AB\u0005\u0004\u0000\u0000BC\u0005"+
		"\u0005\u0000\u0000CD\u0005\u0010\u0000\u0000DE\u0005\u0011\u0000\u0000"+
		"EF\u0003\u0014\n\u0000F\u0003\u0001\u0000\u0000\u0000GI\u0003\u0006\u0003"+
		"\u0000HJ\u00032\u0019\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u00030\u0018\u0000LM\u0005\u0014\u0000"+
		"\u0000MN\u0006\u0002\uffff\uffff\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OP\u0003,\u0016\u0000PQ\u0006\u0003\uffff\uffff\u0000QV\u0001\u0000\u0000"+
		"\u0000RS\u0003\n\u0005\u0000ST\u0006\u0003\uffff\uffff\u0000TV\u0001\u0000"+
		"\u0000\u0000UO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000V\u0007"+
		"\u0001\u0000\u0000\u0000WY\u0003\u0006\u0003\u0000XZ\u00032\u0019\u0000"+
		"YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u00030\u0018\u0000\\]\u0005\u0014\u0000\u0000]^\u0006\u0004"+
		"\uffff\uffff\u0000^\t\u0001\u0000\u0000\u0000_a\u0005\u0007\u0000\u0000"+
		"`b\u0005%\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ce\u0005\u000e\u0000\u0000df\u0003\b\u0004\u0000"+
		"ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u000f"+
		"\u0000\u0000jk\u0006\u0005\uffff\uffff\u0000k\u000b\u0001\u0000\u0000"+
		"\u0000lm\u0005\u0007\u0000\u0000mo\u0005\u000e\u0000\u0000np\u0003\b\u0004"+
		"\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0005"+
		"\u000f\u0000\u0000tv\u00032\u0019\u0000ut\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0005%\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0014\u0000\u0000{|\u0006\u0006\uffff\uffff\u0000|\r\u0001\u0000"+
		"\u0000\u0000}~\u0003,\u0016\u0000~\u007f\u0005%\u0000\u0000\u007f\u0081"+
		"\u0005\u0010\u0000\u0000\u0080\u0082\u0003(\u0014\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0011\u0000\u0000\u0084\u0085\u0003"+
		"\u0014\n\u0000\u0085\u0086\u0006\u0007\uffff\uffff\u0000\u0086\u000f\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\u0004\u0002\u0000\u0088\u0089\u0006"+
		"\b\uffff\uffff\u0000\u0089\u00a0\u0001\u0000\u0000\u0000\u008a\u008b\u0003"+
		"\u0018\f\u0000\u008b\u008c\u0006\b\uffff\uffff\u0000\u008c\u00a0\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u0016\u000b\u0000\u008e\u008f\u0006"+
		"\b\uffff\uffff\u0000\u008f\u00a0\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\u001a\r\u0000\u0091\u0092\u0006\b\uffff\uffff\u0000\u0092\u00a0\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0003\u001c\u000e\u0000\u0094\u0095\u0006"+
		"\b\uffff\uffff\u0000\u0095\u00a0\u0001\u0000\u0000\u0000\u0096\u0097\u0003"+
		"\u001e\u000f\u0000\u0097\u0098\u0006\b\uffff\uffff\u0000\u0098\u00a0\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003 \u0010\u0000\u009a\u009b\u0006\b"+
		"\uffff\uffff\u0000\u009b\u00a0\u0001\u0000\u0000\u0000\u009c\u009d\u0003"+
		"\"\u0011\u0000\u009d\u009e\u0006\b\uffff\uffff\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u0087\u0001\u0000\u0000\u0000\u009f\u008a\u0001"+
		"\u0000\u0000\u0000\u009f\u008d\u0001\u0000\u0000\u0000\u009f\u0090\u0001"+
		"\u0000\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000\u009f\u0096\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009c\u0001"+
		"\u0000\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0010\b\u0000\u00a2\u00a3\u0003\u0012\t\u0000\u00a3\u00a4\u0006\t\uffff"+
		"\uffff\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a7\u0006\t\uffff"+
		"\uffff\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u000e"+
		"\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u00ab\u0005\u000f\u0000"+
		"\u0000\u00ab\u00ac\u0006\n\uffff\uffff\u0000\u00ac\u00b1\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u00af\u0006\n\uffff\uffff"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u0005\u0010\u0000"+
		"\u0000\u00b4\u00b5\u0003$\u0012\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000"+
		"\u00b6\u00b9\u0003\u0014\n\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8"+
		"\u00ba\u0003\u0014\n\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0006\u000b\uffff\uffff\u0000\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003$\u0012\u0000\u00be\u00bf\u0005\r\u0000\u0000\u00bf\u00c0"+
		"\u0003$\u0012\u0000\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0006"+
		"\f\uffff\uffff\u0000\u00c2\u0019\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0003\u0000\u0000\u00c4\u00c5\u0005\u0010\u0000\u0000\u00c5\u00c6\u0003"+
		"$\u0012\u0000\u00c6\u00c7\u0005\u0011\u0000\u0000\u00c7\u00c8\u0003\u0014"+
		"\n\u0000\u00c8\u00c9\u0006\r\uffff\uffff\u0000\u00c9\u001b\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\f\u0000\u0000\u00cb\u00cc\u0003$\u0012"+
		"\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00ce\u0006\u000e\uffff"+
		"\uffff\u0000\u00ce\u001d\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0006"+
		"\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1\u00d2\u0005\u0014\u0000"+
		"\u0000\u00d2\u00d3\u0006\u000f\uffff\uffff\u0000\u00d3\u001f\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0003&\u0013"+
		"\u0000\u00d6\u00d7\u0005\u0014\u0000\u0000\u00d7\u00d8\u0006\u0010\uffff"+
		"\uffff\u0000\u00d8!\u0001\u0000\u0000\u0000\u00d9\u00da\u0003$\u0012\u0000"+
		"\u00da\u00db\u0005\u0014\u0000\u0000\u00db\u00dc\u0006\u0011\uffff\uffff"+
		"\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\u0012\uffff\uffff"+
		"\u0000\u00de\u00df\u0005\u0017\u0000\u0000\u00df\u00e0\u0003$\u0012\u000b"+
		"\u00e0\u00e1\u0006\u0012\uffff\uffff\u0000\u00e1\u00fb\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005#\u0000\u0000\u00e3\u00e4\u0003$\u0012\n\u00e4"+
		"\u00e5\u0006\u0012\uffff\uffff\u0000\u00e5\u00fb\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0010\u0000\u0000\u00e7\u00e8\u0003$\u0012\u0000\u00e8"+
		"\u00e9\u0005\u0011\u0000\u0000\u00e9\u00ea\u0006\u0012\uffff\uffff\u0000"+
		"\u00ea\u00fb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005(\u0000\u0000\u00ec"+
		"\u00fb\u0006\u0012\uffff\uffff\u0000\u00ed\u00ee\u0005\'\u0000\u0000\u00ee"+
		"\u00fb\u0006\u0012\uffff\uffff\u0000\u00ef\u00f0\u0005&\u0000\u0000\u00f0"+
		"\u00fb\u0006\u0012\uffff\uffff\u0000\u00f1\u00f2\u0005%\u0000\u0000\u00f2"+
		"\u00fb\u0006\u0012\uffff\uffff\u0000\u00f3\u00fb\u00034\u001a\u0000\u00f4"+
		"\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f6\u0003,\u0016\u0000\u00f6\u00f7"+
		"\u0005\u0011\u0000\u0000\u00f7\u00f8\u0003$\u0012\u0001\u00f8\u00f9\u0006"+
		"\u0012\uffff\uffff\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00dd"+
		"\u0001\u0000\u0000\u0000\u00fa\u00e2\u0001\u0000\u0000\u0000\u00fa\u00e6"+
		"\u0001\u0000\u0000\u0000\u00fa\u00eb\u0001\u0000\u0000\u0000\u00fa\u00ed"+
		"\u0001\u0000\u0000\u0000\u00fa\u00ef\u0001\u0000\u0000\u0000\u00fa\u00f1"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f3\u0001\u0000\u0000\u0000\u00fa\u00f4"+
		"\u0001\u0000\u0000\u0000\u00fb\u0149\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\n\u0018\u0000\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe\u00ff\u0003"+
		"$\u0012\u0019\u00ff\u0100\u0006\u0012\uffff\uffff\u0000\u0100\u0148\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\n\u0017\u0000\u0000\u0102\u0103\u0005!"+
		"\u0000\u0000\u0103\u0104\u0003$\u0012\u0018\u0104\u0105\u0006\u0012\uffff"+
		"\uffff\u0000\u0105\u0148\u0001\u0000\u0000\u0000\u0106\u0107\n\u0016\u0000"+
		"\u0000\u0107\u0108\u0005 \u0000\u0000\u0108\u0109\u0003$\u0012\u0017\u0109"+
		"\u010a\u0006\u0012\uffff\uffff\u0000\u010a\u0148\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\n\u0015\u0000\u0000\u010c\u010d\u0005\u001f\u0000\u0000\u010d"+
		"\u010e\u0003$\u0012\u0016\u010e\u010f\u0006\u0012\uffff\uffff\u0000\u010f"+
		"\u0148\u0001\u0000\u0000\u0000\u0110\u0111\n\u0014\u0000\u0000\u0111\u0112"+
		"\u0005\u001e\u0000\u0000\u0112\u0113\u0003$\u0012\u0015\u0113\u0114\u0006"+
		"\u0012\uffff\uffff\u0000\u0114\u0148\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\n\u0013\u0000\u0000\u0116\u0117\u0005\u001d\u0000\u0000\u0117\u0118\u0003"+
		"$\u0012\u0014\u0118\u0119\u0006\u0012\uffff\uffff\u0000\u0119\u0148\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\n\u0012\u0000\u0000\u011b\u011c\u0005\u001c"+
		"\u0000\u0000\u011c\u011d\u0003$\u0012\u0013\u011d\u011e\u0006\u0012\uffff"+
		"\uffff\u0000\u011e\u0148\u0001\u0000\u0000\u0000\u011f\u0120\n\u0011\u0000"+
		"\u0000\u0120\u0121\u0005\u001b\u0000\u0000\u0121\u0122\u0003$\u0012\u0012"+
		"\u0122\u0123\u0006\u0012\uffff\uffff\u0000\u0123\u0148\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\n\u0010\u0000\u0000\u0125\u0126\u0005\u0016\u0000\u0000"+
		"\u0126\u0127\u0003$\u0012\u0011\u0127\u0128\u0006\u0012\uffff\uffff\u0000"+
		"\u0128\u0148\u0001\u0000\u0000\u0000\u0129\u012a\n\u000f\u0000\u0000\u012a"+
		"\u012b\u0005\u0017\u0000\u0000\u012b\u012c\u0003$\u0012\u0010\u012c\u012d"+
		"\u0006\u0012\uffff\uffff\u0000\u012d\u0148\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\n\u000e\u0000\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130\u0131"+
		"\u0003$\u0012\u000f\u0131\u0132\u0006\u0012\uffff\uffff\u0000\u0132\u0148"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\n\r\u0000\u0000\u0134\u0135\u0005"+
		"\u0019\u0000\u0000\u0135\u0136\u0003$\u0012\u000e\u0136\u0137\u0006\u0012"+
		"\uffff\uffff\u0000\u0137\u0148\u0001\u0000\u0000\u0000\u0138\u0139\n\f"+
		"\u0000\u0000\u0139\u013a\u0005\u001a\u0000\u0000\u013a\u013b\u0003$\u0012"+
		"\r\u013b\u013c\u0006\u0012\uffff\uffff\u0000\u013c\u0148\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\n\u0003\u0000\u0000\u013e\u013f\u0005$\u0000\u0000"+
		"\u013f\u0140\u0005%\u0000\u0000\u0140\u0148\u0006\u0012\uffff\uffff\u0000"+
		"\u0141\u0142\n\u0002\u0000\u0000\u0142\u0143\u0005\u0012\u0000\u0000\u0143"+
		"\u0144\u0003$\u0012\u0000\u0144\u0145\u0005\u0013\u0000\u0000\u0145\u0146"+
		"\u0006\u0012\uffff\uffff\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147"+
		"\u00fc\u0001\u0000\u0000\u0000\u0147\u0101\u0001\u0000\u0000\u0000\u0147"+
		"\u0106\u0001\u0000\u0000\u0000\u0147\u010b\u0001\u0000\u0000\u0000\u0147"+
		"\u0110\u0001\u0000\u0000\u0000\u0147\u0115\u0001\u0000\u0000\u0000\u0147"+
		"\u011a\u0001\u0000\u0000\u0000\u0147\u011f\u0001\u0000\u0000\u0000\u0147"+
		"\u0124\u0001\u0000\u0000\u0000\u0147\u0129\u0001\u0000\u0000\u0000\u0147"+
		"\u012e\u0001\u0000\u0000\u0000\u0147\u0133\u0001\u0000\u0000\u0000\u0147"+
		"\u0138\u0001\u0000\u0000\u0000\u0147\u013d\u0001\u0000\u0000\u0000\u0147"+
		"\u0141\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"%\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0151"+
		"\u0003$\u0012\u0000\u014d\u014e\u0005\u0015\u0000\u0000\u014e\u0150\u0003"+
		"$\u0012\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0006\u0013\uffff\uffff\u0000\u0155\u0158\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0006\u0013\uffff\uffff\u0000\u0157\u014c"+
		"\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\'\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0003*\u0015\u0000\u015a\u0161\u0006\u0014"+
		"\uffff\uffff\u0000\u015b\u015c\u0005\u0015\u0000\u0000\u015c\u015d\u0003"+
		"*\u0015\u0000\u015d\u015e\u0006\u0014\uffff\uffff\u0000\u015e\u0160\u0001"+
		"\u0000\u0000\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u0160\u0163\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0166\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0164\u0166\u0006\u0014\uffff\uffff\u0000\u0165\u0159"+
		"\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166)\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0003,\u0016\u0000\u0168\u0169\u0005%\u0000"+
		"\u0000\u0169\u016a\u0006\u0015\uffff\uffff\u0000\u016a+\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0003.\u0017\u0000\u016c\u016d\u0006\u0016\uffff\uffff"+
		"\u0000\u016d\u0171\u0001\u0000\u0000\u0000\u016e\u016f\u0005%\u0000\u0000"+
		"\u016f\u0171\u0006\u0016\uffff\uffff\u0000\u0170\u016b\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171-\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0005\b\u0000\u0000\u0173\u017b\u0006\u0017\uffff\uffff\u0000"+
		"\u0174\u0175\u0005\t\u0000\u0000\u0175\u017b\u0006\u0017\uffff\uffff\u0000"+
		"\u0176\u0177\u0005\n\u0000\u0000\u0177\u017b\u0006\u0017\uffff\uffff\u0000"+
		"\u0178\u0179\u0005\u0004\u0000\u0000\u0179\u017b\u0006\u0017\uffff\uffff"+
		"\u0000\u017a\u0172\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000\u0000"+
		"\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017b/\u0001\u0000\u0000\u0000\u017c\u017e\u0005%\u0000\u0000\u017d"+
		"\u017f\u00032\u0019\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0189"+
		"\u0006\u0018\uffff\uffff\u0000\u0181\u0182\u0005\u0015\u0000\u0000\u0182"+
		"\u0184\u0005%\u0000\u0000\u0183\u0185\u00032\u0019\u0000\u0184\u0183\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0006\u0018\uffff\uffff\u0000\u0187\u0181"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a1\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005"+
		"\u0012\u0000\u0000\u018d\u018e\u0005(\u0000\u0000\u018e\u0190\u0005\u0013"+
		"\u0000\u0000\u018f\u018c\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0196\u0006\u0019"+
		"\uffff\uffff\u0000\u0194\u0196\u0006\u0019\uffff\uffff\u0000\u0195\u018f"+
		"\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u01963\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005%\u0000\u0000\u0198\u019a\u0005\u0010"+
		"\u0000\u0000\u0199\u019b\u0003&\u0013\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005\u0011\u0000\u0000\u019d\u019e\u0006\u001a\uffff"+
		"\uffff\u0000\u019e5\u0001\u0000\u0000\u0000\u001e9;IUYagqux\u0081\u009f"+
		"\u00a6\u00b0\u00b9\u00fa\u0147\u0149\u0151\u0157\u0161\u0165\u0170\u017a"+
		"\u017e\u0184\u0189\u0191\u0195\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}