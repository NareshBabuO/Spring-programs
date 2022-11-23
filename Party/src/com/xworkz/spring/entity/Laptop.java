package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	public Laptop() {
	System.out.println(getClass().getSimpleName());
	}
	
	public void use() {
		System.out.println("Laptop is good for All users ");
	}

}
