package com.agencevoyage.mapper;

import com.agencevoyage.dto.JourneyDTO;
import com.agencevoyage.entities.Journey;

public interface IJourneyMapper {
	
	JourneyDTO convertToJourneyDTO(Journey Journey);
	
	Journey convertToJourney(JourneyDTO JourneyDTO);

}
