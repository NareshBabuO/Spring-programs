package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.CylinderEntity;

@Component
public interface CylinderRepository {
	
	boolean ValidateAndSave(CylinderEntity entity);

}
