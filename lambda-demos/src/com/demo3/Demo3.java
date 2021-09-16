package com.demo3;

public class Demo3 {
	public static void main(String[] args) {
		Hello h1 = (a,b)->{
			int sum=a+b;
			System.out.println("Sum : "+sum);
		};
		
		h1.test(100, 50);
		
		Hello h2 = (a,b)->System.out.println("Sum : "+(a+b));
		h2.test(15, 21);
		
		
		Hello h3 = (a,b)->{
			int sub=a-b;
			System.out.println("Sub : "+sub);
		};
		h3.test(100, 75);
		
		Hello h4 = (a,b)->System.out.println("Sub : "+(a-b));
		h4.test(120, 79);
	}
}
