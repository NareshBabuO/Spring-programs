package com.xworkz.java.numbers.programs;

import java.util.Scanner;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {

	public static void main(String[] args) {

		//method for reverse a number 
		public static void reverseNumber(int number) 
		{
			
			if(number<10) {
				System.out.println(number);
				return;
			}
			
			else {
				System.out.println(number %10);
				reverseNumber(number/10);
			}
		}
			public static void main(String args[])  {
				
				System.out.print("Enter the number that you want to reverse: ");  
				Scanner sc = new Scanner(System.in);  
				int num=sc.nextInt();
				System.out.print("The reverse of the given number is: ");  
				reverseNumber(num);  
				
				
				
			
		}
			

	}

	private static void reverseNumber(int num) {
		
	}

}
