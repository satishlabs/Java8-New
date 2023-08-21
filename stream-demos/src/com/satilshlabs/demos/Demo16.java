package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Demo16 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(11,22,33,44,55,66,77,88,99);
		Optional<Integer> mynum1 = numList.stream().findAny();
		mynum1.ifPresent(System.out::println);
		
		System.out.println("-------------------------");
		
		Optional<Integer> mynum2 = numList.stream().findFirst();
		mynum2.ifPresent(System.out::println);
		
		System.out.println("-------------------------");
		Optional<Integer> mynum3 = numList.stream().parallel().findAny();
		mynum3.ifPresent(System.out::println);
		
		System.out.println("-------------------------");
		Optional<Integer> mynum4 = numList.stream().parallel().findFirst();
		mynum4.ifPresent(System.out::println);
		
		System.out.println("-------------------------");
		
	}
}
