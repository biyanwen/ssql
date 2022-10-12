// Generated from D:/Work/ssql/src/main/java/com/github/byw/parser\Ssql.g4 by ANTLR 4.10.1
package com.github.byw.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SsqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, VALUE_STRING=14, NUMBER=15, STRING=16, 
		LIKE_STRING=17, INTERVAL=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "VALUE_STRING", "NUMBER", "STRING", 
			"LIKE_STRING", "INTERVAL", "INT", "EXP", "ID_LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'&'", "'|'", "'='", "'>'", "'>='", "'<'", "'<='", 
			"'%'", "'<->'", "'->'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "VALUE_STRING", "NUMBER", "STRING", "LIKE_STRING", "INTERVAL", 
			"WS"
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


	public SsqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ssql.g4"; }

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
		"\u0004\u0000\u0013\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0003\rQ\b\r\u0001\r\u0001\r\u0001\u000e\u0003"+
		"\u000eV\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e[\b\u000e"+
		"\u000b\u000e\f\u000e\\\u0003\u000e_\b\u000e\u0001\u000e\u0003\u000eb\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010g\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010k\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012v\b\u0012\n\u0012\f\u0012y\t\u0012\u0003\u0012{\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u007f\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0005\u0014\u0084\b\u0014\n\u0014\f\u0014\u0087\t\u0014\u0001"+
		"\u0014\u0004\u0014\u008a\b\u0014\u000b\u0014\f\u0014\u008b\u0001\u0014"+
		"\u0005\u0014\u008f\b\u0014\n\u0014\f\u0014\u0092\t\u0014\u0001\u0015\u0004"+
		"\u0015\u0095\b\u0015\u000b\u0015\f\u0015\u0096\u0001\u0015\u0001\u0015"+
		"\u0002\u0085\u008b\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000"+
		"\'\u0000)\u0000+\u0013\u0001\u0000\u0007\u0001\u000009\u0001\u000019\u0002"+
		"\u0000EEee\u0002\u0000++--\u0006\u0000$$09AZ__az\u0080\u8000\uffff\u0005"+
		"\u0000$$AZ__az\u0080\u8000\uffff\u0003\u0000\t\n\r\r  \u00a4\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f"+
		"<\u0001\u0000\u0000\u0000\u0011>\u0001\u0000\u0000\u0000\u0013A\u0001"+
		"\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000"+
		"\u0000\u0019J\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001d"+
		"U\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!f\u0001\u0000"+
		"\u0000\u0000#l\u0001\u0000\u0000\u0000%z\u0001\u0000\u0000\u0000\'|\u0001"+
		"\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000+\u0094\u0001\u0000\u0000"+
		"\u0000-.\u0005{\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005}\u0000"+
		"\u00000\u0004\u0001\u0000\u0000\u000012\u0005&\u0000\u00002\u0006\u0001"+
		"\u0000\u0000\u000034\u0005|\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005"+
		"=\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005>\u0000\u00008\f\u0001"+
		"\u0000\u0000\u00009:\u0005>\u0000\u0000:;\u0005=\u0000\u0000;\u000e\u0001"+
		"\u0000\u0000\u0000<=\u0005<\u0000\u0000=\u0010\u0001\u0000\u0000\u0000"+
		">?\u0005<\u0000\u0000?@\u0005=\u0000\u0000@\u0012\u0001\u0000\u0000\u0000"+
		"AB\u0005%\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005<\u0000\u0000"+
		"DE\u0005-\u0000\u0000EF\u0005>\u0000\u0000F\u0016\u0001\u0000\u0000\u0000"+
		"GH\u0005-\u0000\u0000HI\u0005>\u0000\u0000I\u0018\u0001\u0000\u0000\u0000"+
		"JK\u0005<\u0000\u0000KL\u0005-\u0000\u0000L\u001a\u0001\u0000\u0000\u0000"+
		"MP\u0005\'\u0000\u0000NQ\u0003\u001f\u000f\u0000OQ\u0003!\u0010\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005\'\u0000\u0000S\u001c\u0001\u0000\u0000\u0000TV\u0005-\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W^\u0003%\u0012\u0000XZ\u0005.\u0000\u0000Y[\u0007\u0000\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^X\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`b\u0003\'\u0013\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u001e\u0001\u0000\u0000\u0000cd\u0003)\u0014\u0000d \u0001\u0000\u0000"+
		"\u0000eg\u0005*\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0003\u001f\u000f\u0000ik\u0005*\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\"\u0001\u0000"+
		"\u0000\u0000lm\u0005[\u0000\u0000mn\u0003\u001d\u000e\u0000no\u0005,\u0000"+
		"\u0000op\u0003\u001d\u000e\u0000pq\u0005]\u0000\u0000q$\u0001\u0000\u0000"+
		"\u0000r{\u00050\u0000\u0000sw\u0007\u0001\u0000\u0000tv\u0007\u0000\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000zr\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000\u0000"+
		"{&\u0001\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000}\u007f\u0007\u0003"+
		"\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0003%\u0012\u0000\u0081"+
		"(\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0004\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0007\u0005\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u0090\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0007\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0007\u0006\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0006\u0015\u0000\u0000\u0099,\u0001\u0000"+
		"\u0000\u0000\u000f\u0000PU\\^afjwz~\u0085\u008b\u0090\u0096\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}