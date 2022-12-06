package com.xworkz.spring.abs.service;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.MirrorEntity;
@Component
public interface MirrorService {
	
	boolean ValidateAndSave(MirrorEntity entity);

}
