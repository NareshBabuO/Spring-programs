package com.xworkz.spring.server.oyo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("SpringConfiguration in OYO Room ");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return factoryBean;
	}

}
