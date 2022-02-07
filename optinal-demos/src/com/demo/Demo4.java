package com.demo;

import java.util.Optional;

public class Demo4 {
	public static void main(String[] args) {
		//Trainer trainer = null;
		Course course = null;
		Student student = new Student("Hello", "hello@gmail", 111, Optional.ofNullable(course));

		Optional<Student> mystudent = Optional.ofNullable(student);
		String name = mystudent.map(mystu->mystu.getStudentName()).orElse("No Name is provided");
		String email = mystudent.map(mystu->mystu.getStudentEmail()).orElse("No Phone is provided");
		
		long phone = mystudent.map(mystu -> mystu.getStudentPhone()).orElse((long) 11111);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		
		System.out.println("-------------------------------------------------------");
		
		
	}
}
