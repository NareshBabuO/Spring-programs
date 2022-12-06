package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.CylinderEntity;

@Component
public interface CylinderService {

	boolean ValidateAndSave(CylinderEntity entity);

}
