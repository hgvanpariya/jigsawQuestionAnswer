package com.jigsaw.bean;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class JSQuestion {

	@Id
	private String id;

	String question;

	JSChartType chartType;

	float chartTypeMarks;

	LinkedList<JSQuestionValues> values;

	/**
	 * 
	 */
	public JSQuestion() {
		super();
	}

	/**
	 * @param id
	 * @param question
	 * @param chartType
	 * @param chartTypeMarks
	 * @param values
	 */
	public JSQuestion(String id, String question, JSChartType chartType, float chartTypeMarks,
			LinkedList<JSQuestionValues> values) {
		super();
		this.id = id;
		this.question = question;
		this.chartType = chartType;
		this.chartTypeMarks = chartTypeMarks;
		this.values = values;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the chartType
	 */
	public JSChartType getChartType() {
		return chartType;
	}

	/**
	 * @param chartType
	 *            the chartType to set
	 */
	public void setChartType(JSChartType chartType) {
		this.chartType = chartType;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the values
	 */
	public LinkedList<JSQuestionValues> getValues() {
		return values;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public void setValues(LinkedList<JSQuestionValues> values) {
		this.values = values;
	}

	/**
	 * @return the chartTypeMarks
	 */
	public float getChartTypeMarks() {
		return chartTypeMarks;
	}

	/**
	 * @param chartTypeMarks
	 *            the chartTypeMarks to set
	 */
	public void setChartTypeMarks(float chartTypeMarks) {
		this.chartTypeMarks = chartTypeMarks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JSQuestion [id=" + id + ", question=" + question + ", chartType=" + chartType + ", chartTypeMarks="
				+ chartTypeMarks + ", values=" + values + "]";
	}

}
