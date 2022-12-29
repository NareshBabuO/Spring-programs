package com.xworkz.spring.criminal.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "criminal_details")
@NamedQuery(name = "findByNameAndJailName", query = "select kalla from CriminalEntity kalla where "
		+ "(:nm is null or kalla.name=:nm) or " + "(:jn is null or kalla.jailName=:jn)")
public class CriminalEntity extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// @NotNull
	// @NotEmpty
	// @Size(min = 3, max = 50)
	private String name;
	// @NotNull
	// @NotEmpty
	// @Size(min = 3, max = 50)
	private String crime;
	private int totalYearsAwarded;
	// @NotNull
	// @NotEmpty
	// @Size(min = 3, max = 50)
	private String aliasName;
	// @NotNull
	// @NotEmpty
	// @Size(min = 3, max = 50)
	private String description;
	// @NotNull
	// @NotEmpty
	// @Size(min = 3, max = 50)
	private String jailName;
	private String fileName;
	private long fileSize;
	private String contentType;

	public CriminalEntity() {
		System.out.println("CriminalEntity using default constr");
		// TODO Auto-generated constructor stub
	}

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

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public int getTotalYearsAwarded() {
		return totalYearsAwarded;
	}

	public void setTotalYearsAwarded(int totalYearsAwarded) {
		this.totalYearsAwarded = totalYearsAwarded;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJailName() {
		return jailName;
	}

	public void setJailName(String jailName) {
		this.jailName = jailName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public CriminalEntity(int id, String name, String crime, int totalYearsAwarded, String aliasName,
			String description, String jailName, String fileName, long fileSize, String contentType) {
		super();
		this.id = id;
		this.name = name;
		this.crime = crime;
		this.totalYearsAwarded = totalYearsAwarded;
		this.aliasName = aliasName;
		this.description = description;
		this.jailName = jailName;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
	}

}
