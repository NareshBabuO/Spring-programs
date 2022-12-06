package com.xworkz.spring.abs.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.abbs.entity.MirrorEntity;

@Component
public interface MirrorRepository {

	boolean Save(MirrorEntity entity);

}
