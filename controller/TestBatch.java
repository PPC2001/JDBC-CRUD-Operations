package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestBatch {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(151);
		s1.setName("NISHANT");
		s1.setEmail("nishant@gmail.com");

		Student s2 = new Student();
		s2.setId(152);
		s2.setName("OMKAR");
		s2.setEmail("omkar@gmail.com");
	
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);

		StudentDao studentDao = new StudentDao();
		studentDao.addMultipleStudents(al);

	}	
}
