package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.TableEntity;

@Component
public interface TableService {

	boolean ValidateAndSave(TableEntity entity);

}
