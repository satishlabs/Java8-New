package com.satishlabs.bifunction.demos;

import java.util.function.BiFunction;

public class Demo13 {
	public static void main(String[] args) {
		BiFunction<String, String, String> fun1 = (input1,input2) -> input1+input2;
		String out1 = fun1.apply("Hello : ", "Satish Prasad");
		System.out.println(out1);
		
		BiFunction<Integer, Integer, Integer> fun2 = (num1,num2)->num1*num2;
		System.out.println(fun2.apply(10, 7));
		
		BiFunction<Integer, Integer, String> fun3 = (num1,num2)->{
			int res1 = num1*num2;
			String str = "Result is :"+res1;
			return str;
		};
		System.out.println(fun3.apply(5, 6));
	}
}
