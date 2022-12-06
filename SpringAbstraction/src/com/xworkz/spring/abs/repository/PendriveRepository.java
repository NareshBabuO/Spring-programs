package com.xworkz.spring.abs.repository;


import org.springframework.stereotype.Component;

import com.xworkz.spring.abs.dto.PendriveDTO;
@Component
public interface PendriveRepository {
	
	public boolean Save(PendriveDTO dto);

}
