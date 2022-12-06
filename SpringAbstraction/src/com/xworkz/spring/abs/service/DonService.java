package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DonEntity;

@Component
public interface DonService {

	boolean ValidateAndSave(DonEntity entity);
}
