package com.tutorialspoint;

public class Student {
	private int age;
	private String name;
	
	
	public int getAge() {
		System.out.println("Age: " + age);
		return age;
	}
	
	//@Autowired(required=false)
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		System.out.println("Name: " + name);
		return name;
	}
	
	//@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
	
	
}
