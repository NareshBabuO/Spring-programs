package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	@Value("50000")
	private int gross;

	@Value("450000")
	private double net;

	@Value("false")
	private boolean pt;

	@Value("8000")
	private int pf;

	@Value("60000")
	private int bonaus;

	@Value("false")
	private boolean hra;

	@Value("false")
	private boolean ot;

	@Value("false")
	private boolean variable;

	@Override
	public String toString() {
		return "Salary [gross=" + gross + ", net=" + net + ", pt=" + pt + ", pf=" + pf + ", bonaus=" + bonaus + ", hra="
				+ hra + ", ot=" + ot + ", variable=" + variable + "]";
	}
	
	
}
