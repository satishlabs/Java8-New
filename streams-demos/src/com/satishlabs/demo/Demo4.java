package com.satishlabs.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> numList1 = Arrays.asList(1,2,3);
		List<Integer> numList2 = Arrays.asList(10,20,30);
		
		List<List<Integer>> myList = Arrays.asList(numList1,numList2);
		myList.stream()
			.forEach(System.out::println);
		System.out.println("-------------------------------");
		
		myList.parallelStream()
			.map(Collection::stream)
			.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		
		myList.parallelStream()
			.map(Collection::stream)
			.flatMap(input -> input)
			.forEach(System.out::println);
	}
}
