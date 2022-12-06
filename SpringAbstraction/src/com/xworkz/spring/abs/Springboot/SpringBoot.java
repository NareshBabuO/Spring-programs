package com.xworkz.spring.abs.Springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.abbs.entity.BajajEntity;
import com.xworkz.spring.abs.configuration.SpringConfiguration;
import com.xworkz.spring.abs.service.BajajService;
import com.xworkz.spring.abs.service.CylinderService;
import com.xworkz.spring.abs.service.DishService;
import com.xworkz.spring.abs.service.DonService;
import com.xworkz.spring.abs.service.HelmetService;
import com.xworkz.spring.abs.service.MirrorService;
import com.xworkz.spring.abs.service.SilverService;
import com.xworkz.spring.abs.service.TableService;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		context.getBeanDefinitionCount();
		BajajService bajajService = context.getBean(BajajService.class);
		System.out.println(bajajService.ValidateAndSave(null));
		System.out.println("=======================");
		CylinderService cylinderService = context.getBean(CylinderService.class);
		System.out.println(cylinderService.ValidateAndSave(null));
		System.out.println(".....................");
		DishService dishService = context.getBean(DishService.class);
		System.out.println(dishService.ValidateAndSave(null));
		System.out.println("++++++++++++++++++++++++++++");
		DonService donService = context.getBean(DonService.class);
		System.out.println(donService.ValidateAndSave(null));
		System.out.println("========================");
		HelmetService helmetService = context.getBean(HelmetService.class);
		System.out.println(helmetService.ValidateAndSave(null));
		System.out.println("------------------");
		MirrorService mirrorService = context.getBean(MirrorService.class);
		System.out.println(mirrorService.ValidateAndSave(null));
		System.out.println("__________________");
		SilverService silverService = context.getBean(SilverService.class);
		System.out.println(silverService.ValidateAndSave(null));
		System.out.println("=========================");
		TableService tableService = context.getBean(TableService.class);
		System.out.println(tableService.ValidateAndSave(null));

	}

}
