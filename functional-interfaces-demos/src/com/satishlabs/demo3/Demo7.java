package com.satishlabs.demo3;

import java.util.function.Predicate;

public class Demo7 {
	public static void main(String[] args) {
		Predicate<Integer> predicate1 = (num)->num%2==0;
		Predicate<Integer> predicate2 = (num)->num%2==1;
		boolean mybool = predicate1.test(28);
		System.out.println(mybool);
		mybool = predicate1.negate().test(28);
		System.out.println(mybool);
	}
}
