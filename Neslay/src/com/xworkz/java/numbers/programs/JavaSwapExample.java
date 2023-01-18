package com.xworkz.java.numbers.programs;

public class JavaSwapExample {

	public static void main(String[] args) {

		int x = 30;
		int y = 82;

		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		// swap the value
		swap(x, y);

	}

	private static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping");
		System.out.println("Value of x:" + x);
		System.out.println("Value of y:" + y);

	}

}
