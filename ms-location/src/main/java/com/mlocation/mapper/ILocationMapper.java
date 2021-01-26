package com.mlocation.mapper;

import com.mlocation.DTO.LocationDTO;
import com.mlocation.entities.Location;

public interface ILocationMapper {
	LocationDTO convertToLocationDTO(Location location);
	Location convertToLocation(LocationDTO locationDTO);
}
