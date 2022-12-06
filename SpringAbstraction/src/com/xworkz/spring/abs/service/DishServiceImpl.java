package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DishEntity;
import com.xworkz.spring.abs.repository.DishRepository;

@Component
public class DishServiceImpl implements DishService {

	@Autowired
	@Qualifier("dishRepository")
	DishRepository repo;

	@Override
	public boolean ValidateAndSave(DishEntity entity) {
		System.out.println("Validating and Saving methods in ServiceImpl....");
		// TODO Auto-generated method stub
		repo.Save(entity);
		return false;
	}

}
