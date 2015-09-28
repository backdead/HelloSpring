package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	
	@Autowired(required=false)
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	
}
