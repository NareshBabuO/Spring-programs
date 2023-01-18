package com.xworkz.java.string.programs;

public class EqualCheck {

	public static void main(String[] args) {

		String a = "AVATAR";
		String b = "avatar";

		if (a.equals(b)) // method is used to compare strings.

		{
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}

		if (a.equalsIgnoreCase(b)) // Java equalsIgnoreCase() method can ignore the case.
		{
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}

	}

}
