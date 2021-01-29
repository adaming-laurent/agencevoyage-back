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

import com.agencevoyage.dto.RiverCruiseDTO;
import com.agencevoyage.entities.RiverCruise;
import com.agencevoyage.mapper.IRiverCruiseMapper;
import com.agencevoyage.service.IRiverCruiseService;

@CrossOrigin
@RestController
public class RiverCruiseController {

	@Autowired
	IRiverCruiseMapper RiverCruiseMapper;
	
	@Autowired
	IRiverCruiseService RiverCruiseService;
	
	@GetMapping("/riverCruises")
	public List<RiverCruiseDTO> findAll(){
		return (List<RiverCruiseDTO>)RiverCruiseService.getRiverCruises().stream().map(e->
		RiverCruiseMapper.convertToRiverCruiseDTO(e)).collect(Collectors.toList());
				
	}
	
	@GetMapping("/riverCruises/{id}")
	public RiverCruiseDTO findOne(@PathVariable("id") Long id) {
		return RiverCruiseMapper.convertToRiverCruiseDTO(RiverCruiseService.getRiverCruise(id));
		
	}
	
	@PostMapping("/riverCruises")
	public RiverCruiseDTO saveRiverCruise(@RequestBody RiverCruise RiverCruise) {
		return RiverCruiseMapper.convertToRiverCruiseDTO(RiverCruiseService.saveRiverCruise(RiverCruise));
	}
	
//	@PutMapping("/RiverCruises/{id}")
//	public RiverCruiseDTO updateRiverCruise(@RequestBody RiverCruise RiverCruise, @PathVariable("id")Long id ) {
//		RiverCruise currentRiverCruise = RiverCruiseService.getRiverCruise(id);
//		currentRiverCruise.setNom(RiverCruise.getNom());
//		currentRiverCruise.setPrix(RiverCruise.getPrix());
//		currentRiverCruise.setCommande(RiverCruise.getCommande());
//		return RiverCruiseMapper.convertToRiverCruiseDTO(RiverCruiseService.saveRiverCruise(currentRiverCruise));
//	}
	
	@DeleteMapping("/riverCruises/{id}")
	public void deleteRiverCruise(@PathVariable("id") Long id) {
		RiverCruiseService.deleteRiverCruise(id);

	}
}
