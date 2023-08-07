package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;

public class Demo7 {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);

		myList.stream()
				.skip(4)
				.limit(9)
				.peek(System.out::println)
				.filter(num->num%2!=0)
				.peek(System.out::println)
				.map(num->num*num)
				.forEach(System.out::println);

		System.out.println("--------------------------");
		
	}
}
