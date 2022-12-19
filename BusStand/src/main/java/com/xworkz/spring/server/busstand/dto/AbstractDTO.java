package com.xworkz.spring.server.busstand.dto;

import java.time.LocalDateTime;

public abstract class AbstractDTO {

	private String createdBy="SYSTEM";
	private LocalDateTime createdDateTime=LocalDateTime.now();

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDateTime;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDateTime = createdDate;
	}

}
