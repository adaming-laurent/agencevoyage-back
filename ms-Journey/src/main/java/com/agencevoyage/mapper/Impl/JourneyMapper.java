package com.agencevoyage.mapper.Impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.agencevoyage.dto.JourneyDTO;
import com.agencevoyage.entities.Journey;
import com.agencevoyage.mapper.IJourneyMapper;

@Component
public class JourneyMapper implements IJourneyMapper {

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public JourneyDTO convertToJourneyDTO(Journey Journey) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		JourneyDTO JourneyDTO = modelMapper.map(Journey, JourneyDTO.class);
		
		return JourneyDTO;
	}

	@Override
	public Journey convertToJourney(JourneyDTO JourneyDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Journey Journey = modelMapper.map(JourneyDTO, Journey.class);
		
		return Journey;
	}
}
