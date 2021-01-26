package com.moperating.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.moperating.DTO.OperatingDTO;
import com.moperating.entities.Operating;

@Component
public class OperatingMapper implements IOperatingMapper {
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public OperatingDTO convertToOperatingDTO(Operating operating) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		OperatingDTO operatingDTO = modelMapper.map(operating, OperatingDTO.class);
		return operatingDTO;	
	}

	@Override
	public Operating convertToOperating(OperatingDTO operatingDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Operating operating = modelMapper.map(operatingDTO, Operating.class);
		return operating;
	}
}
