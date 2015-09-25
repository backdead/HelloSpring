package com.tutorialspoint;

public class Engine {
	private final String name;
	private final double rpm;
	
	public Engine(String name, double rpm) {
		System.out.println("Engine constructor");
		this.name = name;
		this.rpm = rpm;
	}
	
	public void Start() {
		System.out.println("Engine starts...");
	}
	
}
