package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.SilverEntity;

@Component
public class SilverRepositoryImpl implements SilverRepository {

	@Override
	public boolean Save(SilverEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Saving method in RepositoryImpl...");
		return true;
	}

}
