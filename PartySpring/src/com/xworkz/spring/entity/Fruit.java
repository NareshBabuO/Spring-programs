package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Fruit {

	public Fruit() {
		System.out.println(getClass().getSimpleName());
	}
	
	public void sweet() {
		System.out.println("apple is very sweet");
	}
}
