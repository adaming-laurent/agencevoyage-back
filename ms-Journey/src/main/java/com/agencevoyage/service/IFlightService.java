package com.agencevoyage.service;

import java.util.List;

import com.agencevoyage.entities.Flight;

public interface IFlightService {

	public Flight saveFlight(Flight Flight);
	
	public void deleteFlight(Long idFlight);
	
	public List<Flight> getFlights();
	
	public Flight getFlight(Long idFlight);
}
