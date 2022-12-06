package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.SilverEntity;
@Component
public interface SilverService {

	boolean ValidateAndSave(SilverEntity entity);

}
