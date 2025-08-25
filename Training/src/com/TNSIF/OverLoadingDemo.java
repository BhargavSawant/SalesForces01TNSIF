package com.TNSIF;

public class OverLoadingDemo {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(1, 6, 0));
		System.out.println(c.add(1, 2, 3));
	}
}
