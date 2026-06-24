package com.job_intel.backend.repositories;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.Dtos.SkillVelocityDto;
import com.job_intel.backend.Dtos.comboDTO;
import com.job_intel.backend.Dtos.datePostingDto;
import com.job_intel.backend.models.Job;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    List<HiringCompaniesDto> getHiringCompanies(Pageable p);

    //insertCombo

    @Transactional
    @Modifying
    @NativeQuery(value = """
INSERT INTO combos (skill_arr, rank_number)
SELECT array_agg(skills.name) as skill_arr, ?2
FROM skills
WHERE skills.id IN (?1);
""")
    void insertCombo(List<Long> skillIds, Long rankNum);

    @NativeQuery(value = """
SELECT skill_arr, rank_number
FROM combos
""")
    List<comboDTO> getCombos();


    @NativeQuery(value = """
WITH counters AS (SELECT s.name, COUNT(CASE WHEN j.posted_date BETWEEN '2026-03-01' AND '2026-03-31' THEN 1 END) AS "previous_period_count", COUNT(CASE WHEN j.posted_date BETWEEN '2026-04-01' AND '2026-04-30' THEN 1 END) AS "current_period_count"
   FROM job_skills js
   JOIN skills s on s.id = js.skill_id
   JOIN jobs j on j.id = js.job_id
   GROUP BY s.name)

SELECT name, CASE WHEN previous_period_count = 0 THEN (CAST((current_period_count - previous_period_count) AS DECIMAL )/ 1) * 100
ELSE (CAST((current_period_count - previous_period_count) AS DECIMAL) / previous_period_count) * 100
END AS "growth_rate"
FROM counters
""")
    List<SkillVelocityDto> getSkillVelocity(Pageable p);


    @NativeQuery(value = """
select posted_date, count(*) as "job_postings" 
from jobs j
group by posted_date
            """)
    List<datePostingDto> getDatesPosting(Pageable p);





}