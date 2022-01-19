package com.satishlabs.consumer.demos;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo15 {
	public static void main(String[] args) {
		//Consumer<String> fun1 = (input)->input.toUpperCase();
		//String out1 = fun1.accept("Hello Satish");
		
		Consumer<String> consumer1 = (input)->System.out.println(input.toUpperCase());
		consumer1.accept("Hello Satish");
		consumer1.accept("Test1");
		consumer1.accept("Consumer Test");
		
		
		//Bi-Consumer
		BiConsumer<String, String> consumer2 = (input1,input2)->System.out.println(input1.toUpperCase()+input2);
		consumer2.accept("Hello : ", "Satish Prasad");
		consumer2.accept("BiConsumer : ", "Test");
		
	}
}
