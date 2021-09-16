package com.demo1;

public class Demo1 {
	public static void main(String[] args) {
		Hello h1 =()->{
			System.out.println("Welcome to Lambda World");
		};
		h1.display();
		h1.m1();
		//h1.m2();
		Hello.m2();
		
		System.out.println("-----------------------------");
		
		Hello h2 = ()->System.out.println("Welcome to Lambda World!");
		h2.display();
		h2.m1();
		//h2.m2();
		Hello.m2();
	}
}
