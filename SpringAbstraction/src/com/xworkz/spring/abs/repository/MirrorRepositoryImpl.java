package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.MirrorEntity;

@Component
public class MirrorRepositoryImpl implements MirrorRepository {

	@Override
	public boolean Save(MirrorEntity entity) {
		System.out.println("Saving method in RepoImpl....");
		return true;
	}

}
