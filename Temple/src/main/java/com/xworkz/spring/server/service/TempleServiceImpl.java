package com.xworkz.spring.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.dto.TempleDTO;
import com.xworkz.spring.server.repository.TempleRepo;

@Component
public class TempleServiceImpl implements TempleService {

	@Autowired
	private TempleRepo repo;

	@Override
	public boolean ValidateAndSave(TempleDTO dto) {
		System.out.println("ValidateAndSave method ");
		return this.repo.Save(dto);
	}

	@Override
	public Optional<List<TempleDTO>> findByGod(String god) {
		return this.repo.findByGod(god);
	}

}
