package com.demo2;

public interface A {
	default void show() {
		System.out.println("A - show()");
	}
}
