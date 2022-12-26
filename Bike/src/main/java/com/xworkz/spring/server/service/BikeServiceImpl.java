package com.xworkz.spring.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.dto.BikeDTO;
import com.xworkz.spring.server.repo.BikeRepo;

@Component
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepo repo;

	@Override
	public boolean ValidateAndSave(BikeDTO dto) {
		System.out.println("ValidateAndSave method in BikeServiceImpl");
		return this.repo.Save(dto);
	}

	@Override
	public Optional<List<BikeDTO>> findByBrand(String brand) {
		System.out.println("findByBrand in BikeServiceImpl");
		return BikeService.super.findByBrand(brand);
	}

}
