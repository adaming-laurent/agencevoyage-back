package com.moperating.controller;

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

import com.moperating.DTO.OperatingDTO;
import com.moperating.entities.Operating;
import com.moperating.mapper.IOperatingMapper;
import com.moperating.service.interfaces.IOperatingService;

@RestController
@CrossOrigin
public class OperatingCompanyController {
	@Autowired
	IOperatingService ioperatingCompanyService;
	
	@Autowired
	IOperatingMapper operatingMapper;
	
	@GetMapping("/operatings")
	public List<OperatingDTO> findAll() {
		return (List<OperatingDTO>) ioperatingCompanyService.findAll().stream().map(o->operatingMapper.convertToOperatingDTO(o)).collect(Collectors.toList());
	}
	
	@GetMapping("/operatings/{idOperating}")
	public Operating findOne(@PathParam("idOperating") Long id) {
		return ioperatingCompanyService.findOne(id);
	}
	
	@PostMapping("/operatings")
	public OperatingDTO save(@RequestBody Operating operating) {
		return operatingMapper.convertToOperatingDTO(ioperatingCompanyService.save(operating));
	}

	@DeleteMapping("/operatings/{idOperating}")
	public void delete(@PathParam("idOperating") Long id) {
		ioperatingCompanyService.delete(id);
	}
	
	@PutMapping("/operatings/{id}")
	public OperatingDTO updateOperating(@PathVariable("id") Long id, @RequestBody Operating operating) {
		Operating currentOperating = ioperatingCompanyService.findOne(id);
		currentOperating.setOperatingCompanyName(operating.getOperatingCompanyName());
		currentOperating.setOperatingCompanyDetails(operating.getOperatingCompanyDetails());
		return operatingMapper.convertToOperatingDTO(ioperatingCompanyService.save(currentOperating));
	}
}
