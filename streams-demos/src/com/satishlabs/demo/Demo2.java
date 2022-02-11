package com.satishlabs.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Created Stream
		Stream<Integer> mystream1 = numList.stream(); //1	
		mystream1.forEach(System.out::println); //3
		//mystream.forEach(System.out::println); //Exception occured
		
		Stream<Integer> mystream2 = numList.stream(); //1	
		mystream2.forEach(System.out::println); //3
		
		
	}
}
