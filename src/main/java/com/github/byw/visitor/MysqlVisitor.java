package com.github.byw.visitor;


import com.github.byw.helper.StringAppender;
import com.github.byw.parser.SsqlParser;

/**
 * MysqlVisitor
 *
 * @author byw
 * @date 2022/10/10
 */
public class MysqlVisitor extends BaseSsqlVisitor {
	@Override
	public void visitLimitCondition(SsqlParser.LimitConditionContext ctx, StringAppender builder) {
		builder.removeBeforeLogic().append("limit");
	}

	@Override
	public void visitLimitValue(String value, StringAppender builder) {
		value = value.replaceAll("\\(", "");
		value = value.replaceAll("\\)", "");
		value = value.replace('-', ',');
		builder.append(value);
	}
}
