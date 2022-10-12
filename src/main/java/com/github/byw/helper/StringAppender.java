package com.github.byw.helper;

/**
 * 字符串appender
 *
 * @author byw
 * @date 2022/10/10
 */
public class StringAppender {

	private final StringBuilder appendable;

	private String beforeStrLogic = null;

	public StringAppender(String initText) {
		appendable = new StringBuilder(initText);
	}

	public StringAppender append(String str) {
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("不能拼接空字符串");
		}
		beforeStrLogic = str;
		appendable.append(" ").append(str);
		return this;
	}

	/**
	 * 删除上一个逻辑符号
	 *
	 * @return {@link StringAppender}
	 */
	public StringAppender removeBeforeLogic() {
		if (beforeStrLogic != null && (beforeStrLogic.equals("and") || beforeStrLogic.equals("or"))) {
			int startIndex = appendable.lastIndexOf(beforeStrLogic);
			if (startIndex != -1) {
				int endIndex = startIndex + beforeStrLogic.length() - 1;
				for (int i = startIndex; i <= endIndex; i++) {
					appendable.deleteCharAt(startIndex);
				}
			}
		}
		return this;
	}

	public Integer indexOf(String str) {
		return appendable.indexOf(str);
	}

	@Override
	public String toString() {
		return appendable.toString();
	}
}
