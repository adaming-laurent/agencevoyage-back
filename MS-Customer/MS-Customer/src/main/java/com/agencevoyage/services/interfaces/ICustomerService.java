package com.agencevoyage.services.interfaces;

import java.util.List;

import com.agencevoyage.entities.Customer;

public interface ICustomerService {

	List<Customer> getAll();

	Customer findOne(Long id);

	Customer save(Customer cIn);

	void delete(Long id);
}
