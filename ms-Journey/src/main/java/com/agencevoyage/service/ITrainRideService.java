package com.agencevoyage.service;

import java.util.List;

import com.agencevoyage.entities.TrainRide;

public interface ITrainRideService {

	public TrainRide saveTrainRide(TrainRide TrainRide);
	
	public void deleteTrainRide(Long idTrainRide);
	
	public List<TrainRide> getTrainRides();
	
	public TrainRide getTrainRide(Long idTrainRide);
}
