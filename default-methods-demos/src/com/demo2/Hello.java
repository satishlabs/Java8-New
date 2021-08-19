package com.demo2;

public class Hello implements A,B{
	
	@Override
	public void show() {
		System.out.println("Hello - show()");
	}
	public void test() {
		System.out.println("Hello - test()");
		show();
	}
	
	public void test1() {
		System.out.println("Hello - test1()");
		A.super.show();
		B.super.show();
	}

}
