package com.moperating.controller;

import java.util.List;
import java.util.stream.Collectors;


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
public class OperatingController {
	@Autowired
	private IOperatingService ioperatingService;
	
	@Autowired
	private IOperatingMapper ioperatingMapper;
	
	@GetMapping("/operatings")
	public List<OperatingDTO> findAll() {
		return (List<OperatingDTO>) ioperatingService.findAll().stream().map(o->ioperatingMapper.convertToOperatingDTO(o)).collect(Collectors.toList());
	}
	
	@GetMapping("/operatings/{idOperating}")
	public OperatingDTO findOne(@PathVariable("idOperating") Long id) {
		return ioperatingMapper.convertToOperatingDTO(ioperatingService.findOne(id));
	}
	
	@PostMapping("/operatings")
	public OperatingDTO save(@RequestBody Operating operating) {
		return ioperatingMapper.convertToOperatingDTO(ioperatingService.save(operating));
	}

	@DeleteMapping("/operatings/{idOperating}")
	public void delete(@PathVariable("idOperating") Long id) {
		ioperatingService.delete(id);
	}
	
	@PutMapping("/operatings/{id}")
	public OperatingDTO updateOperating(@PathVariable("id") Long id, @RequestBody Operating operating) {
		Operating currentOperating = ioperatingService.findOne(id);
		currentOperating.setOperatingCompanyName(operating.getOperatingCompanyName());
		currentOperating.setOperatingCompanyDetails(operating.getOperatingCompanyDetails());
		return ioperatingMapper.convertToOperatingDTO(ioperatingService.save(currentOperating));
	}
}
