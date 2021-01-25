package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.CustomerBean;
import com.clientui.proxies.MicroServiceCustomerProxies;

public class CustomerController {

	@Autowired
	private MicroServiceCustomerProxies customerProxies;

	@GetMapping(value = "/customers")
	public List<CustomerBean> getAll() {
		return customerProxies.getAll();
	}

	@GetMapping(value = "/customers/{cId}")
	public CustomerBean findOne(@PathVariable(value = "cId") Long id) {
		return customerProxies.findOne(id);
	}

	@PostMapping(value = "/customers")
	public CustomerBean create(@RequestBody CustomerBean cIn) {
		return customerProxies.create(cIn);
	}

	@DeleteMapping(value = "/customers/{cId}")
	public void delete(@PathVariable(value = "cId") Long id) {
		customerProxies.delete(id);
	}

	@PutMapping(value = "/customers/{cId}")
	public CustomerBean update(@PathVariable(value = "cId") Long id, @RequestBody CustomerBean cIn) {
		return customerProxies.update(id, cIn);
	}
}
