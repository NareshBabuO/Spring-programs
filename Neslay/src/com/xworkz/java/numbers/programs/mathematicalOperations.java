package com.xworkz.java.numbers.programs;

import java.util.Scanner;

public class mathematicalOperations {

	public static void main(String args[]) {

		int first, second, add, sub, multi;
		float devide;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 2 Numbers:");

		first = scanner.nextInt();
		second = scanner.nextInt();

		add = first + second;
		sub = first - second;
		multi = first * second;
		devide = (float) first / second;

		System.out.println("Addtion is:" + add);
		System.out.println("Difference  is:" + sub);
		System.out.println("Multiplication = " + multi);
		System.out.println("Division = " + devide);

	}

}
