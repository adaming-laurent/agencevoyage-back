package com.moperating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moperating.entities.OperatingCompany;

@Repository
public interface OperatingCompanyRepository extends JpaRepository<OperatingCompany, Long>{

}
