package com.agencevoyage.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.agencevoyage.jackson.LocalDateDeserializer;
import com.agencevoyage.jackson.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	private String customerName;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dateBecomeCustomer;
	private String email;
	private Integer phoneNumber;

	private Long idJourney;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateBecomeCustomer() {
		return dateBecomeCustomer;
	}

	public void setDateBecomeCustomer(LocalDate dateBecomeCustomer) {
		this.dateBecomeCustomer = dateBecomeCustomer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getIdJourney() {
		return idJourney;
	}

	public void setIdJourney(Long idJourney) {
		this.idJourney = idJourney;
	}

	public Customer(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Customer(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber, Long idJourney) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.idJourney = idJourney;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", dateBecomeCustomer="
				+ dateBecomeCustomer + ", email=" + email + ", phoneNumber=" + phoneNumber + ", idJourney=" + idJourney
				+ "]";
	}

}
