package com.demo2;

public interface B {
	default void show() {
		System.out.println("B - Show() ");
	}
}
