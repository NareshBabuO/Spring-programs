package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.BajajEntity;
import com.xworkz.spring.abs.repository.BajajRepository;

@Component
public class BajajServiceImpl implements BajajService {
	@Autowired
	@Qualifier("bajajRepository")
	BajajRepository repo;

	@Override
	public boolean ValidateAndSave(BajajEntity entity) {
		System.out.println("Validating and Saving Methods..... ");
		repo.Save(entity);
		return true;
	}

}
