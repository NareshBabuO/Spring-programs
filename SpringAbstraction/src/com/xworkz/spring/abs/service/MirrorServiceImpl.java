package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.MirrorEntity;
import com.xworkz.spring.abs.repository.MirrorRepository;
@Component
public class MirrorServiceImpl implements MirrorService {

	@Autowired
	@Qualifier("mirrorRepository")
	MirrorRepository repo;

	@Override
	public boolean ValidateAndSave(MirrorEntity entity) {
		System.out.println("Validating Saving Methods in Mirror ServiceImpl");
		repo.Save(entity);
		return true;
	}

}
