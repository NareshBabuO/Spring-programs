package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abs.dto.RoboDTO;

@Component
public interface RoboRepository {

	public boolean Save(RoboDTO dto);

}
