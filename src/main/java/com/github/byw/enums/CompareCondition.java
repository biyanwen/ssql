package com.github.byw.enums;

public enum CompareCondition {
	EQUAL(1,"="),
	MORE_THAN_THE(2,">"),
	GREATER_OR_EQUAL_TO(3,">="),
	LESS_THAN(4,"<"),
	;
	private Integer index;
	private String text;

	CompareCondition(Integer index, String text) {
		this.index = index;
		this.text = text;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
