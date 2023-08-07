package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);

		List<Integer> list2 = Arrays.asList(10, 20, 30);

		List<List<Integer>> myList = Arrays.asList(list1, list2);

		myList.stream()
				.forEach(System.out::println);

		System.out.println("--------------------------");

		myList.stream()
				.map(input -> input)// Map function will be called two times for list1 and list2
				.forEach(System.out::println);

		System.out.println("--------------------------");

		myList.stream()
				.map(Collection::stream)
				.forEach(System.out::println);

		System.out.println("--------------------------");
		
		myList.stream()
				.map(Collection::stream)
				.flatMap(input->input)
				.forEach(System.out::println);

		System.out.println("--------------------------");

	}
}
