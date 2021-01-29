package com.agencevoyage.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agencevoyage.dto.FlightDTO;
import com.agencevoyage.entities.Flight;
import com.agencevoyage.mapper.IFlightMapper;
import com.agencevoyage.service.IFlightService;

@CrossOrigin
@RestController
public class FlightController {

	@Autowired
	IFlightMapper FlightMapper;
	
	@Autowired
	IFlightService FlightService;
	
	@GetMapping("/flights")
	public List<FlightDTO> findAll(){
		return (List<FlightDTO>)FlightService.getFlights().stream().map(e->
		FlightMapper.convertToFlightDTO(e)).collect(Collectors.toList());
				
	}
	
	@GetMapping("/flights/{id}")
	public FlightDTO findOne(@PathVariable("id") Long id) {
		return FlightMapper.convertToFlightDTO(FlightService.getFlight(id));
		
	}
	
	@PostMapping("/flights")
	public FlightDTO saveFlight(@RequestBody Flight Flight) {
		return FlightMapper.convertToFlightDTO(FlightService.saveFlight(Flight));
	}
	
//	@PutMapping("/Flights/{id}")
//	public FlightDTO updateFlight(@RequestBody Flight Flight, @PathVariable("id")Long id ) {
//		Flight currentFlight = FlightService.getFlight(id);
//		currentFlight.setNom(Flight.getNom());
//		currentFlight.setPrix(Flight.getPrix());
//		currentFlight.setCommande(Flight.getCommande());
//		return FlightMapper.convertToFlightDTO(FlightService.saveFlight(currentFlight));
//	}
	
	@DeleteMapping("/flights/{id}")
	public void deleteFlight(@PathVariable("id") Long id) {
		FlightService.deleteFlight(id);

	}
}
