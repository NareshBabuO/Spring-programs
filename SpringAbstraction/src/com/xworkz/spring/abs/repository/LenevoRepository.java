package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.LenevoEntity;

@Component
public interface LenevoRepository {

	boolean Save(LenevoEntity entity);

}
