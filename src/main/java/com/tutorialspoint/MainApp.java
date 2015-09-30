package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   //AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	   //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//
//      SayToWorld objA = (SayToWorld) context.getBean("sayToWorld");
//      
//      objA.getMessage1();
//      objA.getMessage2();
//      
//      context.registerShutdownHook();
//
//      ByeWorld objB = (ByeWorld) context.getBean("byeWorld");
//      
//      objB.getMessage1();
//      objB.getMessage2();
//      objB.getMessage3();
//      
//      context.registerShutdownHook();
	   
//	   TextEditor te = (TextEditor) context.getBean("textEditor");
//	   te.spellCheck();
	   
//	   Car car = (Car) context.getBean("car");
//	   car.start();
	   
//	   JavaCollection obj = (JavaCollection) context.getBean("javaCollection");
//	   obj.getAddressList();
//	   obj.getAddressSet();
//	   obj.getAddressMap();
//	   obj.getAddressPro();
	   
//	   Student obj = (Student) context.getBean("student");
//	   
//	   System.out.println("Name: " + obj.getName());
//	   System.out.println("Age: " + obj.getAge());
	   
//	   CarFactory obj = (CarFactory) context.getBean("carFactory");
//	   
//	   obj.start();
	   
//	   context.start();
//	   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//	   
//	   obj.getMessage();
//	   
//	   context.stop();
	   
	   ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
	   
	   cvp.publish();
	   cvp.publish();
	   
	   
	   
	   
   } 
}