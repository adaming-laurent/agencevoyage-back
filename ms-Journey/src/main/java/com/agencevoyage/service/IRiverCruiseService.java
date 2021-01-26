package com.agencevoyage.service;

import java.util.List;

import com.agencevoyage.entities.RiverCruise;

public interface IRiverCruiseService {
	
	public RiverCruise saveRiverCruise(RiverCruise RiverCruise);
	
	public void deleteRiverCruise(Long idRiverCruise);
	
	public List<RiverCruise> getRiverCruises();
	
	public RiverCruise getRiverCruise(Long idRiverCruise);

}
