package com.xworkz.java.string.programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "lenevo";
		String rev = "";

		System.out.println("Before Reversing String=" + string);

		for (int i = 0; i < string.length(); i++) {
			rev = string.charAt(i) + rev;
		}
		System.out.println("After Reversing String:" + rev);

	}

}
