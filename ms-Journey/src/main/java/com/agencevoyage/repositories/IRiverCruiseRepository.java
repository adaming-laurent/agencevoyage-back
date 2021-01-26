package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.RiverCruise;

@Repository
public interface IRiverCruiseRepository extends JpaRepository<RiverCruise, Long> {

}
