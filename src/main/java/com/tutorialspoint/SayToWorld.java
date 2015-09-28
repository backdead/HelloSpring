package com.tutorialspoint;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SayToWorld {
	private String message1;
	private String message2;
	
	@PostConstruct
	public void init() {
		System.out.println("Initialiez the parameter");
		message1 = "OK";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void getMessage1() {
		System.out.println("Your Message : " + this.message1);
	}
	
	public void getMessage2() {
		System.out.println("Your Message : " + this.message2);
	}


	//public abstract String text();
}
