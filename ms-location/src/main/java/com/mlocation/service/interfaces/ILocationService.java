package com.mlocation.service.interfaces;

import java.util.List;

import com.mlocation.entities.Location;

public interface ILocationService {
	List<Location> findAll();
	Location findOne(Long id);
	Location save(Location location);
	void delete(Long id);

}
