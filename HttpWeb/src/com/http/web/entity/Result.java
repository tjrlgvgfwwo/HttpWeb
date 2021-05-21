package com.http.web.entity;

import java.util.List;

public class Result {
	private int result;
	List<Person> personData;
	public Result() {
	}
	public Result(int result, List<Person> personData) {
		this.result = result;
		this.personData = personData;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<Person> getPersonData() {
		return personData;
	}
	public void setPersonData(List<Person> personData) {
		this.personData = personData;
	}
	
	
}
