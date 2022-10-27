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
			null, "'--'", "';'", "','", "'='", "'>'", "'>='", "'<'", "'<='", "'=like='", 
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
		"\u0004\u0000\u0013\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\rW\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\\\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000ea\b\u000e\u000b\u000e"+
		"\f\u000eb\u0003\u000ee\b\u000e\u0001\u000e\u0003\u000eh\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010m\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010q\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012|\b\u0012\n\u0012\f\u0012\u007f\t\u0012\u0003\u0012\u0081\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0085\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0005\u0014\u008a\b\u0014\n\u0014\f\u0014\u008d\t\u0014\u0001"+
		"\u0014\u0004\u0014\u0090\b\u0014\u000b\u0014\f\u0014\u0091\u0001\u0014"+
		"\u0005\u0014\u0095\b\u0014\n\u0014\f\u0014\u0098\t\u0014\u0001\u0015\u0004"+
		"\u0015\u009b\b\u0015\u000b\u0015\f\u0015\u009c\u0001\u0015\u0001\u0015"+
		"\u0002\u008b\u0091\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000"+
		"\'\u0000)\u0000+\u0013\u0001\u0000\u0007\u0001\u000009\u0001\u000019\u0002"+
		"\u0000EEee\u0002\u0000++--\u0006\u0000$$09AZ__az\u0080\u8000\uffff\u0005"+
		"\u0000$$AZ__az\u0080\u8000\uffff\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u00052\u0001"+
		"\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000"+
		"\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f"+
		"=\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000\u0013G\u0001"+
		"\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000"+
		"\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001d"+
		"[\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000!l\u0001\u0000"+
		"\u0000\u0000#r\u0001\u0000\u0000\u0000%\u0080\u0001\u0000\u0000\u0000"+
		"\'\u0082\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u009a"+
		"\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000./\u0005-\u0000\u0000/\u0002"+
		"\u0001\u0000\u0000\u000001\u0005;\u0000\u00001\u0004\u0001\u0000\u0000"+
		"\u000023\u0005,\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005=\u0000"+
		"\u00005\b\u0001\u0000\u0000\u000067\u0005>\u0000\u00007\n\u0001\u0000"+
		"\u0000\u000089\u0005>\u0000\u00009:\u0005=\u0000\u0000:\f\u0001\u0000"+
		"\u0000\u0000;<\u0005<\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005"+
		"<\u0000\u0000>?\u0005=\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@A\u0005"+
		"=\u0000\u0000AB\u0005l\u0000\u0000BC\u0005i\u0000\u0000CD\u0005k\u0000"+
		"\u0000DE\u0005e\u0000\u0000EF\u0005=\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GH\u0005-\u0000\u0000HI\u0005>\u0000\u0000I\u0014\u0001\u0000\u0000"+
		"\u0000JK\u0005<\u0000\u0000KL\u0005-\u0000\u0000L\u0016\u0001\u0000\u0000"+
		"\u0000MN\u0005<\u0000\u0000NO\u0005-\u0000\u0000OP\u0005>\u0000\u0000"+
		"P\u0018\u0001\u0000\u0000\u0000QR\u0005.\u0000\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000SV\u0005\'\u0000\u0000TW\u0003\u001f\u000f\u0000UW\u0003!"+
		"\u0010\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XY\u0005\'\u0000\u0000Y\u001c\u0001\u0000\u0000\u0000"+
		"Z\\\u0005-\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]d\u0003%\u0012\u0000^`\u0005.\u0000"+
		"\u0000_a\u0007\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fh\u0003\'\u0013\u0000gf\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ij\u0003)\u0014"+
		"\u0000j \u0001\u0000\u0000\u0000km\u0005*\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0003\u001f"+
		"\u000f\u0000oq\u0005*\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\"\u0001\u0000\u0000\u0000rs\u0005(\u0000\u0000st\u0003\u001d"+
		"\u000e\u0000tu\u0005,\u0000\u0000uv\u0003\u001d\u000e\u0000vw\u0005)\u0000"+
		"\u0000w$\u0001\u0000\u0000\u0000x\u0081\u00050\u0000\u0000y}\u0007\u0001"+
		"\u0000\u0000z|\u0007\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"x\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0081&\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0007\u0002\u0000\u0000\u0083\u0085\u0007"+
		"\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"%\u0012\u0000\u0087(\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0004\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0007\u0005\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0096\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0007\u0004\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097*\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0006\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0015\u0000\u0000"+
		"\u009f,\u0001\u0000\u0000\u0000\u000f\u0000V[bdglp}\u0080\u0084\u008b"+
		"\u0091\u0096\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}