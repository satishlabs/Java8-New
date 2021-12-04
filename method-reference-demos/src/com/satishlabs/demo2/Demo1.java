package com.satishlabs.demo2;

public class Demo1 {
	public static void main(String[] args) {
		//3
		Hello h1 = (a,b)->{
			int sum = a+b;
			return sum;
		};
		
		int sum = h1.test(10, 20);
		System.out.println("Sum = :"+sum);
		
		//2
		MyInteger myIntRef = new MyInteger();
		Hello h2 = myIntRef::findSum;
		 sum = h2.test(100, 200);
		System.out.println("Sum = :"+sum);
		
		
		//1
		Hello h3 = Integer::sum; //Built-in method
		sum = h3.test(200, 400);
		System.out.println("Sum = :"+sum);
		
	}
}
