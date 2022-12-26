package com.xworkz.spring.server.oyo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oyo_rooms")
@NoArgsConstructor
@AllArgsConstructor

public class OyoRoomEntity {

	@Id
	private int id;
	private String area;
	private int totalRoom;
	private double cost;
	private String idProof;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	@Override
	public String toString() {
		return "OyoRoomEntity [id=" + id + ", area=" + area + ", totalRoom=" + totalRoom + ", cost=" + cost
				+ ", idProof=" + idProof + "]";
	}

}
