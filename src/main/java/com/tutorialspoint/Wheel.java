package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Wheel {
	
	private String brand;
	
	public Wheel() {
		System.out.println("Wheel constructor");
	}
	
	public void Start() {
		System.out.println("Wheels start...");
	}
	
	@Autowired
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
}
