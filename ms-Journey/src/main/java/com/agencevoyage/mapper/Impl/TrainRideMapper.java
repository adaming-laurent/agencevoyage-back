package com.agencevoyage.mapper.Impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.agencevoyage.dto.TrainRideDTO;
import com.agencevoyage.entities.TrainRide;
import com.agencevoyage.mapper.ITrainRideMapper;

@Component
public class TrainRideMapper implements ITrainRideMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public TrainRideDTO convertToTrainRideDTO(TrainRide TrainRide) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		TrainRideDTO TrainRideDTO = modelMapper.map(TrainRide, TrainRideDTO.class);
		
		return TrainRideDTO;
	}

	@Override
	public TrainRide convertToTrainRide(TrainRideDTO TrainRideDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		TrainRide TrainRide = modelMapper.map(TrainRideDTO, TrainRide.class);
		
		return TrainRide;
	}
}
