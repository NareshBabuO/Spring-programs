package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.LenevoEntity;

@Component
public interface LenevoService {

	boolean ValidateAndSave(LenevoEntity entity);

}
