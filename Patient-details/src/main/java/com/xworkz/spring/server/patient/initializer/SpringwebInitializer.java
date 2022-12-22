package com.xworkz.spring.server.patient.initializer;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.spring.server.patient.config.SpringConfig;

public class SpringwebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses  Method in Patient ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses Method in Patient");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings Method in Patient");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling Method in Patient");
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {

		File uploadFile = new File(System.getProperty("java.io.tmpdir"));

		MultipartConfigElement configElement = new MultipartConfigElement(uploadFile.getAbsolutePath(), 99999999999999L,
				999999999999L, 10);

		registration.setMultipartConfig(configElement);
	}

}
