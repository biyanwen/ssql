// Generated from D:/Work/ssql/src/main/java/com/github/byw/parser\Ssql.g4 by ANTLR 4.10.1
package com.github.byw.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, VALUE_STRING=15, NUMBER=16, 
		STRING=17, LIKE_STRING=18, INTERVAL=19, IN_VALUE=20, WS=21;
	public static final int
		RULE_statements = 0, RULE_expression = 1, RULE_commonExpression = 2, RULE_sortExpression = 3, 
		RULE_limitExpression = 4, RULE_logic = 5, RULE_compareCondition = 6, RULE_sortCondition = 7, 
		RULE_limitCondition = 8, RULE_tableName = 9, RULE_fieldName = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "expression", "commonExpression", "sortExpression", "limitExpression", 
			"logic", "compareCondition", "sortCondition", "limitCondition", "tableName", 
			"fieldName", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'--'", "';'", "','", "'='", "'>'", "'>='", "'<'", "'<='", "'=like='", 
			"'=in='", "'->'", "'<-'", "'<->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VALUE_STRING", "NUMBER", "STRING", "LIKE_STRING", 
			"INTERVAL", "IN_VALUE", "WS"
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
	public String getGrammarFileName() { return "Ssql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			tableName();
			setState(25);
			match(T__0);
			setState(26);
			expression();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(27);
				logic();
				setState(28);
				expression();
				}
				}
				setState(34);
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

	public static class ExpressionContext extends ParserRuleContext {
		public CommonExpressionContext commonExpression() {
			return getRuleContext(CommonExpressionContext.class,0);
		}
		public SortExpressionContext sortExpression() {
			return getRuleContext(SortExpressionContext.class,0);
		}
		public LimitExpressionContext limitExpression() {
			return getRuleContext(LimitExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				commonExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				sortExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				limitExpression();
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

	public static class CommonExpressionContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public CompareConditionContext compareCondition() {
			return getRuleContext(CompareConditionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CommonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterCommonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitCommonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitCommonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonExpressionContext commonExpression() throws RecognitionException {
		CommonExpressionContext _localctx = new CommonExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			fieldName();
			setState(41);
			compareCondition();
			setState(42);
			value();
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

	public static class SortExpressionContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public SortConditionContext sortCondition() {
			return getRuleContext(SortConditionContext.class,0);
		}
		public SortExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterSortExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitSortExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitSortExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortExpressionContext sortExpression() throws RecognitionException {
		SortExpressionContext _localctx = new SortExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sortExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			fieldName();
			setState(45);
			sortCondition();
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

	public static class LimitExpressionContext extends ParserRuleContext {
		public LimitConditionContext limitCondition() {
			return getRuleContext(LimitConditionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LimitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterLimitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitLimitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitLimitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExpressionContext limitExpression() throws RecognitionException {
		LimitExpressionContext _localctx = new LimitExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			limitCondition();
			setState(48);
			value();
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

	public static class LogicContext extends ParserRuleContext {
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class CompareConditionContext extends ParserRuleContext {
		public CompareConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterCompareCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitCompareCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitCompareCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareConditionContext compareCondition() throws RecognitionException {
		CompareConditionContext _localctx = new CompareConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compareCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class SortConditionContext extends ParserRuleContext {
		public SortConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterSortCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitSortCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitSortCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortConditionContext sortCondition() throws RecognitionException {
		SortConditionContext _localctx = new SortConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sortCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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

	public static class LimitConditionContext extends ParserRuleContext {
		public LimitConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterLimitCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitLimitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitLimitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitConditionContext limitCondition() throws RecognitionException {
		LimitConditionContext _localctx = new LimitConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limitCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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

	public static class TableNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(SsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SsqlParser.STRING, i);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableName);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					match(STRING);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					match(T__13);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				setState(69);
				match(STRING);
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SsqlParser.STRING, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE_STRING() { return getToken(SsqlParser.VALUE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SsqlParser.NUMBER, 0); }
		public TerminalNode INTERVAL() { return getToken(SsqlParser.INTERVAL, 0); }
		public TerminalNode IN_VALUE() { return getToken(SsqlParser.IN_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SsqlListener ) ((SsqlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SsqlVisitor ) return ((SsqlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE_STRING) | (1L << NUMBER) | (1L << INTERVAL) | (1L << IN_VALUE))) != 0)) ) {
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
		"\u0004\u0001\u0015M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t=\b\t\u000b\t\f\t"+
		">\u0001\t\u0004\tB\b\t\u000b\t\f\tC\u0001\t\u0003\tG\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001\u0000\u0002"+
		"\u0003\u0001\u0000\u0004\n\u0001\u0000\u000b\f\u0002\u0000\u000f\u0010"+
		"\u0013\u0014F\u0000\u0018\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000"+
		"\u0000\u0004(\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		"/\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f4\u0001\u0000\u0000"+
		"\u0000\u000e6\u0001\u0000\u0000\u0000\u00108\u0001\u0000\u0000\u0000\u0012"+
		"F\u0001\u0000\u0000\u0000\u0014H\u0001\u0000\u0000\u0000\u0016J\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0012\t\u0000\u0019\u001a\u0005\u0001"+
		"\u0000\u0000\u001a \u0003\u0002\u0001\u0000\u001b\u001c\u0003\n\u0005"+
		"\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001f\u0001\u0000\u0000"+
		"\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0001\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#\'\u0003\u0004\u0002\u0000"+
		"$\'\u0003\u0006\u0003\u0000%\'\u0003\b\u0004\u0000&#\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0003\u0001"+
		"\u0000\u0000\u0000()\u0003\u0014\n\u0000)*\u0003\f\u0006\u0000*+\u0003"+
		"\u0016\u000b\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0003\u0014\n\u0000"+
		"-.\u0003\u000e\u0007\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0003\u0010"+
		"\b\u000001\u0003\u0016\u000b\u00001\t\u0001\u0000\u0000\u000023\u0007"+
		"\u0000\u0000\u00003\u000b\u0001\u0000\u0000\u000045\u0007\u0001\u0000"+
		"\u00005\r\u0001\u0000\u0000\u000067\u0007\u0002\u0000\u00007\u000f\u0001"+
		"\u0000\u0000\u000089\u0005\r\u0000\u00009\u0011\u0001\u0000\u0000\u0000"+
		":G\u0005\u0011\u0000\u0000;=\u0005\u0011\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0005\u000e\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0005\u0011\u0000"+
		"\u0000F:\u0001\u0000\u0000\u0000F<\u0001\u0000\u0000\u0000G\u0013\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0011\u0000\u0000I\u0015\u0001\u0000\u0000"+
		"\u0000JK\u0007\u0003\u0000\u0000K\u0017\u0001\u0000\u0000\u0000\u0005"+
		" &>CF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}