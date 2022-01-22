package com.demo;

import com.demo.model.Course;
import com.demo.model.Student;
import com.demo.model.Trainer;

public class Demo2 {
	public static void main(String[] args) {
		//Trainer trainer1 = new Trainer("Satish Prasad", "sat@gmail", "1234567890");
		//Course course1 = new Course("DevOps", 15000, null);
		Student student1 = new Student("Hello", "hello@gmail", 111, null);

		//I have only student object access
		//I want to trainer Name, email, and phone
		
		String trainerName  = "No Name available";
		String trainerEmail = "No Email provided";
		String trainerPhone = "No Phone provided";
		if(student1 != null) {
			Course mycourse = student1.getCourse();
			if(mycourse != null) {
				Trainer mytrainer = mycourse.getTrainer();
				if(mytrainer != null) {
					trainerName = mytrainer.getTrainerName();
					trainerEmail = mytrainer.getTrainerEmail();
					trainerPhone = mytrainer.getTrainerPhone();
				}
			}
		}
		
		
		System.out.println(trainerName+", "+trainerEmail+", "+trainerPhone);

		System.out.println("---------------------------------------------------");

	}
}
