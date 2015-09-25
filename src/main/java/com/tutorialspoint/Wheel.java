package com.tutorialspoint;

public class Wheel {
	private final String brand;
	
	public Wheel(String brand) {
		System.out.println("Wheel constructor");
		this.brand = brand;
	}
	
	public void Start() {
		System.out.println("Wheels start...");
	}
}
