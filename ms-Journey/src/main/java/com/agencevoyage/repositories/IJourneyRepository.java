package com.agencevoyage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.Journey;

@Repository
public interface IJourneyRepository extends JpaRepository<Journey, Long> {

	public List<Journey> findByOperatingCompanyid(Long operatingCompanyid);

	public List<Journey> findByDestinationLocationCode(String destinationLocationCode);
}
