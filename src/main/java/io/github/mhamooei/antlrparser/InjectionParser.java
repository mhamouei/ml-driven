// Generated from /home/mhit/IdeaProjects/MlSqliTester/src/main/resources/Injection.g4 by ANTLR 4.7.2
package io.github.mhamooei.antlrparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InjectionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43;
	public static final int
		RULE_start = 0, RULE_dQuoteContext = 1, RULE_sQuoteContext = 2, RULE_numericContext = 3, 
		RULE_sqliAttack = 4, RULE_piggyAttack = 5, RULE_unionAttack = 6, RULE_union = 7, 
		RULE_unionPostfix = 8, RULE_cols = 9, RULE_distinct = 10, RULE_all = 11, 
		RULE_t1 = 12, RULE_t2 = 13, RULE_t3 = 14, RULE_t4 = 15, RULE_t5 = 16, 
		RULE_booleanAttack = 17, RULE_andAttack = 18, RULE_orAttack = 19, RULE_booleanFalseExpr = 20, 
		RULE_unaryFalse = 21, RULE_falseAtom = 22, RULE_falseConst = 23, RULE_booleanTrueExpr = 24, 
		RULE_binaryTrue = 25, RULE_unaryTrue = 26, RULE_trueAtom = 27, RULE_trueConst = 28, 
		RULE_wsp = 29, RULE_cmt = 30, RULE_hashtag = 31, RULE_doubleDash = 32, 
		RULE_funcSleep = 33, RULE_sleep = 34, RULE_blank = 35, RULE_inlineCmt = 36, 
		RULE_parOpen = 37, RULE_par = 38, RULE_terOne = 39, RULE_terSQuote = 40, 
		RULE_terDQuote = 41, RULE_terDigitZero = 42, RULE_terDigitOne = 43, RULE_terDigitExcludingZero = 44, 
		RULE_terDigitIncludingZero = 45, RULE_terChar = 46, RULE_opNot = 47, RULE_opBinInvert = 48, 
		RULE_opEqual = 49, RULE_opLt = 50, RULE_opGt = 51, RULE_opLike = 52, RULE_opIs = 53, 
		RULE_opMinus = 54, RULE_opOr = 55, RULE_opAnd = 56, RULE_opSel = 57, RULE_opUni = 58, 
		RULE_opSem = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dQuoteContext", "sQuoteContext", "numericContext", "sqliAttack", 
			"piggyAttack", "unionAttack", "union", "unionPostfix", "cols", "distinct", 
			"all", "t1", "t2", "t3", "t4", "t5", "booleanAttack", "andAttack", "orAttack", 
			"booleanFalseExpr", "unaryFalse", "falseAtom", "falseConst", "booleanTrueExpr", 
			"binaryTrue", "unaryTrue", "trueAtom", "trueConst", "wsp", "cmt", "hashtag", 
			"doubleDash", "funcSleep", "sleep", "blank", "inlineCmt", "parOpen", 
			"par", "terOne", "terSQuote", "terDQuote", "terDigitZero", "terDigitOne", 
			"terDigitExcludingZero", "terDigitIncludingZero", "terChar", "opNot", 
			"opBinInvert", "opEqual", "opLt", "opGt", "opLike", "opIs", "opMinus", 
			"opOr", "opAnd", "opSel", "opUni", "opSem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'distinct'", "'all'", "'/*!'", "'*/'", "'50000'", "'false'", "'true'", 
			"'#'", "'--'", "'sleep'", "' '", "'/**/'", "'('", "')'", "'1'", "'''", 
			"'\"'", "'0'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", 
			"'a'", "'!'", "'not'", "'~'", "'='", "'<'", "'>'", "'like'", "'is'", 
			"'-'", "'or'", "'||'", "'and'", "'&&'", "'select'", "'union'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "Injection.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InjectionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public NumericContextContext numericContext() {
			return getRuleContext(NumericContextContext.class,0);
		}
		public SQuoteContextContext sQuoteContext() {
			return getRuleContext(SQuoteContextContext.class,0);
		}
		public DQuoteContextContext dQuoteContext() {
			return getRuleContext(DQuoteContextContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				numericContext();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				sQuoteContext();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				dQuoteContext();
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

	public static class DQuoteContextContext extends ParserRuleContext {
		public List<TerDQuoteContext> terDQuote() {
			return getRuleContexts(TerDQuoteContext.class);
		}
		public TerDQuoteContext terDQuote(int i) {
			return getRuleContext(TerDQuoteContext.class,i);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public BooleanAttackContext booleanAttack() {
			return getRuleContext(BooleanAttackContext.class,0);
		}
		public OpOrContext opOr() {
			return getRuleContext(OpOrContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public SqliAttackContext sqliAttack() {
			return getRuleContext(SqliAttackContext.class,0);
		}
		public CmtContext cmt() {
			return getRuleContext(CmtContext.class,0);
		}
		public DQuoteContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dQuoteContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterDQuoteContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitDQuoteContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitDQuoteContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DQuoteContextContext dQuoteContext() throws RecognitionException {
		DQuoteContextContext _localctx = new DQuoteContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dQuoteContext);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				terDQuote();
				setState(126);
				wsp();
				setState(127);
				booleanAttack();
				setState(128);
				wsp();
				setState(129);
				opOr();
				setState(130);
				terDQuote();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				terDQuote();
				setState(133);
				par();
				setState(134);
				wsp();
				setState(135);
				booleanAttack();
				setState(136);
				wsp();
				setState(137);
				opOr();
				setState(138);
				parOpen();
				setState(139);
				terDQuote();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				terDQuote();
				setState(142);
				wsp();
				setState(143);
				sqliAttack();
				setState(144);
				cmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				terDQuote();
				setState(147);
				par();
				setState(148);
				wsp();
				setState(149);
				sqliAttack();
				setState(150);
				cmt();
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

	public static class SQuoteContextContext extends ParserRuleContext {
		public List<TerSQuoteContext> terSQuote() {
			return getRuleContexts(TerSQuoteContext.class);
		}
		public TerSQuoteContext terSQuote(int i) {
			return getRuleContext(TerSQuoteContext.class,i);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public BooleanAttackContext booleanAttack() {
			return getRuleContext(BooleanAttackContext.class,0);
		}
		public OpOrContext opOr() {
			return getRuleContext(OpOrContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public SqliAttackContext sqliAttack() {
			return getRuleContext(SqliAttackContext.class,0);
		}
		public CmtContext cmt() {
			return getRuleContext(CmtContext.class,0);
		}
		public SQuoteContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sQuoteContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterSQuoteContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitSQuoteContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitSQuoteContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SQuoteContextContext sQuoteContext() throws RecognitionException {
		SQuoteContextContext _localctx = new SQuoteContextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sQuoteContext);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				terSQuote();
				setState(155);
				wsp();
				setState(156);
				booleanAttack();
				setState(157);
				wsp();
				setState(158);
				opOr();
				setState(159);
				terSQuote();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				terSQuote();
				setState(162);
				par();
				setState(163);
				wsp();
				setState(164);
				booleanAttack();
				setState(165);
				wsp();
				setState(166);
				opOr();
				setState(167);
				parOpen();
				setState(168);
				terSQuote();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				terSQuote();
				setState(171);
				wsp();
				setState(172);
				sqliAttack();
				setState(173);
				cmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				terSQuote();
				setState(176);
				par();
				setState(177);
				wsp();
				setState(178);
				sqliAttack();
				setState(179);
				cmt();
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

	public static class NumericContextContext extends ParserRuleContext {
		public List<TerDigitZeroContext> terDigitZero() {
			return getRuleContexts(TerDigitZeroContext.class);
		}
		public TerDigitZeroContext terDigitZero(int i) {
			return getRuleContext(TerDigitZeroContext.class,i);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public BooleanAttackContext booleanAttack() {
			return getRuleContext(BooleanAttackContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public OpOrContext opOr() {
			return getRuleContext(OpOrContext.class,0);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public SqliAttackContext sqliAttack() {
			return getRuleContext(SqliAttackContext.class,0);
		}
		public CmtContext cmt() {
			return getRuleContext(CmtContext.class,0);
		}
		public NumericContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterNumericContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitNumericContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitNumericContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContextContext numericContext() throws RecognitionException {
		NumericContextContext _localctx = new NumericContextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericContext);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				terDigitZero();
				setState(184);
				wsp();
				setState(185);
				booleanAttack();
				setState(186);
				wsp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				terDigitZero();
				setState(189);
				par();
				setState(190);
				wsp();
				setState(191);
				booleanAttack();
				setState(192);
				wsp();
				setState(193);
				opOr();
				setState(194);
				parOpen();
				setState(195);
				terDigitZero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				terDigitZero();
				setState(198);
				wsp();
				setState(199);
				sqliAttack();
				setState(200);
				cmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				terDigitZero();
				setState(203);
				par();
				setState(204);
				wsp();
				setState(205);
				sqliAttack();
				setState(206);
				cmt();
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

	public static class SqliAttackContext extends ParserRuleContext {
		public UnionAttackContext unionAttack() {
			return getRuleContext(UnionAttackContext.class,0);
		}
		public PiggyAttackContext piggyAttack() {
			return getRuleContext(PiggyAttackContext.class,0);
		}
		public BooleanAttackContext booleanAttack() {
			return getRuleContext(BooleanAttackContext.class,0);
		}
		public SqliAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqliAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterSqliAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitSqliAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitSqliAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqliAttackContext sqliAttack() throws RecognitionException {
		SqliAttackContext _localctx = new SqliAttackContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqliAttack);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				unionAttack();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				piggyAttack();
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				booleanAttack();
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

	public static class PiggyAttackContext extends ParserRuleContext {
		public OpSemContext opSem() {
			return getRuleContext(OpSemContext.class,0);
		}
		public OpSelContext opSel() {
			return getRuleContext(OpSelContext.class,0);
		}
		public WspContext wsp() {
			return getRuleContext(WspContext.class,0);
		}
		public FuncSleepContext funcSleep() {
			return getRuleContext(FuncSleepContext.class,0);
		}
		public PiggyAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piggyAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterPiggyAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitPiggyAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitPiggyAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiggyAttackContext piggyAttack() throws RecognitionException {
		PiggyAttackContext _localctx = new PiggyAttackContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_piggyAttack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			opSem();
			setState(216);
			opSel();
			setState(217);
			wsp();
			setState(218);
			funcSleep();
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

	public static class UnionAttackContext extends ParserRuleContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public OpSelContext opSel() {
			return getRuleContext(OpSelContext.class,0);
		}
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public UnionPostfixContext unionPostfix() {
			return getRuleContext(UnionPostfixContext.class,0);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public UnionAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterUnionAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitUnionAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitUnionAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionAttackContext unionAttack() throws RecognitionException {
		UnionAttackContext _localctx = new UnionAttackContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unionAttack);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				union();
				setState(221);
				wsp();
				setState(222);
				opSel();
				setState(223);
				wsp();
				setState(224);
				cols();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				union();
				setState(227);
				wsp();
				setState(228);
				unionPostfix();
				setState(229);
				opSel();
				setState(230);
				wsp();
				setState(231);
				cols();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				union();
				setState(234);
				wsp();
				setState(235);
				parOpen();
				setState(236);
				opSel();
				setState(237);
				wsp();
				setState(238);
				cols();
				setState(239);
				par();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				union();
				setState(242);
				wsp();
				setState(243);
				unionPostfix();
				setState(244);
				parOpen();
				setState(245);
				opSel();
				setState(246);
				wsp();
				setState(247);
				cols();
				setState(248);
				par();
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

	public static class UnionContext extends ParserRuleContext {
		public OpUniContext opUni() {
			return getRuleContext(OpUniContext.class,0);
		}
		public T1Context t1() {
			return getRuleContext(T1Context.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public T3Context t3() {
			return getRuleContext(T3Context.class,0);
		}
		public T4Context t4() {
			return getRuleContext(T4Context.class,0);
		}
		public T5Context t5() {
			return getRuleContext(T5Context.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_union);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				opUni();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				t1();
				setState(254);
				opUni();
				setState(255);
				t2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				t3();
				setState(258);
				t4();
				setState(259);
				opUni();
				setState(260);
				t5();
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

	public static class UnionPostfixContext extends ParserRuleContext {
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public WspContext wsp() {
			return getRuleContext(WspContext.class,0);
		}
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public UnionPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterUnionPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitUnionPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitUnionPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionPostfixContext unionPostfix() throws RecognitionException {
		UnionPostfixContext _localctx = new UnionPostfixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unionPostfix);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				all();
				setState(265);
				wsp();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				distinct();
				setState(268);
				wsp();
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

	public static class ColsContext extends ParserRuleContext {
		public TerDigitZeroContext terDigitZero() {
			return getRuleContext(TerDigitZeroContext.class,0);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitCols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			terDigitZero();
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

	public static class DistinctContext extends ParserRuleContext {
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__0);
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

	public static class AllContext extends ParserRuleContext {
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__1);
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

	public static class T1Context extends ParserRuleContext {
		public T1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitT1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T1Context t1() throws RecognitionException {
		T1Context _localctx = new T1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_t1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__2);
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

	public static class T2Context extends ParserRuleContext {
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitT2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_t2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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

	public static class T3Context extends ParserRuleContext {
		public T3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterT3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitT3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitT3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T3Context t3() throws RecognitionException {
		T3Context _localctx = new T3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_t3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__2);
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

	public static class T4Context extends ParserRuleContext {
		public T4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterT4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitT4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitT4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T4Context t4() throws RecognitionException {
		T4Context _localctx = new T4Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_t4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__4);
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

	public static class T5Context extends ParserRuleContext {
		public T5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterT5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitT5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitT5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T5Context t5() throws RecognitionException {
		T5Context _localctx = new T5Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_t5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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

	public static class BooleanAttackContext extends ParserRuleContext {
		public OrAttackContext orAttack() {
			return getRuleContext(OrAttackContext.class,0);
		}
		public AndAttackContext andAttack() {
			return getRuleContext(AndAttackContext.class,0);
		}
		public BooleanAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterBooleanAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitBooleanAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitBooleanAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAttackContext booleanAttack() throws RecognitionException {
		BooleanAttackContext _localctx = new BooleanAttackContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanAttack);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				orAttack();
				}
				break;
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				andAttack();
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

	public static class AndAttackContext extends ParserRuleContext {
		public OpAndContext opAnd() {
			return getRuleContext(OpAndContext.class,0);
		}
		public BooleanFalseExprContext booleanFalseExpr() {
			return getRuleContext(BooleanFalseExprContext.class,0);
		}
		public AndAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterAndAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitAndAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitAndAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndAttackContext andAttack() throws RecognitionException {
		AndAttackContext _localctx = new AndAttackContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andAttack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			opAnd();
			setState(293);
			booleanFalseExpr();
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

	public static class OrAttackContext extends ParserRuleContext {
		public OpOrContext opOr() {
			return getRuleContext(OpOrContext.class,0);
		}
		public BooleanTrueExprContext booleanTrueExpr() {
			return getRuleContext(BooleanTrueExprContext.class,0);
		}
		public OrAttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orAttack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOrAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOrAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOrAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrAttackContext orAttack() throws RecognitionException {
		OrAttackContext _localctx = new OrAttackContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orAttack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			opOr();
			setState(296);
			booleanTrueExpr();
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

	public static class BooleanFalseExprContext extends ParserRuleContext {
		public UnaryFalseContext unaryFalse() {
			return getRuleContext(UnaryFalseContext.class,0);
		}
		public BooleanFalseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFalseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterBooleanFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitBooleanFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitBooleanFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFalseExprContext booleanFalseExpr() throws RecognitionException {
		BooleanFalseExprContext _localctx = new BooleanFalseExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanFalseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			unaryFalse();
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

	public static class UnaryFalseContext extends ParserRuleContext {
		public FalseAtomContext falseAtom() {
			return getRuleContext(FalseAtomContext.class,0);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public OpNotContext opNot() {
			return getRuleContext(OpNotContext.class,0);
		}
		public TrueAtomContext trueAtom() {
			return getRuleContext(TrueAtomContext.class,0);
		}
		public OpBinInvertContext opBinInvert() {
			return getRuleContext(OpBinInvertContext.class,0);
		}
		public UnaryFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterUnaryFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitUnaryFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitUnaryFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryFalseContext unaryFalse() throws RecognitionException {
		UnaryFalseContext _localctx = new UnaryFalseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryFalse);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				falseAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				wsp();
				setState(302);
				opNot();
				setState(303);
				wsp();
				setState(304);
				trueAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				wsp();
				setState(307);
				opNot();
				setState(308);
				opBinInvert();
				setState(309);
				falseAtom();
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

	public static class FalseAtomContext extends ParserRuleContext {
		public WspContext wsp() {
			return getRuleContext(WspContext.class,0);
		}
		public FalseConstContext falseConst() {
			return getRuleContext(FalseConstContext.class,0);
		}
		public TerDigitZeroContext terDigitZero() {
			return getRuleContext(TerDigitZeroContext.class,0);
		}
		public List<TerSQuoteContext> terSQuote() {
			return getRuleContexts(TerSQuoteContext.class);
		}
		public TerSQuoteContext terSQuote(int i) {
			return getRuleContext(TerSQuoteContext.class,i);
		}
		public FalseAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseAtomContext falseAtom() throws RecognitionException {
		FalseAtomContext _localctx = new FalseAtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_falseAtom);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				wsp();
				setState(314);
				falseConst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				wsp();
				setState(317);
				terDigitZero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				terSQuote();
				setState(320);
				terSQuote();
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

	public static class FalseConstContext extends ParserRuleContext {
		public FalseConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterFalseConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitFalseConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitFalseConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseConstContext falseConst() throws RecognitionException {
		FalseConstContext _localctx = new FalseConstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_falseConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__5);
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

	public static class BooleanTrueExprContext extends ParserRuleContext {
		public UnaryTrueContext unaryTrue() {
			return getRuleContext(UnaryTrueContext.class,0);
		}
		public BinaryTrueContext binaryTrue() {
			return getRuleContext(BinaryTrueContext.class,0);
		}
		public BooleanTrueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTrueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterBooleanTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitBooleanTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitBooleanTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTrueExprContext booleanTrueExpr() throws RecognitionException {
		BooleanTrueExprContext _localctx = new BooleanTrueExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanTrueExpr);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				unaryTrue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				binaryTrue();
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

	public static class BinaryTrueContext extends ParserRuleContext {
		public List<UnaryTrueContext> unaryTrue() {
			return getRuleContexts(UnaryTrueContext.class);
		}
		public UnaryTrueContext unaryTrue(int i) {
			return getRuleContext(UnaryTrueContext.class,i);
		}
		public OpEqualContext opEqual() {
			return getRuleContext(OpEqualContext.class,0);
		}
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public List<UnaryFalseContext> unaryFalse() {
			return getRuleContexts(UnaryFalseContext.class);
		}
		public UnaryFalseContext unaryFalse(int i) {
			return getRuleContext(UnaryFalseContext.class,i);
		}
		public List<TerSQuoteContext> terSQuote() {
			return getRuleContexts(TerSQuoteContext.class);
		}
		public TerSQuoteContext terSQuote(int i) {
			return getRuleContext(TerSQuoteContext.class,i);
		}
		public List<TerCharContext> terChar() {
			return getRuleContexts(TerCharContext.class);
		}
		public TerCharContext terChar(int i) {
			return getRuleContext(TerCharContext.class,i);
		}
		public List<TerDQuoteContext> terDQuote() {
			return getRuleContexts(TerDQuoteContext.class);
		}
		public TerDQuoteContext terDQuote(int i) {
			return getRuleContext(TerDQuoteContext.class,i);
		}
		public OpLtContext opLt() {
			return getRuleContext(OpLtContext.class,0);
		}
		public OpGtContext opGt() {
			return getRuleContext(OpGtContext.class,0);
		}
		public List<TrueAtomContext> trueAtom() {
			return getRuleContexts(TrueAtomContext.class);
		}
		public TrueAtomContext trueAtom(int i) {
			return getRuleContext(TrueAtomContext.class,i);
		}
		public OpLikeContext opLike() {
			return getRuleContext(OpLikeContext.class,0);
		}
		public OpIsContext opIs() {
			return getRuleContext(OpIsContext.class,0);
		}
		public TrueConstContext trueConst() {
			return getRuleContext(TrueConstContext.class,0);
		}
		public FalseConstContext falseConst() {
			return getRuleContext(FalseConstContext.class,0);
		}
		public OpMinusContext opMinus() {
			return getRuleContext(OpMinusContext.class,0);
		}
		public BinaryTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterBinaryTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitBinaryTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitBinaryTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTrueContext binaryTrue() throws RecognitionException {
		BinaryTrueContext _localctx = new BinaryTrueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_binaryTrue);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				unaryTrue();
				setState(331);
				opEqual();
				setState(332);
				wsp();
				setState(333);
				parOpen();
				setState(334);
				unaryTrue();
				setState(335);
				par();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				unaryFalse();
				setState(338);
				opEqual();
				setState(339);
				wsp();
				setState(340);
				parOpen();
				setState(341);
				unaryFalse();
				setState(342);
				par();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				terSQuote();
				setState(345);
				terChar();
				setState(346);
				terSQuote();
				setState(347);
				opEqual();
				setState(348);
				terSQuote();
				setState(349);
				terChar();
				setState(350);
				terSQuote();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				terDQuote();
				setState(353);
				terChar();
				setState(354);
				terDQuote();
				setState(355);
				opEqual();
				setState(356);
				terDQuote();
				setState(357);
				terChar();
				setState(358);
				terDQuote();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				unaryFalse();
				setState(361);
				opLt();
				setState(362);
				parOpen();
				setState(363);
				unaryTrue();
				setState(364);
				par();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				unaryTrue();
				setState(367);
				opGt();
				setState(368);
				parOpen();
				setState(369);
				unaryFalse();
				setState(370);
				par();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				wsp();
				setState(373);
				trueAtom();
				setState(374);
				wsp();
				setState(375);
				opLike();
				setState(376);
				wsp();
				setState(377);
				trueAtom();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				unaryTrue();
				setState(380);
				wsp();
				setState(381);
				opIs();
				setState(382);
				wsp();
				setState(383);
				trueConst();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(385);
				unaryFalse();
				setState(386);
				wsp();
				setState(387);
				opIs();
				setState(388);
				wsp();
				setState(389);
				falseConst();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				unaryTrue();
				setState(392);
				opMinus();
				setState(393);
				parOpen();
				setState(394);
				unaryFalse();
				setState(395);
				par();
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

	public static class UnaryTrueContext extends ParserRuleContext {
		public List<WspContext> wsp() {
			return getRuleContexts(WspContext.class);
		}
		public WspContext wsp(int i) {
			return getRuleContext(WspContext.class,i);
		}
		public TrueAtomContext trueAtom() {
			return getRuleContext(TrueAtomContext.class,0);
		}
		public OpNotContext opNot() {
			return getRuleContext(OpNotContext.class,0);
		}
		public FalseAtomContext falseAtom() {
			return getRuleContext(FalseAtomContext.class,0);
		}
		public OpBinInvertContext opBinInvert() {
			return getRuleContext(OpBinInvertContext.class,0);
		}
		public UnaryTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterUnaryTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitUnaryTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitUnaryTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryTrueContext unaryTrue() throws RecognitionException {
		UnaryTrueContext _localctx = new UnaryTrueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryTrue);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				wsp();
				setState(400);
				trueAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				wsp();
				setState(403);
				opNot();
				setState(404);
				wsp();
				setState(405);
				falseAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				opBinInvert();
				setState(408);
				wsp();
				setState(409);
				falseAtom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				opBinInvert();
				setState(412);
				wsp();
				setState(413);
				trueAtom();
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

	public static class TrueAtomContext extends ParserRuleContext {
		public TrueConstContext trueConst() {
			return getRuleContext(TrueConstContext.class,0);
		}
		public TerDigitOneContext terDigitOne() {
			return getRuleContext(TerDigitOneContext.class,0);
		}
		public TrueAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueAtomContext trueAtom() throws RecognitionException {
		TrueAtomContext _localctx = new TrueAtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_trueAtom);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				trueConst();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				terDigitOne();
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

	public static class TrueConstContext extends ParserRuleContext {
		public TrueConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTrueConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTrueConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTrueConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueConstContext trueConst() throws RecognitionException {
		TrueConstContext _localctx = new TrueConstContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_trueConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__6);
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

	public static class WspContext extends ParserRuleContext {
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public InlineCmtContext inlineCmt() {
			return getRuleContext(InlineCmtContext.class,0);
		}
		public WspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterWsp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitWsp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitWsp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WspContext wsp() throws RecognitionException {
		WspContext _localctx = new WspContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_wsp);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				blank();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				inlineCmt();
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

	public static class CmtContext extends ParserRuleContext {
		public HashtagContext hashtag() {
			return getRuleContext(HashtagContext.class,0);
		}
		public DoubleDashContext doubleDash() {
			return getRuleContext(DoubleDashContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public CmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterCmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitCmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitCmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmtContext cmt() throws RecognitionException {
		CmtContext _localctx = new CmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmt);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				hashtag();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				doubleDash();
				setState(429);
				blank();
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

	public static class HashtagContext extends ParserRuleContext {
		public HashtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterHashtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitHashtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitHashtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashtagContext hashtag() throws RecognitionException {
		HashtagContext _localctx = new HashtagContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_hashtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__7);
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

	public static class DoubleDashContext extends ParserRuleContext {
		public DoubleDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterDoubleDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitDoubleDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitDoubleDash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleDashContext doubleDash() throws RecognitionException {
		DoubleDashContext _localctx = new DoubleDashContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_doubleDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__8);
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

	public static class FuncSleepContext extends ParserRuleContext {
		public SleepContext sleep() {
			return getRuleContext(SleepContext.class,0);
		}
		public ParOpenContext parOpen() {
			return getRuleContext(ParOpenContext.class,0);
		}
		public TerDigitExcludingZeroContext terDigitExcludingZero() {
			return getRuleContext(TerDigitExcludingZeroContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public FuncSleepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcSleep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterFuncSleep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitFuncSleep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitFuncSleep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncSleepContext funcSleep() throws RecognitionException {
		FuncSleepContext _localctx = new FuncSleepContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcSleep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			sleep();
			setState(438);
			parOpen();
			setState(439);
			terDigitExcludingZero();
			setState(440);
			par();
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

	public static class SleepContext extends ParserRuleContext {
		public SleepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterSleep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitSleep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitSleep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SleepContext sleep() throws RecognitionException {
		SleepContext _localctx = new SleepContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sleep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__9);
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

	public static class BlankContext extends ParserRuleContext {
		public BlankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__10);
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

	public static class InlineCmtContext extends ParserRuleContext {
		public InlineCmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineCmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterInlineCmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitInlineCmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitInlineCmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineCmtContext inlineCmt() throws RecognitionException {
		InlineCmtContext _localctx = new InlineCmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_inlineCmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__11);
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

	public static class ParOpenContext extends ParserRuleContext {
		public ParOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterParOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitParOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitParOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParOpenContext parOpen() throws RecognitionException {
		ParOpenContext _localctx = new ParOpenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__12);
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

	public static class ParContext extends ParserRuleContext {
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__13);
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

	public static class TerOneContext extends ParserRuleContext {
		public TerOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terOne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerOneContext terOne() throws RecognitionException {
		TerOneContext _localctx = new TerOneContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_terOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__14);
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

	public static class TerSQuoteContext extends ParserRuleContext {
		public TerSQuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terSQuote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerSQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerSQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerSQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerSQuoteContext terSQuote() throws RecognitionException {
		TerSQuoteContext _localctx = new TerSQuoteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_terSQuote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__15);
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

	public static class TerDQuoteContext extends ParserRuleContext {
		public TerDQuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terDQuote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerDQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerDQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerDQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerDQuoteContext terDQuote() throws RecognitionException {
		TerDQuoteContext _localctx = new TerDQuoteContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_terDQuote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__16);
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

	public static class TerDigitZeroContext extends ParserRuleContext {
		public TerDigitZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terDigitZero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerDigitZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerDigitZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerDigitZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerDigitZeroContext terDigitZero() throws RecognitionException {
		TerDigitZeroContext _localctx = new TerDigitZeroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_terDigitZero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__17);
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

	public static class TerDigitOneContext extends ParserRuleContext {
		public TerDigitOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terDigitOne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerDigitOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerDigitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerDigitOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerDigitOneContext terDigitOne() throws RecognitionException {
		TerDigitOneContext _localctx = new TerDigitOneContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_terDigitOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__14);
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

	public static class TerDigitExcludingZeroContext extends ParserRuleContext {
		public TerDigitOneContext terDigitOne() {
			return getRuleContext(TerDigitOneContext.class,0);
		}
		public TerDigitExcludingZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terDigitExcludingZero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerDigitExcludingZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerDigitExcludingZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerDigitExcludingZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerDigitExcludingZeroContext terDigitExcludingZero() throws RecognitionException {
		TerDigitExcludingZeroContext _localctx = new TerDigitExcludingZeroContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_terDigitExcludingZero);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				terDigitOne();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 8);
				{
				setState(469);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(470);
				match(T__25);
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

	public static class TerDigitIncludingZeroContext extends ParserRuleContext {
		public TerDigitZeroContext terDigitZero() {
			return getRuleContext(TerDigitZeroContext.class,0);
		}
		public TerDigitExcludingZeroContext terDigitExcludingZero() {
			return getRuleContext(TerDigitExcludingZeroContext.class,0);
		}
		public TerDigitIncludingZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terDigitIncludingZero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerDigitIncludingZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerDigitIncludingZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerDigitIncludingZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerDigitIncludingZeroContext terDigitIncludingZero() throws RecognitionException {
		TerDigitIncludingZeroContext _localctx = new TerDigitIncludingZeroContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_terDigitIncludingZero);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				terDigitZero();
				}
				break;
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				terDigitExcludingZero();
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

	public static class TerCharContext extends ParserRuleContext {
		public TerCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterTerChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitTerChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitTerChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerCharContext terChar() throws RecognitionException {
		TerCharContext _localctx = new TerCharContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_terChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__26);
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

	public static class OpNotContext extends ParserRuleContext {
		public OpNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpNotContext opNot() throws RecognitionException {
		OpNotContext _localctx = new OpNotContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	public static class OpBinInvertContext extends ParserRuleContext {
		public OpBinInvertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinInvert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpBinInvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpBinInvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpBinInvert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpBinInvertContext opBinInvert() throws RecognitionException {
		OpBinInvertContext _localctx = new OpBinInvertContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_opBinInvert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__29);
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

	public static class OpEqualContext extends ParserRuleContext {
		public OpEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpEqualContext opEqual() throws RecognitionException {
		OpEqualContext _localctx = new OpEqualContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_opEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__30);
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

	public static class OpLtContext extends ParserRuleContext {
		public OpLtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpLtContext opLt() throws RecognitionException {
		OpLtContext _localctx = new OpLtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_opLt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__31);
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

	public static class OpGtContext extends ParserRuleContext {
		public OpGtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opGt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpGtContext opGt() throws RecognitionException {
		OpGtContext _localctx = new OpGtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_opGt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__32);
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

	public static class OpLikeContext extends ParserRuleContext {
		public OpLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpLikeContext opLike() throws RecognitionException {
		OpLikeContext _localctx = new OpLikeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_opLike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__33);
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

	public static class OpIsContext extends ParserRuleContext {
		public OpIsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opIs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpIs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpIsContext opIs() throws RecognitionException {
		OpIsContext _localctx = new OpIsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_opIs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__34);
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

	public static class OpMinusContext extends ParserRuleContext {
		public OpMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMinusContext opMinus() throws RecognitionException {
		OpMinusContext _localctx = new OpMinusContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_opMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__35);
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

	public static class OpOrContext extends ParserRuleContext {
		public OpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpOrContext opOr() throws RecognitionException {
		OpOrContext _localctx = new OpOrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_opOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
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

	public static class OpAndContext extends ParserRuleContext {
		public OpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAndContext opAnd() throws RecognitionException {
		OpAndContext _localctx = new OpAndContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_opAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
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

	public static class OpSelContext extends ParserRuleContext {
		public OpSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpSel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSelContext opSel() throws RecognitionException {
		OpSelContext _localctx = new OpSelContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_opSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__40);
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

	public static class OpUniContext extends ParserRuleContext {
		public OpUniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpUni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpUni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpUniContext opUni() throws RecognitionException {
		OpUniContext _localctx = new OpUniContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_opUni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__41);
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

	public static class OpSemContext extends ParserRuleContext {
		public OpSemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).enterOpSem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InjectionListener ) ((InjectionListener)listener).exitOpSem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InjectionVisitor ) return ((InjectionVisitor<? extends T>)visitor).visitOpSem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSemContext opSem() throws RecognitionException {
		OpSemContext _localctx = new OpSemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_opSem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__42);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u01fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\5\2~\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u009b"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b8\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00d3\n\5\3\6\3\6\3\6\5\6\u00d8\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fd\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0109\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0111\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u0125\n\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u013a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0145\n\30\3\31\3\31\3\32\3\32\5\32\u014b\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0190\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01a2\n\34\3\35\3\35\5\35\u01a6\n\35\3\36\3\36\3\37\3\37\5\37\u01ac\n"+
		"\37\3 \3 \3 \3 \5 \u01b2\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u01da\n.\3/\3/\5/\u01de\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\5\3\2\36\37\3\2\'(\3\2)"+
		"*\2\u01f0\2}\3\2\2\2\4\u009a\3\2\2\2\6\u00b7\3\2\2\2\b\u00d2\3\2\2\2\n"+
		"\u00d7\3\2\2\2\f\u00d9\3\2\2\2\16\u00fc\3\2\2\2\20\u0108\3\2\2\2\22\u0110"+
		"\3\2\2\2\24\u0112\3\2\2\2\26\u0114\3\2\2\2\30\u0116\3\2\2\2\32\u0118\3"+
		"\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2\2\2 \u011e\3\2\2\2\"\u0120\3\2\2"+
		"\2$\u0124\3\2\2\2&\u0126\3\2\2\2(\u0129\3\2\2\2*\u012c\3\2\2\2,\u0139"+
		"\3\2\2\2.\u0144\3\2\2\2\60\u0146\3\2\2\2\62\u014a\3\2\2\2\64\u018f\3\2"+
		"\2\2\66\u01a1\3\2\2\28\u01a5\3\2\2\2:\u01a7\3\2\2\2<\u01ab\3\2\2\2>\u01b1"+
		"\3\2\2\2@\u01b3\3\2\2\2B\u01b5\3\2\2\2D\u01b7\3\2\2\2F\u01bc\3\2\2\2H"+
		"\u01be\3\2\2\2J\u01c0\3\2\2\2L\u01c2\3\2\2\2N\u01c4\3\2\2\2P\u01c6\3\2"+
		"\2\2R\u01c8\3\2\2\2T\u01ca\3\2\2\2V\u01cc\3\2\2\2X\u01ce\3\2\2\2Z\u01d9"+
		"\3\2\2\2\\\u01dd\3\2\2\2^\u01df\3\2\2\2`\u01e1\3\2\2\2b\u01e3\3\2\2\2"+
		"d\u01e5\3\2\2\2f\u01e7\3\2\2\2h\u01e9\3\2\2\2j\u01eb\3\2\2\2l\u01ed\3"+
		"\2\2\2n\u01ef\3\2\2\2p\u01f1\3\2\2\2r\u01f3\3\2\2\2t\u01f5\3\2\2\2v\u01f7"+
		"\3\2\2\2x\u01f9\3\2\2\2z~\5\b\5\2{~\5\6\4\2|~\5\4\3\2}z\3\2\2\2}{\3\2"+
		"\2\2}|\3\2\2\2~\3\3\2\2\2\177\u0080\5T+\2\u0080\u0081\5<\37\2\u0081\u0082"+
		"\5$\23\2\u0082\u0083\5<\37\2\u0083\u0084\5p9\2\u0084\u0085\5T+\2\u0085"+
		"\u009b\3\2\2\2\u0086\u0087\5T+\2\u0087\u0088\5N(\2\u0088\u0089\5<\37\2"+
		"\u0089\u008a\5$\23\2\u008a\u008b\5<\37\2\u008b\u008c\5p9\2\u008c\u008d"+
		"\5L\'\2\u008d\u008e\5T+\2\u008e\u009b\3\2\2\2\u008f\u0090\5T+\2\u0090"+
		"\u0091\5<\37\2\u0091\u0092\5\n\6\2\u0092\u0093\5> \2\u0093\u009b\3\2\2"+
		"\2\u0094\u0095\5T+\2\u0095\u0096\5N(\2\u0096\u0097\5<\37\2\u0097\u0098"+
		"\5\n\6\2\u0098\u0099\5> \2\u0099\u009b\3\2\2\2\u009a\177\3\2\2\2\u009a"+
		"\u0086\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0094\3\2\2\2\u009b\5\3\2\2\2"+
		"\u009c\u009d\5R*\2\u009d\u009e\5<\37\2\u009e\u009f\5$\23\2\u009f\u00a0"+
		"\5<\37\2\u00a0\u00a1\5p9\2\u00a1\u00a2\5R*\2\u00a2\u00b8\3\2\2\2\u00a3"+
		"\u00a4\5R*\2\u00a4\u00a5\5N(\2\u00a5\u00a6\5<\37\2\u00a6\u00a7\5$\23\2"+
		"\u00a7\u00a8\5<\37\2\u00a8\u00a9\5p9\2\u00a9\u00aa\5L\'\2\u00aa\u00ab"+
		"\5R*\2\u00ab\u00b8\3\2\2\2\u00ac\u00ad\5R*\2\u00ad\u00ae\5<\37\2\u00ae"+
		"\u00af\5\n\6\2\u00af\u00b0\5> \2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5R*\2"+
		"\u00b2\u00b3\5N(\2\u00b3\u00b4\5<\37\2\u00b4\u00b5\5\n\6\2\u00b5\u00b6"+
		"\5> \2\u00b6\u00b8\3\2\2\2\u00b7\u009c\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7"+
		"\u00ac\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\7\3\2\2\2\u00b9\u00ba\5V,\2\u00ba"+
		"\u00bb\5<\37\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\5<\37\2\u00bd\u00d3\3\2"+
		"\2\2\u00be\u00bf\5V,\2\u00bf\u00c0\5N(\2\u00c0\u00c1\5<\37\2\u00c1\u00c2"+
		"\5$\23\2\u00c2\u00c3\5<\37\2\u00c3\u00c4\5p9\2\u00c4\u00c5\5L\'\2\u00c5"+
		"\u00c6\5V,\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\5V,\2\u00c8\u00c9\5<\37\2"+
		"\u00c9\u00ca\5\n\6\2\u00ca\u00cb\5> \2\u00cb\u00d3\3\2\2\2\u00cc\u00cd"+
		"\5V,\2\u00cd\u00ce\5N(\2\u00ce\u00cf\5<\37\2\u00cf\u00d0\5\n\6\2\u00d0"+
		"\u00d1\5> \2\u00d1\u00d3\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00be\3\2\2"+
		"\2\u00d2\u00c7\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d3\t\3\2\2\2\u00d4\u00d8"+
		"\5\16\b\2\u00d5\u00d8\5\f\7\2\u00d6\u00d8\5$\23\2\u00d7\u00d4\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\13\3\2\2\2\u00d9\u00da"+
		"\5x=\2\u00da\u00db\5t;\2\u00db\u00dc\5<\37\2\u00dc\u00dd\5D#\2\u00dd\r"+
		"\3\2\2\2\u00de\u00df\5\20\t\2\u00df\u00e0\5<\37\2\u00e0\u00e1\5t;\2\u00e1"+
		"\u00e2\5<\37\2\u00e2\u00e3\5\24\13\2\u00e3\u00fd\3\2\2\2\u00e4\u00e5\5"+
		"\20\t\2\u00e5\u00e6\5<\37\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\5t;\2\u00e8"+
		"\u00e9\5<\37\2\u00e9\u00ea\5\24\13\2\u00ea\u00fd\3\2\2\2\u00eb\u00ec\5"+
		"\20\t\2\u00ec\u00ed\5<\37\2\u00ed\u00ee\5L\'\2\u00ee\u00ef\5t;\2\u00ef"+
		"\u00f0\5<\37\2\u00f0\u00f1\5\24\13\2\u00f1\u00f2\5N(\2\u00f2\u00fd\3\2"+
		"\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\5<\37\2\u00f5\u00f6\5\22\n\2\u00f6"+
		"\u00f7\5L\'\2\u00f7\u00f8\5t;\2\u00f8\u00f9\5<\37\2\u00f9\u00fa\5\24\13"+
		"\2\u00fa\u00fb\5N(\2\u00fb\u00fd\3\2\2\2\u00fc\u00de\3\2\2\2\u00fc\u00e4"+
		"\3\2\2\2\u00fc\u00eb\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fd\17\3\2\2\2\u00fe"+
		"\u0109\5v<\2\u00ff\u0100\5\32\16\2\u0100\u0101\5v<\2\u0101\u0102\5\34"+
		"\17\2\u0102\u0109\3\2\2\2\u0103\u0104\5\36\20\2\u0104\u0105\5 \21\2\u0105"+
		"\u0106\5v<\2\u0106\u0107\5\"\22\2\u0107\u0109\3\2\2\2\u0108\u00fe\3\2"+
		"\2\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2\2\2\u0109\21\3\2\2\2\u010a\u010b"+
		"\5\30\r\2\u010b\u010c\5<\37\2\u010c\u0111\3\2\2\2\u010d\u010e\5\26\f\2"+
		"\u010e\u010f\5<\37\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d"+
		"\3\2\2\2\u0111\23\3\2\2\2\u0112\u0113\5V,\2\u0113\25\3\2\2\2\u0114\u0115"+
		"\7\3\2\2\u0115\27\3\2\2\2\u0116\u0117\7\4\2\2\u0117\31\3\2\2\2\u0118\u0119"+
		"\7\5\2\2\u0119\33\3\2\2\2\u011a\u011b\7\6\2\2\u011b\35\3\2\2\2\u011c\u011d"+
		"\7\5\2\2\u011d\37\3\2\2\2\u011e\u011f\7\7\2\2\u011f!\3\2\2\2\u0120\u0121"+
		"\7\6\2\2\u0121#\3\2\2\2\u0122\u0125\5(\25\2\u0123\u0125\5&\24\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125%\3\2\2\2\u0126\u0127\5r:\2\u0127"+
		"\u0128\5*\26\2\u0128\'\3\2\2\2\u0129\u012a\5p9\2\u012a\u012b\5\62\32\2"+
		"\u012b)\3\2\2\2\u012c\u012d\5,\27\2\u012d+\3\2\2\2\u012e\u013a\5.\30\2"+
		"\u012f\u0130\5<\37\2\u0130\u0131\5`\61\2\u0131\u0132\5<\37\2\u0132\u0133"+
		"\58\35\2\u0133\u013a\3\2\2\2\u0134\u0135\5<\37\2\u0135\u0136\5`\61\2\u0136"+
		"\u0137\5b\62\2\u0137\u0138\5.\30\2\u0138\u013a\3\2\2\2\u0139\u012e\3\2"+
		"\2\2\u0139\u012f\3\2\2\2\u0139\u0134\3\2\2\2\u013a-\3\2\2\2\u013b\u013c"+
		"\5<\37\2\u013c\u013d\5\60\31\2\u013d\u0145\3\2\2\2\u013e\u013f\5<\37\2"+
		"\u013f\u0140\5V,\2\u0140\u0145\3\2\2\2\u0141\u0142\5R*\2\u0142\u0143\5"+
		"R*\2\u0143\u0145\3\2\2\2\u0144\u013b\3\2\2\2\u0144\u013e\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0145/\3\2\2\2\u0146\u0147\7\b\2\2\u0147\61\3\2\2\2\u0148"+
		"\u014b\5\66\34\2\u0149\u014b\5\64\33\2\u014a\u0148\3\2\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\63\3\2\2\2\u014c\u014d\5\66\34\2\u014d\u014e\5d\63\2\u014e"+
		"\u014f\5<\37\2\u014f\u0150\5L\'\2\u0150\u0151\5\66\34\2\u0151\u0152\5"+
		"N(\2\u0152\u0190\3\2\2\2\u0153\u0154\5,\27\2\u0154\u0155\5d\63\2\u0155"+
		"\u0156\5<\37\2\u0156\u0157\5L\'\2\u0157\u0158\5,\27\2\u0158\u0159\5N("+
		"\2\u0159\u0190\3\2\2\2\u015a\u015b\5R*\2\u015b\u015c\5^\60\2\u015c\u015d"+
		"\5R*\2\u015d\u015e\5d\63\2\u015e\u015f\5R*\2\u015f\u0160\5^\60\2\u0160"+
		"\u0161\5R*\2\u0161\u0190\3\2\2\2\u0162\u0163\5T+\2\u0163\u0164\5^\60\2"+
		"\u0164\u0165\5T+\2\u0165\u0166\5d\63\2\u0166\u0167\5T+\2\u0167\u0168\5"+
		"^\60\2\u0168\u0169\5T+\2\u0169\u0190\3\2\2\2\u016a\u016b\5,\27\2\u016b"+
		"\u016c\5f\64\2\u016c\u016d\5L\'\2\u016d\u016e\5\66\34\2\u016e\u016f\5"+
		"N(\2\u016f\u0190\3\2\2\2\u0170\u0171\5\66\34\2\u0171\u0172\5h\65\2\u0172"+
		"\u0173\5L\'\2\u0173\u0174\5,\27\2\u0174\u0175\5N(\2\u0175\u0190\3\2\2"+
		"\2\u0176\u0177\5<\37\2\u0177\u0178\58\35\2\u0178\u0179\5<\37\2\u0179\u017a"+
		"\5j\66\2\u017a\u017b\5<\37\2\u017b\u017c\58\35\2\u017c\u0190\3\2\2\2\u017d"+
		"\u017e\5\66\34\2\u017e\u017f\5<\37\2\u017f\u0180\5l\67\2\u0180\u0181\5"+
		"<\37\2\u0181\u0182\5:\36\2\u0182\u0190\3\2\2\2\u0183\u0184\5,\27\2\u0184"+
		"\u0185\5<\37\2\u0185\u0186\5l\67\2\u0186\u0187\5<\37\2\u0187\u0188\5\60"+
		"\31\2\u0188\u0190\3\2\2\2\u0189\u018a\5\66\34\2\u018a\u018b\5n8\2\u018b"+
		"\u018c\5L\'\2\u018c\u018d\5,\27\2\u018d\u018e\5N(\2\u018e\u0190\3\2\2"+
		"\2\u018f\u014c\3\2\2\2\u018f\u0153\3\2\2\2\u018f\u015a\3\2\2\2\u018f\u0162"+
		"\3\2\2\2\u018f\u016a\3\2\2\2\u018f\u0170\3\2\2\2\u018f\u0176\3\2\2\2\u018f"+
		"\u017d\3\2\2\2\u018f\u0183\3\2\2\2\u018f\u0189\3\2\2\2\u0190\65\3\2\2"+
		"\2\u0191\u0192\5<\37\2\u0192\u0193\58\35\2\u0193\u01a2\3\2\2\2\u0194\u0195"+
		"\5<\37\2\u0195\u0196\5`\61\2\u0196\u0197\5<\37\2\u0197\u0198\5.\30\2\u0198"+
		"\u01a2\3\2\2\2\u0199\u019a\5b\62\2\u019a\u019b\5<\37\2\u019b\u019c\5."+
		"\30\2\u019c\u01a2\3\2\2\2\u019d\u019e\5b\62\2\u019e\u019f\5<\37\2\u019f"+
		"\u01a0\58\35\2\u01a0\u01a2\3\2\2\2\u01a1\u0191\3\2\2\2\u01a1\u0194\3\2"+
		"\2\2\u01a1\u0199\3\2\2\2\u01a1\u019d\3\2\2\2\u01a2\67\3\2\2\2\u01a3\u01a6"+
		"\5:\36\2\u01a4\u01a6\5X-\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"9\3\2\2\2\u01a7\u01a8\7\t\2\2\u01a8;\3\2\2\2\u01a9\u01ac\5H%\2\u01aa\u01ac"+
		"\5J&\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac=\3\2\2\2\u01ad\u01b2"+
		"\5@!\2\u01ae\u01af\5B\"\2\u01af\u01b0\5H%\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2?\3\2\2\2\u01b3\u01b4\7\n\2\2"+
		"\u01b4A\3\2\2\2\u01b5\u01b6\7\13\2\2\u01b6C\3\2\2\2\u01b7\u01b8\5F$\2"+
		"\u01b8\u01b9\5L\'\2\u01b9\u01ba\5Z.\2\u01ba\u01bb\5N(\2\u01bbE\3\2\2\2"+
		"\u01bc\u01bd\7\f\2\2\u01bdG\3\2\2\2\u01be\u01bf\7\r\2\2\u01bfI\3\2\2\2"+
		"\u01c0\u01c1\7\16\2\2\u01c1K\3\2\2\2\u01c2\u01c3\7\17\2\2\u01c3M\3\2\2"+
		"\2\u01c4\u01c5\7\20\2\2\u01c5O\3\2\2\2\u01c6\u01c7\7\21\2\2\u01c7Q\3\2"+
		"\2\2\u01c8\u01c9\7\22\2\2\u01c9S\3\2\2\2\u01ca\u01cb\7\23\2\2\u01cbU\3"+
		"\2\2\2\u01cc\u01cd\7\24\2\2\u01cdW\3\2\2\2\u01ce\u01cf\7\21\2\2\u01cf"+
		"Y\3\2\2\2\u01d0\u01da\5X-\2\u01d1\u01da\7\25\2\2\u01d2\u01da\7\26\2\2"+
		"\u01d3\u01da\7\27\2\2\u01d4\u01da\7\30\2\2\u01d5\u01da\7\31\2\2\u01d6"+
		"\u01da\7\32\2\2\u01d7\u01da\7\33\2\2\u01d8\u01da\7\34\2\2\u01d9\u01d0"+
		"\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9"+
		"\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01d8\3\2\2\2\u01da[\3\2\2\2\u01db\u01de\5V,\2\u01dc\u01de"+
		"\5Z.\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de]\3\2\2\2\u01df\u01e0"+
		"\7\35\2\2\u01e0_\3\2\2\2\u01e1\u01e2\t\2\2\2\u01e2a\3\2\2\2\u01e3\u01e4"+
		"\7 \2\2\u01e4c\3\2\2\2\u01e5\u01e6\7!\2\2\u01e6e\3\2\2\2\u01e7\u01e8\7"+
		"\"\2\2\u01e8g\3\2\2\2\u01e9\u01ea\7#\2\2\u01eai\3\2\2\2\u01eb\u01ec\7"+
		"$\2\2\u01eck\3\2\2\2\u01ed\u01ee\7%\2\2\u01eem\3\2\2\2\u01ef\u01f0\7&"+
		"\2\2\u01f0o\3\2\2\2\u01f1\u01f2\t\3\2\2\u01f2q\3\2\2\2\u01f3\u01f4\t\4"+
		"\2\2\u01f4s\3\2\2\2\u01f5\u01f6\7+\2\2\u01f6u\3\2\2\2\u01f7\u01f8\7,\2"+
		"\2\u01f8w\3\2\2\2\u01f9\u01fa\7-\2\2\u01fay\3\2\2\2\25}\u009a\u00b7\u00d2"+
		"\u00d7\u00fc\u0108\u0110\u0124\u0139\u0144\u014a\u018f\u01a1\u01a5\u01ab"+
		"\u01b1\u01d9\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}