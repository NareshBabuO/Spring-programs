package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DishEntity;
@Component
public class DishRepositoryimpl implements DishRepository {

	@Override
	public boolean Save(DishEntity entity) {
		// TODO Auto-generated method stub
		 System.out.println("Saving method in Repository.............");
		return false;
	}

}
