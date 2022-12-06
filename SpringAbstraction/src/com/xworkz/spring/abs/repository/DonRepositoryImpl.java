package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DonEntity;
@Component
public class DonRepositoryImpl implements DonRepository {

	@Override
	public boolean Save(DonEntity entity) {
		System.out.println("Saving Methods in Don Repository....");
		return true;
	}

}
