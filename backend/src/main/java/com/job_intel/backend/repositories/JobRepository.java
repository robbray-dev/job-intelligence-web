package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

    Job findJobById(Long id);
    List<Job> findDistinctByJobSkills_Skill_NameIn(String[] names);
}
