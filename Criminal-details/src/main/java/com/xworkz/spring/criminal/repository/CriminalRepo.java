package com.xworkz.spring.criminal.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.criminal.entity.CriminalEntity;

public interface CriminalRepo {

	boolean Save(CriminalEntity entity);

	Optional<List<CriminalEntity>> findByNameAndJailName(String name, String jailName);

}
