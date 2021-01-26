package com.moperating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moperating.entities.Operating;

@Repository
public interface OperatingRepository extends JpaRepository<Operating, Long>{

}
