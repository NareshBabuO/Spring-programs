package com.xworkz.spring.abs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.abbs.entity.CylinderEntity;
import com.xworkz.spring.abbs.entity.HelmetEntity;
import com.xworkz.spring.abs.repository.BajajRepository;
import com.xworkz.spring.abs.repository.BajajRepositoryImpl;
import com.xworkz.spring.abs.repository.CylinderRepository;
import com.xworkz.spring.abs.repository.CylinderRepositoryImpl;
import com.xworkz.spring.abs.repository.DishRepository;
import com.xworkz.spring.abs.repository.DishRepositoryimpl;
import com.xworkz.spring.abs.repository.DonRepository;
import com.xworkz.spring.abs.repository.DonRepositoryImpl;
import com.xworkz.spring.abs.repository.HelmetRepository;
import com.xworkz.spring.abs.repository.HelmetRepositoryImpl;
import com.xworkz.spring.abs.repository.LenevoRepository;
import com.xworkz.spring.abs.repository.LenevoRepositoryImpl;
import com.xworkz.spring.abs.repository.MirrorRepository;
import com.xworkz.spring.abs.repository.MirrorRepositoryImpl;
import com.xworkz.spring.abs.repository.SilverRepository;
import com.xworkz.spring.abs.repository.SilverRepositoryImpl;
import com.xworkz.spring.abs.repository.TableRepository;
import com.xworkz.spring.abs.repository.TableRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public BajajRepository bajajRepository() {
		return new BajajRepositoryImpl();
	}

	@Bean
	public HelmetRepository helmetRepository() {
		return new HelmetRepositoryImpl();

	}

	@Bean
	public CylinderRepository cylinderRepository() {
		return new CylinderRepositoryImpl();
	}

	@Bean
	public DishRepository dishRepository() {
		return new DishRepositoryimpl();
	}

	@Bean
	public DonRepository donRepository() {
		return new DonRepositoryImpl();
	}

	@Bean
	public LenevoRepository lenevoRepository() {
		return new LenevoRepositoryImpl();
	}

	@Bean
	public MirrorRepository mirrorRepository() {
		return new MirrorRepositoryImpl();
	}

	@Bean
	public SilverRepository silverRepository() {
		return new SilverRepositoryImpl();
	}

	@Bean
	public TableRepository tableRepository() {
		return new TableRepositoryImpl();
	}

}
