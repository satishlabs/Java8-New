package com.demo;

import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		Trainer trainer = null;
		Course course = new Course("DevOps", 15000, Optional.ofNullable(trainer));
		Student student = new Student("Hello", "hello@gmail", 111, Optional.ofNullable(course));

		Optional<Student> mystudent = Optional.ofNullable(student);
		String name = mystudent.flatMap(
				mystu->mystu.getCourse().flatMap(
						mycou->mycou.getTrainer().map(
								mytra->mytra.getTrainerName()))).orElse("No Name is provided");
		
		String email = mystudent.flatMap(
				mystu->mystu.getCourse().flatMap(
						mycou->mycou.getTrainer().map(
								mytra->mytra.getTrainerEmail()))).orElse("No Email is provided");
		
		String phone = mystudent.flatMap(
				mystu->mystu.getCourse().flatMap(
						mycou->mycou.getTrainer().map(
								mytra->mytra.getTrainerPhone()))).orElse("No Phone is provided");
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		
		System.out.println("-------------------------------------------------------");
		String cname = mystudent.flatMap(
				mystu->mystu.getCourse().map(mycou -> mycou.getCourseName())).orElse("No Course is provided");
		double cprice = mystudent.flatMap(
				mystu->mystu.getCourse().map(mycou -> mycou.getCoursePrice())).orElse(25000.00);
		System.out.println(cname);
		System.out.println(cprice);
		
	}
}
