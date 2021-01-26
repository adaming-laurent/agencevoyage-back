package com.mlocation.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mlocation.DTO.LocationDTO;
import com.mlocation.entities.Location;

@Component
public class LocationMapper implements ILocationMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public LocationDTO convertToLocationDTO(Location location) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		LocationDTO locationDTO = modelMapper.map(location, LocationDTO.class);
		return locationDTO;
	}

	@Override
	public Location convertToLocation(LocationDTO locationDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Location location = modelMapper.map(locationDTO, Location.class);
		return location;
	}

}
