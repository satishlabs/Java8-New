package com.satishlabs.demo3;

import java.util.function.Predicate;

public class Demo7 {
	public static void main(String[] args) {

		Predicate<Integer> predicate1 = (num)->{
			System.out.println("Predicate 1");
			return num%2==0;
		};
		Predicate<Integer> predicate2 = (num)->{
			System.out.println("Predicate 2");
			return num%2==1;
		};
		Predicate<Integer> predicate3 = (num)->{
			System.out.println("Predicate 3");
			return num>=25 && num<=50;
		};

		//Check weather number is even and between 25 and 50
		
		boolean mybool = predicate1.and(predicate3).test(28);
		System.out.println(mybool); //T
		
		
		 mybool = predicate1.and(predicate3).test(19);
		System.out.println(mybool); //F
		
		//Check weather number is odd and between 25 and 50
		
		mybool = predicate2.and(predicate3).test(28);
		System.out.println(mybool); //T
		
		mybool = predicate2.and(predicate3).test(19);
		System.out.println(mybool); //F
		
		
		//Check weather number is odd or between 25 and 50
		mybool = predicate2.or(predicate3).test(29);
		System.out.println(mybool); //T
		
		mybool = predicate2.or(predicate3).test(28);
		System.out.println(mybool); //F
		
		mybool = predicate2.and(predicate3).test(18);
		System.out.println(mybool); //F
	}
}
