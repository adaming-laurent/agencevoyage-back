package com.agencevoyage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencevoyage.entities.Role;
import com.agencevoyage.repositories.RoleRepository;
import com.agencevoyage.service.interfaces.IRoleService;

@Service
public class RoleServiceImp implements IRoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long idRole) {
		return roleRepository.findById(idRole).get();
	}

	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void delete(Long idRole) {
		roleRepository.deleteById(idRole);

	}
}
