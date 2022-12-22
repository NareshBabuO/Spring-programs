package com.xworkz.spring.server.patient.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public abstract class AbstractEntity {

	private String createdBy = "SYSTEM";
	private LocalDateTime createdDateTime = LocalDateTime.now();

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

}
