package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// //XmlBeanFactory factory = new XmlBeanFactory(new
		// ClassPathResource("Beans.xml"));
		//
		// SayToWorld objA = (SayToWorld) context.getBean("sayToWorld");
		//
		// objA.getMessage1();
		// objA.getMessage2();
		//
		// context.registerShutdownHook();
		//
		// ByeWorld objB = (ByeWorld) context.getBean("byeWorld");
		//
		// objB.getMessage1();
		// objB.getMessage2();
		// objB.getMessage3();
		//
		// context.registerShutdownHook();

		// TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellCheck();

		// Car car = (Car) context.getBean("car");
		// car.start();

		// JavaCollection obj = (JavaCollection)
		// context.getBean("javaCollection");
		// obj.getAddressList();
		// obj.getAddressSet();
		// obj.getAddressMap();
		// obj.getAddressPro();

		// Student obj = (Student) context.getBean("student");
		//
		// System.out.println("Name: " + obj.getName());
		// System.out.println("Age: " + obj.getAge());

		// CarFactory obj = (CarFactory) context.getBean("carFactory");
		//
		// obj.start();

		// context.start();
		// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		//
		// obj.getMessage();
		//
		// context.stop();

		/* Event */
		// ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// CustomEventPublisher cvp = (CustomEventPublisher)
		// context.getBean("customEventPublisher");
		//
		// cvp.publish();
		// cvp.publish();

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		//
		// Student student = (Student) context.getBean("student");
		// student.getName();
		// student.getAge();
		//
		// student.printThrowException();

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

//		System.out.println("------Records Creation--------");
//		studentJDBCTemplate.create("Zara", 11);
//		studentJDBCTemplate.create("Nuha", 2);
//		studentJDBCTemplate.create("Ayan", 15);

		System.out.println("------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}

		System.out.println("----Updating Record with ID = 2 -----");
		studentJDBCTemplate.update(2, 20);

		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());

	}
}