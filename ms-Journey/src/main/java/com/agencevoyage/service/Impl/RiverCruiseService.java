package com.agencevoyage.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.RiverCruise;
import com.agencevoyage.repositories.IRiverCruiseRepository;
import com.agencevoyage.service.IRiverCruiseService;

@Service
public class RiverCruiseService implements IRiverCruiseService{
	
	@Autowired
	public IRiverCruiseRepository riverCruiseRepository;

	@Override
	public RiverCruise saveRiverCruise(RiverCruise RiverCruise) {
		return riverCruiseRepository.save(RiverCruise);
	}

	@Override
	public void deleteRiverCruise(Long idRiverCruise) {
		riverCruiseRepository.deleteById(idRiverCruise);;
	}

	@Override
	public List<RiverCruise> getRiverCruises() {
		return riverCruiseRepository.findAll();
	}

	@Override
	public RiverCruise getRiverCruise(Long idRiverCruise) {
		return riverCruiseRepository.findById(idRiverCruise).get();
	}


}
