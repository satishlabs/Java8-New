package com.satishlabs.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo3 {
	public static void main(String[] args) {
		Predicate<Integer> predicate1 = (num) ->num%2==0;
		boolean mybool = predicate1.test(19);
		System.out.println(mybool);
		
		mybool = predicate1.test(20);
		System.out.println(mybool);
		
		
		Predicate<Integer> predicate2 = (num) ->num%2==1;
		 mybool = predicate2.test(19);
		System.out.println(mybool);
		
		mybool = predicate2.test(20);
		System.out.println(mybool);
		
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(20);
		myList.add(21);
		myList.add(22);
		myList.add(23);
		myList.add(24);
		myList.add(25);
		myList.add(26);
		
		
	}
}
