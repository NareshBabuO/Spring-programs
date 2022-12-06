package com.xworkz.spring.abs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.TableEntity;
import com.xworkz.spring.abs.repository.TableRepository;
@Component
public class TableServiceImpl implements TableService {

	@Autowired
	@Qualifier("tableRepository")
	TableRepository repo;

	@Override
	public boolean ValidateAndSave(TableEntity entity) {
		System.out.println("Validating And Saving in Table Repository..........");
		return true;
	}

}
