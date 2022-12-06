package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.HelmetEntity;

@Component
public interface HelmetRepository {

	public boolean Save(HelmetEntity entity);

}
