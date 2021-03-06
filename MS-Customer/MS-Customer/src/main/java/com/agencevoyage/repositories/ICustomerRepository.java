package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
