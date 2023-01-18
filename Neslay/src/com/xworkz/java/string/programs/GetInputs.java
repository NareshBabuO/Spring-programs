package com.xworkz.java.string.programs;

import java.util.Scanner;

public class GetInputs {

	public static void main(String args[]) {

		int a;
		float b;
		String c;

		Scanner s = new Scanner(System.in);// The System class contains several useful class fields and methods

		

		System.out.println("Enter a string:");
		c = s.nextLine(); /*function for string input. && Take string input and assign to variable */
		System.out.println("The Entered String is :" + c); /* Print */
		
		
		System.out.println("Enter a Integer:");
		a = s.nextInt();/* Take integer input and assign to variable */
		System.out.println("Entered Int is :" + a);

		System.out.println("Enter a float:");
		b = s.nextFloat(); /* Take float input and assign to variable */
		System.out.println("You entered float " + b); /* Print */

	}

}
