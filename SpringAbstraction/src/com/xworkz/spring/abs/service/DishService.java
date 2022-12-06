package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DishEntity;

@Component
public interface DishService {
	
	boolean ValidateAndSave(DishEntity entity);

}
