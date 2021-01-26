package com.agencevoyage.mapper.Impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.agencevoyage.dto.RiverCruiseDTO;
import com.agencevoyage.entities.RiverCruise;
import com.agencevoyage.mapper.IRiverCruiseMapper;

@Component
public class RiverCruiseMapper implements IRiverCruiseMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public RiverCruiseDTO convertToRiverCruiseDTO(RiverCruise RiverCruise) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		RiverCruiseDTO RiverCruiseDTO = modelMapper.map(RiverCruise, RiverCruiseDTO.class);
		
		return RiverCruiseDTO;
	}

	@Override
	public RiverCruise convertToRiverCruise(RiverCruiseDTO RiverCruiseDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		RiverCruise RiverCruise = modelMapper.map(RiverCruiseDTO, RiverCruise.class);
		
		return RiverCruise;
	}
	
}
