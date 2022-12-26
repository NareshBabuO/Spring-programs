package com.xworkz.spring.server.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.server.dto.TempleDTO;

public interface TempleService {

	boolean ValidateAndSave(TempleDTO dto);

	default Optional<List<TempleDTO>> findByGod(String god)
	{
		return Optional.empty();
	}
}
