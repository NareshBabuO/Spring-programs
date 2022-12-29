package com.xworkz.spring.mall.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mall_admin")
public class AdminDTO extends AbstractDTO {

	@Id
	private int id;
	private String name;
	private String password;
	private String mallName;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public AdminDTO(int id, String name, String password, String mallName) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mallName = mallName;
	}

}
