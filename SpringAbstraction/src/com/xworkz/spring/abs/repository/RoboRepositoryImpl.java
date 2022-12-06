package com.xworkz.spring.abs.repository;

import com.xworkz.spring.abs.dto.RoboDTO;

public class RoboRepositoryImpl implements RoboRepository {

	@Override
	public boolean Save(RoboDTO dto) {
		System.out.println("Saving RoboRepositoryImpl.....");
		return true;
	}

}
