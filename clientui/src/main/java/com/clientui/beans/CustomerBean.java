package com.clientui.beans;

import java.time.LocalDate;

public class CustomerBean {

	private Long customerId;
	private String customerName;
	private LocalDate dateBecomeCustomer;
	private String email;
	private Integer phoneNumber;

	private Long idJourney;

	public CustomerBean() {
	}

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

	public CustomerBean(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public CustomerBean(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber, Long idJourney) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.idJourney = idJourney;
	}

	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", dateBecomeCustomer="
				+ dateBecomeCustomer + ", email=" + email + ", phoneNumber=" + phoneNumber + ", idJourney=" + idJourney
				+ "]";
	}

}
