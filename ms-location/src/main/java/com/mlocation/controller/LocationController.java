package com.mlocation.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlocation.mapper.ILocationMapper;
import com.mlocation.service.interfaces.ILocationService;
import com.mlocation.DTO.LocationDTO;
import com.mlocation.entities.Location;

@RestController
@CrossOrigin
public class LocationController {
	@Autowired
	ILocationService ilocationService;
	
	@Autowired
	ILocationMapper ilocationMapper;
	
	@GetMapping("/locations")
	public List<LocationDTO> findAll() {
		return (List<LocationDTO>) ilocationService.findAll().stream().map(o->ilocationMapper.convertToLocationDTO(o)).collect(Collectors.toList());
	}
	
	@GetMapping("/locations/{idLocation}")
	public LocationDTO findOne(@PathParam("idLocation") Long id) {
		return ilocationMapper.convertToLocationDTO(ilocationService.findOne(id));
	}
	
	@PostMapping("/locations")
	public LocationDTO save(@RequestBody Location location) {
		return ilocationMapper.convertToLocationDTO(ilocationService.save(location));
	}

	@DeleteMapping("/locations/{idLocation}")
	public void delete(@PathParam("idLocation") Long id) {
		ilocationService.delete(id);
	}
	
	@PutMapping("/locations/{id}")
	public LocationDTO updateLocation(@PathVariable("id") Long id, @RequestBody Location location) {
		Location currentLocation = ilocationService.findOne(id);
		currentLocation.setLocationCode(location.getLocationCode());
		currentLocation.setLocationName(location.getLocationName());
		return ilocationMapper.convertToLocationDTO(ilocationService.save(currentLocation));
	}

}
