package com.job_intel.backend.repositories;

import com.job_intel.backend.Dtos.JobSkillDto;
import com.job_intel.backend.models.JobSkill;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSkillRepository extends JpaRepository<JobSkill, Long> {

    @NonNull
    @Query(value = """
SELECT job_id, skill_id
FROM job_skills
""", nativeQuery = true)
    List<JobSkillDto> findAllAsDto();
}
