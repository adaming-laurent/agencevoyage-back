package com.agencevoyage.mapper.Impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.agencevoyage.dto.FlightDTO;
import com.agencevoyage.entities.Flight;
import com.agencevoyage.mapper.IFlightMapper;

@Component
public class FlightMapper implements IFlightMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public FlightDTO convertToFlightDTO(Flight Flight) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		FlightDTO FlightDTO = modelMapper.map(Flight, FlightDTO.class);
		
		return FlightDTO;
	}

	@Override
	public Flight convertToFlight(FlightDTO FlightDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Flight Flight = modelMapper.map(FlightDTO, Flight.class);
		
		return Flight;
	}
}
