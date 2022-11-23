package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.entity.AirEntity;
import com.xworkz.spring.entity.Ant;
import com.xworkz.spring.entity.Fruit;
import com.xworkz.spring.entity.Gate;
import com.xworkz.spring.entity.Human;
import com.xworkz.spring.entity.Laptop;
import com.xworkz.spring.entity.PartyEntity;

public class SpringBoot {

	public static void main(String args[]) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		//PartyEntity bean = context.getBean(PartyEntity.class);
		//bean.partyHard();
		System.out.println(context.getBean(PartyEntity.class));
		System.out.println(context.getBean(AirEntity.class).hashCode());
		System.out.println(context.getBean(Ant.class).hashCode());
		System.out.println(context.getBean(Fruit.class).hashCode());
		System.out.println(context.getBean(Gate.class).hashCode());
		System.out.println(context.getBean(Human.class).hashCode());
		System.out.println(context.getBean(Laptop.class).hashCode());
		System.out.println(context.getBean("name", String.class).hashCode());
		System.out.println(context.getBean("name1", String.class).hashCode());
		System.out.println(context.getBean("name2", String.class).hashCode());
		System.out.println(context.getBean("name3", String.class).hashCode());
		System.out.println(context.getBean("name4", String.class).hashCode());
		System.out.println(context.getBean("name5", String.class).hashCode());
		System.out.println(context.getBean("name6", String.class).hashCode());
		System.out.println(context.getBean("name7", String.class).hashCode());
		System.out.println(context.getBean("name8", String.class).hashCode());
		System.out.println(context.getBean("name9", String.class).hashCode());
		System.out.println(context.getBean("bike", String.class).hashCode());
		System.out.println(context.getBean("bike1", String.class).hashCode());
		System.out.println(context.getBean("bike2", String.class).hashCode());
		System.out.println(context.getBean("bike3", String.class).hashCode());
		System.out.println(context.getBean("bike4", String.class).hashCode());
		System.out.println(context.getBean("bike5", String.class).hashCode());
		System.out.println(context.getBean("bike6", String.class).hashCode());
		System.out.println(context.getBean("bike7", String.class).hashCode());
		System.out.println(context.getBean("bike8", String.class).hashCode());
		System.out.println(context.getBean("bike9", String.class).hashCode());
		System.out.println(context.getBean("bike10", String.class).hashCode());
		System.out.println(context.getBean("bike11", String.class).hashCode());
		System.out.println(context.getBean("bike12", String.class).hashCode());
		System.out.println(context.getBean("bike13", String.class).hashCode());
		System.out.println(context.getBean("bike14", String.class).hashCode());
		System.out.println(context.getBean("bike15", String.class).hashCode());
		System.out.println(context.getBean("car", String.class).hashCode());
		System.out.println(context.getBean("car1", String.class).hashCode());
		System.out.println(context.getBean("car2", String.class).hashCode());
		System.out.println(context.getBean("car3", String.class).hashCode());
		System.out.println(context.getBean("car4", String.class).hashCode());
		System.out.println(context.getBean("car5", String.class).hashCode());
		System.out.println(context.getBean("car6", String.class).hashCode());
		System.out.println(context.getBean("car7", String.class).hashCode());
		System.out.println(context.getBean("car8", String.class).hashCode());
		System.out.println(context.getBean("car9", String.class).hashCode());
		System.out.println(context.getBean("car10", String.class).hashCode());
		System.out.println(context.getBean("car11", String.class).hashCode());
		System.out.println(context.getBean("car12", String.class).hashCode());
		System.out.println(context.getBean("car13", String.class).hashCode());
		System.out.println(context.getBean("car14", String.class).hashCode());
		System.out.println(context.getBean("car15", String.class).hashCode());
		System.out.println(context.getBean("car16", String.class).hashCode());
		System.out.println(context.getBean("car17", String.class).hashCode());
		System.out.println(context.getBean("car18", String.class).hashCode());
		System.out.println(context.getBean("car19", String.class).hashCode());
		System.out.println(context.getBean("car20", String.class).hashCode());
		System.out.println(context.getBean("car21", String.class).hashCode());
		System.out.println(context.getBean("car22", String.class).hashCode());
		System.out.println(context.getBean("car23", String.class).hashCode());
		System.out.println(context.getBean("car24", String.class).hashCode());
		System.out.println(context.getBean("car25", String.class).hashCode());
		System.out.println(context.getBean("car26", String.class).hashCode());
		System.out.println(context.getBean("car27", String.class).hashCode());
		System.out.println(context.getBean("car28", String.class).hashCode());
		System.out.println(context.getBean("car29", String.class).hashCode());
		System.out.println(context.getBean("car30", String.class).hashCode());
		System.out.println(context.getBean("car31", String.class).hashCode());
		System.out.println(context.getBean("car32", String.class).hashCode());
		System.out.println(context.getBean("car33", String.class).hashCode());
		System.out.println(context.getBean("car34", String.class).hashCode());
		System.out.println(context.getBean("car35", String.class).hashCode());
		System.out.println(context.getBean("car36", String.class).hashCode());
		System.out.println(context.getBean("car37", String.class).hashCode());
		System.out.println(context.getBean("car38", String.class).hashCode());
		System.out.println(context.getBean("car39", String.class).hashCode());
		System.out.println(context.getBean("car40", String.class).hashCode());
		System.out.println(context.getBean("car41", String.class).hashCode());
		System.out.println(context.getBean("car42", String.class).hashCode());
		System.out.println(context.getBean("car43", String.class).hashCode());
		System.out.println(context.getBean("car44", String.class).hashCode());
		System.out.println(context.getBean("car45", String.class).hashCode());
		System.out.println(context.getBean("car46", String.class).hashCode());
		System.out.println(context.getBean("car47", String.class).hashCode());
		System.out.println(context.getBean("car48", String.class).hashCode());
		System.out.println(context.getBean("car49", String.class).hashCode());
		System.out.println(context.getBean("car50", String.class).hashCode());
		System.out.println(context.getBean("car51", String.class).hashCode());
		System.out.println(context.getBean("car52", String.class).hashCode());
		System.out.println(context.getBean("car53", String.class).hashCode());
		System.out.println(context.getBean("car54", String.class).hashCode());
		System.out.println(context.getBean("car55", String.class).hashCode());
		System.out.println(context.getBean("car56", String.class).hashCode());
		System.out.println(context.getBean("car57", String.class).hashCode());
		System.out.println(context.getBean("car58", String.class).hashCode());
		System.out.println(context.getBean("car59", String.class).hashCode());
		System.out.println(context.getBean("car60", String.class).hashCode());
		System.out.println(context.getBean("car61", String.class).hashCode());

	}

}
