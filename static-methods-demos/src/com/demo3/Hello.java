package com.demo3;

public class Hello implements A, B {

	public void test() {
		A.m1();
		B.m1();
		m1();
	}
	
	static void m1() {
		System.out.println("Hello -> m1()");
	}
	static void show() {
		System.out.println("Hello -> show()");
	}
}
