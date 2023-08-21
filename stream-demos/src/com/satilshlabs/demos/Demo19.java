package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Demo19 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		long count = numList.stream()
						.filter(num->num%2!=0)
						.collect(Collectors.counting());
		System.out.println(count);
		System.out.println("-------------------------");
		
		long sumResult = numList.stream()
				.filter(num ->num%2!=0)
				.collect(Collectors.reducing(0,(num1,num2)->num1+num2));
		System.out.println(sumResult);
		System.out.println("-------------------------");
		
		long mulResult = numList.stream()
				.filter(num->num%2!=0)
				.collect(Collectors.reducing(1,(num1,num2)->num1*num2));
		System.out.println(mulResult);
		System.out.println("-------------------------");
		
		List<String> courseList = Arrays.asList("Java","SpringBoot","DevOps");
		String result = courseList.stream()
					.collect(Collectors.joining("---"));
		System.out.println(result);
		
		
	}
}
