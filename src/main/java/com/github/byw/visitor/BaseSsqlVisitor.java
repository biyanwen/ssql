package com.github.byw.visitor;

import com.github.byw.helper.StringAppender;
import com.github.byw.parser.SsqlBaseVisitor;
import com.github.byw.parser.SsqlParser;

public abstract class BaseSsqlVisitor extends SsqlBaseVisitor<String> {

	private static final String WHERE = "where";
	private static final String OR = ",";
	private static final String LIKE = "=like=";
	private static final String IN = "=in=";
	private static final Integer IN_SQL_CODE = 20;
	/**
	 * 反序
	 */
	private static final String REVERSE_ORDER = "<-";

	private static final String LIMIT = "<->";

	private final StringAppender builder = new StringAppender("select * from");

	/**
	 * 是否处理过 limit ，因为 limit 只能出现在最后
	 */
	private boolean gotLimit = false;

	/**
	 * 是否处理过 order by 排序语句，排序语句不能在 where 表达式中，或者之前。
	 */
	private boolean gotOrderBy = false;

	@Override
	public String visitStatements(SsqlParser.StatementsContext ctx) {
		super.visitStatements(ctx);
		return builder.append(";").toString();
	}

	@Override
	public String visitExpression(SsqlParser.ExpressionContext ctx) {
		if (builder.indexOf(WHERE) == -1) {
			builder.append(WHERE);
		}
		return super.visitExpression(ctx);
	}

	@Override
	public String visitSortExpression(SsqlParser.SortExpressionContext ctx) {
		gotOrderBy = true;
		builder.removeBeforeLogic();
		String fieldName = ctx.getChild(0).getText();
		String sortSymbol = ctx.getChild(1).getText();
		builder.append("order by").append(fieldName);
		if (sortSymbol.equals(REVERSE_ORDER)) {
			builder.append("desc");
		}
		return null;
	}

	@Override
	public String visitCommonExpression(SsqlParser.CommonExpressionContext ctx) {
		if (gotOrderBy) {
			throw new IllegalArgumentException("->和<-等排序语句应该出现在条件语句之后,例如 order by 不能出现在 where 语句中间和之前");
		}
		return super.visitCommonExpression(ctx);
	}

	@Override
	public String visitLogic(SsqlParser.LogicContext ctx) {
		if (gotLimit) {
			throw new IllegalArgumentException("<->语句位置错误,limit语句应该放在最后");
		}
		String logic = ctx.getChild(0).getText();
		if (logic.equals(OR)) {
			logic = "or";
		} else {
			logic = "and";
		}
		builder.append(logic);
		return super.visitLogic(ctx);
	}

	@Override
	public String visitCompareCondition(SsqlParser.CompareConditionContext ctx) {
		String compareCondition = ctx.getChild(0).getText();
		if (compareCondition.equals(LIKE)) {
			compareCondition = "like";
		}
		if (compareCondition.equals(LIMIT)) {
			compareCondition = "limit";
		}
		if (compareCondition.equals(IN)) {
			compareCondition = "in";
		}
		builder.append(compareCondition);
		return super.visitCompareCondition(ctx);
	}

	/**
	 * 访问分页条件
	 *
	 * @param ctx
	 * @param builder
	 */
	public abstract void visitLimitCondition(SsqlParser.LimitConditionContext ctx, StringAppender builder);

	/**
	 * 访问limit数值
	 *
	 * @param builder 构建器
	 * @param value   价值
	 */
	public abstract void visitLimitValue(String value, StringAppender builder);

	@Override
	public String visitLimitCondition(SsqlParser.LimitConditionContext ctx) {
		gotLimit = true;
		visitLimitCondition(ctx, builder);
		return super.visitLimitCondition(ctx);
	}

	@Override
	public String visitTableName(SsqlParser.TableNameContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			builder.append(ctx.getChild(i).getText());
		}
		return super.visitTableName(ctx);
	}

	@Override
	public String visitFieldName(SsqlParser.FieldNameContext ctx) {
		builder.append(ctx.getChild(0).getText());
		return super.visitFieldName(ctx);
	}

	@Override
	public String visitValue(SsqlParser.ValueContext ctx) {
		String value = ctx.getChild(0).getText();
		if (value.contains("*")) {
			value = value.replaceAll("\\*", "%");
			builder.append(value);
		} else if (isLimitValue(value, ctx.getStop().getType())) {
			visitLimitValue(value, builder);
		} else {
			builder.append(value);
		}
		return super.visitValue(ctx);
	}

	private boolean isLimitValue(String value, Integer code) {
		return value.startsWith("(") && value.endsWith(")") && code != 20;
	}
}
