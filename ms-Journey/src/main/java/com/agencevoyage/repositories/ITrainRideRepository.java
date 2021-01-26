package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.TrainRide;

@Repository
public interface ITrainRideRepository extends JpaRepository<TrainRide, Long>{

	
}
