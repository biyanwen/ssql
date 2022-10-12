// Generated from D:/Work/ssql/src/main/java/com/github/byw/parser\Ssql.g4 by ANTLR 4.10.1
package com.github.byw.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SsqlParser}.
 */
public interface SsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SsqlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SsqlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SsqlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonExpression(SsqlParser.CommonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonExpression(SsqlParser.CommonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#sortExpression}.
	 * @param ctx the parse tree
	 */
	void enterSortExpression(SsqlParser.SortExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#sortExpression}.
	 * @param ctx the parse tree
	 */
	void exitSortExpression(SsqlParser.SortExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#limitExpression}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpression(SsqlParser.LimitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#limitExpression}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpression(SsqlParser.LimitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(SsqlParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(SsqlParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#compareCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompareCondition(SsqlParser.CompareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#compareCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompareCondition(SsqlParser.CompareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#sortCondition}.
	 * @param ctx the parse tree
	 */
	void enterSortCondition(SsqlParser.SortConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#sortCondition}.
	 * @param ctx the parse tree
	 */
	void exitSortCondition(SsqlParser.SortConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#limitCondition}.
	 * @param ctx the parse tree
	 */
	void enterLimitCondition(SsqlParser.LimitConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#limitCondition}.
	 * @param ctx the parse tree
	 */
	void exitLimitCondition(SsqlParser.LimitConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SsqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SsqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(SsqlParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(SsqlParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SsqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SsqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SsqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SsqlParser.ValueContext ctx);
}