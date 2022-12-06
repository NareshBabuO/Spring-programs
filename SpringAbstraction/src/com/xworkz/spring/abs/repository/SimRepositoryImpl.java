package com.xworkz.spring.abs.repository;

import com.xworkz.spring.abs.dto.SimDTO;

public class SimRepositoryImpl implements SimRepository {

	@Override
	public boolean Save(SimDTO dto) {
		System.out.println("Saving SimRepositoryImpl...... ");
		return true;
	}

}
