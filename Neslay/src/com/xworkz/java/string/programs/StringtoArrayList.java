package com.xworkz.java.string.programs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringtoArrayList {

	public static void main(String[] args) {
		String strings = "99,42,55,81,79,64,22";
		String str[] = strings.split(",");

		List nl = new ArrayList();
		nl = Arrays.asList(str);
		for (String s : nl) {
			System.out.println(s);
		}

	}

}
