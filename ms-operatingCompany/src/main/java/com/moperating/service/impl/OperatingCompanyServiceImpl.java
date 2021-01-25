package com.moperating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moperating.entities.OperatingCompany;
import com.moperating.repositories.OperatingCompanyRepository;
import com.moperating.service.interfaces.IOperatingCompanyService;

@Service
public class OperatingCompanyServiceImpl implements IOperatingCompanyService{
	@Autowired
	OperatingCompanyRepository operatingCompanyRepository;

	@Override
	public List<OperatingCompany> findAll() {
		return operatingCompanyRepository.findAll();
	}

	@Override
	public OperatingCompany findOne(Long id) {
		return operatingCompanyRepository.findById(id).get();
	}

	@Override
	public OperatingCompany save(OperatingCompany operatingCompany) {
		return operatingCompanyRepository.save(operatingCompany);
	}

	@Override
	public void delete(Long id) {
		operatingCompanyRepository.deleteById(id);
	}

}
