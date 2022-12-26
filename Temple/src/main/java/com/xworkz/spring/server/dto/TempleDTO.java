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
@Entity
@Table(name="temple_sp")
@NamedQuery(name = "findByGod",query = "select temple from TempleDTO temple where temple.mainGod=:gd")
public class TempleDTO {

	@Id
	private int id;
	private String name;
	private String location;
	private int pincode;
	private String mainGod;
	private double fee;
	private double openTime;
	private double closeTime;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", pincode=" + pincode
				+ ", mainGod=" + mainGod + ", fee=" + fee + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}

}
