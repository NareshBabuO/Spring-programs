package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.SilverEntity;

@Component
public interface SilverRepository {

	boolean Save(SilverEntity entity);

}
