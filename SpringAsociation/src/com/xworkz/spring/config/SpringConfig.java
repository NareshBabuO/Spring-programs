package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.City;
import com.xworkz.spring.bean.Country;
import com.xworkz.spring.bean.Name;
import com.xworkz.spring.bean.President;
import com.xworkz.spring.bean.PrimeMinister;
import com.xworkz.spring.bean.Salary;
import com.xworkz.spring.bean.State;
import com.xworkz.spring.bean.UnionTerritory;
import com.xworkz.spring.bean.VicePresident;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	@Bean
	public City city() {
		System.out.println("Registered the City Detail");
		City city = new City();
		return city;

	}

	@Bean
	public President president() {
		System.out.println("Registered the President Details");
		President president = new President();
		return president;
	}

	@Bean
	public Name name() {
		System.out.println("Registered the Name Details");
		Name name = new Name();
		return name;
	}

	@Bean
	public PrimeMinister primeMinister() {
		System.out.println("Registered the PrimeMinister Details");
		PrimeMinister primeMinister = new PrimeMinister();
		return primeMinister;
	}

	@Bean
	public Salary salary() {
		System.out.println("Registring the Salary Details");
		Salary salary = new Salary();
		return salary;
	}

	@Bean
	public State state() {
		System.out.println("Registring the State Details");
		State state = new State();
		return state;
	}

	@Bean
	public UnionTerritory uterritory() {
		System.out.println("Registring the UnionTerritory Details");
		UnionTerritory uterritory = new UnionTerritory();
		return uterritory;
	}

	public VicePresident vicePresident() {
		System.out.println("Registring the VicePresident Details");
		VicePresident vicePresident = new VicePresident();
		return vicePresident;
	}

	@Bean
	public Country country() {
		System.out.println("Registered the CountryDetail");
		Country country = new Country();
		return country;
	}

}
