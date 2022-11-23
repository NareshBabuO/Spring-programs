package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Ant {
	
	public Ant() {
		System.out.println(getClass().getSimpleName());
	}
	
	public void surviving() {
		System.out.println("ant is surviving");
	}

}
