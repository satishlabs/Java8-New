package com.demo2;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo6 {
	public static void main(String[] args) {
		//Optional with ofNullable() method
		String str= "Satish Prasad";
		//String str= null;
		Optional<String> myopts = Optional.ofNullable(str);
	
		if(myopts.isPresent()) {
			System.out.println("5. "+myopts.get());
		}
		
		myopts.ifPresent(input -> System.out.println(input));
		
		if(myopts.isPresent()) {
			System.out.println("6. "+myopts.get().toUpperCase());
		}
		Consumer<String> myconsumer = (input)->System.out.println(input.toUpperCase());
		myopts.ifPresent(myconsumer);
		
		System.out.println("----------------------------------------------");
		
		
		myopts.ifPresent(input -> System.out.println(input.toUpperCase()));
		
		System.out.println("Done !!");
	}
}
