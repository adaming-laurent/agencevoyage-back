package com.agencevoyage.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.agencevoyage.dto.CustomerDTO;
import com.agencevoyage.entities.Customer;

@Component
public class CustomerMapper implements ICustomerMapper {

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public CustomerDTO convertToCustomerDTO(Customer customer) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
		return customerDTO;
	}

	@Override
	public Customer convertToCustomer(CustomerDTO customerDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		return customer;
	}

}
