package com.demo3;

public class Demo3 {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.test();
		
		//1.
		//A aobj = null;
		//aobj.m1();
		
		Hello hello1 = new Hello();
		hello1.show();
		
		//2.
		//A aobj = new Hello();
		//aobj.m1();
		
		
		Hello hello2=new Hello();
		hello2.show();
		
		A.m1();
		Hello.show();
	}
}
