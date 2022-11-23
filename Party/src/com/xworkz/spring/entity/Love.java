package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Love {
	
	public Love() {
		System.out.println(getClass().getSimpleName());
	}
	
	public void injury() {
		System.out.println("Love is Injurius to Heart");
	}

}
