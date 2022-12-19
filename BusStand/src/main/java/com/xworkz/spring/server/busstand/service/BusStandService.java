package com.xworkz.spring.server.busstand.service;


import java.util.List;
import java.util.Optional;

import com.xworkz.spring.server.busstand.dto.BusStandDTO;

public interface BusStandService {
	
	boolean ValidateAndSave(BusStandDTO dto);
	
	default Optional<List<BusStandDTO>> findByLocation(String location) {
		return Optional.empty();
	}

}
