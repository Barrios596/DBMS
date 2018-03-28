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
		RULE_rel = 23, RULE_notOp = 24, RULE_alterTable = 25, RULE_alterModifyTable = 26, 
		RULE_action = 27, RULE_addColumn = 28, RULE_addConstraint = 29, RULE_dropColumn = 30, 
		RULE_dropConstraint = 31, RULE_dropTable = 32, RULE_showTables = 33, RULE_showColumns = 34, 
		RULE_insertInto = 35, RULE_updateSet = 36, RULE_updateColumas = 37, RULE_cambio = 38, 
		RULE_deleteFrom = 39, RULE_selectFrom = 40, RULE_orden = 41, RULE_colOrder = 42, 
		RULE_cols = 43, RULE_tabs = 44, RULE_rel_op = 45, RULE_cond_op = 46;
	public static final String[] ruleNames = {
		"literal", "int_literal", "float_literal", "char_literal", "date_literal", 
		"programa", "database", "createDatabase", "alterDatabase", "dropDatabase", 
		"showDatabase", "useDatabase", "tipo", "createTable", "columna", "constraint", 
		"primaryKey", "foreignKey", "check", "exp", "location", "operacion", "cond", 
		"rel", "notOp", "alterTable", "alterModifyTable", "action", "addColumn", 
		"addConstraint", "dropColumn", "dropConstraint", "dropTable", "showTables", 
		"showColumns", "insertInto", "updateSet", "updateColumas", "cambio", "deleteFrom", 
		"selectFrom", "orden", "colOrder", "cols", "tabs", "rel_op", "cond_op"
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				int_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				float_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				char_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				date_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
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
			setState(104);
			match(T__0);
			setState(105);
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
			setState(107);
			match(APOS);
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX) | (1L << CHARX) | (1L << IDX) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
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
			setState(111);
			match(APOS);
			setState(112);
			match(DIGIT_four);
			setState(113);
			match(T__1);
			setState(114);
			match(DIGIT_two);
			setState(115);
			match(T__1);
			setState(116);
			match(DIGIT_two);
			setState(117);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << SELECT) | (1L << UPDATE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(120);
					database();
					}
					}
					setState(125);
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
		public AlterModifyTableContext alterModifyTable() {
			return getRuleContext(AlterModifyTableContext.class,0);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(128);
				createDatabase();
				}
				break;
			case 2:
				{
				setState(129);
				alterDatabase();
				}
				break;
			case 3:
				{
				setState(130);
				dropDatabase();
				}
				break;
			case 4:
				{
				setState(131);
				showDatabase();
				}
				break;
			case 5:
				{
				setState(132);
				useDatabase();
				}
				break;
			case 6:
				{
				setState(133);
				createTable();
				}
				break;
			case 7:
				{
				setState(134);
				alterTable();
				}
				break;
			case 8:
				{
				setState(135);
				alterModifyTable();
				}
				break;
			case 9:
				{
				setState(136);
				dropTable();
				}
				break;
			case 10:
				{
				setState(137);
				showTables();
				}
				break;
			case 11:
				{
				setState(138);
				showColumns();
				}
				break;
			case 12:
				{
				setState(139);
				insertInto();
				}
				break;
			case 13:
				{
				setState(140);
				updateSet();
				}
				break;
			case 14:
				{
				setState(141);
				deleteFrom();
				}
				break;
			case 15:
				{
				setState(142);
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
			setState(145);
			match(CREATE);
			setState(146);
			match(DATABASE);
			setState(147);
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
			setState(149);
			match(ALTER);
			setState(150);
			match(DATABASE);
			setState(151);
			match(IDX);
			setState(152);
			match(RENAME);
			setState(153);
			match(TO);
			setState(154);
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
			setState(156);
			match(DROP);
			setState(157);
			match(DATABASE);
			setState(158);
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
			setState(160);
			match(SHOW);
			setState(161);
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
			setState(163);
			match(USE);
			setState(164);
			match(DATABASE);
			setState(165);
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(CHAR);
				setState(171);
				match(T__2);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_four) | (1L << DIGIT_two) | (1L << DIGIT) | (1L << NUMX))) != 0)) {
					{
					{
					setState(172);
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
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(CREATE);
			setState(182);
			match(TABLE);
			setState(183);
			match(IDX);
			setState(184);
			match(T__2);
			setState(185);
			columna();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(186);
				match(T__4);
				setState(187);
				columna();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINT) {
				{
				{
				setState(193);
				match(CONSTRAINT);
				setState(194);
				constraint();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
			setState(202);
			match(IDX);
			setState(203);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				foreignKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDX);
			setState(211);
			match(PRIMARY);
			setState(212);
			match(KEY);
			setState(213);
			match(T__2);
			setState(214);
			match(IDX);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(215);
				match(T__4);
				setState(216);
				match(IDX);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			setState(224);
			match(IDX);
			setState(225);
			match(FOREIGN);
			setState(226);
			match(KEY);
			setState(227);
			match(T__2);
			setState(228);
			match(IDX);
			setState(229);
			match(T__3);
			setState(230);
			match(REFERENCES);
			setState(231);
			match(IDX);
			setState(232);
			match(T__2);
			setState(233);
			match(IDX);
			setState(234);
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
			setState(236);
			match(IDX);
			setState(237);
			match(CHECK);
			{
			setState(238);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(240);
				cond();
				}
				break;
			case 2:
				{
				setState(241);
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
			setState(244);
			match(IDX);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(245);
				match(T__0);
				setState(246);
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
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDX:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
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
				setState(250);
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
			setState(255);
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
				setState(253);
				rel();
				}
				break;
			case T__2:
			case NOT:
				{
				setState(254);
				notOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(257);
				cond_op();
				setState(260);
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
					setState(258);
					rel();
					}
					break;
				case T__2:
				case NOT:
					{
					setState(259);
					notOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(266);
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
			setState(267);
			operacion();
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(268);
				rel_op();
				setState(269);
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
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(273);
				match(NOT);
				}
			}

			setState(276);
			match(T__2);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(277);
				rel();
				}
				break;
			case 2:
				{
				setState(278);
				cond();
				}
				break;
			}
			setState(281);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ALTER);
			setState(284);
			match(TABLE);
			setState(285);
			match(IDX);
			setState(286);
			match(RENAME);
			setState(287);
			match(TO);
			setState(288);
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

	public static class AlterModifyTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public TerminalNode IDX() { return getToken(GramaticaSQLParser.IDX, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterModifyTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterModifyTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterModifyTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterModifyTableContext alterModifyTable() throws RecognitionException {
		AlterModifyTableContext _localctx = new AlterModifyTableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alterModifyTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ALTER);
			setState(291);
			match(TABLE);
			setState(292);
			match(IDX);
			setState(293);
			action();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(294);
				match(T__4);
				setState(295);
				action();
				}
				}
				setState(300);
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
		enterRule(_localctx, 54, RULE_action);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				addColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				addConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				dropConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
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
		enterRule(_localctx, 56, RULE_addColumn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ADD);
			setState(308);
			match(COLUMN);
			setState(309);
			columna();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(310);
				match(CONSTRAINT);
				setState(311);
				constraint();
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(T__4);
						setState(313);
						match(CONSTRAINT);
						setState(314);
						constraint();
						}
						} 
					}
					setState(319);
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
		enterRule(_localctx, 58, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ADD);
			setState(323);
			match(CONSTRAINT);
			setState(324);
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
		enterRule(_localctx, 60, RULE_dropColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DROP);
			setState(327);
			match(COLUMN);
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
		enterRule(_localctx, 62, RULE_dropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(DROP);
			setState(331);
			match(CONSTRAINT);
			setState(332);
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
		enterRule(_localctx, 64, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(DROP);
			setState(335);
			match(TABLE);
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
		enterRule(_localctx, 66, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SHOW);
			setState(339);
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
		enterRule(_localctx, 68, RULE_showColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(SHOW);
			setState(342);
			match(COLUMNS);
			setState(343);
			match(FROM);
			setState(344);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 70, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(INSERT);
			setState(347);
			match(INTO);
			setState(348);
			match(IDX);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(349);
				match(T__2);
				setState(350);
				match(IDX);
				setState(351);
				match(T__3);
				}
			}

			setState(354);
			match(VALUES);
			setState(355);
			match(T__2);
			setState(356);
			literal();
			setState(357);
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
		enterRule(_localctx, 72, RULE_updateSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(UPDATE);
			setState(360);
			match(IDX);
			setState(361);
			match(SET);
			setState(362);
			updateColumas();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(363);
				match(WHERE);
				setState(364);
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
		enterRule(_localctx, 74, RULE_updateColumas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			cambio();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(368);
				match(T__4);
				setState(369);
				cambio();
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
		enterRule(_localctx, 76, RULE_cambio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IDX);
			setState(376);
			match(T__5);
			setState(377);
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
		enterRule(_localctx, 78, RULE_deleteFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DELETE);
			setState(380);
			match(FROM);
			setState(381);
			match(IDX);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(382);
				match(WHERE);
				setState(383);
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
		enterRule(_localctx, 80, RULE_selectFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(SELECT);
			setState(387);
			cols();
			setState(388);
			match(FROM);
			setState(389);
			tabs();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(390);
				match(WHERE);
				setState(391);
				exp();
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(394);
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
		enterRule(_localctx, 82, RULE_orden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ORDER);
			setState(398);
			match(BY);
			setState(399);
			colOrder();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(400);
				match(T__4);
				setState(401);
				colOrder();
				}
				}
				setState(406);
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
		enterRule(_localctx, 84, RULE_colOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			location();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(408);
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
		enterRule(_localctx, 86, RULE_cols);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__6);
				}
				break;
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				location();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(413);
					match(T__4);
					setState(414);
					location();
					}
					}
					setState(419);
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
		enterRule(_localctx, 88, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(IDX);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(423);
				match(T__4);
				setState(424);
				match(IDX);
				}
				}
				setState(429);
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
		enterRule(_localctx, 90, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		enterRule(_localctx, 92, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\5\2f\n\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\7\7|\n\7\f\7\16\7\177\13\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16"+
		"\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bf\n"+
		"\17\f\17\16\17\u00c2\13\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00d3\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\5\25\u00f5\n\25\3\26\3\26\3\26\5\26\u00fa"+
		"\n\26\3\27\3\27\5\27\u00fe\n\27\3\30\3\30\5\30\u0102\n\30\3\30\3\30\3"+
		"\30\5\30\u0107\n\30\7\30\u0109\n\30\f\30\16\30\u010c\13\30\3\31\3\31\3"+
		"\31\3\31\5\31\u0112\n\31\3\32\5\32\u0115\n\32\3\32\3\32\3\32\5\32\u011a"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u012b\n\34\f\34\16\34\u012e\13\34\3\35\3\35\3\35\3\35"+
		"\5\35\u0134\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u013e\n"+
		"\36\f\36\16\36\u0141\13\36\5\36\u0143\n\36\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\5%\u0163\n%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0170\n&\3\'\3\'"+
		"\3\'\7\'\u0175\n\'\f\'\16\'\u0178\13\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u0183"+
		"\n)\3*\3*\3*\3*\3*\3*\5*\u018b\n*\3*\5*\u018e\n*\3+\3+\3+\3+\3+\7+\u0195"+
		"\n+\f+\16+\u0198\13+\3,\3,\5,\u019c\n,\3-\3-\3-\3-\7-\u01a2\n-\f-\16-"+
		"\u01a5\13-\5-\u01a7\n-\3.\3.\3.\7.\u01ac\n.\f.\16.\u01af\13.\3/\3/\3\60"+
		"\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^\2\7\3\2:=\3\2:@\3\2\66\67\4\2\b\b\n\16\3\2"+
		"\"#\2\u01bc\2e\3\2\2\2\4g\3\2\2\2\6i\3\2\2\2\bm\3\2\2\2\nq\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u0091\3\2\2\2\20\u0093\3\2\2\2\22\u0097\3\2\2\2\24\u009e\3"+
		"\2\2\2\26\u00a2\3\2\2\2\30\u00a5\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2"+
		"\2\2\36\u00cc\3\2\2\2 \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00e2\3\2\2\2&\u00ee"+
		"\3\2\2\2(\u00f4\3\2\2\2*\u00f6\3\2\2\2,\u00fd\3\2\2\2.\u0101\3\2\2\2\60"+
		"\u010d\3\2\2\2\62\u0114\3\2\2\2\64\u011d\3\2\2\2\66\u0124\3\2\2\28\u0133"+
		"\3\2\2\2:\u0135\3\2\2\2<\u0144\3\2\2\2>\u0148\3\2\2\2@\u014c\3\2\2\2B"+
		"\u0150\3\2\2\2D\u0154\3\2\2\2F\u0157\3\2\2\2H\u015c\3\2\2\2J\u0169\3\2"+
		"\2\2L\u0171\3\2\2\2N\u0179\3\2\2\2P\u017d\3\2\2\2R\u0184\3\2\2\2T\u018f"+
		"\3\2\2\2V\u0199\3\2\2\2X\u01a6\3\2\2\2Z\u01a8\3\2\2\2\\\u01b0\3\2\2\2"+
		"^\u01b2\3\2\2\2`f\5\4\3\2af\5\6\4\2bf\5\b\5\2cf\5\n\6\2df\78\2\2e`\3\2"+
		"\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\3\3\2\2\2gh\t\2\2\2h\5\3"+
		"\2\2\2ij\t\2\2\2jk\7\3\2\2kl\t\2\2\2l\7\3\2\2\2mn\79\2\2no\t\3\2\2op\7"+
		"9\2\2p\t\3\2\2\2qr\79\2\2rs\7:\2\2st\7\4\2\2tu\7;\2\2uv\7\4\2\2vw\7;\2"+
		"\2wx\79\2\2x\13\3\2\2\2y\u0081\5\16\b\2z|\5\16\b\2{z\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080y\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\r\3\2\2\2\u0082\u0092\5\20\t\2\u0083\u0092\5\22\n\2\u0084"+
		"\u0092\5\24\13\2\u0085\u0092\5\26\f\2\u0086\u0092\5\30\r\2\u0087\u0092"+
		"\5\34\17\2\u0088\u0092\5\64\33\2\u0089\u0092\5\66\34\2\u008a\u0092\5B"+
		"\"\2\u008b\u0092\5D#\2\u008c\u0092\5F$\2\u008d\u0092\5H%\2\u008e\u0092"+
		"\5J&\2\u008f\u0092\5P)\2\u0090\u0092\5R*\2\u0091\u0082\3\2\2\2\u0091\u0083"+
		"\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091"+
		"\u0087\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2"+
		"\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\17\3\2\2"+
		"\2\u0093\u0094\7\17\2\2\u0094\u0095\7\20\2\2\u0095\u0096\7?\2\2\u0096"+
		"\21\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\20\2\2\u0099\u009a\7?\2"+
		"\2\u009a\u009b\7\23\2\2\u009b\u009c\7\25\2\2\u009c\u009d\7?\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\7?\2"+
		"\2\u00a1\25\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\7\21\2\2\u00a4\27"+
		"\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\7?\2\2"+
		"\u00a8\31\3\2\2\2\u00a9\u00b6\7\36\2\2\u00aa\u00b6\7\37\2\2\u00ab\u00b6"+
		"\7 \2\2\u00ac\u00ad\7!\2\2\u00ad\u00b1\7\5\2\2\u00ae\u00b0\t\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7\6\2\2\u00b5"+
		"\u00a9\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00c0\5\36\20\2\u00bc\u00bd\7\7\2\2"+
		"\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\30\2\2\u00c4\u00c6\5 \21\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\7?\2\2"+
		"\u00cd\u00ce\5\32\16\2\u00ce\37\3\2\2\2\u00cf\u00d3\5\"\22\2\u00d0\u00d3"+
		"\5$\23\2\u00d1\u00d3\5&\24\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7\31\2\2"+
		"\u00d6\u00d7\7\33\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00dd\7?\2\2\u00d9\u00da"+
		"\7\7\2\2\u00da\u00dc\7?\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7\6\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4"+
		"\7\32\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\7?\2\2"+
		"\u00e7\u00e8\7\6\2\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb"+
		"\7\5\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ed\7\6\2\2\u00ed%\3\2\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1\5(\25\2\u00f1\'\3\2\2\2\u00f2"+
		"\u00f5\5.\30\2\u00f3\u00f5\5\62\32\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5)\3\2\2\2\u00f6\u00f9\7?\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00fa"+
		"\7?\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa+\3\2\2\2\u00fb\u00fe"+
		"\5*\26\2\u00fc\u00fe\5\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"-\3\2\2\2\u00ff\u0102\5\60\31\2\u0100\u0102\5\62\32\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0100\3\2\2\2\u0102\u010a\3\2\2\2\u0103\u0106\5^\60\2\u0104"+
		"\u0107\5\60\31\2\u0105\u0107\5\62\32\2\u0106\u0104\3\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b/\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u0111\5,\27\2\u010e\u010f\5\\/\2\u010f\u0110\5,\27\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112\61\3\2\2\2\u0113"+
		"\u0115\7$\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0119\7\5\2\2\u0117\u011a\5\60\31\2\u0118\u011a\5.\30\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\6"+
		"\2\2\u011c\63\3\2\2\2\u011d\u011e\7\22\2\2\u011e\u011f\7%\2\2\u011f\u0120"+
		"\7?\2\2\u0120\u0121\7\23\2\2\u0121\u0122\7\25\2\2\u0122\u0123\7?\2\2\u0123"+
		"\65\3\2\2\2\u0124\u0125\7\22\2\2\u0125\u0126\7%\2\2\u0126\u0127\7?\2\2"+
		"\u0127\u012c\58\35\2\u0128\u0129\7\7\2\2\u0129\u012b\58\35\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\67\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0134\5:\36\2\u0130\u0134\5<\37"+
		"\2\u0131\u0134\5@!\2\u0132\u0134\5> \2\u0133\u012f\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u01349\3\2\2\2\u0135"+
		"\u0136\7\'\2\2\u0136\u0137\7(\2\2\u0137\u0142\5\36\20\2\u0138\u0139\7"+
		"\30\2\2\u0139\u013f\5 \21\2\u013a\u013b\7\7\2\2\u013b\u013c\7\30\2\2\u013c"+
		"\u013e\5 \21\2\u013d\u013a\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0138\3\2\2\2\u0142\u0143\3\2\2\2\u0143;\3\2\2\2\u0144\u0145\7\'\2\2"+
		"\u0145\u0146\7\30\2\2\u0146\u0147\5 \21\2\u0147=\3\2\2\2\u0148\u0149\7"+
		"\24\2\2\u0149\u014a\7(\2\2\u014a\u014b\7?\2\2\u014b?\3\2\2\2\u014c\u014d"+
		"\7\24\2\2\u014d\u014e\7\30\2\2\u014e\u014f\7?\2\2\u014fA\3\2\2\2\u0150"+
		"\u0151\7\24\2\2\u0151\u0152\7%\2\2\u0152\u0153\7?\2\2\u0153C\3\2\2\2\u0154"+
		"\u0155\7\26\2\2\u0155\u0156\7&\2\2\u0156E\3\2\2\2\u0157\u0158\7\26\2\2"+
		"\u0158\u0159\7)\2\2\u0159\u015a\7+\2\2\u015a\u015b\7?\2\2\u015bG\3\2\2"+
		"\2\u015c\u015d\7,\2\2\u015d\u015e\7/\2\2\u015e\u0162\7?\2\2\u015f\u0160"+
		"\7\5\2\2\u0160\u0161\7?\2\2\u0161\u0163\7\6\2\2\u0162\u015f\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7.\2\2\u0165\u0166\7\5"+
		"\2\2\u0166\u0167\5\2\2\2\u0167\u0168\7\6\2\2\u0168I\3\2\2\2\u0169\u016a"+
		"\7\60\2\2\u016a\u016b\7?\2\2\u016b\u016c\7\61\2\2\u016c\u016f\5L\'\2\u016d"+
		"\u016e\7\62\2\2\u016e\u0170\5(\25\2\u016f\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170K\3\2\2\2\u0171\u0176\5N(\2\u0172\u0173\7\7\2\2\u0173\u0175"+
		"\5N(\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177M\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7?\2\2\u017a"+
		"\u017b\7\b\2\2\u017b\u017c\5\2\2\2\u017cO\3\2\2\2\u017d\u017e\7\63\2\2"+
		"\u017e\u017f\7+\2\2\u017f\u0182\7?\2\2\u0180\u0181\7\62\2\2\u0181\u0183"+
		"\5(\25\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183Q\3\2\2\2\u0184"+
		"\u0185\7-\2\2\u0185\u0186\5X-\2\u0186\u0187\7+\2\2\u0187\u018a\5Z.\2\u0188"+
		"\u0189\7\62\2\2\u0189\u018b\5(\25\2\u018a\u0188\3\2\2\2\u018a\u018b\3"+
		"\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5T+\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018eS\3\2\2\2\u018f\u0190\7\64\2\2\u0190\u0191\7\65\2"+
		"\2\u0191\u0196\5V,\2\u0192\u0193\7\7\2\2\u0193\u0195\5V,\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"U\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\5*\26\2\u019a\u019c\t\4\2\2"+
		"\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019cW\3\2\2\2\u019d\u01a7\7"+
		"\t\2\2\u019e\u01a3\5*\26\2\u019f\u01a0\7\7\2\2\u01a0\u01a2\5*\26\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6"+
		"\u019e\3\2\2\2\u01a7Y\3\2\2\2\u01a8\u01ad\7?\2\2\u01a9\u01aa\7\7\2\2\u01aa"+
		"\u01ac\7?\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae[\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1"+
		"\t\5\2\2\u01b1]\3\2\2\2\u01b2\u01b3\t\6\2\2\u01b3_\3\2\2\2$e}\u0080\u0091"+
		"\u00b1\u00b5\u00c0\u00c7\u00d2\u00dd\u00f4\u00f9\u00fd\u0101\u0106\u010a"+
		"\u0111\u0114\u0119\u012c\u0133\u013f\u0142\u0162\u016f\u0176\u0182\u018a"+
		"\u018d\u0196\u019b\u01a3\u01a6\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}