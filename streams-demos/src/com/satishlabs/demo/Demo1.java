package com.satishlabs.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Created Stream
		Stream<Integer> mystream = numList.stream(); //1
		
		//Applyed Intermediate Operation
		Stream<Integer> oddStream = mystream.filter(num -> num%2 != 0); //2
		Stream<Integer> squerStream = oddStream.map(num -> num*num);//2
		
		squerStream.forEach(System.out::println); //3
		
		
	}
}
