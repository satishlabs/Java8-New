package com.satishlabs.function.demos;

import java.util.function.Function;

//use cases:
//Task1 : Convert String to number(fun1)
//Task2 : add 10 to the number(fun2)

public class Demo11 {
	public static void main(String[] args) {
		Function<String, Integer> fun1 = (num)->{
			System.out.println("Converting String to Integer");
			return Integer.parseInt(num);
		};

		Function<Integer, Integer> fun2 = (num)->{
			System.out.println("Add 10 to the number");
			return num+10; 
		};

		int res1 = fun1.andThen(fun2).apply("10");
		System.out.println(res1);//20
		
		int res2 = fun2.compose(fun1).apply("10");
		System.out.println(res2);
		
	}
}
