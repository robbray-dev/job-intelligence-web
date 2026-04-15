package com.job_intel.backend.repositories;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
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


    // query to find the hiring companies
    @Query(value = """
WITH counters AS (
  SELECT c.name, COUNT(CASE WHEN j.posted_date BETWEEN '2026-03-01' AND '2026-03-31' THEN 1 END) AS "previous_jobs", COUNT(CASE WHEN j.posted_date BETWEEN '2026-04-01' AND '2026-04-30' THEN 1 END) AS "current_jobs"
   FROM jobs j
   JOIN companies c on c.id = j.company_id
   GROUP BY c.name
)
SELECT name AS companyName, CASE WHEN previous_jobs = 0 THEN (CAST((current_jobs - previous_jobs) AS DECIMAL )/ 1) * 100
             ELSE (CAST((current_jobs - previous_jobs) AS DECIMAL) / previous_jobs) * 100
             END AS jobGrowthRate, current_jobs AS numOfJobs
FROM counters

""", nativeQuery = true)

    List<HiringCompaniesDto> getHiringCompanies();
}
