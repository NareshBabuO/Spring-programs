package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.BajajEntity;

@Component
public interface BajajService {

	boolean ValidateAndSave(BajajEntity entity);

}
