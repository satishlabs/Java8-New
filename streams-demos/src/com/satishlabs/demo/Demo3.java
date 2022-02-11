package com.satishlabs.demo;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("------------------------------");
		numList.stream().forEach(System.out::println);
		
		
		System.out.println("------------------------------");
		
		numList.parallelStream()//1
				.forEach(System.out::println);//3
		
		
	}
}
