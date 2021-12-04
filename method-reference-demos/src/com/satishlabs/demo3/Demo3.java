package com.satishlabs.demo3;

public class Demo3 {
	public static void main(String[] args) {
		//3
		Hello h1 = (a,b,c,d)->{
			Course mycourse = new Course(a, b, c, d);
			return mycourse;
		};
		
		Course cou1 = h1.test(101, "JDK8", 300, "Satish");
		System.out.println("Course - 1 :"+cou1);
		
		Hello h2 = Course::new;//No Clarity about Cons. to Invoke
		Course cou2 = h2.test(102, "SpringBoot", 400, "Test");
		System.out.println("Course - 2 :"+cou2);
	}
}
