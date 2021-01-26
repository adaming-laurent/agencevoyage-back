package com.agencevoyage.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.TrainRide;
import com.agencevoyage.repositories.ITrainRideRepository;
import com.agencevoyage.service.ITrainRideService;

@Service
public class TrainRideService implements ITrainRideService{
	
	@Autowired
	public ITrainRideRepository trainRideRepository;

	@Override
	public TrainRide saveTrainRide(TrainRide TrainRide) {
		return trainRideRepository.save(TrainRide);
	}

	@Override
	public void deleteTrainRide(Long idTrainRide) {
		trainRideRepository.deleteById(idTrainRide);;
	}

	@Override
	public List<TrainRide> getTrainRides() {
		return trainRideRepository.findAll();
	}

	@Override
	public TrainRide getTrainRide(Long idTrainRide) {
		return trainRideRepository.findById(idTrainRide).get();
	}

}
