package com.xworkz.java.numbers.programs;

import java.util.Scanner;

import java.util.Scanner;

public class CountPrimeNumber {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 500; i <= 9600; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println("totol count between 500 and 9600 is " + count);
	}
}

/*
 * }
 * 
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Enter the first number : "); int first = scan.nextInt();
 * int first2 = first; System.out.print("Enter the Last number : "); int last =
 * scan.nextInt();
 * 
 * int count = 0;
 * 
 * while (first <= last) { int i = 2;
 * 
 * while (i <= first) { if (first % i == 0) { break; } i++; } if (i == first) {
 * // System.out.println(i); count++; } first++; }
 * System.out.println("Count of prime number between " + first2 + "and " + last
 * + "is:" + count);
 * 
 * }
 */
