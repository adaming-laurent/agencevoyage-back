package com.moperating.mapper;

import com.moperating.DTO.OperatingDTO;
import com.moperating.entities.Operating;

public interface IOperatingMapper {
	
	OperatingDTO convertToOperatingDTO(Operating operating);
	
	Operating convertToOperating(OperatingDTO operatingDTO);
}
