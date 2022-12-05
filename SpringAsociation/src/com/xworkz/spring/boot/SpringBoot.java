package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Country;
import com.xworkz.spring.config.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(context.getBeanDefinitionCount());
		Country country = context.getBean(Country.class);
		System.out.println(country);

	}

}
