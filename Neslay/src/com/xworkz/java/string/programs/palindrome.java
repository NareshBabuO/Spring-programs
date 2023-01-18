package com.xworkz.java.string.programs;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		// Initializing an empty string to store the reverse
		// of the original str

		// String str, rev = "";
		// Scanner class and its functions are used to obtain inputs,
		// and println() function is used to print on the screen.

		String str, rev = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String to Check Palindrome :");
		str = sc.nextLine();

		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
			
			rev = rev + str.charAt(i);

		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str+"is not palindrome");
		}

	}

}
