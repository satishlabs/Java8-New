package com.satishlabs.bipredicate.demos;

import java.util.function.BiPredicate;

public class Demo8 {
	public static void main(String[] args) {

		BiPredicate<Integer,Integer> predicate1 = (num1,num2)->num1>num2;

		boolean mybool = predicate1.test(13, 21);
		System.out.println(mybool);

		BiPredicate<Integer,Integer> predicate2 = (num1,num2)->num1<num2;
		mybool = predicate2.test(13, 21);
		System.out.println(mybool);
		
		
		
	}
}
