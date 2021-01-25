package com.agencevoyage.dto;

import java.time.LocalDate;

import com.agencevoyage.jackson.LocalDateDeserializer;
import com.agencevoyage.jackson.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CustomerDTO {

	private Long CustomerId;
	private String CustomerName;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate DateBecomeCustomer;
	private String Email;
	private Integer PhoneNumber;

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

	public CustomerDTO(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber) {
		CustomerId = customerId;
		CustomerName = customerName;
		DateBecomeCustomer = dateBecomeCustomer;
		Email = email;
		PhoneNumber = phoneNumber;
	}

	public CustomerDTO() {
	}

	@Override
	public String toString() {
		return "CustomerDTO [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", DateBecomeCustomer="
				+ DateBecomeCustomer + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
