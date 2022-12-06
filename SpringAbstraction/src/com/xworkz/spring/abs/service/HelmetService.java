package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.HelmetEntity;

@Component
public interface HelmetService {
	
	 boolean ValidateAndSave(HelmetEntity entity);

}
