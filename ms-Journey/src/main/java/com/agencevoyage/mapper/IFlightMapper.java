package com.agencevoyage.mapper;

import com.agencevoyage.dto.FlightDTO;
import com.agencevoyage.entities.Flight;

public interface IFlightMapper {

	FlightDTO convertToFlightDTO(Flight Flight);
	
	Flight convertToFlight(FlightDTO FlightDTO);
}
