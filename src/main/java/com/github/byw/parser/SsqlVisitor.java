// Generated from D:/Work/ssql/src/main/java/com/github/byw/parser\Ssql.g4 by ANTLR 4.10.1
package com.github.byw.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SsqlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SsqlParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SsqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#commonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonExpression(SsqlParser.CommonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#sortExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExpression(SsqlParser.SortExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#limitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpression(SsqlParser.LimitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(SsqlParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#compareCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCondition(SsqlParser.CompareConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#sortCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCondition(SsqlParser.SortConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#limitCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitCondition(SsqlParser.LimitConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SsqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(SsqlParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SsqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SsqlParser.ValueContext ctx);
}