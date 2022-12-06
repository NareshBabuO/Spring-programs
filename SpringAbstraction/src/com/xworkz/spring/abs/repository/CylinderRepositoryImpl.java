package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.CylinderEntity;
@Component
public class CylinderRepositoryImpl implements CylinderRepository {

	@Override
	public boolean ValidateAndSave(CylinderEntity entity) {
		System.out.println("Validating and Saving method in Cylinder repository....");
		return true;

	}

}
