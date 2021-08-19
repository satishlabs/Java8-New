package com.demo1;

public class Hello implements A {

	@Override
	public void m1() {
		System.out.println("Hello -> m1()");
	}

	@Override
	public void m2() {
		System.out.println("Hello -> m2()");
	}
	
	public void test() {
		System.out.println(P);
		System.out.println(Q);
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
	}

}
