package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.TableEntity;

@Component
public interface TableRepository {
	
	boolean Save(TableEntity entity);

}
