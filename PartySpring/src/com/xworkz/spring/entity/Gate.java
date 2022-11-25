package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Gate {

	public Gate() {
		System.out.println(getClass().getSimpleName());
	}

	public void security() {
		System.out.println("provides security");
	}

}
