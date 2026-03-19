package com.job_intel.backend.repositories;

import com.job_intel.backend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job,Long> {

}
