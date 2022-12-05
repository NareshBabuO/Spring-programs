package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {
	@Autowired
	private Name name;
	@Value("35")
	private int age;
	@Autowired
	private Salary salary;
	@Value("3")
	private int experence;
	@Autowired
	private Education education;

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", salary=" + salary + ", experence=" + experence
				+ ", education=" + education + "]";
	}

}
