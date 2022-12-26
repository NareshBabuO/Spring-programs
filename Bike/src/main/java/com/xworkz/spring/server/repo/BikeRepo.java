package com.xworkz.spring.server.repo;

import java.util.*;

import com.xworkz.spring.server.dto.BikeDTO;

public interface BikeRepo {

	boolean Save(BikeDTO dto);

	default Optional<List<BikeDTO>> findByBrand(String brand) {
		return Optional.empty();
	}

}
