package com.xworkz.java.numbers.programs;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);//Scanner class and its function

		//We also required to create objects of Scanner class and Random class 
		// to call its functions.

		Random random = new Random();

		System.out.println("Enter max range:");

		int max = SC.nextInt();//nextInt() is used to obtain the input

		for (int loop = 1; loop <= 10; loop++) {

			System.out.println(random.nextInt(max));
		}
		/*
		 * ORRR System.out.println("===========");
		 * 
		 * int minRange = 1000, maxRange = 5000; int value = random.nextInt(maxRange -
		 * minRange) + minRange;
		 * 
		 * System.out.println(value);
		 */

	}

}
