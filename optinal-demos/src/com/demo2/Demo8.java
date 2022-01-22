package com.demo2;

import java.util.Optional;

/*
 map()
 ..................
 Case1: Optional Object is Empty
 ---------------------------
 =>Map Function Logic will not run
 =>Return Empty Optinal Object
 
 
 Case2: Optional Object is Not Empty
 ------------------------------------
 =>Map Function Logic will run
 =>Map Function returns the Transformed value
 =>Return Optional Object created with Transformed value
 * */


public class Demo8 {
	public static void main(String[] args) {
		
		String str1= "Satish Prasad";
		Optional<String> myopts1 = Optional.ofNullable(str1);
		System.out.println("1. "+myopts1);
		
		Optional<String> myopts2 = myopts1.map(input -> input);
		System.out.println("2. "+myopts2);
		
		Optional<String> myopts3 = myopts1.map(input -> input.toUpperCase());
		System.out.println("3. "+myopts3);
		
		Optional<String> myopts4 = myopts3.map(input -> new StringBuilder(input).reverse().toString());
		System.out.println("4. "+myopts4);
		
		String mystr = null;
		Optional<String> myopts5 = Optional.ofNullable(mystr);
		System.out.println("5. "+myopts5);
		
		Optional<String> myopts6 = myopts5.map(input ->input.toUpperCase());
		System.out.println("6. "+myopts6);
		
		System.out.println("Done!!");
	}
}
