package com.kunev;

import org.kie.api.definition.type.Label;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Mood implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Day")
	private int day;
	@org.kie.api.definition.type.Label("State")
	private String state;

	public Mood() {
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Mood {" + "day=" + day + ", state=" + state + '}';
	}

	public Mood(int day, java.lang.String state) {
		this.day = day;
		this.state = state;
	}

}