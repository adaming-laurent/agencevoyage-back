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

import com.agencevoyage.dto.TrainRideDTO;
import com.agencevoyage.entities.TrainRide;
import com.agencevoyage.mapper.ITrainRideMapper;
import com.agencevoyage.service.ITrainRideService;

@CrossOrigin
@RestController
public class TrainRideController {

	@Autowired
	ITrainRideMapper TrainRideMapper;
	
	@Autowired
	ITrainRideService TrainRideService;
	
	@GetMapping("/TrainRides")
	public List<TrainRideDTO> findAll(){
		return (List<TrainRideDTO>)TrainRideService.getTrainRides().stream().map(e->
		TrainRideMapper.convertToTrainRideDTO(e)).collect(Collectors.toList());
				
	}
	
	@GetMapping("/TrainRides/{id}")
	public TrainRideDTO findOne(@PathVariable("id") Long id) {
		return TrainRideMapper.convertToTrainRideDTO(TrainRideService.getTrainRide(id));
		
	}
	
	@PostMapping("/TrainRides")
	public TrainRideDTO saveTrainRide(@RequestBody TrainRide TrainRide) {
		return TrainRideMapper.convertToTrainRideDTO(TrainRideService.saveTrainRide(TrainRide));
	}
	
//	@PutMapping("/TrainRides/{id}")
//	public TrainRideDTO updateTrainRide(@RequestBody TrainRide TrainRide, @PathVariable("id")Long id ) {
//		TrainRide currentTrainRide = TrainRideService.getTrainRide(id);
//		currentTrainRide.setNom(TrainRide.getNom());
//		currentTrainRide.setPrix(TrainRide.getPrix());
//		currentTrainRide.setCommande(TrainRide.getCommande());
//		return TrainRideMapper.convertToTrainRideDTO(TrainRideService.saveTrainRide(currentTrainRide));
//	}
	
	@DeleteMapping("/TrainRides/{id}")
	public void deleteTrainRide(@PathVariable("id") Long id) {
		TrainRideService.deleteTrainRide(id);

	}
}
