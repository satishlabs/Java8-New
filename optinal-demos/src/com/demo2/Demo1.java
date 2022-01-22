package com.demo2;

import java.util.Optional;

public class Demo1 {
	public static void main(String[] args) {
		//Optiona are private constructos, direct object creational is not possible
		//Optional<String> myopts = new Optional<String>();
		
		Optional<String> myopts = Optional.empty();
		System.out.println("1. "+myopts);
		System.out.println("2. "+myopts.orElse("Hello Guys"));
		System.out.println("3. "+myopts);
		System.out.println("4. "+myopts.isPresent());
		//System.out.println("5. "+myopts.get()); //Exception in thread "main" java.util.NoSuchElementException: No value present
		
		if(myopts.isPresent()) {
			System.out.println("5. "+myopts.get());
		}else {
			System.out.println("6. No value found");
		}
	}
}
