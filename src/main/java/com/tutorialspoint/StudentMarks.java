package com.tutorialspoint;

public class StudentMarks {
	
		private int age;
		private String name;
		private int id;
		private int marks;
		private int year;
		private int sid;
		
		public int getAge() {
			System.out.println("Age: " + age);
			return age;
		}
		
		//@Autowired(required=false)
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getName() {
			System.out.println("Name: " + name);
			return name;
		}
		
		//@Autowired
		public void setName(String name) {
			this.name = name;
		}
		
		public void printThrowException() {
			System.out.println("Exception raised");
			throw new IllegalArgumentException();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}
		
}
