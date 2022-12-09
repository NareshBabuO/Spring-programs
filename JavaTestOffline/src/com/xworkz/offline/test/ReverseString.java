package com.xworkz.offline.test;

public class ReverseString {

	public static void main(String[] args) {

		String input = "getting good at coding needs a lot of practice";
		String reverse = "";

		char ch;

		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}

}
