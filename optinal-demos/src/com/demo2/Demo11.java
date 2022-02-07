package com.demo2;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Demo11 {
	public static void main(String[] args) {
		String str1 ="Satish";
		Optional<String> myopts = Optional.ofNullable(str1);
		System.out.println("1. "+myopts);
		System.out.println("2. "+myopts.orElse("Hello Guys!"));
		//System.out.println("3. "+myopts.orElseGet("Hello Satish"));
		//System.out.println("3. "+myopts.orElseGet(()->"Ok Guys!"));// Ok Guys!
		System.out.println("3. "+myopts.orElseGet(()->{
			System.out.println("OK OK");
			System.out.println("OK OK");
			return "Ok Guys!";
		}));
		System.out.println("4. "+myopts.orElseThrow(NoSuchElementException::new));
		
		System.out.println("------------------------------------------------");
				String str2 =null;
				 myopts = Optional.ofNullable(str2);
				System.out.println("1. "+myopts);
				System.out.println("2. "+myopts.orElse("Hello Guys!"));
				//System.out.println("3. "+myopts.orElseGet("Hello Satish"));
				//System.out.println("3. "+myopts.orElseGet(()->"Ok Guys!"));// Ok Guys!
				System.out.println("3. "+myopts.orElseGet(()->{
					System.out.println("OK OK");
					System.out.println("OK OK");
					return "Ok Guys!";
				}));
				System.out.println("4. "+myopts.orElseThrow(NoSuchElementException::new));
	}
}
