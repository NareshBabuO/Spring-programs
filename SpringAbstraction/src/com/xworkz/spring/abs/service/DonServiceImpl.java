package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DonEntity;
import com.xworkz.spring.abs.repository.DonRepository;

@Component
public class DonServiceImpl implements DonService {

	@Autowired
	@Qualifier("donRepository")
	DonRepository repo;

	@Override
	public boolean ValidateAndSave(DonEntity entity) {
		System.out.println("Validating and Saving method in DonSerivce....");
		repo.Save(entity);
		return true;
	}

}
