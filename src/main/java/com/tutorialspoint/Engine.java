package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
	private String name;
	
	private double rpm;
	
	public Engine() {
		System.out.println("Engine constructor");
	}
	
	public void Start() {
		System.out.println("Engine starts...");
	}
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired(required=false)
	public void setRpm(double rpm) {
		this.rpm = rpm;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getRpm() {
		return this.rpm;
	}
}
