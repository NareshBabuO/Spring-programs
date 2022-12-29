package com.xworkz.spring.criminal.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.criminal.entity.CriminalEntity;
import com.xworkz.spring.criminal.repository.CriminalRepo;

@Component
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalRepo repo;

	@Override
	public boolean ValidateAndSave(CriminalEntity entity) {
		System.out.println("ValidateAndSave method in Service Impl");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CriminalEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("Validation Error Check it again");
		} else {
			System.out.println("Validation is Done");
			return this.repo.Save(entity);
		}

		return true;
	}

	@Override
	public Optional<List<CriminalEntity>> findByNameAndJailName(String name, String jailName) {
		return this.repo.findByNameAndJailName(name, jailName);
	}
}
