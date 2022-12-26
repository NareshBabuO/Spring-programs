package com.xworkz.spring.server.oyo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.oyo.entity.OyoRoomEntity;
import com.xworkz.spring.server.oyo.repository.OyoRoomRepo;

@Component
public class OyoRoomServiceImpl implements OyoRoomService {

	@Autowired
	public OyoRoomRepo repo;
	
	@Override
	public boolean ValidateAndSave(OyoRoomEntity entity) {
		System.out.println("ValidateAndSave in oyo room ");
		return this.repo.Save(entity);
	}

}
