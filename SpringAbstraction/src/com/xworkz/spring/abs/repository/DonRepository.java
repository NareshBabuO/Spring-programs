package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DonEntity;

@Component
public interface DonRepository {

	boolean Save(DonEntity entity);
}
