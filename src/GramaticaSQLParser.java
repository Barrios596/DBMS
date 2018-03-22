// Generated from GramaticaSQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CREATE=13, DATABASE=14, DATABASES=15, ALTER=16, 
		RENAME=17, DROP=18, TO=19, SHOW=20, USE=21, CONSTRAINT=22, PRIMARY=23, 
		FOREIGN=24, KEY=25, REFERENCES=26, CHECK=27, INT=28, FLOAT=29, DATE=30, 
		CHAR=31, AND=32, OR=33, NOT=34, TABLE=35, TABLES=36, ADD=37, COLUMN=38, 
		COLUMNS=39, SHOWX=40, FROM=41, INSERT=42, SELECT=43, VALUES=44, INTO=45, 
		UPDATE=46, SET=47, WHERE=48, DELETE=49, ORDER=50, BY=51, ASC=52, DESC=53, 
		NULL=54, APOS=55, DIGIT_four=56, DIGIT_two=57, DIGIT=58, NUMX=59, CHARX=60, 
		IDX=61, WORD=62, COMMENT=63, WS=64;
	public static final int
		RULE_literal = 0, RULE_int_literal = 1, RULE_float_literal = 2, RULE_char_literal = 3, 
		RULE_date_literal = 4, RULE_programa = 5, RULE_database = 6, RULE_createDatabase = 7, 
		RULE_alterDatabase = 8, RULE_dropDatabase = 9, RULE_showDatabase = 10, 
		RULE_useDatabase = 11, RULE_tipo = 12, RULE_createTable = 13, RULE_columna = 14, 
		RULE_constraint = 15, RULE_primaryKey = 16, RULE_foreignKey = 17, RULE_check = 18, 
		RULE_exp = 19, RULE_location = 20, RULE_operacion = 21, RULE_cond = 22, 
		RULE_rel = 23, RULE_notOp = 24, RULE_alterTable = 25, RULE_action = 26, 
		RULE_addColumn = 27, RULE_addConstraint = 28, RULE_dropColumn = 29, RULE_dropConstraint = 30, 
		RULE_dropTable = 31, RULE_showTables = 32, RULE_showColumns = 33, RULE_insertInto = 34, 
		RULE_updateSet = 35, RULE_updateColumas = 36, RULE_cambio = 37, RULE_deleteFrom = 38, 
		RULE_selectFrom = 39, RULE_orden = 40, RULE_colOrder = 41, RULE_cols = 42, 
		RULE_tabs = 43, RULE_rel_op = 44, RULE_cond_op = 45;
	public static final String[] ruleNames = {
		"literal", "int_literal", "float_literal", "char_literal", "date_literal", 
		"programa", "database", "createDatabase", "alterDatabase", "dropDatabase", 
		"showDatabase", "useDatabase", "tipo", "createTable", "columna", "constraint", 
		"primaryKey", "foreignKey", "check", "exp", "location", "operacion", "cond", 
		"rel", "notOp", "alterTable", "action", "addColumn", "addConstraint", 
		"dropColumn", "dropConstraint", "dropTable", "showTables", "showColumns", 
		"insertInto", "updateSet", "updateColumas", "cambio", "deleteFrom", "selectFrom", 
		"orden", "colOrder", "cols", "tabs", "rel_op", "cond_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'-'", "'('", "')'", "','", "'='", "'*'", "'<'", "'>'", "'<='", 
		"'>='", "'<>'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CREATE", "DATABASE", "DATABASES", "ALTER", "RENAME", "DROP", "TO", 
		"SHOW", "USE", "CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", "REFERENCES", 
		"CHECK", "INT", "FLOAT", "DATE", "CHAR", "AND", "OR", "NOT", "TABLE", 
		"TABLES", "ADD", "COLUMN", "COLUMNS", "SHOWX", "FROM", "INSERT", "SELECT", 
		"VALUES", "INTO", "UPDATE", "SET", "WHERE", "DELETE", "ORDER", "BY", "ASC", 
		"DESC", "NULL", "APOS", "DIGIT_four", "DIGIT_two", "DIGIT", "NUMX", "CHARX", 
		"IDX", "WORD", "COMMENT", "WS"
	};
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
	public String getGrammarFileName() { return "GramaticaSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(GramaticaSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				int_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				float_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				char_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				date_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(NULL);
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUMX() { return getToken(GramaticaSQLParser.NUMX, 0); }
		public TerminalNode DIGIT() { return getToken(GramaticaSQLParser.DIGIT, 0); }
		public TerminalNode DIGIT_four() { return getToken(GramaticaSQLParser.DIGIT_four, 0); }
		public TerminalNode DIGIT_two() { return getToken(GramaticaSQLParser.DIGIT_two, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Float_literalContext extends ParserRuleContext {
		public List<TerminalNode> NUMX() { return getTokens(GramaticaSQLParser.NUMX); }
		public TerminalNode NUMX(int i) {
			return getToken(GramaticaSQLParser.NUMX, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GramaticaSQLParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GramaticaSQLParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT_four() { return getTokens(GramaticaSQLParser.DIGIT_four); }
		public TerminalNode DIGIT_four(int i) {
			return getToken(GramaticaSQLParser.DIGIT_four, i);
		}
		public List<TerminalNode> DIGIT_two() { return getTokens(GramaticaSQLParser.DIGIT_two); }
		public TerminalNode DIGIT_two(int i) {
			return getToken(GramaticaSQLParser.DIGIT_two, i);
		}
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitFloat_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(T__0);
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Char_literalContext extends ParserRuleContext {
		public List<TerminalNode> APOS() { return getTokens(GramaticaSQLParser.APOS); }
		public TerminalNode APOS(int i) {
			return getToken(GramaticaSQLParser.APOS, i);
		}
		public TerminalNode CHARX() { return getToken(GramaticaSQLParser.CHARX, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public TerminalNode WORD() { return getToken(GramaticaSQLParser.WORD, 0); }
		public TerminalNode NUMX() { return getToken(GramaticaSQLParser.NUMX, 0); }
		public TerminalNode DIGIT() { return getToken(GramaticaSQLParser.DIGIT, 0); }
		public TerminalNode DIGIT_four() { return getToken(GramaticaSQLParser.DIGIT_four, 0); }
		public TerminalNode DIGIT_two() { return getToken(GramaticaSQLParser.DIGIT_two, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_char_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(APOS);
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX) | (1L << CHARX) | (1L << IDX) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(APOS);
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

	public static class Date_literalContext extends ParserRuleContext {
		public List<TerminalNode> APOS() { return getTokens(GramaticaSQLParser.APOS); }
		public TerminalNode APOS(int i) {
			return getToken(GramaticaSQLParser.APOS, i);
		}
		public TerminalNode DIGIT_four() { return getToken(GramaticaSQLParser.DIGIT_four, 0); }
		public List<TerminalNode> DIGIT_two() { return getTokens(GramaticaSQLParser.DIGIT_two); }
		public TerminalNode DIGIT_two(int i) {
			return getToken(GramaticaSQLParser.DIGIT_two, i);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(APOS);
			setState(110);
			match(DIGIT_four);
			setState(111);
			match(T__1);
			setState(112);
			match(DIGIT_two);
			setState(113);
			match(T__1);
			setState(114);
			match(DIGIT_two);
			setState(115);
			match(APOS);
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

	public static class ProgramaContext extends ParserRuleContext {
		public List<DatabaseContext> database() {
			return getRuleContexts(DatabaseContext.class);
		}
		public DatabaseContext database(int i) {
			return getRuleContext(DatabaseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_programa);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << SELECT) | (1L << UPDATE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(118);
					database();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DatabaseContext extends ParserRuleContext {
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public ShowDatabaseContext showDatabase() {
			return getRuleContext(ShowDatabaseContext.class,0);
		}
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public UpdateSetContext updateSet() {
			return getRuleContext(UpdateSetContext.class,0);
		}
		public DeleteFromContext deleteFrom() {
			return getRuleContext(DeleteFromContext.class,0);
		}
		public SelectFromContext selectFrom() {
			return getRuleContext(SelectFromContext.class,0);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(126);
				createDatabase();
				}
				break;
			case 2:
				{
				setState(127);
				alterDatabase();
				}
				break;
			case 3:
				{
				setState(128);
				dropDatabase();
				}
				break;
			case 4:
				{
				setState(129);
				showDatabase();
				}
				break;
			case 5:
				{
				setState(130);
				useDatabase();
				}
				break;
			case 6:
				{
				setState(131);
				createTable();
				}
				break;
			case 7:
				{
				setState(132);
				alterTable();
				}
				break;
			case 8:
				{
				setState(133);
				dropTable();
				}
				break;
			case 9:
				{
				setState(134);
				showTables();
				}
				break;
			case 10:
				{
				setState(135);
				showColumns();
				}
				break;
			case 11:
				{
				setState(136);
				insertInto();
				}
				break;
			case 12:
				{
				setState(137);
				updateSet();
				}
				break;
			case 13:
				{
				setState(138);
				deleteFrom();
				}
				break;
			case 14:
				{
				setState(139);
				selectFrom();
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

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CREATE);
			setState(143);
			match(DATABASE);
			setState(144);
			match(IDX);
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

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ALTER);
			setState(147);
			match(DATABASE);
			setState(148);
			match(IDX);
			setState(149);
			match(RENAME);
			setState(150);
			match(TO);
			setState(151);
			match(IDX);
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

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(DROP);
			setState(154);
			match(DATABASE);
			setState(155);
			match(IDX);
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

	public static class ShowDatabaseContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(GramaticaSQLParser.DATABASES, 0); }
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_showDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(SHOW);
			setState(158);
			match(DATABASES);
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

	public static class UseDatabaseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(GramaticaSQLParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(USE);
			setState(161);
			match(DATABASE);
			setState(162);
			match(IDX);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaSQLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GramaticaSQLParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(GramaticaSQLParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaSQLParser.CHAR, 0); }
		public List<TerminalNode> NUMX() { return getTokens(GramaticaSQLParser.NUMX); }
		public TerminalNode NUMX(int i) {
			return getToken(GramaticaSQLParser.NUMX, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GramaticaSQLParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GramaticaSQLParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT_four() { return getTokens(GramaticaSQLParser.DIGIT_four); }
		public TerminalNode DIGIT_four(int i) {
			return getToken(GramaticaSQLParser.DIGIT_four, i);
		}
		public List<TerminalNode> DIGIT_two() { return getTokens(GramaticaSQLParser.DIGIT_two); }
		public TerminalNode DIGIT_two(int i) {
			return getToken(GramaticaSQLParser.DIGIT_two, i);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(CHAR);
				setState(168);
				match(T__2);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) {
					{
					{
					setState(169);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__3);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(GramaticaSQLParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(GramaticaSQLParser.CONSTRAINT, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CREATE);
			setState(179);
			match(TABLE);
			setState(180);
			match(IDX);
			setState(181);
			match(T__2);
			setState(182);
			columna();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(T__4);
					setState(184);
					columna();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(190);
				match(T__4);
				setState(191);
				match(CONSTRAINT);
				setState(192);
				constraint();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__3);
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

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDX);
			setState(201);
			tipo();
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

	public static class ConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ForeignKeyContext foreignKey() {
			return getRuleContext(ForeignKeyContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constraint);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				foreignKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				check();
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TerminalNode PRIMARY() { return getToken(GramaticaSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDX);
			setState(209);
			match(PRIMARY);
			setState(210);
			match(KEY);
			setState(211);
			match(T__2);
			setState(212);
			match(IDX);
			setState(213);
			match(T__3);
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

	public static class ForeignKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TerminalNode FOREIGN() { return getToken(GramaticaSQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(GramaticaSQLParser.REFERENCES, 0); }
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_foreignKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDX);
			setState(216);
			match(FOREIGN);
			setState(217);
			match(KEY);
			setState(218);
			match(T__2);
			setState(219);
			match(IDX);
			setState(220);
			match(T__3);
			setState(221);
			match(REFERENCES);
			setState(222);
			match(IDX);
			setState(223);
			match(T__2);
			setState(224);
			match(IDX);
			setState(225);
			match(T__3);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public TerminalNode CHECK() { return getToken(GramaticaSQLParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDX);
			setState(228);
			match(CHECK);
			{
			setState(229);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotOpContext notOp() {
			return getRuleContext(NotOpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(231);
				cond();
				}
				break;
			case 2:
				{
				setState(232);
				notOp();
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

	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDX);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(236);
				match(T__0);
				setState(237);
				match(IDX);
				}
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

	public static class OperacionContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operacion);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDX:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				location();
				}
				break;
			case NULL:
			case APOS:
			case DIGIT_four:
			case DIGIT_two:
			case DIGIT:
			case NUMX:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				literal();
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

	public static class CondContext extends ParserRuleContext {
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public List<NotOpContext> notOp() {
			return getRuleContexts(NotOpContext.class);
		}
		public NotOpContext notOp(int i) {
			return getRuleContext(NotOpContext.class,i);
		}
		public List<Cond_opContext> cond_op() {
			return getRuleContexts(Cond_opContext.class);
		}
		public Cond_opContext cond_op(int i) {
			return getRuleContext(Cond_opContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case APOS:
			case DIGIT_four:
			case DIGIT_two:
			case DIGIT:
			case NUMX:
			case IDX:
				{
				setState(244);
				rel();
				}
				break;
			case T__2:
			case NOT:
				{
				setState(245);
				notOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(248);
				cond_op();
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
				case APOS:
				case DIGIT_four:
				case DIGIT_two:
				case DIGIT:
				case NUMX:
				case IDX:
					{
					setState(249);
					rel();
					}
					break;
				case T__2:
				case NOT:
					{
					setState(250);
					notOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(257);
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

	public static class RelContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258);
			operacion();
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(259);
				rel_op();
				setState(260);
				operacion();
				}
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

	public static class NotOpContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GramaticaSQLParser.NOT, 0); }
		public NotOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitNotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOpContext notOp() throws RecognitionException {
		NotOpContext _localctx = new NotOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_notOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(264);
				match(NOT);
				}
			}

			setState(267);
			match(T__2);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(268);
				rel();
				}
				break;
			case 2:
				{
				setState(269);
				cond();
				}
				break;
			}
			setState(272);
			match(T__3);
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alterTable);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ALTER);
				setState(275);
				match(TABLE);
				setState(276);
				match(IDX);
				setState(277);
				match(RENAME);
				setState(278);
				match(TO);
				setState(279);
				match(IDX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ALTER);
				setState(281);
				match(TABLE);
				setState(282);
				match(IDX);
				setState(283);
				action();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(284);
					match(T__4);
					setState(285);
					action();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ActionContext extends ParserRuleContext {
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public DropConstraintContext dropConstraint() {
			return getRuleContext(DropConstraintContext.class,0);
		}
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_action);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				addColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				addConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				dropConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				dropColumn();
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

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(GramaticaSQLParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(GramaticaSQLParser.CONSTRAINT, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_addColumn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ADD);
			setState(300);
			match(COLUMN);
			setState(301);
			columna();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(302);
				match(CONSTRAINT);
				setState(303);
				constraint();
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(304);
						match(T__4);
						setState(305);
						match(CONSTRAINT);
						setState(306);
						constraint();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
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

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ADD);
			setState(315);
			match(CONSTRAINT);
			setState(316);
			constraint();
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

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dropColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(DROP);
			setState(319);
			match(COLUMN);
			setState(320);
			match(IDX);
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

	public static class DropConstraintContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public DropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintContext dropConstraint() throws RecognitionException {
		DropConstraintContext _localctx = new DropConstraintContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DROP);
			setState(323);
			match(CONSTRAINT);
			setState(324);
			match(IDX);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DROP);
			setState(327);
			match(TABLE);
			setState(328);
			match(IDX);
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

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(GramaticaSQLParser.TABLES, 0); }
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(SHOW);
			setState(331);
			match(TABLES);
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

	public static class ShowColumnsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(GramaticaSQLParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_showColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(SHOW);
			setState(334);
			match(COLUMNS);
			setState(335);
			match(FROM);
			setState(336);
			match(IDX);
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(GramaticaSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(GramaticaSQLParser.INTO, 0); }
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TerminalNode VALUES() { return getToken(GramaticaSQLParser.VALUES, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(INSERT);
			setState(339);
			match(INTO);
			setState(340);
			match(IDX);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(341);
				match(T__2);
				setState(342);
				match(IDX);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(343);
					match(T__4);
					setState(344);
					match(IDX);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(T__3);
				}
			}

			setState(353);
			match(VALUES);
			setState(354);
			match(T__2);
			setState(355);
			literal();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(356);
				match(T__4);
				setState(357);
				literal();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__3);
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

	public static class UpdateSetContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(GramaticaSQLParser.UPDATE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public TerminalNode SET() { return getToken(GramaticaSQLParser.SET, 0); }
		public UpdateColumasContext updateColumas() {
			return getRuleContext(UpdateColumasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUpdateSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSetContext updateSet() throws RecognitionException {
		UpdateSetContext _localctx = new UpdateSetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_updateSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(UPDATE);
			setState(366);
			match(IDX);
			setState(367);
			match(SET);
			setState(368);
			updateColumas();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(369);
				match(WHERE);
				setState(370);
				exp();
				}
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

	public static class UpdateColumasContext extends ParserRuleContext {
		public List<CambioContext> cambio() {
			return getRuleContexts(CambioContext.class);
		}
		public CambioContext cambio(int i) {
			return getRuleContext(CambioContext.class,i);
		}
		public UpdateColumasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateColumas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUpdateColumas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateColumasContext updateColumas() throws RecognitionException {
		UpdateColumasContext _localctx = new UpdateColumasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_updateColumas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			cambio();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(374);
				match(T__4);
				setState(375);
				cambio();
				}
				}
				setState(380);
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

	public static class CambioContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CambioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cambio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCambio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CambioContext cambio() throws RecognitionException {
		CambioContext _localctx = new CambioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cambio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IDX);
			setState(382);
			match(T__5);
			setState(383);
			literal();
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

	public static class DeleteFromContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(GramaticaSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeleteFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDeleteFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFromContext deleteFrom() throws RecognitionException {
		DeleteFromContext _localctx = new DeleteFromContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_deleteFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(DELETE);
			setState(386);
			match(FROM);
			setState(387);
			match(IDX);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(388);
				match(WHERE);
				setState(389);
				exp();
				}
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

	public static class SelectFromContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GramaticaSQLParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OrdenContext orden() {
			return getRuleContext(OrdenContext.class,0);
		}
		public SelectFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectFrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitSelectFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectFromContext selectFrom() throws RecognitionException {
		SelectFromContext _localctx = new SelectFromContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selectFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(SELECT);
			setState(393);
			cols();
			setState(394);
			match(FROM);
			setState(395);
			tabs();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(396);
				match(WHERE);
				setState(397);
				exp();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(400);
				orden();
				}
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

	public static class OrdenContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(GramaticaSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(GramaticaSQLParser.BY, 0); }
		public List<ColOrderContext> colOrder() {
			return getRuleContexts(ColOrderContext.class);
		}
		public ColOrderContext colOrder(int i) {
			return getRuleContext(ColOrderContext.class,i);
		}
		public OrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orden; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitOrden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenContext orden() throws RecognitionException {
		OrdenContext _localctx = new OrdenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_orden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ORDER);
			setState(404);
			match(BY);
			setState(405);
			colOrder();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(406);
				match(T__4);
				setState(407);
				colOrder();
				}
				}
				setState(412);
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

	public static class ColOrderContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ASC() { return getToken(GramaticaSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(GramaticaSQLParser.DESC, 0); }
		public ColOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colOrder; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitColOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColOrderContext colOrder() throws RecognitionException {
		ColOrderContext _localctx = new ColOrderContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_colOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			location();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class ColsContext extends ParserRuleContext {
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cols);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(T__6);
				}
				break;
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				location();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(419);
					match(T__4);
					setState(420);
					location();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TabsContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(GramaticaSQLParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(GramaticaSQLParser.IDX, i);
		}
		public TabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTabs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabsContext tabs() throws RecognitionException {
		TabsContext _localctx = new TabsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IDX);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(429);
				match(T__4);
				setState(430);
				match(IDX);
				}
				}
				setState(435);
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GramaticaSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(GramaticaSQLParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\5\2d\n\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7z\n"+
		"\7\f\7\16\7}\13\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00ad\n\16\f\16\16\16\u00b0\13\16\3\16\5\16\u00b3\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bc\n\17\f\17\16\17\u00bf"+
		"\13\17\3\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00ec\n\25\3\26\3\26\3\26\5\26\u00f1"+
		"\n\26\3\27\3\27\5\27\u00f5\n\27\3\30\3\30\5\30\u00f9\n\30\3\30\3\30\3"+
		"\30\5\30\u00fe\n\30\7\30\u0100\n\30\f\30\16\30\u0103\13\30\3\31\3\31\3"+
		"\31\3\31\5\31\u0109\n\31\3\32\5\32\u010c\n\32\3\32\3\32\3\32\5\32\u0111"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0121\n\33\f\33\16\33\u0124\13\33\5\33\u0126\n\33\3\34\3\34"+
		"\3\34\3\34\5\34\u012c\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0136\n\35\f\35\16\35\u0139\13\35\5\35\u013b\n\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\7$\u015c\n$\f$\16$\u015f\13$\3$\5$\u0162\n$\3$"+
		"\3$\3$\3$\3$\7$\u0169\n$\f$\16$\u016c\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0176"+
		"\n%\3&\3&\3&\7&\u017b\n&\f&\16&\u017e\13&\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\5(\u0189\n(\3)\3)\3)\3)\3)\3)\5)\u0191\n)\3)\5)\u0194\n)\3*\3*\3*"+
		"\3*\3*\7*\u019b\n*\f*\16*\u019e\13*\3+\3+\5+\u01a2\n+\3,\3,\3,\3,\7,\u01a8"+
		"\n,\f,\16,\u01ab\13,\5,\u01ad\n,\3-\3-\3-\7-\u01b2\n-\f-\16-\u01b5\13"+
		"-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\7\3\2:=\3\2:@\3\2\66\67\4\2\b\b\n"+
		"\16\3\2\"#\2\u01c4\2c\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bk\3\2\2\2\no\3\2"+
		"\2\2\f~\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\u0094\3\2\2\2\24"+
		"\u009b\3\2\2\2\26\u009f\3\2\2\2\30\u00a2\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4"+
		"\3\2\2\2\36\u00ca\3\2\2\2 \u00d0\3\2\2\2\"\u00d2\3\2\2\2$\u00d9\3\2\2"+
		"\2&\u00e5\3\2\2\2(\u00eb\3\2\2\2*\u00ed\3\2\2\2,\u00f4\3\2\2\2.\u00f8"+
		"\3\2\2\2\60\u0104\3\2\2\2\62\u010b\3\2\2\2\64\u0125\3\2\2\2\66\u012b\3"+
		"\2\2\28\u012d\3\2\2\2:\u013c\3\2\2\2<\u0140\3\2\2\2>\u0144\3\2\2\2@\u0148"+
		"\3\2\2\2B\u014c\3\2\2\2D\u014f\3\2\2\2F\u0154\3\2\2\2H\u016f\3\2\2\2J"+
		"\u0177\3\2\2\2L\u017f\3\2\2\2N\u0183\3\2\2\2P\u018a\3\2\2\2R\u0195\3\2"+
		"\2\2T\u019f\3\2\2\2V\u01ac\3\2\2\2X\u01ae\3\2\2\2Z\u01b6\3\2\2\2\\\u01b8"+
		"\3\2\2\2^d\5\4\3\2_d\5\6\4\2`d\5\b\5\2ad\5\n\6\2bd\78\2\2c^\3\2\2\2c_"+
		"\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\3\3\2\2\2ef\t\2\2\2f\5\3\2\2\2"+
		"gh\t\2\2\2hi\7\3\2\2ij\t\2\2\2j\7\3\2\2\2kl\79\2\2lm\t\3\2\2mn\79\2\2"+
		"n\t\3\2\2\2op\79\2\2pq\7:\2\2qr\7\4\2\2rs\7;\2\2st\7\4\2\2tu\7;\2\2uv"+
		"\79\2\2v\13\3\2\2\2w\177\5\16\b\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~w\3\2\2\2~{\3\2\2\2\177\r\3\2\2"+
		"\2\u0080\u008f\5\20\t\2\u0081\u008f\5\22\n\2\u0082\u008f\5\24\13\2\u0083"+
		"\u008f\5\26\f\2\u0084\u008f\5\30\r\2\u0085\u008f\5\34\17\2\u0086\u008f"+
		"\5\64\33\2\u0087\u008f\5@!\2\u0088\u008f\5B\"\2\u0089\u008f\5D#\2\u008a"+
		"\u008f\5F$\2\u008b\u008f\5H%\2\u008c\u008f\5N(\2\u008d\u008f\5P)\2\u008e"+
		"\u0080\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0083\3\2"+
		"\2\2\u008e\u0084\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0086\3\2\2\2\u008e"+
		"\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2"+
		"\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\17\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7?\2"+
		"\2\u0093\21\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7\20\2\2\u0096\u0097"+
		"\7?\2\2\u0097\u0098\7\23\2\2\u0098\u0099\7\25\2\2\u0099\u009a\7?\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7?\2"+
		"\2\u009e\25\3\2\2\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\7\21\2\2\u00a1\27"+
		"\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\7?\2\2"+
		"\u00a5\31\3\2\2\2\u00a6\u00b3\7\36\2\2\u00a7\u00b3\7\37\2\2\u00a8\u00b3"+
		"\7 \2\2\u00a9\u00aa\7!\2\2\u00aa\u00ae\7\5\2\2\u00ab\u00ad\t\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\6\2\2\u00b2"+
		"\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2"+
		"\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\7%\2\2\u00b6\u00b7"+
		"\7?\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00ba\7\7\2\2"+
		"\u00ba\u00bc\5\36\20\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\7\7\2\2\u00c1\u00c2\7\30\2\2\u00c2\u00c4\5 \21\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9\35\3\2\2"+
		"\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\5\32\16\2\u00cc\37\3\2\2\2\u00cd\u00d1"+
		"\5\"\22\2\u00ce\u00d1\5$\23\2\u00cf\u00d1\5&\24\2\u00d0\u00cd\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7"+
		"?\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\7\5\2\2\u00d6"+
		"\u00d7\7?\2\2\u00d7\u00d8\7\6\2\2\u00d8#\3\2\2\2\u00d9\u00da\7?\2\2\u00da"+
		"\u00db\7\32\2\2\u00db\u00dc\7\33\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\7"+
		"?\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\7\34\2\2\u00e0\u00e1\7?\2\2\u00e1"+
		"\u00e2\7\5\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7\6\2\2\u00e4%\3\2\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\5(\25\2\u00e8\'\3\2\2\2"+
		"\u00e9\u00ec\5.\30\2\u00ea\u00ec\5\62\32\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00f0\7?\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f1"+
		"\7?\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00f5"+
		"\5*\26\2\u00f3\u00f5\5\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"-\3\2\2\2\u00f6\u00f9\5\60\31\2\u00f7\u00f9\5\62\32\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u00fd\5\\/\2\u00fb"+
		"\u00fe\5\60\31\2\u00fc\u00fe\5\62\32\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102/\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0104\u0108\5,\27\2\u0105\u0106\5Z.\2\u0106\u0107\5,\27\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109\61\3\2\2\2\u010a"+
		"\u010c\7$\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0110\7\5\2\2\u010e\u0111\5\60\31\2\u010f\u0111\5.\30\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\6"+
		"\2\2\u0113\63\3\2\2\2\u0114\u0115\7\22\2\2\u0115\u0116\7%\2\2\u0116\u0117"+
		"\7?\2\2\u0117\u0118\7\23\2\2\u0118\u0119\7\25\2\2\u0119\u0126\7?\2\2\u011a"+
		"\u011b\7\22\2\2\u011b\u011c\7%\2\2\u011c\u011d\7?\2\2\u011d\u0122\5\66"+
		"\34\2\u011e\u011f\7\7\2\2\u011f\u0121\5\66\34\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0114\3\2\2\2\u0125\u011a\3\2\2\2\u0126"+
		"\65\3\2\2\2\u0127\u012c\58\35\2\u0128\u012c\5:\36\2\u0129\u012c\5> \2"+
		"\u012a\u012c\5<\37\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012c\67\3\2\2\2\u012d\u012e\7\'\2\2\u012e"+
		"\u012f\7(\2\2\u012f\u013a\5\36\20\2\u0130\u0131\7\30\2\2\u0131\u0137\5"+
		" \21\2\u0132\u0133\7\7\2\2\u0133\u0134\7\30\2\2\u0134\u0136\5 \21\2\u0135"+
		"\u0132\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0130\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b9\3\2\2\2\u013c\u013d\7\'\2\2\u013d\u013e\7\30\2\2"+
		"\u013e\u013f\5 \21\2\u013f;\3\2\2\2\u0140\u0141\7\24\2\2\u0141\u0142\7"+
		"(\2\2\u0142\u0143\7?\2\2\u0143=\3\2\2\2\u0144\u0145\7\24\2\2\u0145\u0146"+
		"\7\30\2\2\u0146\u0147\7?\2\2\u0147?\3\2\2\2\u0148\u0149\7\24\2\2\u0149"+
		"\u014a\7%\2\2\u014a\u014b\7?\2\2\u014bA\3\2\2\2\u014c\u014d\7\26\2\2\u014d"+
		"\u014e\7&\2\2\u014eC\3\2\2\2\u014f\u0150\7\26\2\2\u0150\u0151\7)\2\2\u0151"+
		"\u0152\7+\2\2\u0152\u0153\7?\2\2\u0153E\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7/\2\2\u0156\u0161\7?\2\2\u0157\u0158\7\5\2\2\u0158\u015d\7?\2"+
		"\2\u0159\u015a\7\7\2\2\u015a\u015c\7?\2\2\u015b\u0159\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\7\6\2\2\u0161\u0157\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7.\2\2\u0164\u0165\7\5\2\2\u0165"+
		"\u016a\5\2\2\2\u0166\u0167\7\7\2\2\u0167\u0169\5\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\6\2\2\u016eG\3\2\2\2"+
		"\u016f\u0170\7\60\2\2\u0170\u0171\7?\2\2\u0171\u0172\7\61\2\2\u0172\u0175"+
		"\5J&\2\u0173\u0174\7\62\2\2\u0174\u0176\5(\25\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176I\3\2\2\2\u0177\u017c\5L\'\2\u0178\u0179\7\7\2\2\u0179"+
		"\u017b\5L\'\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017dK\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180"+
		"\7?\2\2\u0180\u0181\7\b\2\2\u0181\u0182\5\2\2\2\u0182M\3\2\2\2\u0183\u0184"+
		"\7\63\2\2\u0184\u0185\7+\2\2\u0185\u0188\7?\2\2\u0186\u0187\7\62\2\2\u0187"+
		"\u0189\5(\25\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189O\3\2\2\2"+
		"\u018a\u018b\7-\2\2\u018b\u018c\5V,\2\u018c\u018d\7+\2\2\u018d\u0190\5"+
		"X-\2\u018e\u018f\7\62\2\2\u018f\u0191\5(\25\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0194\5R*\2\u0193\u0192\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194Q\3\2\2\2\u0195\u0196\7\64\2\2\u0196\u0197"+
		"\7\65\2\2\u0197\u019c\5T+\2\u0198\u0199\7\7\2\2\u0199\u019b\5T+\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019dS\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\5*\26\2\u01a0\u01a2"+
		"\t\4\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2U\3\2\2\2\u01a3"+
		"\u01ad\7\t\2\2\u01a4\u01a9\5*\26\2\u01a5\u01a6\7\7\2\2\u01a6\u01a8\5*"+
		"\26\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01a3\3\2"+
		"\2\2\u01ac\u01a4\3\2\2\2\u01adW\3\2\2\2\u01ae\u01b3\7?\2\2\u01af\u01b0"+
		"\7\7\2\2\u01b0\u01b2\7?\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4Y\3\2\2\2\u01b5\u01b3\3\2\2\2"+
		"\u01b6\u01b7\t\5\2\2\u01b7[\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9]\3\2\2\2"+
		"&c{~\u008e\u00ae\u00b2\u00bd\u00c5\u00d0\u00eb\u00f0\u00f4\u00f8\u00fd"+
		"\u0101\u0108\u010b\u0110\u0122\u0125\u012b\u0137\u013a\u015d\u0161\u016a"+
		"\u0175\u017c\u0188\u0190\u0193\u019c\u01a1\u01a9\u01ac\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}