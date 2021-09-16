package com.demo1;

@FunctionalInterface
public interface Hello {
	public void display();
	//public void display1();
	default void m1() {
		System.out.println("Hello - m1()");
	}
	
	static void m2() {
		System.out.println("Hello -m2()");
	}
}
