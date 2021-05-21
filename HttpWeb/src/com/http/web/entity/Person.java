package com.http.web.entity;

import java.util.List;

public class Person {
	private String name ;
	private String imageUrl;
	private int age;
	private List<SchoolInfo> schools;
	public Person() {
	}
	public Person(String name, String imageUrl, int age,
			List<SchoolInfo> schools) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.age = age;
		this.schools = schools;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<SchoolInfo> getSchools() {
		return schools;
	}
	public void setSchools(List<SchoolInfo> schools) {
		this.schools = schools;
	}
}
