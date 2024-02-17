package com.gl.StudentManagement.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.StudentManagement.Student.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
