package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;

public class Demo5 {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		myList.stream()
				.forEach(System.out::println);

		System.out.println("--------------------------");
		myList.stream()
				.limit(10)
				.forEach(System.out::println);

		System.out.println("--------------------------");
		myList.stream()
				.limit(10)
				.filter(num->num%2!=0)
				.map(num->num*num)
				.forEach(System.out::println);

		System.out.println("--------------------------");
		
	}
}
