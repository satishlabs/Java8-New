package com.satishlabs.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo5 {
	public static void main(String[] args) {
		/*
		Predicate<Integer> predicate1 = (num)->{
			//System.out.println(num);
			return num%2==0;
		};
		
		
		Predicate<Integer> predicate2 = (num) ->num%2==1;
		
		*/
		
		List<Integer> myList1 = new ArrayList<Integer>();
		myList1.add(20);
		myList1.add(21);
		myList1.add(22);
		myList1.add(23);
		myList1.add(24);
		myList1.add(25);
		myList1.add(26);
		System.out.println(myList1);
		myList1.removeIf((num)->num%2==0);
		System.out.println(myList1);
		
		System.out.println("=============================");
		System.out.println();
		
		List<Integer> myList2 = new ArrayList<Integer>();
		myList2.add(20);
		myList2.add(21);
		myList2.add(22);
		myList2.add(23);
		myList2.add(24);
		myList2.add(25);
		myList2.add(26);
		System.out.println(myList2);
		myList2.removeIf((num)->num%2==1);
		System.out.println(myList2);
	}
}
