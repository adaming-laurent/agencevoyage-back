package com.agencevoyage.mapper;

import com.agencevoyage.dto.TrainRideDTO;
import com.agencevoyage.entities.TrainRide;

public interface ITrainRideMapper {

	TrainRideDTO convertToTrainRideDTO(TrainRide TrainRide);
	
	TrainRide convertToTrainRide(TrainRideDTO TrainRideDTO);
}
