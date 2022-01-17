package com.satishlabs.unaryoperator.demos;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo12 {
	public static void main(String[] args) {
		
		Function<String, String> fun1 = (input)->input.toUpperCase();
		System.out.println(fun1.apply("Hello Guys"));
		
		UnaryOperator<String> unary1 = (input)->input.toUpperCase();
		String out1 = unary1.apply("Satish Prasad");
		System.out.println(out1);
		
		Function<Integer, Integer> fun2 = (num) ->num*2;
		System.out.println(fun2.apply(5));
		
		UnaryOperator<Integer> unary2 = (num)-> num*3;
		System.out.println(unary2.apply(5));
		
	}
}
