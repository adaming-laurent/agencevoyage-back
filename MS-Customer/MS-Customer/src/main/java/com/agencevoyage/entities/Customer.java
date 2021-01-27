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
	private Long CustomerId;
	private String CustomerName;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate DateBecomeCustomer;
	private String Email;
	private Integer PhoneNumber;
	
	private Long idJourney;

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public LocalDate getDateBecomeCustomer() {
		return DateBecomeCustomer;
	}

	public void setDateBecomeCustomer(LocalDate dateBecomeCustomer) {
		DateBecomeCustomer = dateBecomeCustomer;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	

	public Long getIdJourney() {
		return idJourney;
	}

	public void setIdJourney(Long idJourney) {
		this.idJourney = idJourney;
	}

	public Customer(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber) {
		CustomerId = customerId;
		CustomerName = customerName;
		DateBecomeCustomer = dateBecomeCustomer;
		Email = email;
		PhoneNumber = phoneNumber;
	}
	

	public Customer(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber, Long idJourney) {
		CustomerId = customerId;
		CustomerName = customerName;
		DateBecomeCustomer = dateBecomeCustomer;
		Email = email;
		PhoneNumber = phoneNumber;
		this.idJourney = idJourney;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", DateBecomeCustomer="
				+ DateBecomeCustomer + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + ", idJourney=" + idJourney
				+ "]";
	}

}
