package com.xworkz.spring.server.patient.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.patient.entity.PatientEntity;
import com.xworkz.spring.server.patient.repository.PatientRepository;

@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	public PatientRepository repository;

	@Override
	public boolean validateAndSave(PatientEntity entity) {
		System.out.println("patient in PatientServiceImpl");

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<PatientEntity>> valid = validator.validate(entity);
		if (valid.size() > 0) {
			System.out.println("size is fixed");
		} else {
			System.out.println("validated");
		}

		return this.repository.save(entity);
	}

	@Override
	public Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		System.out.println("Validating findByName method in serviceImpl");
		StringBuilder query = new StringBuilder("select rogi from PatientEntity rogi where  1=1");
		List<String> optionList = new ArrayList<String>();
		if (name != null && !name.isEmpty()) {
			query.append(" and rogi.name like '%").append(name).append("%'");
			optionList.add(name);
		}
		if (greaterThanAge >= 0) {
			query.append(" and rogi.age>=").append(greaterThanAge);
		}
		if (lesserThanAge > 0 && lesserThanAge <= 200) {
			query.append(" and rogi.age<=").append(lesserThanAge);
		}
		System.out.println("Query Generated..." + query);
		return this.repository.findByQuery(query.toString());
	}

	@Override
	public boolean findByEmail(String email) {
		List<PatientEntity> findByEmail = repository.findByEmail(email);
		if (findByEmail != null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<PatientEntity> findByMobileNo = repository.findByMobileNo(mobileNo);
		if (findByMobileNo != null) {
			return false;
		} else {
			return true;
		}
	}

}
