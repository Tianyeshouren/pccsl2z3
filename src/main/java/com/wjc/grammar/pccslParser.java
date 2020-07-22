// Generated from D:/pCCSL2SMT/src/res\pccsl.g4 by ANTLR 4.8
package com.wjc.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pccslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, END=8, SUB=9, 
		CAU=10, UNI=11, INF=12, PED=13, DEL=14, EXC=15, PRE=16, CON=17, SUP=18, 
		DEFINE=19, PAR=20, CLOCK=21, NUM=22, WS=23;
	public static final int
		RULE_cons = 0, RULE_con = 1, RULE_periodicity = 2, RULE_delayfpr = 3, 
		RULE_subclock = 4, RULE_causality = 5, RULE_union = 6, RULE_infimum = 7, 
		RULE_exclusion = 8, RULE_precedence = 9, RULE_intersection = 10, RULE_supremum = 11, 
		RULE_pedoff = 12, RULE_pedjitter = 13, RULE_peddrify = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"cons", "con", "periodicity", "delayfpr", "subclock", "causality", "union", 
			"infimum", "exclusion", "precedence", "intersection", "supremum", "pedoff", 
			"pedjitter", "peddrify"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'on'", "'['", "']'", "'with'", "'+-'", "'-+'", "';'", 
			"'in'", "'<='", "'+'", "'^'", "'P'", "'$'", "'#'", "'<'", "'*'", "'v'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "END", "SUB", "CAU", 
			"UNI", "INF", "PED", "DEL", "EXC", "PRE", "CON", "SUP", "DEFINE", "PAR", 
			"CLOCK", "NUM", "WS"
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
	public String getGrammarFileName() { return "pccsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pccslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ConsContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitCons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		return cons(0);
	}

	private ConsContext cons(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConsContext _localctx = new ConsContext(_ctx, _parentState);
		ConsContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_cons, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(31);
			con();
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cons);
					setState(33);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(34);
					con();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ConContext extends ParserRuleContext {
		public SubclockContext subclock() {
			return getRuleContext(SubclockContext.class,0);
		}
		public CausalityContext causality() {
			return getRuleContext(CausalityContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public InfimumContext infimum() {
			return getRuleContext(InfimumContext.class,0);
		}
		public ExclusionContext exclusion() {
			return getRuleContext(ExclusionContext.class,0);
		}
		public PrecedenceContext precedence() {
			return getRuleContext(PrecedenceContext.class,0);
		}
		public IntersectionContext intersection() {
			return getRuleContext(IntersectionContext.class,0);
		}
		public SupremumContext supremum() {
			return getRuleContext(SupremumContext.class,0);
		}
		public PeriodicityContext periodicity() {
			return getRuleContext(PeriodicityContext.class,0);
		}
		public DelayfprContext delayfpr() {
			return getRuleContext(DelayfprContext.class,0);
		}
		public PedoffContext pedoff() {
			return getRuleContext(PedoffContext.class,0);
		}
		public PedjitterContext pedjitter() {
			return getRuleContext(PedjitterContext.class,0);
		}
		public PeddrifyContext peddrify() {
			return getRuleContext(PeddrifyContext.class,0);
		}
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitCon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitCon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_con);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				subclock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				causality();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				union();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				infimum();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				exclusion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				precedence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				intersection();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				supremum();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				periodicity();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				delayfpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(50);
				pedoff();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(51);
				pedjitter();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(52);
				peddrify();
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

	public static class PeriodicityContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode PED() { return getToken(pccslParser.PED, 0); }
		public List<TerminalNode> PAR() { return getTokens(pccslParser.PAR); }
		public TerminalNode PAR(int i) {
			return getToken(pccslParser.PAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(pccslParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pccslParser.NUM, i);
		}
		public List<TerminalNode> CAU() { return getTokens(pccslParser.CAU); }
		public TerminalNode CAU(int i) {
			return getToken(pccslParser.CAU, i);
		}
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public PeriodicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterPeriodicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitPeriodicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitPeriodicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodicityContext periodicity() throws RecognitionException {
		PeriodicityContext _localctx = new PeriodicityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_periodicity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CLOCK);
			setState(56);
			match(DEFINE);
			setState(57);
			match(CLOCK);
			setState(58);
			match(PED);
			setState(59);
			match(PAR);
			setState(60);
			match(T__0);
			setState(61);
			match(NUM);
			setState(62);
			match(CAU);
			setState(63);
			match(PAR);
			setState(64);
			match(CAU);
			setState(65);
			match(NUM);
			setState(66);
			match(END);
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

	public static class DelayfprContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode DEL() { return getToken(pccslParser.DEL, 0); }
		public List<TerminalNode> PAR() { return getTokens(pccslParser.PAR); }
		public TerminalNode PAR(int i) {
			return getToken(pccslParser.PAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(pccslParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pccslParser.NUM, i);
		}
		public List<TerminalNode> CAU() { return getTokens(pccslParser.CAU); }
		public TerminalNode CAU(int i) {
			return getToken(pccslParser.CAU, i);
		}
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public DelayfprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayfpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterDelayfpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitDelayfpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitDelayfpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayfprContext delayfpr() throws RecognitionException {
		DelayfprContext _localctx = new DelayfprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delayfpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CLOCK);
			setState(69);
			match(DEFINE);
			setState(70);
			match(CLOCK);
			setState(71);
			match(DEL);
			setState(72);
			match(PAR);
			setState(73);
			match(T__1);
			setState(74);
			match(CLOCK);
			setState(75);
			match(T__0);
			setState(76);
			match(NUM);
			setState(77);
			match(CAU);
			setState(78);
			match(PAR);
			setState(79);
			match(CAU);
			setState(80);
			match(NUM);
			setState(81);
			match(END);
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

	public static class SubclockContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode SUB() { return getToken(pccslParser.SUB, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public SubclockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subclock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterSubclock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitSubclock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitSubclock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubclockContext subclock() throws RecognitionException {
		SubclockContext _localctx = new SubclockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subclock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CLOCK);
			setState(84);
			match(SUB);
			setState(85);
			match(CLOCK);
			setState(86);
			match(END);
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

	public static class CausalityContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode CAU() { return getToken(pccslParser.CAU, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public CausalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_causality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterCausality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitCausality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitCausality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CausalityContext causality() throws RecognitionException {
		CausalityContext _localctx = new CausalityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_causality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CLOCK);
			setState(89);
			match(CAU);
			setState(90);
			match(CLOCK);
			setState(91);
			match(END);
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
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode UNI() { return getToken(pccslParser.UNI, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CLOCK);
			setState(94);
			match(DEFINE);
			setState(95);
			match(CLOCK);
			setState(96);
			match(UNI);
			setState(97);
			match(CLOCK);
			setState(98);
			match(END);
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

	public static class InfimumContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode INF() { return getToken(pccslParser.INF, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public InfimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterInfimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitInfimum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitInfimum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfimumContext infimum() throws RecognitionException {
		InfimumContext _localctx = new InfimumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_infimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CLOCK);
			setState(101);
			match(DEFINE);
			setState(102);
			match(CLOCK);
			setState(103);
			match(INF);
			setState(104);
			match(CLOCK);
			setState(105);
			match(END);
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

	public static class ExclusionContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode EXC() { return getToken(pccslParser.EXC, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public ExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterExclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitExclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitExclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusionContext exclusion() throws RecognitionException {
		ExclusionContext _localctx = new ExclusionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CLOCK);
			setState(108);
			match(EXC);
			setState(109);
			match(CLOCK);
			setState(110);
			match(END);
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

	public static class PrecedenceContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode NUM() { return getToken(pccslParser.NUM, 0); }
		public TerminalNode PRE() { return getToken(pccslParser.PRE, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public PrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecedenceContext precedence() throws RecognitionException {
		PrecedenceContext _localctx = new PrecedenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_precedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CLOCK);
			setState(113);
			match(T__2);
			setState(114);
			match(NUM);
			setState(115);
			match(T__3);
			setState(116);
			match(PRE);
			setState(117);
			match(CLOCK);
			setState(118);
			match(END);
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

	public static class IntersectionContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode CON() { return getToken(pccslParser.CON, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public IntersectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionContext intersection() throws RecognitionException {
		IntersectionContext _localctx = new IntersectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intersection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CLOCK);
			setState(121);
			match(DEFINE);
			setState(122);
			match(CLOCK);
			setState(123);
			match(CON);
			setState(124);
			match(CLOCK);
			setState(125);
			match(END);
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

	public static class SupremumContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode SUP() { return getToken(pccslParser.SUP, 0); }
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public SupremumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supremum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterSupremum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitSupremum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitSupremum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupremumContext supremum() throws RecognitionException {
		SupremumContext _localctx = new SupremumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_supremum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CLOCK);
			setState(128);
			match(DEFINE);
			setState(129);
			match(CLOCK);
			setState(130);
			match(SUP);
			setState(131);
			match(CLOCK);
			setState(132);
			match(END);
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

	public static class PedoffContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode PED() { return getToken(pccslParser.PED, 0); }
		public List<TerminalNode> NUM() { return getTokens(pccslParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pccslParser.NUM, i);
		}
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public PedoffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedoff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterPedoff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitPedoff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitPedoff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedoffContext pedoff() throws RecognitionException {
		PedoffContext _localctx = new PedoffContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pedoff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CLOCK);
			setState(135);
			match(DEFINE);
			setState(136);
			match(CLOCK);
			setState(137);
			match(PED);
			setState(138);
			match(NUM);
			setState(139);
			match(T__4);
			setState(140);
			match(NUM);
			setState(141);
			match(END);
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

	public static class PedjitterContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode PED() { return getToken(pccslParser.PED, 0); }
		public List<TerminalNode> NUM() { return getTokens(pccslParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pccslParser.NUM, i);
		}
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public PedjitterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedjitter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterPedjitter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitPedjitter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitPedjitter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedjitterContext pedjitter() throws RecognitionException {
		PedjitterContext _localctx = new PedjitterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pedjitter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CLOCK);
			setState(144);
			match(DEFINE);
			setState(145);
			match(CLOCK);
			setState(146);
			match(PED);
			setState(147);
			match(NUM);
			setState(148);
			match(T__5);
			setState(149);
			match(NUM);
			setState(150);
			match(END);
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

	public static class PeddrifyContext extends ParserRuleContext {
		public List<TerminalNode> CLOCK() { return getTokens(pccslParser.CLOCK); }
		public TerminalNode CLOCK(int i) {
			return getToken(pccslParser.CLOCK, i);
		}
		public TerminalNode DEFINE() { return getToken(pccslParser.DEFINE, 0); }
		public TerminalNode PED() { return getToken(pccslParser.PED, 0); }
		public List<TerminalNode> NUM() { return getTokens(pccslParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(pccslParser.NUM, i);
		}
		public TerminalNode END() { return getToken(pccslParser.END, 0); }
		public PeddrifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peddrify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).enterPeddrify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pccslListener ) ((pccslListener)listener).exitPeddrify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pccslVisitor ) return ((pccslVisitor<? extends T>)visitor).visitPeddrify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeddrifyContext peddrify() throws RecognitionException {
		PeddrifyContext _localctx = new PeddrifyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_peddrify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CLOCK);
			setState(153);
			match(DEFINE);
			setState(154);
			match(CLOCK);
			setState(155);
			match(PED);
			setState(156);
			match(NUM);
			setState(157);
			match(T__6);
			setState(158);
			match(NUM);
			setState(159);
			match(END);
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
		case 0:
			return cons_sempred((ConsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cons_sempred(ConsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\3\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00a1\2 \3\2\2\2\4\67\3"+
		"\2\2\2\69\3\2\2\2\bF\3\2\2\2\nU\3\2\2\2\fZ\3\2\2\2\16_\3\2\2\2\20f\3\2"+
		"\2\2\22m\3\2\2\2\24r\3\2\2\2\26z\3\2\2\2\30\u0081\3\2\2\2\32\u0088\3\2"+
		"\2\2\34\u0091\3\2\2\2\36\u009a\3\2\2\2 !\b\2\1\2!\"\5\4\3\2\"\'\3\2\2"+
		"\2#$\f\4\2\2$&\5\4\3\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3"+
		"\2\2\2)\'\3\2\2\2*8\5\n\6\2+8\5\f\7\2,8\5\16\b\2-8\5\20\t\2.8\5\22\n\2"+
		"/8\5\24\13\2\608\5\26\f\2\618\5\30\r\2\628\5\6\4\2\638\5\b\5\2\648\5\32"+
		"\16\2\658\5\34\17\2\668\5\36\20\2\67*\3\2\2\2\67+\3\2\2\2\67,\3\2\2\2"+
		"\67-\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62"+
		"\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3"+
		"\2\2\29:\7\27\2\2:;\7\25\2\2;<\7\27\2\2<=\7\17\2\2=>\7\26\2\2>?\7\3\2"+
		"\2?@\7\30\2\2@A\7\f\2\2AB\7\26\2\2BC\7\f\2\2CD\7\30\2\2DE\7\n\2\2E\7\3"+
		"\2\2\2FG\7\27\2\2GH\7\25\2\2HI\7\27\2\2IJ\7\20\2\2JK\7\26\2\2KL\7\4\2"+
		"\2LM\7\27\2\2MN\7\3\2\2NO\7\30\2\2OP\7\f\2\2PQ\7\26\2\2QR\7\f\2\2RS\7"+
		"\30\2\2ST\7\n\2\2T\t\3\2\2\2UV\7\27\2\2VW\7\13\2\2WX\7\27\2\2XY\7\n\2"+
		"\2Y\13\3\2\2\2Z[\7\27\2\2[\\\7\f\2\2\\]\7\27\2\2]^\7\n\2\2^\r\3\2\2\2"+
		"_`\7\27\2\2`a\7\25\2\2ab\7\27\2\2bc\7\r\2\2cd\7\27\2\2de\7\n\2\2e\17\3"+
		"\2\2\2fg\7\27\2\2gh\7\25\2\2hi\7\27\2\2ij\7\16\2\2jk\7\27\2\2kl\7\n\2"+
		"\2l\21\3\2\2\2mn\7\27\2\2no\7\21\2\2op\7\27\2\2pq\7\n\2\2q\23\3\2\2\2"+
		"rs\7\27\2\2st\7\5\2\2tu\7\30\2\2uv\7\6\2\2vw\7\22\2\2wx\7\27\2\2xy\7\n"+
		"\2\2y\25\3\2\2\2z{\7\27\2\2{|\7\25\2\2|}\7\27\2\2}~\7\23\2\2~\177\7\27"+
		"\2\2\177\u0080\7\n\2\2\u0080\27\3\2\2\2\u0081\u0082\7\27\2\2\u0082\u0083"+
		"\7\25\2\2\u0083\u0084\7\27\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\27\2"+
		"\2\u0086\u0087\7\n\2\2\u0087\31\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008a"+
		"\7\25\2\2\u008a\u008b\7\27\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7\30\2"+
		"\2\u008d\u008e\7\7\2\2\u008e\u008f\7\30\2\2\u008f\u0090\7\n\2\2\u0090"+
		"\33\3\2\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7\25\2\2\u0093\u0094\7\27"+
		"\2\2\u0094\u0095\7\17\2\2\u0095\u0096\7\30\2\2\u0096\u0097\7\b\2\2\u0097"+
		"\u0098\7\30\2\2\u0098\u0099\7\n\2\2\u0099\35\3\2\2\2\u009a\u009b\7\27"+
		"\2\2\u009b\u009c\7\25\2\2\u009c\u009d\7\27\2\2\u009d\u009e\7\17\2\2\u009e"+
		"\u009f\7\30\2\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2\7"+
		"\n\2\2\u00a2\37\3\2\2\2\4\'\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}