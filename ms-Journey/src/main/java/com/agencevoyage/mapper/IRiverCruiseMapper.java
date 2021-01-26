package com.agencevoyage.mapper;

import com.agencevoyage.dto.RiverCruiseDTO;
import com.agencevoyage.entities.RiverCruise;

public interface IRiverCruiseMapper {
	
	RiverCruiseDTO convertToRiverCruiseDTO(RiverCruise RiverCruise);
	
	RiverCruise convertToRiverCruise(RiverCruiseDTO RiverCruiseDTO);

}
