package com.jigsaw.bean;

import java.util.List;

public class JSQuestionValues {

	String axisValue;

	List<String> axisData;

	float marks;

	/**
	 * 
	 */
	public JSQuestionValues() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param axisValue
	 * @param axisData
	 * @param marks
	 */
	public JSQuestionValues(String axisValue, List<String> axisData, float marks) {
		super();
		this.axisValue = axisValue;
		this.axisData = axisData;
		this.marks = marks;
	}

	/**
	 * @return the axisValue
	 */
	public String getAxisValue() {
		return axisValue;
	}

	/**
	 * @param axisValue
	 *            the axisValue to set
	 */
	public void setAxisValue(String axisValue) {
		this.axisValue = axisValue;
	}

	/**
	 * @return the axisData
	 */
	public List<String> getAxisData() {
		return axisData;
	}

	/**
	 * @param axisData
	 *            the axisData to set
	 */
	public void setAxisData(List<String> axisData) {
		this.axisData = axisData;
	}

	/**
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}

	/**
	 * @param marks
	 *            the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}

}
