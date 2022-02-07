package com.demo;

import java.util.Optional;

public class Demo1 {
	public static void main(String[] args) {
		Trainer trainer1 = new Trainer("Satish Prasad", "sat@gmail", "1234567890");
		//Optional<Trainer> trainerOpts = Optional.ofNullable(trainer1);
		
	//	Course course1 = new Course("DevOps", 15000, Optional.ofNullable(trainer1));
		Course course1 = new Course("DevOps", 15000, Optional.ofNullable(trainer1));
		
		//Student student1 = new Student("Hello", "hello@gmail", 111, course1);
		Student student1 = new Student("Hello", "hello@gmail", 111, Optional.ofNullable(course1));

		Optional<Student> mystudent = Optional.ofNullable(student1);
		System.out.println(mystudent);
		System.out.println("Name : "+mystudent.map(n->n.getStudentName()));
		System.out.println("Email : "+mystudent.map(s -> s.getStudentEmail()));
		System.out.println("Mobile : "+mystudent.map(p->p.getStudentPhone()));
		
		System.out.println("------------------------------------");
		Optional<Course> mycourse = mystudent.flatMap(mystu->mystu.getCourse());
		Optional<Trainer> mytrainer = mycourse.flatMap(mycou->mycou.getTrainer());
		
		Optional<String> nameOpts = mytrainer.map(mytra->mytra.getTrainerName());
		String name = nameOpts.orElse("No Name is given");
		System.out.println(name);
		
		Optional<String> emailOpts = mytrainer.map(mytra->mytra.getTrainerEmail());
		String email = emailOpts.orElse("No Email is given");
		System.out.println(email);
		
		Optional<String> phoneOpts = mytrainer.map(mytra->mytra.getTrainerPhone());
		String phone = phoneOpts.orElse("No Phone is given");
		System.out.println(phone);
		
		
	}
}
