package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.entity.AirEntity;
import com.xworkz.spring.entity.Ant;
import com.xworkz.spring.entity.Fruit;
import com.xworkz.spring.entity.Gate;
import com.xworkz.spring.entity.Human;
import com.xworkz.spring.entity.Laptop;
import com.xworkz.spring.entity.Love;
import com.xworkz.spring.entity.PartyEntity;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("ruuning spring configuration...");

	}

	@Bean
	public PartyEntity partyEntity() {

		PartyEntity entity = new PartyEntity();
		System.out.println("PartyEntity Method is Started.....");

		return entity;
	}

	public Ant ant() {
		Ant entity = new Ant();
		System.out.println("Ant method is running");
		return entity;
	}

	public Gate gate() {
		Gate entityGate = new Gate();
		System.out.println("Gate method is running");
		return entityGate;
	}

	public Fruit apple() {
		Fruit entity = new Fruit();
		System.out.println("Apple method is running");
		return entity;
	}

	public Laptop use() {
		Laptop entity = new Laptop();
		System.out.println("Laptop method is running");
		return entity;
	}

	public Human human() {
		Human entity = new Human();
		System.out.println("Human method is running");
		return entity;
	}

	@Bean
	public Love injury() {
		Love entity = new Love();
		System.out.println("Love method is running");
		return entity;
	}

	public AirEntity air() {
		AirEntity entity = new AirEntity();
		System.out.println("Fan method is running");
		return entity;
	}

	@Bean
	public String name() {
		String string = new String();
		return "nagesh";
	}

	@Bean
	public String name1() {
		String string = new String();
		return "dyamanna";
	}

	@Bean
	public String name2() {
		String string = new String();
		return "hanamant";
	}

	@Bean
	public String name3() {
		String string = new String();
		return "basavaraj";
	}

	@Bean
	public String name4() {
		String string = new String();
		return "sachin";
	}

	@Bean
	public String name5() {
		String string = new String();
		return "dada";
	}

	@Bean
	public String name6() {
		String string = new String();
		return "malatesh";
	}

	@Bean
	public String name7() {
		String string = new String();
		return "chandru";
	}

	@Bean
	public String name8() {
		String string = new String();
		return "dhivya";
	}

	@Bean
	public String name9() {
		String string = new String();
		return "manoj";
	}

	@Bean
	public String bike() {
		String string = new String();
		return "Pulasar";
	}

	@Bean
	public String bike1() {
		String string = new String();
		System.out.println("Bike Name is NS 200");
		return "NS 200";
	}

	@Bean
	public String bike2() {
		String string = new String();
		return "Honda";
	}

	@Bean
	public String bike3() {
		String string = new String();
		return "Duke";
	}

	@Bean
	public String bike4() {
		String string = new String();
		return "R-15";
	}

	@Bean
	public String bike5() {
		String string = new String();
		return "Hero";
	}

	@Bean
	public String bike6() {
		String string = new String();
		return "KTM";
	}

	@Bean
	public String bike7() {
		String string = new String();
		return "Enfield";
	}

	@Bean
	public String bike8() {
		String string = new String();
		return "RX-100";
	}

	@Bean
	public String bike9() {
		String string = new String();
		return "Yamaha";
	}

	@Bean
	public String bike10() {
		String string = new String();
		return "Mahindra";
	}

	@Bean
	public String bike11() {
		String string = new String();
		return "Royal";
	}

	@Bean
	public String bike12() {
		String string = new String();
		return "Pulasar-150";
	}

	@Bean
	public String bike13() {
		String string = new String();
		return "Activa";
	}

	@Bean
	public String bike14() {
		String string = new String();
		return "Dominor";
	}

	@Bean
	public String bike15() {
		String string = new String();
		return "FZ-160";
	}

	@Bean
	public String car() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car1() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car2() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car3() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car4() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car5() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car6() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car7() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car8() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car9() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car10() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car11() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car12() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car13() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car14() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car15() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car16() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car17() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car18() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car19() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car20() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car21() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car22() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car23() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car24() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car25() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car26() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car27() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car28() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car29() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car30() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car31() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car32() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car33() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car34() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car35() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car36() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car37() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car38() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car39() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car40() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car41() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car42() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car43() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car44() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car45() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car46() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car47() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car48() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car49() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car50() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car51() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car52() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car53() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car54() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car55() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car56() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car57() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car58() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car59() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car60() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car61() {
		String string = new String();
		return "maruti santner";
	}

}
