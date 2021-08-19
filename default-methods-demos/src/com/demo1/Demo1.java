package com.demo1;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(" From Dog class");
		Dog mydog = new Dog();
		mydog.eating(); //Overriden method
		mydog.sleeping(); //Overriden method
		mydog.running(); //Overriden method
		mydog.thinking(); //Inherited default method
		
		
		System.out.println();
		System.out.println(" From Cat class");
		Cat mycat = new Cat();
		mycat.eating(); //Overriden method
		mycat.sleeping(); //Overriden method
		mycat.running(); //Inherited default method
		mycat.thinking(); //Overriden method
	}
}
