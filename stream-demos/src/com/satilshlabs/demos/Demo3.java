package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> mystream1 = numsList.stream(); // 1
		mystream1.forEach(System.out::println);

		System.out.println("--------------------------");
		Stream<Integer> mystream2 = numsList.parallelStream(); // 1
		mystream2.forEach(System.out::println);

	}
}
