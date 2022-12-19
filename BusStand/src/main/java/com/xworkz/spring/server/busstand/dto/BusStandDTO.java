package com.xworkz.spring.server.busstand.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "busstand")
@Entity
@NamedQuery(name = "findByLocation", query = "select alia from BusStandDTO alia where alia.location=:lc")
public class BusStandDTO extends AbstractDTO{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int noOfBusses;
	private String location;
	private int noOfPlatform;
	private int noOfShop;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfBusses() {
		return noOfBusses;
	}

	public void setNoOfBusses(int noOfBusses) {
		this.noOfBusses = noOfBusses;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfPlatform() {
		return noOfPlatform;
	}

	public void setNoOfPlatform(int noOfPlatform) {
		this.noOfPlatform = noOfPlatform;
	}

	public int getNoOfShop() {
		return noOfShop;
	}

	public void setNoOfShop(int noOfShop) {
		this.noOfShop = noOfShop;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "BusStandDTO [ id=" + id + "  ,name=" + name + ", noOfBusses=" + noOfBusses + ", location=" + location
				+ ", noOfPlatform=" + noOfPlatform + ", noOfShop=" + noOfShop + ", city=" + city + "]";
	}

}
