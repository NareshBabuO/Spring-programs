package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.LenevoEntity;
import com.xworkz.spring.abs.repository.LenevoRepository;

@Component
public class LenevoServiceImpl implements LenevoService {

	@Autowired
	@Qualifier("lenevoRepository")
	LenevoRepository repo;

	@Override
	public boolean ValidateAndSave(LenevoEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Validating And Saving Methods in Lenovo ServiceImpl....");
		return false;
	}

}
