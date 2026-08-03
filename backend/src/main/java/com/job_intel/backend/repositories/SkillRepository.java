package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Skill;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    boolean existsByName(String name);

    Optional<Skill> findByName(String name);

}
