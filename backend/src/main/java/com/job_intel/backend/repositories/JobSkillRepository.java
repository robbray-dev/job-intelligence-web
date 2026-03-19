package com.job_intel.backend.repositories;

import com.job_intel.backend.model.Job;
import com.job_intel.backend.model.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSkillRepository extends JpaRepository<JobSkill, Long> {



}
