package com.satishlabs.demo3;

public class Course {
	private int courseId;
	private String courseName;
	private double price;
	private String trainer;

	public Course() {}

	public Course(int courseId, String courseName, double price, String trainer) {
		System.out.println("Course 4-args const---");
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
		this.trainer = trainer;
	}

	public Course( String courseName, double price, String trainer) {
		System.out.println("Course 3-args const---");
		this.courseName = courseName;
		this.price = price;
		this.trainer = trainer;
	}
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return courseId + "," + courseName + "," + price + ", "+ trainer;
	}

}
