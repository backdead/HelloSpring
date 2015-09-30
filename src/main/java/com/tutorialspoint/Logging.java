package com.tutorialspoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	@Pointcut("execution(* com.tutorialspoint.*.*(..))")
	private void selectAll() {
		
	}
	
	/**
	 * This is the method which i would like to execute before a selected method execution.
	 */
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profiel.");
	}
	
	/**
	 * This is the method which i would like to execute after a selected method execution.
	 */
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}
	
	/**
	 * This is the method which i would like to execute when any method returns.
	 */
	@AfterReturning(pointcut="selectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning: " + retVal.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
