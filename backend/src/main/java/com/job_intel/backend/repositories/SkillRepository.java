package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
