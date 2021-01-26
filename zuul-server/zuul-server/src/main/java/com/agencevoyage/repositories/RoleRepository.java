package com.agencevoyage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencevoyage.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
