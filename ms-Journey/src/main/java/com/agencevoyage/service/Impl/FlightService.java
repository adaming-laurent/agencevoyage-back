package com.agencevoyage.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.Flight;
import com.agencevoyage.repositories.IFlightRepository;
import com.agencevoyage.service.IFlightService;

@Service
public class FlightService implements IFlightService{
	
	@Autowired
	public IFlightRepository flightRepository;

	@Override
	public Flight saveFlight(Flight Flight) {
		return flightRepository.save(Flight);
	}

	@Override
	public void deleteFlight(Long idFlight) {
		flightRepository.deleteById(idFlight);;
	}

	@Override
	public List<Flight> getFlights() {
		return flightRepository.findAll();
	}

	@Override
	public Flight getFlight(Long idFlight) {
		return flightRepository.findById(idFlight).get();
	}

}
