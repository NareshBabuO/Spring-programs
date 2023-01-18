package com.xworkz.java.string.programs;

public class Duplicate_String {

	public static void main(String[] args) {

		String str = "Characters";// is declared and initialized with string
		int cnt = 0;// is declared and initialized with value 0
		// cnt will count the number of character-duplication found in the given string

		char[] inp = str.toCharArray();
		// is used to convert the given string to character array with the name inp
		// using the predefined method toCharArray().

		System.out.println("Duplicate Characters are:");

		for (int i = 0; i < str.length(); i++)
		// for loop is implemented which will iterate from zero till string length.
		//

		{

			for (int j = i + 1; j < str.length(); j++)
			// Another nested for loop has to be implemented which will count from i+1 till
			// length of string.

			{
				if (inp[i] == inp[j])
				// you have to use an if condition which will check whether inp[i] is equal to
				// inp[j] or not.
				{
					System.out.println(inp[j]);
					cnt++;// If the condition becomes true prints inp[j], s single incrementation of
							// variable

					break;// break statement will be encountered which will move the execution out of the
							// loop.

				}
			}
		}

	}

}
