package com.tutorialspoint;

public class Car {
	private final Engine engine;
	private final Wheel wheel;
	
	public Car(Engine engine, Wheel wheel) {
		System.out.println("Car constructor");
		this.engine = engine;
		this.wheel = wheel;
	}
	
	
	public void start() {
		engine.Start();
		wheel.Start();
	}
}
