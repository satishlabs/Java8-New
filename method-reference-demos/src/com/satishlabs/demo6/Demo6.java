package com.satishlabs.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Demo6 {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(3);
		myList.add(1);
		myList.add(5);
		myList.add(2);
		myList.add(4);
		myList.add(7);
		myList.add(6);
		
	
		System.out.println("----------IsEven With Lambda---------------");
		myList.stream()
			.filter(a -> a%2 ==0)
				.map(x -> x*x)
					.forEach(System.out::println);
		
		System.out.println("----------IsOdd With Lambda--------------");
		myList.stream()
			.filter(a -> a%2 !=0)
				.map(x -> x*x)
					.forEach(System.out::println);
	}
}
