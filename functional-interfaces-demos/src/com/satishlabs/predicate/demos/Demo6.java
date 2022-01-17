package com.satishlabs.predicate.demos;

import java.util.function.Predicate;

public class Demo6 {
	public static void main(String[] args) {
		Predicate<String> predicate1 = Predicate.isEqual("Hello Guys");
		boolean myvalue =  predicate1.test("Hello Guys");
		System.out.println(myvalue);
		
		myvalue =  predicate1.test("Hai Guys");
		System.out.println(myvalue);
		
		System.out.println();
		System.out.println("=====================================");
		
		
		Predicate<Integer> predicate2 = Predicate.isEqual(99);
		 myvalue =  predicate2.test(99);
		System.out.println(myvalue);
		
		myvalue =  predicate2.test(57);
		System.out.println(myvalue);
		
		System.out.println();
		System.out.println("=====================================");
		
		Predicate<Integer> predicate3 = (num)->num%2==0;
		Predicate<Integer> predicate4 = (num)->num%2==1;
		boolean mybool = predicate3.test(28);
		System.out.println(mybool);
		mybool = predicate3.negate().test(28);
		System.out.println(mybool);
	}
}
