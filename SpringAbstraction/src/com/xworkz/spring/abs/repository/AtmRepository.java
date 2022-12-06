package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abs.dto.AtmDTO;
@Component
public interface AtmRepository {

	public boolean Save(AtmDTO dto);

}
