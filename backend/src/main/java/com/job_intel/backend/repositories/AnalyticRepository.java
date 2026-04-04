package com.job_intel.backend.repositories;

import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalyticRepository extends JpaRepository<Job, Long>{
    @Query("""
SELECT new com.job_intel.backend.Dtos.SalarySkillPointDto(
    j.title,
    COUNT(s.id),
    (j.salaryMin + j.salaryMax) / 2.0
)
FROM Job j
JOIN j.jobSkills js
JOIN js.skill s
WHERE j.salaryMin IS NOT NULL
AND j.salaryMax IS NOT NULL
GROUP BY j.id, j.title, j.salaryMin, j.salaryMax
""")
    List<SalarySkillPointDto> getSalaryVsSkills();
}
