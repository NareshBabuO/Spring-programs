package com.xworkz.java.numbers.programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 5852677;
		int reversedNumber = 0;
		int temp = 0;

		while (number > 0) {

			// modulus operator used to strip off the last digit
			// temp used as remainder
			temp = number % 10;

			reversedNumber = reversedNumber * 10 + temp;

			number = number / 10;
		}
		System.out.println("Reversed Number is: " + reversedNumber);

	}

}
