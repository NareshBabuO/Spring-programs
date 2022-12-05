package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritory {

	@Autowired
	private Name name;

	@Value("8")
	private int area;

	@Value("Chikkana")
	private String governarName;

	@Value("3.80")
	private double population;

	@Override
	public String toString() {
		return "UnionTerritory [name=" + name + ", area=" + area + ", governarName=" + governarName + ", population="
				+ population + "]";
	}

}
