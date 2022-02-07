package com.demo2;

import java.util.Optional;

public class Demo9 {
	public static void main(String[] args) {
		String str1="Satish";
		Optional<Optional<String>> myopts1 = Optional.of(Optional.ofNullable(str1));
		System.out.println("1. "+myopts1);
		System.out.println("2. "+myopts1.map(input->input));
		System.out.println("3. "+myopts1.flatMap(input -> input));
		
		System.out.println("-------------------------------------");
		//System.out.println("4. "+myopts1.map(input1 -> input1.map(input2 -> input2.toString())));
		Optional<Optional<String>> x = myopts1.map(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("4. "+x);
		
		Optional<String> y = myopts1.flatMap(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("5. "+y);
		//Optional<String> str = y.flatMap(input->input.toLowerCase());
		
		Optional<Optional<Optional<String>>> myopts2 = Optional.of(Optional.of(Optional.of(str1)));
		Optional<Optional<Optional<String>>> z= myopts2.map(input -> input);
		System.out.println("z "+z);
		System.out.println("Done!!");
	}
}
