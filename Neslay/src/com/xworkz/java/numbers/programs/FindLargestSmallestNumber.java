package com.xworkz.java.numbers.programs;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {
//
//		// numbers array
//		int num[] = new int[] { 55, 32, 45, 98, 82, 11, 9, 39, 5, -52, 1, 7 };
//
//		// assign first element of an array to largest and smallest
//		//declared and initialized with the 0th index value of the array.
//		int smallest = num[0];
//		int largest = num[0];
//
//		//'for loop' is used which goes from 1 to the array length
//		for (int i = 0; i < num.length; i++) {
//
//			if (num[i] > largest)//When …. numbers[i] is greater than largest
//				largest = num[i];
//			else if (num[i] < smallest)//when numbers[i] greater than smallest
//				smallest = num[i];
//		}
//
//		System.out.println("Largest Number is : " + largest);
//		System.out.println("Smallest Number is : " + smallest);
//
//	}

		int num[] = new int[] { 30, 52, 44, 789, 156, 52 };

		int largest = num[0];
		int smalest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest)
				largest = num[i];
			else if (num[i] < smalest)
				smalest = num[i];
		}
		System.out.println("The Largest element is :" + largest);
		System.out.println("The Largest element is :" + smalest);

	}

}
