package com.xyz.model;

import java.util.Date;

public class UITemp {

	Date date;
	int min;
	int max;
	String condition;
	String suggestion;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String message) {
		this.suggestion = message;
	}
}
