package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class Demo17 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,4,8,3,6,7,2,9);
		List<Integer> numList1 = numList.stream()
				.filter(num->num%2==0)
				.map(num->num*num)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(numList1);
		System.out.println("-------------------------");
		
		List<Integer> numList2 = numList.stream()
				.filter(num->num%2==0)
				.map(num->num*num)
				.sorted()
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(numList2);
		
	}
}
