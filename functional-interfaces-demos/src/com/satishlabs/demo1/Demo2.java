package com.satishlabs.demo1;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("main begin ...");
		Hello hello1 = (a,b)->{
			
			System.out.println("Lambda code Start...");
			int result = a/b;
			System.out.println("Result is: "+result);
			
			System.out.println("Lambda code Ends...");
		};
		try {
		hello1.test(20, 0);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end ...");
	}
}
