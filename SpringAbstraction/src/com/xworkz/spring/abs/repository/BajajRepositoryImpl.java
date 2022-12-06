package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.BajajEntity;
@Component
public class BajajRepositoryImpl implements BajajRepository {

	@Override
	public boolean Save(BajajEntity entity) {
		System.out.println("Saving Method in repo......");
		return true;
	}

}
