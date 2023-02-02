package com.xworkz.java.numbers.programs;

import java.util.Scanner;

public class JavaSwapExample {

	public static void main(String[] args) {

		int x,y,temp;
		System.out.println("Enter x and y values to swap");
		Scanner sc= new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swaping: x="+x+"y="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swaping:x="+x+"y="+y);
		
		
	}

}
