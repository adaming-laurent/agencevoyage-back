package com.moperating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moperating.entities.Operating;
import com.moperating.repositories.OperatingRepository;
import com.moperating.service.interfaces.IOperatingService;

@Service
public class OperatingServiceImpl implements IOperatingService{
	@Autowired
	OperatingRepository operatingRepository;

	@Override
	public List<Operating> findAll() {
		return operatingRepository.findAll();
	}

	@Override
	public Operating findOne(Long id) {
		return operatingRepository.findById(id).get();
	}

	@Override
	public Operating save(Operating operating) {
		return operatingRepository.save(operating);
	}

	@Override
	public void delete(Long id) {
		operatingRepository.deleteById(id);
	}

}
