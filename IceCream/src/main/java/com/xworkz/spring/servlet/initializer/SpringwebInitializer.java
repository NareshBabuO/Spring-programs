
package com.xworkz.spring.servlet.initializer;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.spring.servlet.configaration.SpringConfig;

public class SpringwebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("This is getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("this is getServletConfigClasses");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("This is getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("This is configureDefaultServletHandling");
		configurer.enable();
	}

}
