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
			null, "'--'", "';'", "','", "'='", "'>'", "'>='", "'<'", "'<='", "'%'", 
			"'->'", "'<-'", "'<->'", "'.'"
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
		"\u0004\u0000\u0013\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\rR\b\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0003\u000eW\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\\\b\u000e\u000b\u000e\f\u000e]\u0003\u000e`\b\u000e\u0001"+
		"\u000e\u0003\u000ec\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0003"+
		"\u0010h\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010l\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012w\b\u0012\n\u0012\f\u0012z\t\u0012"+
		"\u0003\u0012|\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0080\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u0085\b\u0014\n\u0014"+
		"\f\u0014\u0088\t\u0014\u0001\u0014\u0004\u0014\u008b\b\u0014\u000b\u0014"+
		"\f\u0014\u008c\u0001\u0014\u0005\u0014\u0090\b\u0014\n\u0014\f\u0014\u0093"+
		"\t\u0014\u0001\u0015\u0004\u0015\u0096\b\u0015\u000b\u0015\f\u0015\u0097"+
		"\u0001\u0015\u0001\u0015\u0002\u0086\u008c\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0000\'\u0000)\u0000+\u0013\u0001\u0000\u0007\u0001\u0000"+
		"09\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0006\u0000$$09AZ__a"+
		"z\u0080\u8000\uffff\u0005\u0000$$AZ__az\u0080\u8000\uffff\u0003\u0000"+
		"\t\n\r\r  \u00a5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00030\u0001"+
		"\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001"+
		"\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000"+
		"\u0000\u0013B\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017"+
		"H\u0001\u0000\u0000\u0000\u0019L\u0001\u0000\u0000\u0000\u001bN\u0001"+
		"\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000"+
		"\u0000!g\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%{\u0001\u0000"+
		"\u0000\u0000\'}\u0001\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000"+
		"+\u0095\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000./\u0005-\u0000\u0000"+
		"/\u0002\u0001\u0000\u0000\u000001\u0005;\u0000\u00001\u0004\u0001\u0000"+
		"\u0000\u000023\u0005,\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005"+
		"=\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005>\u0000\u00007\n\u0001"+
		"\u0000\u0000\u000089\u0005>\u0000\u00009:\u0005=\u0000\u0000:\f\u0001"+
		"\u0000\u0000\u0000;<\u0005<\u0000\u0000<\u000e\u0001\u0000\u0000\u0000"+
		"=>\u0005<\u0000\u0000>?\u0005=\u0000\u0000?\u0010\u0001\u0000\u0000\u0000"+
		"@A\u0005%\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005-\u0000\u0000"+
		"CD\u0005>\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0005<\u0000\u0000"+
		"FG\u0005-\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HI\u0005<\u0000\u0000"+
		"IJ\u0005-\u0000\u0000JK\u0005>\u0000\u0000K\u0018\u0001\u0000\u0000\u0000"+
		"LM\u0005.\u0000\u0000M\u001a\u0001\u0000\u0000\u0000NQ\u0005\'\u0000\u0000"+
		"OR\u0003\u001f\u000f\u0000PR\u0003!\u0010\u0000QO\u0001\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\'\u0000\u0000"+
		"T\u001c\u0001\u0000\u0000\u0000UW\u0005-\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X_\u0003%\u0012"+
		"\u0000Y[\u0005.\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000ac\u0003\'\u0013\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001e\u0001\u0000\u0000"+
		"\u0000de\u0003)\u0014\u0000e \u0001\u0000\u0000\u0000fh\u0005*\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ik\u0003\u001f\u000f\u0000jl\u0005*\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0005(\u0000"+
		"\u0000no\u0003\u001d\u000e\u0000op\u0005,\u0000\u0000pq\u0003\u001d\u000e"+
		"\u0000qr\u0005)\u0000\u0000r$\u0001\u0000\u0000\u0000s|\u00050\u0000\u0000"+
		"tx\u0007\u0001\u0000\u0000uw\u0007\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{s\u0001"+
		"\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000|&\u0001\u0000\u0000\u0000"+
		"}\u007f\u0007\u0002\u0000\u0000~\u0080\u0007\u0003\u0000\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0003%\u0012\u0000\u0082(\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0007\u0004\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0005"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u0090\u0007\u0004"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0007\u0006\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0006\u0015\u0000\u0000\u009a,\u0001\u0000\u0000\u0000"+
		"\u000f\u0000QV]_bgkx{\u007f\u0086\u008c\u0091\u0097\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}