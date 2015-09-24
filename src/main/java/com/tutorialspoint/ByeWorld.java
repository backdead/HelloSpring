package com.tutorialspoint;

public class ByeWorld extends SayToWorld{
	private String message3;
	
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	
	public void getMessage3() {
		System.out.println("Your Message : " + this.message3);
	}

}
