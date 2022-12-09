package com.xworkz.offline.test;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String[] input = new String[] { "Hello", "hi", "Wow", "cute", "thanks", "hi", "Aww", "cute", "baby", "beloved",
				"Aww" };

		TreeSet<String> dupliCheckr = new TreeSet<String>();

		for (String element : input) {

			if (!dupliCheckr.add(element)) {

			}
		}

		int length = dupliCheckr.size();

		input = dupliCheckr.toArray(input);

		for (int i = length; i < input.length; i++)
			input[i] = null;

		System.out.println("Output : : " + Arrays.toString(input));

	}
}
