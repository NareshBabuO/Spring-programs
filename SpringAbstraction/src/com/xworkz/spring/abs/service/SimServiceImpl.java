package com.xworkz.spring.abs.service;

import com.xworkz.spring.abs.dto.SimDTO;

public class SimServiceImpl implements SimService {

	@Override
	public boolean ValidateAndSAve(SimDTO dto) {
		System.out.println("Validating in SimServiceImpl...");
		return true;
	}

}
