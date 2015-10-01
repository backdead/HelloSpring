package com.tutorialspoint;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {
//	private DataSource dataSource;
//	private JdbcTemplate jdbcTemplateObject;
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
//	}
//
//	public void create(String name, Integer age) {
//		String sql = "insert into Student(name, age) values (?, ?)";
//
//		jdbcTemplateObject.update(sql, name, age);
//		System.out.println("Create Record Name = " + name + " Age = " + age);
//		return;
//	}
//
//	public Student getStudent(Integer id) {
//		String sql = "select * from Student where id = ?";
//		Student student = jdbcTemplateObject.queryForObject(sql, new Object[] { id }, new StudentMapper());
//
//		return student;
//	}
//
//	public List<Student> listStudents() {
//		String SQL = "select * from Student";
//		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
//		return students;
//	}
//
//	public void delete(Integer id) {
//		String SQL = "delete from Student where id = ?";
//		jdbcTemplateObject.update(SQL, id);
//		System.out.println("Deleted Record with ID = " + id);
//		return;
//	}
//
//	public void update(Integer id, Integer age) {
//		String SQL = "update Student set age = ? where id = ?";
//		jdbcTemplateObject.update(SQL, age, id);
//		System.out.println("Updated Record with ID = " + id);
//		return;
//	}
	
	/*Programmatic transaction management*/
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(ds);
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	public void create(String name, int age, int marks, int year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		try {
			String sql1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplateObject.update(sql1, name, age);
			
			String sql2 = "select max(id) from Student";
			int sid = jdbcTemplateObject.queryForObject(sql2, Integer.class);
			
			String sql3 = "insert into Marks(sid, marks, year) values (?, ?, ?)";
			jdbcTemplateObject.update(sql3, sid, marks, year);
			
			System.out.println("Created name = " + name + ", Age = " + age);
			transactionManager.commit(status);
			
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
		
		return;
	}
	
	public List<StudentMarks> listStudents() {
		String sql = "select * from Student, marks where student.id = marks.sid";
		
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(sql, new StudentMarksMapper());
		
		return studentMarks;
	}


}
