package com.satishlabs.supplier.demos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Demo16 {
	public static void main(String[] args) {
		Supplier<String> supplier1 = ()->"Hello Guys, How are you!";
		String str1 = supplier1.get();
		System.out.println(str1);
		
		Supplier<Integer> supplier2 = ()->LocalDate.now().getDayOfMonth();
		System.out.println(supplier2.get());
		
		Supplier<DayOfWeek> supplier3 = ()->LocalDate.now().getDayOfWeek();
		DayOfWeek dow = supplier3.get();
		System.out.println(dow);
		System.out.println(dow.getValue());
		System.out.println(dow.getDeclaringClass());
	}
}
