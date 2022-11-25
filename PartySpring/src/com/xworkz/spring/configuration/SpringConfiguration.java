package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.entity.AirEntity;
import com.xworkz.spring.entity.Ant;
import com.xworkz.spring.entity.Cities;
import com.xworkz.spring.entity.Fruit;
import com.xworkz.spring.entity.Gate;
import com.xworkz.spring.entity.Human;
import com.xworkz.spring.entity.Laptop;
import com.xworkz.spring.entity.Love;
import com.xworkz.spring.entity.Numbers;
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

//public Integer jersyNumber() {
//	int no= new Int;
//	return 7;
//}

	@Bean
	public String playerName() {
		String string = new String();
		return "KR Rahul";
	}

	@Bean
	public String playerName1() {
		String string = new String();
		return "Rohit";
	}

	@Bean
	public String playerName2() {
		String string = new String();
		return "Virat";
	}

	@Bean
	public String playerName3() {
		String string = new String();
		return "SuryaKumar";
	}

	@Bean
	public String playerName4() {
		String string = new String();
		return "Panth";
	}

	@Bean
	public String playerName5() {
		String string = new String();
		return "Hooda";
	}

	@Bean
	public String playerName6() {
		String string = new String();
		return "Hardik";
	}

	@Bean
	public String playerName7() {
		String string = new String();
		return "Aswni";
	}

	@Bean
	public String playerName8() {
		String string = new String();
		return "Akashdeep";
	}

	@Bean
	public String playerName9() {
		String string = new String();
		return "Dinda";
	}

	@Bean
	public String playerName10() {
		String string = new String();
		return "Shami";
	}

	@Bean
	public String playerName11() {
		String string = new String();
		return "Buvi";
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
	public String bike16() {
		String string = new String();
		return "FZ-161";
	}

	@Bean
	public String bike17() {
		String string = new String();
		return "FZ-162";
	}

	@Bean
	public String bike18() {
		String string = new String();
		return "FZ-163";
	}

	@Bean
	public String bike19() {
		String string = new String();
		return "FZ-164";
	}

	@Bean
	public String bike20() {
		String string = new String();
		return "FZ-165";
	}

	@Bean
	public String bike21() {
		String string = new String();
		return "FZ-166";
	}

	@Bean
	public String bike22() {
		String string = new String();
		return "FZ-167";
	}

	@Bean
	public String bike23() {
		String string = new String();
		return "FZ-169";
	}

	@Bean
	public String bike24() {
		String string = new String();
		return "FZ-170";
	}

	@Bean
	public String bike25() {
		String string = new String();
		return "Kavasaki";
	}

	@Bean
	public String bike26() {
		String string = new String();
		return "FZ-Kavasaki";
	}

	@Bean
	public String bike27() {
		String string = new String();
		return "FZ-160";
	}

	@Bean
	public String bike28() {
		String string = new String();
		return "FZ-160";
	}

	@Bean
	public String bike29() {
		String string = new String();
		return "FZ-160";
	}

	@Bean
	public String bike30() {
		String string = new String();
		return "FZ-100";
	}

	@Bean
	public String bike31() {
		String bike = new String();
		return "honda activa";
	}

	@Bean
	public String bike32() {
		String bike = new String();
		return "dio";
	}

	@Bean
	public String bike33() {
		String bike = new String();
		return "hero electric";
	}

	@Bean
	public String bike34() {
		String bike = new String();
		return "CT 100";
	}

	@Bean
	public String bike35() {
		String bike = new String();
		return "hunk";
	}

	@Bean
	public String bike36() {
		String bike = new String();
		return "achiever";
	}

	@Bean
	public String bike37() {
		String bike = new String();
		return "discover";
	}

	@Bean
	public String bike38() {
		String bike = new String();
		return "avenger";
	}

	@Bean
	public String bike39() {
		String bike = new String();
		return "karizma";
	}

	@Bean
	public String bike40() {
		String bike = new String();
		return "passion pro";
	}

	@Bean
	public String bike41() {
		String bike = new String();
		return "glamour";
	}

	@Bean
	public String bike42() {
		String bike = new String();
		return "hero glamour";
	}

	@Bean
	public String bike43() {
		String bike = new String();
		return "yamaha FZ";
	}

	@Bean
	public String bike44() {
		String bike = new String();
		return "hero passion";
	}

	@Bean
	public String bike45() {
		String bike = new String();
		return "tvs apache";
	}

	@Bean
	public String bike46() {
		String bike = new String();
		return "honda livo";
	}

	@Bean
	public String bike47() {
		String bike = new String();
		return "suziki";
	}

	@Bean
	public String bike48() {
		String bike = new String();
		return "kawasaki";
	}

	@Bean
	public String bike49() {
		String bike = new String();
		return "Benelli";
	}

	@Bean
	public String bike50() {
		String bike = new String();
		return "BMW";
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

	@Bean
	public Cities cities() {
		System.out.println("City");
		Cities city = new Cities();
		return city;
	}

	@Bean
	public String city1() {
		System.out.println("bengaluru");
		return "bengaluru";
	}

	@Bean
	public String city2() {
		System.out.println("Mysore");
		return "Mysore";
	}

	@Bean
	public String city3() {
		System.out.println("Tumkur");
		return "Tumkur";
	}

	@Bean
	public String city4() {
		System.out.println("Gubbi");
		return "Gubbi";
	}

	@Bean
	public String city5() {
		System.out.println("chikkamangalore");
		return "chikkamangalore";
	}

	@Bean
	public String city6() {
		System.out.println("bidar");
		return "bidar";
	}

	@Bean
	public String city7() {
		System.out.println("bagalokote");
		return "bagalokote";
	}

	@Bean
	public String city8() {
		System.out.println("hubbli");
		return "hubbli";
	}

	@Bean
	public String city9() {
		System.out.println("mangalore");
		return "mangalore";
	}

	@Bean
	public String city10() {
		System.out.println("kodagu");
		return "kodagu";
	}

	@Bean
	public String city11() {
		System.out.println("belghavi");
		return "belghavi";
	}

	@Bean
	public String city12() {
		System.out.println("koppala");
		return "koppala";
	}

	@Bean
	public String city13() {
		System.out.println("bijapura");
		return "bijapura";
	}

	@Bean
	public String city14() {
		System.out.println("Bagalakote");
		return "Bagalakote";
	}

	@Bean
	public String city15() {
		System.out.println("Pavagada");
		return "Pavagada";
	}

	@Bean
	public String city16() {
		System.out.println("Sira");
		return "Sira";
	}

	@Bean
	public String city17() {
		System.out.println("Gubbi");
		return "Gubbi";
	}

	@Bean
	public String city18() {
		System.out.println("Kunigal");
		return "Kunigal";
	}

	@Bean
	public String city19() {
		System.out.println("Madhugiri");
		return "Madhugiri";
	}

	@Bean
	public String city20() {
		System.out.println("Koratagere");
		return "Koratagere";
	}

	@Bean
	public String city21() {
		System.out.println("Tumakuru");
		return "Tumakuru";
	}

	@Bean
	public String city22() {
		System.out.println("Chikkanayakanahalli");
		return "Chikkanayakanahalli";
	}

	@Bean
	public String city23() {
		System.out.println("Tipaturu");
		return "Tipaturu";
	}

	@Bean
	public String city24() {
		System.out.println("Turuvekere");
		return "Turuvekere";
	}

	@Bean
	public String city25() {
		System.out.println("Belegavi");
		return "Belegavi";
	}

	@Bean
	public String city26() {
		System.out.println("Athani");
		return "Athani";
	}

	@Bean
	public String city27() {
		System.out.println("Bailhongal");
		return "Bailhongal";
	}

	@Bean
	public String city28() {
		System.out.println("Belagavi");
		return "Belagavi";
	}

	@Bean
	public String city29() {
		System.out.println("Chikkodi");
		return "Chikkodi";
	}

	@Bean
	public String city30() {
		System.out.println("Gokak");
		return "Gokak";
	}

	@Bean
	public String city31() {
		System.out.println("Hukkeri");
		return "Hukkeri";
	}

	@Bean
	public String city32() {
		System.out.println("Khanapur");
		return "Khanapur";
	}

	@Bean
	public String city33() {
		System.out.println("Raibag");
		return "Raibag";
	}

	@Bean
	public String city34() {
		System.out.println("Ramdurg");
		return "Ramdurg";
	}

	@Bean
	public String city35() {
		System.out.println("Soudatti");
		return "Soudatti";
	}

	@Bean
	public String city36() {
		System.out.println("Kittur");
		return "Kittur";
	}

	@Bean
	public String city37() {
		System.out.println("Nippani");
		return "Nippani";
	}

	@Bean
	public String city38() {
		System.out.println("Raibag");
		return "Raibag";
	}

	@Bean
	public String city39() {
		System.out.println("Kagawad");
		return "Kagawad";
	}

	@Bean
	public String city40() {
		System.out.println("Mudalagi");
		return "Mudalagi";
	}

	@Bean
	public String city41() {
		System.out.println("Yaragatii");
		return "Yaragatii";
	}

	@Bean
	public Numbers numbers() {
		System.out.println("numbers");
		Numbers num = new Numbers();
		return num;
	}

	@Bean
	public String one() {
		System.out.println("one");
		return "1";

	}

	@Bean
	public String two() {
		System.out.println("two");
		return "2";

	}

	@Bean
	public String three() {
		System.out.println("three");
		return "3";

	}

	@Bean
	public String four() {
		System.out.println("four");
		return "4";

	}

	@Bean
	public String five() {
		System.out.println("five");
		return "5";

	}

	@Bean
	public String six() {
		System.out.println("six");
		return "6";

	}

	@Bean
	public String seven() {
		System.out.println("seven");
		return "7";

	}

	@Bean
	public String eight() {
		System.out.println("eight");
		return "8";

	}

	@Bean
	public String nine() {
		System.out.println("nine");
		return "9";

	}

	@Bean
	public String ten() {
		System.out.println("ten");
		return "10";

	}

	@Bean
	public String number11() {
		System.out.println("eleven");
		return "11";

	}

	@Bean
	public Integer number12() {
		System.out.println("twelve");
		return 12;

	}

	@Bean
	public Integer number13() {
		System.out.println("thirteen");
		return 13;

	}

	@Bean
	public Integer number14() {
		System.out.println("fourteen");
		return 14;

	}

	@Bean
	public Integer number15() {
		System.out.println("fifteen");
		return 15;

	}

	@Bean
	public Integer number16() {
		System.out.println("sixteen");
		return 16;

	}

	@Bean
	public Integer number17() {
		System.out.println("seventeen");
		return 17;

	}

	@Bean
	public Integer number18() {
		System.out.println("eighteen");
		return 18;

	}

	@Bean
	public Integer number19() {
		System.out.println("ninghteen");
		return 19;

	}

	@Bean
	public Integer number20() {
		System.out.println("twenty");
		return 20;

	}

	@Bean
	public Integer number21() {
		System.out.println("twentyOne");
		return 21;

	}

	@Bean
	public Integer number22() {
		System.out.println("twentytwo");
		return 22;

	}

	@Bean
	public Integer number23() {
		System.out.println("twentytThree");
		return 23;

	}

	@Bean
	public Integer number24() {
		System.out.println("twentyFour");
		return 24;

	}

	@Bean
	public Integer number25() {
		System.out.println("twentyFive");
		return 25;

	}

	@Bean
	public Integer number26() {
		System.out.println("twentySix");
		return 26;

	}

	@Bean
	public Integer number27() {
		System.out.println("twentySeven");
		return 27;

	}

	@Bean
	public Integer number28() {
		System.out.println("twentyeight");
		return 28;

	}

	@Bean
	public Integer number29() {
		System.out.println("twentynine");
		return 29;

	}

	@Bean
	public Integer number30() {
		System.out.println("thirty");
		return 30;

	}

	@Bean
	public Integer number31() {
		System.out.println("thirtyOne");
		return 31;

	}

	@Bean
	public Integer number32() {
		System.out.println("thirtyTwo");
		return 32;

	}

	@Bean
	public Integer number33() {
		System.out.println("thirtyThree");
		return 33;

	}

	@Bean
	public Integer number34() {
		System.out.println("thirtyFour");
		return 34;

	}

	@Bean
	public Integer number35() {
		System.out.println("thirtyFive");
		return 35;

	}

	@Bean
	public Integer number36() {
		System.out.println("thirtySix");
		return 36;

	}

	@Bean
	public Integer number37() {
		System.out.println("thirtySeven");
		return 37;

	}

	@Bean
	public Integer number38() {
		System.out.println("thirtyEight");
		return 38;

	}

	@Bean
	public Integer number39() {
		System.out.println("thirtyNine");
		return 39;

	}

	@Bean
	public Integer number40() {
		System.out.println("Fourty");
		return 40;

	}

	@Bean
	public Integer number41() {
		System.out.println("FourtyOne");
		return 41;

	}

	@Bean
	public Integer number42() {
		System.out.println("FourtyTwo");
		return 42;

	}

	@Bean
	public Integer number43() {
		System.out.println("FourtyThree");
		return 43;

	}

	@Bean
	public Integer number44() {
		System.out.println("FourtyFour");
		return 44;

	}

	@Bean
	public Integer number45() {
		System.out.println("FourtyFive");
		return 45;

	}

	@Bean
	public Integer number46() {
		System.out.println("FourtySix");
		return 46;

	}

	@Bean
	public Integer number47() {
		System.out.println("FourtySeven");
		return 47;

	}

	@Bean
	public Integer number48() {
		System.out.println("FourtyEight");
		return 48;

	}

	@Bean
	public Integer number49() {
		System.out.println("FourtyNine");
		return 49;

	}

	@Bean
	public Integer number50() {
		System.out.println("Fifty");
		return 50;

	}

	@Bean
	public Integer number51() {
		System.out.println("FiftyOne");
		return 51;

	}

	@Bean
	public Integer number52() {
		System.out.println("FiftyTwo");
		return 52;

	}

	@Bean
	public Integer number53() {
		System.out.println("FiftyThree");
		return 53;

	}

	@Bean
	public Integer number54() {
		System.out.println("FiftyFour");
		return 54;

	}

	@Bean
	public Integer number55() {
		System.out.println("FiftyFive");
		return 55;

	}

	@Bean
	public Integer number56() {
		System.out.println("FiftySix");
		return 56;

	}

	@Bean
	public Integer number57() {
		System.out.println("FiftySeven");
		return 57;

	}

	@Bean
	public Integer number58() {
		System.out.println("FiftyEight");
		return 58;

	}

	@Bean
	public Integer number59() {
		System.out.println("FiftyNine");
		return 59;

	}

	@Bean
	public Integer number60() {
		System.out.println("Sixtey");
		return 60;

	}

	@Bean
	public Integer number61() {
		System.out.println("SixteyOne");
		return 61;

	}

	@Bean
	public Integer number62() {
		System.out.println("SixtyTwo");
		return 62;

	}

	@Bean
	public Integer number63() {
		System.out.println("SixtyThree");
		return 63;

	}

	@Bean
	public Integer number64() {
		System.out.println("SixtyFour");
		return 64;

	}

	@Bean
	public Integer number65() {
		System.out.println("SixtyFive");
		return 65;

	}

	@Bean
	public Integer number66() {
		System.out.println("SixtySix");
		return 66;

	}

	@Bean
	public Integer number67() {
		System.out.println("SixtySeven");
		return 67;

	}

	@Bean
	public Integer number68() {
		System.out.println("SixtyEight");
		return 68;

	}

	@Bean
	public Integer number69() {
		System.out.println("SixtyNine");
		return 69;

	}

	@Bean
	public Integer number70() {
		System.out.println("Seventy");
		return 70;

	}

	@Bean
	public Integer number71() {
		System.out.println("SeventyOne");
		return 71;

	}

	@Bean
	public Integer number72() {
		System.out.println("SeventyTwo");
		return 72;

	}

	@Bean
	public Integer number73() {
		System.out.println("SeventyThree");
		return 73;

	}

	@Bean
	public Integer number74() {
		System.out.println("SeventyFour");
		return 74;

	}

	@Bean
	public Integer number75() {
		System.out.println("SeventyFive");
		return 75;

	}

	@Bean
	public Integer number76() {
		System.out.println("SeventySix");
		return 76;

	}

	@Bean
	public Integer number77() {
		System.out.println("SeventySeven");
		return 77;

	}

	@Bean
	public Integer number78() {
		System.out.println("seventyEight");
		return 78;

	}

	@Bean
	public Integer number79() {
		System.out.println("seventyNine");
		return 78;

	}

	@Bean
	public Integer number80() {
		System.out.println("eighty");
		return 80;

	}

	@Bean
	public Integer number81() {
		System.out.println("eightyOne");
		return 81;

	}

	@Bean
	public Integer number82() {
		System.out.println("eightyTwo");
		return 82;

	}

	@Bean
	public Integer number83() {
		System.out.println("eightyThree");
		return 83;

	}

	@Bean
	public Integer number84() {
		System.out.println("eightyFour");
		return 84;

	}

	@Bean
	public Integer number85() {
		System.out.println("eightyFive");
		return 85;

	}

	@Bean
	public Integer number86() {
		System.out.println("eightySix");
		return 86;

	}

	@Bean
	public Integer number87() {
		System.out.println("eightySeven");
		return 87;

	}

	@Bean
	public Integer number88() {
		System.out.println("eightyEight");
		return 88;

	}

	@Bean
	public Integer number89() {
		System.out.println("eightyNine");
		return 89;

	}

	@Bean
	public Integer number90() {
		System.out.println("ninty");
		return 90;

	}

	@Bean
	public Integer number91() {
		System.out.println("nintyOne");
		return 91;

	}

	@Bean
	public Integer number92() {
		System.out.println("NintyTwo");
		return 92;

	}

	@Bean
	public Integer number93() {
		System.out.println("nintyThree");
		return 93;

	}

	@Bean
	public Integer number94() {
		System.out.println("nintyFour");
		return 94;

	}

	@Bean
	public Integer number95() {
		System.out.println("nintyFive");
		return 95;

	}

	@Bean
	public Integer number96() {
		System.out.println("nintySix");
		return 96;

	}

	@Bean
	public Integer number97() {
		System.out.println("nintySeven");
		return 97;

	}

	@Bean
	public Integer number98() {
		System.out.println("nintyEight");
		return 98;

	}

	@Bean
	public Integer number99() {
		System.out.println("nintyNine");
		return 99;

	}

	@Bean
	public Integer number100() {
		System.out.println("hundred");
		return 100;

	}

}
