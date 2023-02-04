package com.api.condominiumcontrol.dtos;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

public class UsersDto {
	
	@NotBlank // verifica se o campo nao é vazio
	@Size(max = 70)
	private String nameUser;
	@NotBlank
	@Size(max = 70)
	private String firstName;
	@NotBlank
	@Size(max = 70)
	private String lastName;
	@NotBlank
	@Size(max = 70)
	private String docUser;
	private String birthDate;
	private Boolean active;
	private String cellPhone1;
	private String cellPhone2;
	@Email
	private String email;
	
	
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDocUser() {
		return docUser;
	}
	public void setDocUser(String docUser) {
		this.docUser = docUser;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getCellPhone1() {
		return cellPhone1;
	}
	public void setCellPhone1(String cellPhone1) {
		this.cellPhone1 = cellPhone1;
	}
	public String getCellPhone2() {
		return cellPhone2;
	}
	public void setCellPhone2(String cellPhone2) {
		this.cellPhone2 = cellPhone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
