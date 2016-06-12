package com.jigsaw.bean;

import java.util.List;

public class JSQuestions {

	List<JSQuestion> questions;

	/**
	 * @param questions
	 */
	public JSQuestions(List<JSQuestion> questions) {
		super();
		this.questions = questions;
	}

	/**
	 * 
	 */
	public JSQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the questions
	 */
	public List<JSQuestion> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<JSQuestion> questions) {
		this.questions = questions;
	}

}
