package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.HelmetEntity;

@Component
public class HelmetRepositoryImpl implements HelmetRepository {

	@Override
	public boolean Save(HelmetEntity entity) {
		System.out.println("Saving the Methods in Repository.........");
		return true;
	}

}
