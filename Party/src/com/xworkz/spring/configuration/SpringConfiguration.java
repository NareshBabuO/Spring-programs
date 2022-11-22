package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;

import com.xworkz.spring.entity.PartyEntity;

public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("ruuning spring configuration...");

	}

	@Bean
	public PartyEntity partyEntity() {

		PartyEntity entity = new PartyEntity();
		System.out.println("PartyEntity Method is Started.....");

		return entity;
	}

}
