package com.xworkz.java.string.programs;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {

		//Scanner class and its functions are used to obtain inputs,
	      
		Scanner obj = new Scanner(System.in); /* create a object */

		System.out.println("Enter String here :");/* Taking user input */

		String line = obj.nextLine();// past the current line and returns the input

		String replaceAll = line.replaceAll("\\s", ""); /* Check and remove all spaces. */
		//and println() function is used to print on the screen.
		System.out.println("After removing space from String :" + replaceAll);

	}

}
