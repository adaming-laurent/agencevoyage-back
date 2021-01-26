package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.Journey;

@Repository
public interface IJourneyRepository extends JpaRepository<Journey, Long>{

}
