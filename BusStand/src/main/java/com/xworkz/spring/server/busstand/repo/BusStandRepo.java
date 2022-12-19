package com.xworkz.spring.server.busstand.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.server.busstand.dto.BusStandDTO;

public interface BusStandRepo {

	boolean Save(BusStandDTO dto);

	default Optional<List<BusStandDTO>> findByLocation(String location) {
		return Optional.empty();
	}

}
