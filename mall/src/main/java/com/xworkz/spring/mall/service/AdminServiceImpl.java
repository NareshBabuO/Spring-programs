package com.xworkz.spring.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.mall.dto.AdminDTO;
import com.xworkz.spring.mall.repo.AdminRepo;

@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminRepo repo;
	
	
	@Override
	public boolean validateAndSave(AdminDTO dto) {
		System.out.println("validateAndSave method in Admin Service");

		return true;
	}

}
