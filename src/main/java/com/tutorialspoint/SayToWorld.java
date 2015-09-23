package com.tutorialspoint;

public abstract class SayToWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.text());
	}

	public abstract String text();
}
