package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo14 {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1,2,3,4,5);
		int sumResult1 = numsList.stream().reduce(0, (a,b)->a+b);
		System.out.println(sumResult1);
		
		System.out.println("-------1---------");
		int sumResult2 = numsList.stream().reduce(0, Integer::sum);
		System.out.println(sumResult2);
		
		System.out.println("-------2---------");
		Optional<Integer> mysum = numsList.stream().reduce((num1,num2)->num1+num2);
		mysum.ifPresent(System.out::println);
		
		System.out.println("-------3---------");
		int sumResult3 = numsList.stream().reduce(1, (a,b)->a*b);
		System.out.println(sumResult3);
		
		System.out.println("-------4---------");
		Optional<Integer> mymul = numsList.stream().reduce((num1,num2)->num1*num2);
		mymul.ifPresent(System.out::println);
		
		System.out.println("--------5--------");
		Integer sum = numsList.stream().reduce((num1, num2)->num1+num2).orElse(-1);
		System.out.println(sum);
		
		System.out.println("--------6--------");
		Integer firstElement = numsList.stream().reduce((num1, num2)->num1).orElse(-1);
		System.out.println(firstElement);
		
		System.out.println("-------7---------");
		Integer lastElement = numsList.stream().reduce((num1, num2)->num2).orElse(-1);
		System.out.println(lastElement);

	}
}
