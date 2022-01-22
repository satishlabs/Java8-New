package com.demo;

import com.demo.model.Course;
import com.demo.model.Student;
import com.demo.model.Trainer;

public class Demo1 {
	public static void main(String[] args) {
		Trainer trainer1 = new Trainer("Satish Prasad", "sat@gmail", "1234567890");
		Course course1 = new Course("DevOps", 15000, trainer1);
		Student student1 = new Student("Hello", "hello@gmail", 111, course1);

		//I have only student object access
		//I want to trainer Name, email, and phone
		String trainerName = student1.getCourse().getTrainer().getTrainerName();
		String trainerEmail = student1.getCourse().getTrainer().getTrainerEmail();
		String trainerPhone = student1.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName+", "+trainerEmail+", "+trainerPhone);

		System.out.println("---------------------------------------------------");

		//Trainer trainer2 = new Trainer("Satish Prasad", "sat@gmail", "1234567890");
		Course course2 = new Course("Jdk8", 15000, null);
		Student student2 = new Student("Hello", "hello@gmail", 111, course2);

		String trainerName1 = student2.getCourse().getTrainer().getTrainerName();
		String trainerEmail1 = student2.getCourse().getTrainer().getTrainerEmail();
		String trainerPhone1 = student2.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName1+", "+trainerEmail1+", "+trainerPhone1);


		System.out.println("---------------------------------------------------");
		
		Student student3 = new Student("Hello", "hello@gmail", 111, null);
		
		String trainerName2 = student3.getCourse().getTrainer().getTrainerName();
		String trainerEmail2 = student3.getCourse().getTrainer().getTrainerEmail();
		String trainerPhone2 = student3.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName2+", "+trainerEmail2+", "+trainerPhone2);
	}
}
