package com.satilshlabs.demos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class MyNumComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		return num1-num2;
	}
	
}

public class Demo15 {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(2,3,6,4,5,9,7,8,5);
		mylist.stream()
			.filter(num->num%2!=0)
			//.map(num->num*num)
			.forEach(System.out::println);
		System.out.println("-------------------------");
		
		long count = mylist.stream()
					.filter(num->num%2!=0)
					//.map(num->num*num)
					.count();
		System.out.println(count);
		System.out.println("-------------------------");
		Optional<Integer> maxNum = mylist.stream()
					.filter(num->num%2!=0)
					//.map(num->num*num)
					.max(new MyNumComparator());
		System.out.println(maxNum);
		maxNum.ifPresent(System.out::println);
		System.out.println("-------------------------");
		Optional<Integer> maxNum1 = mylist.stream()
				.filter(num->num%2!=0)
				//.map(num->num*num)
				.max((num1,num2)->num1.compareTo(num2));
	System.out.println(maxNum1);
	maxNum1.ifPresent(System.out::println);
	System.out.println("-------------------------");
		Optional<Integer> minNum = mylist.stream()
				.filter(num->num%2!=0)
				//.map(num->num*num)
				.min((num1,num2)->num1.compareTo(num2));
		System.out.println(minNum);
		minNum.ifPresent(System.out::println);
		System.out.println("-------------------------");
	}
}
