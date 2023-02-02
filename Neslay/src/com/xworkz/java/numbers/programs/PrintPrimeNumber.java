package com.xworkz.java.numbers.programs;

public class PrintPrimeNumber {

	public static void main(String[] args) {

		int count = 0;
		System.out.println("Prime numbers between 500 to 9600:");
		for (int i = 500; i <= 9600; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("totol count between 500 and 9600 is " + count);
	}
}