package com.xworkz.spring.server.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bike_db")
@Entity
@NamedQuery(name = "findByBrand", query = "select bike from BikeDTO bike where bike.brand=:bd")
public class BikeDTO {

	@Id
	private int id;
	private String brand;
	private String ownerName;
	private String location;
	private String ambassador;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	@Override
	public String toString() {
		return "BikeDTO [brand=" + brand + ", ownerName=" + ownerName + ", location=" + location + ", ambassador="
				+ ambassador + "]";
	}

}
