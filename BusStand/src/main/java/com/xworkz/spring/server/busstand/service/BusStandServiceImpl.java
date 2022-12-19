package com.xworkz.spring.server.busstand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.busstand.dto.BusStandDTO;
import com.xworkz.spring.server.busstand.repo.*;

@Component
public class BusStandServiceImpl implements BusStandService {

	@Autowired
	private BusStandRepo repo;

	@Override
	public boolean ValidateAndSave(BusStandDTO dto) {
		System.out.println("ValidateAndSave method in BusStandServiceImpl");
		//call other method to validate email
		return this.repo.Save(dto);
	}

	@Override
	public Optional<List<BusStandDTO>> findByLocation(String location) {
		return this.repo.findByLocation(location);
	}

}
