package com.satishlabs.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Hello{
	public static void show(int x) {
		System.out.println(x);
	}
}

public class Demo4 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(30);
		myList.add(10);
		myList.add(50);
		myList.add(20);
		myList.add(40);
		
		System.out.println("-----------static method Reference--------------");
		Stream<Integer> myStream = myList.stream();
		myStream.forEach(Hello::show); //static method Reference
		
		System.out.println("----------Instance method reference---------------");
		myList.stream().forEach(System.out::println); //Instance method reference
		
		System.out.println("----------Lambda Expression--------------");
		myList.stream().forEach((ele) ->System.out.println(ele)); //Lambda Expression
	}
}
