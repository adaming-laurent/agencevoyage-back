package com.agencevoyage.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agencevoyage.dto.CustomerDTO;
import com.agencevoyage.entities.Customer;
import com.agencevoyage.mapper.CustomerMapper;
import com.agencevoyage.services.interfaces.ICustomerService;

@RestController
@CrossOrigin
public class CustomerController {

	@Autowired
	private ICustomerService servCustomer;

	@Autowired
	private CustomerMapper customerMapper;

	@GetMapping(value = "/customers")
	public List<CustomerDTO> getAll() {
		return (List<CustomerDTO>) servCustomer.getAll().stream().map(e -> customerMapper.convertToCustomerDTO(e))
				.collect(Collectors.toList());
	}

	@GetMapping(value = "/customers/{cId}")
	public CustomerDTO findOne(@PathVariable(value = "cId") Long id) {
		return customerMapper.convertToCustomerDTO(servCustomer.findOne(id));
	}

	@PostMapping(value = "/customers")
	public CustomerDTO create(@RequestBody Customer cIn) {
		cIn.setDateBecomeCustomer(LocalDate.now());
		return customerMapper.convertToCustomerDTO(servCustomer.save(cIn));
	}

	@DeleteMapping(value = "/customers/{cId}")
	public void delete(@PathVariable(value = "cId") Long id) {
		servCustomer.delete(id);
	}

	@PutMapping(value = "/customers/{cId}")
	public CustomerDTO update(@PathVariable(value = "cId") Long id, @RequestBody Customer cIn) {
		Customer cOut = servCustomer.findOne(id);
		cOut.setCustomerName(cIn.getCustomerName());
		cOut.setEmail(cIn.getEmail());
		cOut.setPhoneNumber(cIn.getPhoneNumber());
		return customerMapper.convertToCustomerDTO(servCustomer.save(cOut));

	}
}
