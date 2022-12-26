package com.xworkz.spring.server.repository;

import java.util.Optional;

import java.util.List;

import com.xworkz.spring.server.dto.TempleDTO;

public interface TempleRepo {

	boolean Save(TempleDTO dto);

	default Optional<List<TempleDTO>> findByGod(String god) {
		return Optional.empty();
	}

}
