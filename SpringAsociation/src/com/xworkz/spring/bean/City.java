package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class City {

	@Autowired
	private Name name;
	
	@Value("Jammu")
	private String capital;

	@Override
	public String toString() {
		return "City [name=" + name + ", capital=" + capital + "]";
	}
	
	
	
	
}
