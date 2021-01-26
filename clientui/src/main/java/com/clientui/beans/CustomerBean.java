package com.clientui.beans;

import java.time.LocalDate;

public class CustomerBean {

	private Long CustomerId;
	private String CustomerName;
	private LocalDate DateBecomeCustomer;
	private String Email;
	private Integer PhoneNumber;

	public CustomerBean() {
	}
	
	public CustomerBean(Long customerId, String customerName, LocalDate dateBecomeCustomer, String email,
			Integer phoneNumber) {
		CustomerId = customerId;
		CustomerName = customerName;
		DateBecomeCustomer = dateBecomeCustomer;
		Email = email;
		PhoneNumber = phoneNumber;
	}

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


	@Override
	public String toString() {
		return "CustomerBean [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", DateBecomeCustomer="
				+ DateBecomeCustomer + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
