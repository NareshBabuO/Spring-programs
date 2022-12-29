package com.xworkz.spring.criminal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.criminal.entity.CriminalEntity;

public interface CriminalService {

	boolean ValidateAndSave(CriminalEntity entity);

	Optional<List<CriminalEntity>> findByNameAndJailName(String name, String jailName);

}
