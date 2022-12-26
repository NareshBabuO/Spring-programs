package com.xworkz.spring.server.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.server.dto.BikeDTO;

public interface BikeService {
	
	boolean ValidateAndSave(BikeDTO dto);
	
	default Optional<List<BikeDTO>> findByBrand(String brand) {
		return Optional.empty();
	}

}
