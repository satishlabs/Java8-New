package com.demo3;

public interface A {
	default void m1() {
		System.out.println("A -> m1()");
	}
	default void m2() {
		System.out.println("A -> m2()");
		m1();
	}
	
	
	/*
	 * boolean equals(Object obj) { System.out.println("A = equals()"); }
	 */
}
