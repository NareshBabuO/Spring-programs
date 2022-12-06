package com.xworkz.spring.abs.service;

import com.xworkz.spring.abs.dto.AtmDTO;
import com.xworkz.spring.abs.repository.AtmRepository;

public class AtmServiceImpl implements AtmService {

	private AtmRepository amtRepository;



	@Override
	public boolean ValidateAndSave(AtmDTO dto) {
		System.out.println("Checking ServiceImplentation");
		return true;
	}

}
