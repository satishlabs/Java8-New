package com.satishlabs.demo5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MyNumber{
	public static boolean isEven(int num) {
		if(num%2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int num) {
		if(num%2 != 0)
			return true;
		else
			return false;
	}
}
public class Demo5 {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(30);
		myList.add(10);
		myList.add(51);
		myList.add(20);
		myList.add(43);
		
		
		
		
		System.out.println("----------IsEven---------------");
		myList.stream()
			.filter(MyNumber::isEven)
				.forEach(System.out::println);
		
		System.out.println("----------IsOdd--------------");
		myList.stream()
		.filter(MyNumber::isOdd)
			.forEach(System.out::println);
		
		System.out.println("----------IsEven With Lambda---------------");
		myList.stream().filter(a -> a%2 ==0).forEach(System.out::println);
		
		System.out.println("----------IsOdd With Lambda--------------");
		myList.stream().filter(a -> a%2 !=0).forEach(System.out::println);
	}
}
