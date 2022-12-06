package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.HelmetEntity;
import com.xworkz.spring.abs.repository.HelmetRepository;

@Component
public class HelmetServiceImpl implements HelmetService {

	@Autowired
	@Qualifier("helmetRepository")
	HelmetRepository repo;

	@Override
	public boolean ValidateAndSave(HelmetEntity entity) {
		System.out.println("Validating and Saving the Methods ....");
		repo.Save(entity);
		return true;
	}

}
