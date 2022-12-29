package com.xworkz.spring.criminal.initializer;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.spring.criminal.config.SpringConfig;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses method in Criminal Entity");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses method in Criminal Entity");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings method in Criminal Entity");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling in Criminal Entity");
		configurer.enable();
	}

//	@Override
//	protected void customizeRegistration(Dynamic registration) {
//		System.out.println("customizeRegistration method in Criminal Entity");
//		File file = new File("D:\\CriminalPhotos/");
//	MultipartConfigElement configElement = new MultipartConfigElement(file.getAbsolutePath(), 1000000000,
//				1000000000 * 2, 1000000000 / 2);
//		registration.setMultipartConfig(configElement);
//	}

	@Override
	protected void customizeRegistration(Dynamic registration) {

		File uploadFile = new File(System.getProperty("java.io.tmpdir"));

		MultipartConfigElement configElement = new MultipartConfigElement(uploadFile.getAbsolutePath(), 99999999999999L,
				999999999999L, 10);

		registration.setMultipartConfig(configElement);
	}

}
