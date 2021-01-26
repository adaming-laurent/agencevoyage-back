package com.mlocation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlocation.entities.Location;
import com.mlocation.repositories.LocationRepository;
import com.mlocation.service.interfaces.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService{

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location findOne(Long id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public Location save(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void delete(Long id) {
		locationRepository.deleteById(id);
	}

}
