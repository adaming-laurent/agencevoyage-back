package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.CustomerBean;

@FeignClient(name = "microservice-customer", url = "localhost:9095/")
public interface MicroServiceCustomerProxies {

	@GetMapping(value = "/customers")
	public List<CustomerBean> getAll();

	@GetMapping(value = "/customers/{cId}")
	public CustomerBean findOne(@PathVariable(value = "cId") Long id);

	@PostMapping(value = "/customers")
	public CustomerBean create(@RequestBody CustomerBean cIn);

	@DeleteMapping(value = "/customers/{cId}")
	public void delete(@PathVariable(value = "cId") Long id);

	@PutMapping(value = "/customers/{cId}")
	public CustomerBean update(@PathVariable(value = "cId") Long id, @RequestBody CustomerBean cIn);
}
