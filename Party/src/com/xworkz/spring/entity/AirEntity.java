package com.xworkz.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class AirEntity {

	public AirEntity() {
		System.out.println(getClass().getSimpleName());
	}

	public void wind() {
		System.out.println("creates wind");
	}

}
