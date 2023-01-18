package com.xworkz.java.numbers.programs;

public class FindFactorial {

	public static void main(String[] args) {

		int number = 4;
		int factorial = number;
//the county variable 'i' is initialized as number-1, and the loop will continue till (i>1).
		for (int i = (number - 1); i > 1; i--)
		// the loop will decrement and comes to 1.(i--)
		{
			
			//the factorial taking one value of 'i' at a time within the loop and 
			//storing them back in the 'factorial' variable
			factorial = factorial * i;
		}
		System.out.println("Factorial of" + number + "is:" + factorial);
	}

}
