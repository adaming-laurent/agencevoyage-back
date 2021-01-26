package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long>{

}
