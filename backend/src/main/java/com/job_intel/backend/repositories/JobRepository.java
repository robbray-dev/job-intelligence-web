package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {

}
