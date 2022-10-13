package com.github.byw.visitor;

import com.github.byw.helper.StringAppender;
import com.github.byw.parser.SsqlParser;

/**
 * OracleVisitor
 *
 * @author byw
 * @date 2022/10/12
 */
public class OracleVisitor extends BaseSsqlVisitor {

	@Override
	public void visitLimitCondition(SsqlParser.LimitConditionContext ctx, StringAppender builder) {
		builder.removeBeforeLogic();
		String template = "select * from (" + "select rownum rn,t.* from ( " + builder + " ) t where rownum <= ${end} ) e where e.rn >= ${start}";
		builder.clear().append(template);
	}

	@Override
	public void visitLimitValue(String value, StringAppender builder) {
		char[] chars = value.toCharArray();
		String start = String.valueOf(chars[1]);
		String end = String.valueOf(chars[3]);
		String sql = builder.toString();
		String replace = sql.replace("${start}", start).replace("${end}", end);
		builder.clear().append(replace);
	}
}
