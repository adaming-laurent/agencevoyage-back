package com.moperating.service.interfaces;

import java.util.List;

import com.moperating.entities.Operating;

public interface IOperatingService {
	List<Operating> findAll();
	Operating findOne(Long id);
	Operating save(Operating operating);
	void delete(Long id);
}
