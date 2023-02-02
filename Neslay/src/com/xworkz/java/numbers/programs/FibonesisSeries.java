package com.xworkz.java.numbers.programs;

public class FibonesisSeries {

	public static void main(String[] args) {

		int n1 = 1, n2 = 2, n3, i, count = 15;

		System.out.println("The FibonesisSeries are ="+n1);
		System.out.println("The FibonesisSeries are ="+n2);
		for (i = 2; i < count; ++i) {
			{
				n3 = n1 + n2;
				System.out.println("The FibonesisSeries are =" + n3);
				n1 = n2;
				n2 = n3;
			}
		}
	}

}