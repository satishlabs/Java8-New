package com.satishlabs.binaryoperator.demos;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Demo14 {
	public static void main(String[] args) {
		BiFunction<String, String, String> fun1 = (input1,input2)->input1+input2;
		String out1 = fun1.apply("out1 : ", "Satish Prasad");
		System.out.println(out1);
		
		//
		BinaryOperator<String> binary1 = (input1,input2)->input1+input2;
		String out2 = binary1.apply("out2 : ", "Satish Prasad");
		System.out.println(out2);
		
		BiFunction<Integer, Integer, Integer> fun2 = (num1,num2)->num1*num2;
		System.out.println(fun2.apply(12, 12));
		
		BinaryOperator<Integer> binary2 = (num1,num2)->num1*num2;
		System.out.println(binary2.apply(10, 11));
	}
}
