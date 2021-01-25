package com.moperating.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moperating.entities.OperatingCompany;
import com.moperating.service.interfaces.IOperatingCompanyService;

@RestController
public class OperatingCompanyController {
	@Autowired
	IOperatingCompanyService ioperatingCompanyService;
	
	@GetMapping("/operatings")
	public List<OperatingCompany> findAll() {
		return ioperatingCompanyService.findAll();
	}
	
	@GetMapping("/operatings/{idOperating}")
	public OperatingCompany findOne(@PathParam("idOperating") Long id) {
		return ioperatingCompanyService.findOne(id);
	}

	@PostMapping("/operatings")
	public OperatingCompany save(@RequestBody OperatingCompany operatingCompany) {
		return ioperatingCompanyService.save(operatingCompany);
	}

	@DeleteMapping("/operatings/{idOperating}")
	public void delete(@PathParam("idOperating") Long id) {
		ioperatingCompanyService.delete(id);
	}
}
