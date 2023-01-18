package com.xworkz.java.string.programs;

public class StringToInt {

	public static void main(String[] args) {

		String st = "1256";

		int i = Integer.parseInt(st);// Integer class has parseInt() static method
		// which is used convert string to int.

		System.out.println(st + 50);// 12350 because its concatenate to value.
		System.out.println(i + 50);// 173 because +(plus) is binary plus operator

	}

}
