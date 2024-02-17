package com.gl.StudentManagement.Student.service;

import java.util.List;

import com.gl.StudentManagement.Student.Model.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	

}
