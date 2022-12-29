package com.xworkz.spring.mall.initializer;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.spring.mall.config.SpringConfigaration;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses method in Mall");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses method in Mall");
		return new Class[] {SpringConfigaration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings method in mall");
		return null;
	}
	
	
	
	
	

	

}
