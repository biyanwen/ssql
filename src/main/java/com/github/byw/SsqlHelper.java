package com.github.byw;

import com.github.byw.parser.SsqlBaseVisitor;
import com.github.byw.parser.SsqlLexer;
import com.github.byw.parser.SsqlParser;
import com.github.byw.visitor.MysqlVisitor;
import com.github.byw.visitor.OracleVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * ssql助手
 *
 * @author byw
 * @date 2022/10/10
 */
public class SsqlHelper {

	/**
	 * 为mysql创建sql
	 *
	 * @param ssqlStatement ssql语句
	 * @return {@link String}
	 */
	public static String createSqlForMysql(String ssqlStatement) {
		SsqlParser.StatementsContext context = createContext(ssqlStatement);
		MysqlVisitor visitor = new MysqlVisitor();
		return visitor.visit(context);
	}

	/**
	 * 为oracle创建sql
	 *
	 * @param ssqlStatement ssql声明
	 * @return {@link String}
	 */
	public static String createSqlForOracle(String ssqlStatement) {
		SsqlParser.StatementsContext context = createContext(ssqlStatement);
		OracleVisitor visitor = new OracleVisitor();
		return visitor.visit(context);
	}

	/**
	 * 创建sql,需要实现自己需要的数据库的 visitor
	 *
	 * @param visitor       visitor
	 * @param ssqlStatement ssql声明
	 * @return {@link String}
	 */
	public static String createSql(SsqlBaseVisitor<String> visitor, String ssqlStatement) {
		SsqlParser.StatementsContext context = createContext(ssqlStatement);
		return visitor.visit(context);
	}

	private static SsqlParser.StatementsContext createContext(String ssqlStatement) {
		CharStream input = CharStreams.fromString(ssqlStatement);
		SsqlLexer lexer = new SsqlLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SsqlParser parser = new SsqlParser(tokenStream);
		return parser.statements();
	}
}
