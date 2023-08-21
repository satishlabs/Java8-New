package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3);
		Stream<Integer> mystream1 = numsList.stream(); // 1
		mystream1.forEach(System.out::println);
		
		//You can traverse the Stream only once wiht one Terminal Operation
		
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//mystream.forEach(System.out::println);
		
		System.out.println("--------------------------");
		Stream<Integer> mystream2 = numsList.stream(); // 1
		mystream2.forEach(System.out::println);
		
		System.out.println("--------------------------");
		Stream<Integer> mystream3 = numsList.stream(); // 1
		mystream3.forEach(System.out::println);
		
	}
}
