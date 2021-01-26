package com.mlocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlocation.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{

}
