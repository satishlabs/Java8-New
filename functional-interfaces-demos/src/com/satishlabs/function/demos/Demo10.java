package com.satishlabs.function.demos;

import java.util.function.Function;

public class Demo10 {
	public static void main(String[] args) {
		Function<Integer, Integer> fun1 = (num)->{
			System.out.println("Multiply by 2");
			return num*2;
		};
		
		Function<Integer, Integer> fun2 = (num)->{
			System.out.println("Multiply by 3");
			return num*3;
		};
		
		
		
		System.out.println(fun1.apply(5));
		System.out.println(fun2.apply(7));
		
		int res1 = fun1.compose(fun2).apply(10);
		//fun2.apply(10) =>3*10 =>30
		//fun1.appl(30) =>2*30 =>60
		System.out.println(res1);//60
		
		int res2 = fun1.andThen(fun2).apply(10);
		//fun1.apply(10) =>2*10 =>20
		//fun2.apply(20) => 3*20 =>60
		System.out.println(res2);//60
		
		
		//use cases:
		//Task1 : Convert String to number(fun1)
		//Task2 : add 10 to the number(fun2)
	}
}
