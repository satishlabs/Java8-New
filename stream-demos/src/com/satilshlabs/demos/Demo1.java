package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
 java.util.stream is not same as java.io
 Streams are to process Collection Of Elements (Arrays,Collections)
 3 Operators to Do On Streams
 ----------------
 1. Create Stream Object
 2. Perform zero to more Intermediate Operations
 3. Perform one Terminal Operation
 
 Stream doesn't store data
 * 
 * */

public class Demo1 {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> mystream = numsList.stream(); // 1
		Stream<Integer> oddStream = mystream.filter(num -> num % 2 != 0); // 2
		Stream<Integer> squareSteam = oddStream.map(num -> num * num); // 3
		squareSteam.forEach(System.out::println);

		System.out.println("-------------------");
		numsList.stream().filter(num -> num % 2 == 0)
				.map(num -> num * num)
				.forEach(System.out::println);
	}
}
