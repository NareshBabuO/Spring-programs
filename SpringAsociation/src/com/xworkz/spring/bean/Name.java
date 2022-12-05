package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Name {

	@Value("Raja")
	private String firstName;
	@Value("NaraShimha")
	private String middleName;
	@Value("Chola")
	private String lastName;

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}

}
