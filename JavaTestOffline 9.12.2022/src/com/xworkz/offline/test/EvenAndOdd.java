package com.xworkz.offline.test;

public class EvenAndOdd {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 9;
		int array[] = { 20, 37, 58, 69, 99, 70, 87, 18, 9 };

		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				evenSize++;
			else
				oddSize++;
		}
		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];
		int j = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				even[j++] = array[i];
			else
				odd[k++] = array[i];
		}
		System.out.print("Even Array contains: ");
		printArray(even);
		System.out.print("Odd Array contains: ");
		printArray(odd);
	}
}
