package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("engine2")
	private Engine engine;
	
	@Autowired
	@Qualifier("wheel2")
	private Wheel wheel;
	
	public Car() {
		System.out.println("Car constructor");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public Wheel getWheel() {
		return this.wheel;
	}
	
	public void start() {
		engine.Start();
		wheel.Start();
	}
}
