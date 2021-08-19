package com.demo3;

public interface A {

	static void m1() {
		System.out.println("A -> m1()");
	}

	default void m2() {
		System.out.println("A -> m2()");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		m1();
		//m2();
	}
}
