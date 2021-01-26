package com.agencevoyage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agencevoyage.entities.Role;
import com.agencevoyage.service.interfaces.IRoleService;

@RestController
public class RoleController {

	@Autowired
	IRoleService roleService;

	@GetMapping(value = "roles")
	public List<Role> findAll() {
		return roleService.findAll();
	}

	@GetMapping(value = "roles/{idRole}")
	public Role findOne(@PathVariable("idRole") Long idRole) {
		return roleService.findOne(idRole);
	}

	@PostMapping(value = "roles")
	public Role save(@RequestBody Role role) {
		return roleService.save(role);
	}

	@DeleteMapping(value = "roles/{idRole}")
	public void delete(@PathVariable("idRole") Long idRole) {
		roleService.delete(idRole);

	}
}
