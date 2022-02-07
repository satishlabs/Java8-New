package com.demo;

import java.util.Optional;

public class Student {
	private String studentName;
	private String studentEmail;
	private long studentPhone;
	private Optional<Course> course;
	
	public Student() {}
	
	public Student(String studentName, String studentEmail, long studentPhone, Optional<Course> course) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

	
	public Optional<Course> getCourse() {
		return course;
	}

	public void setCourse(Optional<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", studentPhone="
				+ studentPhone + ", course=" + course + "]";
	}
	
	
}
