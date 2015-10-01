package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks> {
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
	      StudentMarks studentMarks = new StudentMarks();
	      studentMarks.setId(rs.getInt("id"));
	      studentMarks.setName(rs.getString("name"));
	      studentMarks.setAge(rs.getInt("age"));
	      studentMarks.setSid(rs.getInt("sid"));
	      studentMarks.setYear(rs.getInt("year"));
	      studentMarks.setMarks(rs.getInt("marks"));
	      
	      return studentMarks;
	   }
}
