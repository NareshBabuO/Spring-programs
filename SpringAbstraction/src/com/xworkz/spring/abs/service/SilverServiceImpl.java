package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.SilverEntity;
import com.xworkz.spring.abs.repository.SilverRepository;

@Component
public class SilverServiceImpl implements SilverService {

	@Autowired
	@Qualifier("silverRepository")
	SilverRepository repo;

	@Override
	public boolean ValidateAndSave(SilverEntity entity) {
		System.out.println("Validating And Saving Method in Silver ServiceImpl...");
		repo.Save(entity);
		return true;
	}

}
