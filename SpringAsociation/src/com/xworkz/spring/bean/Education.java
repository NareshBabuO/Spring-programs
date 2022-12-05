package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Education {

	@Value("1610156")
	private int id;
	@Value("Tumkur University")
	private String university;
	@Value("PMSc")
	private String branch;
	@Value("Tumkur")
	private String place;
	@Value("1997")
	private int year;
	@Value("0")
	private int backlog;

	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", place=" + place
				+ ", year=" + year + ", backlog=" + backlog + "]";
	}

}
