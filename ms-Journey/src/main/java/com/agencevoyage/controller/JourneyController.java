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

import com.agencevoyage.dto.JourneyDTO;
import com.agencevoyage.entities.Journey;
import com.agencevoyage.mapper.IJourneyMapper;
import com.agencevoyage.service.IJourneyService;

@CrossOrigin
@RestController
public class JourneyController {

	@Autowired
	IJourneyMapper journeyMapper;
	
	@Autowired
	IJourneyService journeyService;
	
	@GetMapping("/journeys")
	public List<JourneyDTO> findAll(){
		return (List<JourneyDTO>)journeyService.getJourneys().stream().map(e->
		journeyMapper.convertToJourneyDTO(e)).collect(Collectors.toList());
				
	}
	
	@GetMapping("/journeys/{id}")
	public JourneyDTO findOne(@PathVariable("id") Long id) {
		return journeyMapper.convertToJourneyDTO(journeyService.getJourney(id));
		
	}
	
	@PostMapping("/Journeys")
	public JourneyDTO saveJourney(@RequestBody Journey Journey) {
		return journeyMapper.convertToJourneyDTO(journeyService.saveJourney(Journey));
	}
	
//	@PutMapping("/journeys/{id}")
//	public JourneyDTO updateJourney(@RequestBody Journey Journey, @PathVariable("id")Long id ) {
//		Journey currentJourney = journeyService.getJourney(id);
//		currentJourney.setOriginLocationCode(Journey.getOriginLocationCode());
//		currentJourney.setDestinationLocationCode(Journey.getDestinationLocationCode());
//		currentJourney.setOperatingCompanyid(Journey.getOperatingCompanyid());
//		currentJourney.setStartDateAndTime(Journey.getStartDateAndTime());
//		currentJourney.setEndDateAndTime(Journey.getEndDateAndTime());
//		currentJourney.setOtherDetails(Journey.getOtherDetails());
//		return journeyMapper.convertToJourneyDTO(JourneyService.saveJourney(currentJourney));
//	}
	
	@DeleteMapping("/journeys/{id}")
	public void deleteJourney(@PathVariable("id") Long id) {
		journeyService.deleteJourney(id);

	}
}
