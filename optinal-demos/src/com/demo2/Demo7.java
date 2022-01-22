package com.demo2;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo7 {
	public static void main(String[] args) {
		//Optional with ofNullable() method
		//String str= "Satish Prasad";
		String str1= null;
		Optional<String> myopts1 = Optional.ofNullable(str1);
		
		Optional<String> myopts4 = myopts1.filter(input -> input.contains("Sat"));
		System.out.println("1. "+myopts4);
		
		String str2= "Satish Prasad";
		Optional<String> myopts2 = Optional.ofNullable(str2);
		
		Optional<String> myopts5 = myopts2.filter(input -> input.contains("Sat"));
		System.out.println("2. "+myopts5);
		
		String str3= "Srinivas Dande";
		Optional<String> myopts3 = Optional.ofNullable(str3);
		
		Optional<String> myopts6 = myopts3.filter(input -> input.contains("Sat"));
		System.out.println("3. "+myopts6);
		
		System.out.println("Done !!");
	}
}
