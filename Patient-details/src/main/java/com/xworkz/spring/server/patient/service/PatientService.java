package com.xworkz.spring.server.patient.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.server.patient.entity.PatientEntity;

public interface PatientService {

	boolean validateAndSave(PatientEntity entity);

	default Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		return Optional.empty();
	}

	boolean findByEmail(String email);

	boolean findByMobileNo(long mobileNo);

}
