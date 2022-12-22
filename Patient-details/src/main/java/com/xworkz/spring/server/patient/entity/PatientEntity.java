package com.xworkz.spring.server.patient.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Data
@Table(name = "patient_details")
@NamedQuery(name = "findByNameOrAgeGreatherThanOrAgeLesserThan", query = "select rogi from PatientEntity rogi where rogi.name=:nm or (rogi.age>=:ag and rogi.age<=:al)")
@NamedQuery(name = "findByEmail", query = "select rogi from PatientEntity rogi where rogi.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select rogi from PatientEntity rogi where rogi.mobileNo=:mn")
public class PatientEntity extends AbstractEntity {

	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	private String gender;
	private String idProof;
	private long idValue;
	private boolean bplCard;
	private boolean insurence;
	@Transient
	private MultipartFile fileName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PatientEntity() {
		// TODO Auto-generated constructor stub
	}

	public PatientEntity(int id, String name, String email, int age, long mobileNo, String gender, String idProof,
			long idValue, boolean bplCard, boolean insurence, MultipartFile fileName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		this.bplCard = bplCard;
		this.insurence = insurence;
		this.fileName = fileName;
	}

	public PatientEntity(String name, String email, int age, long mobileNo, String gender, String idProof, long idValue,
			boolean bplCard, boolean insurence, MultipartFile fileName) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		this.bplCard = bplCard;
		this.insurence = insurence;
		this.fileName = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public long getIdValue() {
		return idValue;
	}

	public void setIdValue(long idValue) {
		this.idValue = idValue;
	}

	public boolean isBplCard() {
		return bplCard;
	}

	public void setBplCard(boolean bplCard) {
		this.bplCard = bplCard;
	}

	public boolean isInsurence() {
		return insurence;
	}

	public void setInsurence(boolean insurence) {
		this.insurence = insurence;
	}

	public MultipartFile getFileName() {
		return fileName;
	}

	public void setFile(MultipartFile fileName) {
		this.fileName = fileName;
	}

}
