package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.OperatingBean;

@FeignClient(name = "microservice-operating", url = "localhost:9121/")
public interface MicroServiceOperatingProxies {
	
	@GetMapping(value="/operatings")
	List<OperatingBean> findAllOperating();
	
	@GetMapping(value="/operatings/{id}")
	public OperatingBean findOneOperating(@PathVariable("id") Long id);
	
	@PostMapping(value="/operatings")
	public OperatingBean saveOperating(@RequestBody OperatingBean operating);
	
	@PutMapping(value="/operatings/{id}")
	public OperatingBean updateOperating(@PathVariable("id") Long id, @RequestBody OperatingBean operating);
	
	@DeleteMapping(value = "/operatings/{id}")
	void deleteOperating(@PathVariable("id") Long id);
}
