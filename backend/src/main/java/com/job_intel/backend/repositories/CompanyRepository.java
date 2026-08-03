package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Company;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByName(String name);

    Optional<Company> findByName(String name);

}
