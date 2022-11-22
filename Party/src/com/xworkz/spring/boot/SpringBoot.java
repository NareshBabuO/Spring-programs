package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.entity.PartyEntity;

public class SpringBoot {

	public static void main(String args[]) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		PartyEntity bean = context.getBean(PartyEntity.class);
		bean.partyHard();

	}

}
