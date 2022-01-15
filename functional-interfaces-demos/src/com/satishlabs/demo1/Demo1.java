package com.satishlabs.demo1;

public class Demo1 {
	public static void main(String[] args) {
		Hello hello1 = (a,b)->{
			System.out.println("Lambda code Starts...");
			try {
			int result = a/b;
			System.out.println("Result is: "+result);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Lambda code Ends...");
		};
		hello1.test(20, 0);
	}
}
