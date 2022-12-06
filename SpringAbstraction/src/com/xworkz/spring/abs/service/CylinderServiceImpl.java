package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.CylinderEntity;
import com.xworkz.spring.abs.repository.CylinderRepository;

@Component
public class CylinderServiceImpl implements CylinderService {
	@Autowired
	@Qualifier("cylinderRepository")
	CylinderRepository repository;

	@Override
	public boolean ValidateAndSave(CylinderEntity entity) {
		System.out.println("Saving method in Service.....");
		return true;
	}

}
