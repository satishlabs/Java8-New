package com.demo1;

public class Dog implements Animal{

	@Override
	public void eating() {
		System.out.println("Dog is eating");
		
	}

	@Override
	public void sleeping() {
		System.out.println("Dog is sleeping");
		
	}
	
	public void running() {
		System.out.println("Dog is running");
	}

}
