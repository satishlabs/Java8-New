package com.demo2;

import java.util.Optional;

public class Demo10 {
	public static void main(String[] args) {
		String str="jlc";
		Optional<Optional<Optional<String>>> myopts = Optional.of(Optional.of(Optional.of(str)));
		System.out.println("1. "+myopts);
		Optional<Optional<Optional<String>>> aa = myopts.map(input->input);
		System.out.println("2. "+aa);
		Optional<Optional<Optional<String>>> xx = myopts.map(input1->input1.map(input2 -> input2));
		System.out.println("3. "+xx);
		Optional<Optional<Optional<String>>> yy = myopts.map(input1->input1.map(input2 -> input2.map(input3 -> input3.toUpperCase())));
		System.out.println("4. "+yy);
		
		
		System.out.println("-----------------------------------------------");
		Optional<Optional<String>> bb = myopts.flatMap(input1->input1.map(input2->input2.map(input3->input3.toUpperCase())));
		System.out.println("5. "+bb);
		
		Optional<String> cc = myopts.flatMap(input1->input1.flatMap(input2->input2.map(input3->input3.toUpperCase())));
		System.out.println("6. "+cc);
		
		
		System.out.println("Done!!");
	}
}
