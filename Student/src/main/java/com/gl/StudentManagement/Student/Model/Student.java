package com.gl.StudentManagement.Student.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="firstName")
	private String firstName;


	@Column(name="lastName")
	private String lastName;


	@Column(name="course")
	private String course;
	
	@Column(name="country")
	private String country;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Student( String firstName, String lastName, String course, String country) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}


	public Student()
	{
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course
				+ ", country=" + country + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getCourse()=" + getCourse() + ", getCountry()=" + getCountry()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
	
}
