package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class State {

	@Autowired
	private Name name;
	@Value("71122487")
	private double poulation;
	@Value("Mysore")
	private String capitalCity;
	@Value("32")
	private int noOfDistrict;
	@Value("Shimhadri")
	private String area;
	@Value("Raja Narashimha")
	private String cmName;
	@Value("Kabanada")
	private String primaryLanguage;

	@Override
	public String toString() {
		return "State [name=" + name + ", poulation=" + poulation + ", capitalCity=" + capitalCity + ", noOfDistrict="
				+ noOfDistrict + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage=" + primaryLanguage + "]";
	}

}
