package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.LenevoEntity;
@Component
public class LenevoRepositoryImpl implements LenevoRepository {

	@Override
	public boolean Save(LenevoEntity entity) {
		System.out.println("Saving methods in Lenevo RepoImpl....");
		return true;
	}

}
