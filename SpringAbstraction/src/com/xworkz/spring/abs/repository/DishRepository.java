package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.DishEntity;

@Component
public interface DishRepository {

	boolean Save(DishEntity entity);

}
