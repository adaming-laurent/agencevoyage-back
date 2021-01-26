package com.agencevoyage.mapper;

import com.agencevoyage.dto.CustomerDTO;
import com.agencevoyage.entities.Customer;

public interface ICustomerMapper {

	CustomerDTO convertToCustomerDTO(Customer customer);

	Customer convertToCustomer(CustomerDTO customerDTO);
}
