package com.xworkz.java.string.programs;

import java.util.HashMap;

public class countNoInWord {

	public static void main(String[] args) {

		String st = "This is program to count total words in a String";
		String[] split = st.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}
