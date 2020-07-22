// Generated from D:/pCCSL2SMT/src/res\pccsl.g4 by ANTLR 4.8
package com.wjc.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pccslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, END=8, SUB=9, 
		CAU=10, UNI=11, INF=12, PED=13, DEL=14, EXC=15, PRE=16, CON=17, SUP=18, 
		DEFINE=19, PAR=20, CLOCK=21, NUM=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "END", "SUB", 
			"CAU", "UNI", "INF", "PED", "DEL", "EXC", "PRE", "CON", "SUP", "DEFINE", 
			"PAR", "CLOCK", "NUM", "WS"
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


	public pccslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pccsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\7\26f\n\26\f\26\16\26i\13\26\3\27\6\27l\n\27\r\27\16\27m\3"+
		"\30\6\30q\n\30\r\30\16\30r\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\3\2\7\3\2c|\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\3\61\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\rA"+
		"\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27O\3\2\2\2\31"+
		"Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!Y\3\2\2\2#[\3\2\2\2%]\3"+
		"\2\2\2\'_\3\2\2\2)a\3\2\2\2+c\3\2\2\2-k\3\2\2\2/p\3\2\2\2\61\62\7c\2\2"+
		"\62\63\7p\2\2\63\64\7f\2\2\64\4\3\2\2\2\65\66\7q\2\2\66\67\7p\2\2\67\6"+
		"\3\2\2\289\7]\2\29\b\3\2\2\2:;\7_\2\2;\n\3\2\2\2<=\7y\2\2=>\7k\2\2>?\7"+
		"v\2\2?@\7j\2\2@\f\3\2\2\2AB\7-\2\2BC\7/\2\2C\16\3\2\2\2DE\7/\2\2EF\7-"+
		"\2\2F\20\3\2\2\2GH\7=\2\2H\22\3\2\2\2IJ\7k\2\2JK\7p\2\2K\24\3\2\2\2LM"+
		"\7>\2\2MN\7?\2\2N\26\3\2\2\2OP\7-\2\2P\30\3\2\2\2QR\7`\2\2R\32\3\2\2\2"+
		"ST\7R\2\2T\34\3\2\2\2UV\7&\2\2V\36\3\2\2\2WX\7%\2\2X \3\2\2\2YZ\7>\2\2"+
		"Z\"\3\2\2\2[\\\7,\2\2\\$\3\2\2\2]^\7x\2\2^&\3\2\2\2_`\7?\2\2`(\3\2\2\2"+
		"ab\t\2\2\2b*\3\2\2\2cg\t\3\2\2df\t\4\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h,\3\2\2\2ig\3\2\2\2jl\t\5\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2n.\3\2\2\2oq\t\6\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tu\b\30\2\2u\60\3\2\2\2\6\2gmr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}