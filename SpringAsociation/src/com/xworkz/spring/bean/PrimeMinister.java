package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {

	@Autowired
	public Name name;
	@Value("42")
	private int age;
	@Autowired
	private State state;
	@Value("Nothings")
	private String terms;
	@Autowired
	private Education education;
	@Autowired
	private Salary salary;
	@Value("KitogiroParty")
	private String party;

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", state=" + state + ", terms=" + terms + ", education="
				+ education + ", salary=" + salary + ", party=" + party + "]";
	}

}
