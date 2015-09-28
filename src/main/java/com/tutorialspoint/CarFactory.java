package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarFactory {
	
	@Autowired
	@Qualifier("car2")
	private Car car;
	
	public CarFactory() {
		System.out.println("Inside car constructor of carFactory");
	}
	
	public Car getCar() {
		return this.car;
	}
	
	//@Autowired
//	public void setCar(Car car) {
//		System.out.println("inside car setter in carFactory");
//		this.car = car;
//	}
	
	public void start() {
		car.start();
		System.out.println("Car's engine name: " + car.getEngine().getName());
		System.out.println("Car's engine rmp: " + car.getEngine().getRpm());
		System.out.println("Car's wheel brand: " + car.getWheel().getBrand());
	}
}
