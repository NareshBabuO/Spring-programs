package com.xworkz.dangerus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("This is SpringConfig");
	}

}
