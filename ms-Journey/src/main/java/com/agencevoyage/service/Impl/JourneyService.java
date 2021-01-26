package com.agencevoyage.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.Journey;
import com.agencevoyage.repositories.IJourneyRepository;
import com.agencevoyage.service.IJourneyService;

@Service
public class JourneyService implements IJourneyService{
	
	@Autowired
	public IJourneyRepository journeyRepository;

	@Override
	public Journey saveJourney(Journey Journey) {
		return journeyRepository.save(Journey);
	}

	@Override
	public void deleteJourney(Long idJourney) {
		journeyRepository.deleteById(idJourney);;
	}

	@Override
	public List<Journey> getJourneys() {
		return journeyRepository.findAll();
	}

	@Override
	public Journey getJourney(Long idJourney) {
		return journeyRepository.findById(idJourney).get();
	}

}
