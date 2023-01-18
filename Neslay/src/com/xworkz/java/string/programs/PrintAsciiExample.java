package com.xworkz.java.string.programs;

public class PrintAsciiExample {

	public static void main(String[] args) {

		char ch = 'G';// Define the character whose ASCII value is to be found
		int ascii = ch;// Assign the character value to integer

		System.out.println("The ASCII value of character '" + ch + "' is: " + ascii);

		// Casting (character to integer)
		// int cast = (int) ch;

		// System.out.println("The ASCII value of character '" + ch + "' is: " + cast);

	}

}

//First, a character is defined using single quotes and assigned to an integer;
//In this way, Java automatically converts the character value to an ASCII value.
//Next, we cast the character ch variable to an integer using (int).
//Casting is the way of converting a variable type to another type.