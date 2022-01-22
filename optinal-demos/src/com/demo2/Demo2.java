package com.demo2;

import java.util.Optional;

public class Demo2 {
	public static void main(String[] args) {
		//of() mehtod of Optional
		String str = "Satish Prasad";
		Optional<String> myopts = Optional.of(str);
		
		System.out.println("1. "+myopts);
		System.out.println("2. "+myopts.orElse("Hello Guys!"));
		System.out.println("3. "+myopts);
		System.out.println("4. "+myopts.isPresent());
		
		if(myopts.isPresent()) {
			System.out.println("5. "+myopts.get());
		}else {
			System.out.println("6. No Value found");
		}
	}
}
