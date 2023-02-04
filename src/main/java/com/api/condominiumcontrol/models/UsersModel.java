package com.api.condominiumcontrol.models;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
/*
 * É um listener de entidade fornecido pelo Spring DAta JPA, 
 * que pode ser usado para acionar a coleta de dados de auditoria */
@EntityListeners(AuditingEntityListener.class)

@Table(name = "TB01_USERS")
public class UsersModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "name_user", nullable = false, unique = true, length = 70)
	private String nameUser;
	@Column(name = "first_name", nullable = false, unique = false, length = 70)
	private String firstName;
	@Column(name = "last_name", nullable = false, unique = false, length = 70)
	private String lastName;
	@Column(name = "doc_user", nullable = true, unique = true, length = 70)
	private String docUser;
	@Column(name = "birth_date", nullable = true)
	private Date birthDate;
	@Column(name = "active")
	private Boolean active;
	@Column(name = "cell_phone1", length = 20)
	private String cellPhone1;
	@Column(name = "cell_phone2", length = 20)
	private String cellPhone2;
	@Column(name = "email", length = 70)
	private String email;
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	@LastModifiedDate 
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
	private Date updatedAt;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		this.birthDate = sdf1.parse((birthDate));
		
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
