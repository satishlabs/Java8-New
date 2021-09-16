package com.demo4;

public class Demo4 {
	public static void main(String[] args) {
		Hello h1 = (a,b)->{
			int sum = a+b;
			return sum;
			
		};
		int sum1 = h1.test(120, 70);
		System.out.println("Sum : "+sum1);
		
		Hello h2 = (a,b)->{
			return a+b;
		};
		
		int sum2 = h2.test(100, 25);
		System.out.println("Sum : "+sum2);
		
		Hello h3 = (a,b)->a+b;
		int sum3 = h3.test(125, 75);
		System.out.println("Sum : "+sum3);
	}
}
