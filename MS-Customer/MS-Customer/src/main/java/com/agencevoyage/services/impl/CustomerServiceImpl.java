package com.agencevoyage.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.Customer;
import com.agencevoyage.repositories.ICustomerRepository;
import com.agencevoyage.services.interfaces.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository repoCustomer;

	@Override
	public List<Customer> getAll() {
		return repoCustomer.findAll();
	}

	@Override
	public Customer findOne(Long id) {
		return repoCustomer.findById(id).get();
	}

	@Override
	public Customer save(Customer cIn) {
		return repoCustomer.save(cIn);
	}

	@Override
	public void delete(Long id) {
		repoCustomer.deleteById(id);

	}

}
