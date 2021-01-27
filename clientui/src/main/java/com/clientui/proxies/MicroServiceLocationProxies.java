package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.LocationBean;

@FeignClient(name = "microservice-location", url = "localhost:9125/")
public interface MicroServiceLocationProxies {
	
	@GetMapping(value="/locations")
	List<LocationBean> findAllLocation();
	
	@GetMapping(value="/locations/{id}")
	public LocationBean findOneLocation(@PathVariable("id") Long id);
	
	@PostMapping(value="/locations")
	public LocationBean saveLocation(@RequestBody LocationBean location);
	
	@PutMapping(value="/locations/{id}")
	public LocationBean updateLocation(@PathVariable("id") Long id, @RequestBody LocationBean location);
	
	@DeleteMapping(value = "/locations/{id}")
	void deleteLocation(@PathVariable("id") Long id);

}
