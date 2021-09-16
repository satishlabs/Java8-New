package com.demo2;

public class Demo2 {
	public static void main(String[] args) {
		Hello h1 = (name)->{
			System.out.println("Hello : "+name+" -> Welcome to Lambda World");
		};
		h1.display("Satish");
		
		Hello h2 = (name)->System.out.println("Hello : "+name+" -> Welcome to Lambda World!");
		
		h2.display("Manish");
		
		Hello h3 = name ->System.out.println("Hello : "+name+"-> Welcome to Lambda World!!");
		h3.display("Kaushik");
	}
}
