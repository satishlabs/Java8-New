package com.satishlabs.function.demos;

import java.util.function.Function;

public class Demo9 {
	public static void main(String[] args) {
		Function<String, String> fun1 = (input)->input.toUpperCase();
		String out1 = fun1.apply("Satish Prasad");
		System.out.println(out1);
		
		Function<String, Integer> fun2 = (input) -> Integer.parseInt(input);
		Integer out2 = fun2.apply("102");
		System.out.println(out2);
		
		Function<Integer, String> fun3 = (input) -> String.valueOf(input);
		String out3 = fun3.apply(99);
		System.out.println(out3);
		
		
	}
}
