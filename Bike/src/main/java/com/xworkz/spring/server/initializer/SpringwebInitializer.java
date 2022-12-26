package com.xworkz.spring.server.initializer;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.spring.server.config.SpringConfig;

public class SpringwebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("This getRootConfigClasses method executing ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("This  getServletConfigClasses method  executing");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("This getServletMappings method executing ");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("This configureDefaultServletHandling method executing");
		configurer.enable();
	}

}
