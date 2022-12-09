package com.xworkz.offline.test;

import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfArray {

	public static void main(String[] args) {
		Integer[] a = { 1, 4, 5, 9, 10 };
		Integer[] b = { 2, 8, 6, 1, 7, 4 };

		HashSet<Integer> set = new HashSet<>();

		set.addAll(Arrays.asList(a));

		set.retainAll(Arrays.asList(b));

		// System.out.println(set);

		Integer[] intersection = {};
		intersection = set.toArray(intersection);

		System.out.println(Arrays.toString(intersection));
	}
}
