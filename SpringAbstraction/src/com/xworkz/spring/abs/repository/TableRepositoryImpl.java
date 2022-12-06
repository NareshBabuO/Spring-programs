package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.TableEntity;
@Component
public class TableRepositoryImpl implements TableRepository {

	@Override
	public boolean Save(TableEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Saving method in Repositoryimpl....");
		return true;
	}

}
