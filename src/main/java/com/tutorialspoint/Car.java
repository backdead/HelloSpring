package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.*;



public class Car {
//	@Autowired
//	@Qualifier("engine2")
	private Engine engine;
	
//	@Autowired
//	@Qualifier("wheel2")
	private Wheel wheel;
	
	public Car() {
		System.out.println("Car constructor");
	}
	
	@Resource(name="engine1")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Resource(name="wheel1")
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
