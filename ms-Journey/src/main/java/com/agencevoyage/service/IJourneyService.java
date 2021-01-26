package com.agencevoyage.service;

import java.util.List;

import com.agencevoyage.entities.Journey;

public interface IJourneyService {
	
	public Journey saveJourney(Journey Journey);
	
	public void deleteJourney(Long idJourney);
	
	public List<Journey> getJourneys();
	
	public Journey getJourney(Long idJourney);

}
