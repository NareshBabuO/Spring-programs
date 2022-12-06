package com.xworkz.spring.abs.service;

import com.xworkz.spring.abs.dto.PendriveDTO;

public class PendriveServiceIpml implements PendriveService {

	@Override
	public boolean ValidateAndSave(PendriveDTO dto) {
		System.out.println("Validating and Save in PendriveSeriveImpl...");
		return false;
	}

}
