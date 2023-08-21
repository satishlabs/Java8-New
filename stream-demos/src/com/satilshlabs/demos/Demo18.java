package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;



public class Demo18 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,4,8,3,6,7,2,9);
		Set<Integer> numSet1 = numList.stream()
				.filter(num->num%2==0)
				.map(num->num*num)
				.sorted()
				.collect(Collectors.toSet());
		System.out.println(numSet1);
		System.out.println("-------------------------");
		
		Set<Integer> numSet2 = numList.stream()
				.filter(num->num%2==0)
				.map(num->num*num)
				.sorted()
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(numSet2);
		
	}
}
