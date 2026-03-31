package com.job_intel.backend.repositories;

import com.job_intel.backend.models.Job;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

    Job findJobById(Long id);

    @Override
    @NonNull
    Page<Job> findAll(@NonNull Pageable pageable);

    @Query("""
SELECT DISTINCT j
FROM Job j
JOIN j.company c
LEFT JOIN j.jobSkills js
LEFT JOIN js.skill s
WHERE 
    (:skills IS NULL OR s.name IN :skills)
AND (:location IS NULL OR j.location = :location)
AND (:minSalary IS NULL OR j.salaryMin >= :minSalary)
AND (:maxSalary IS NULL OR j.salaryMax <= :maxSalary)
AND (:title IS NULL OR LOWER(j.title) LIKE LOWER(CONCAT('%', CAST(:title AS string), '%')))
""")
    Page<Job> filterJobs(
            @Param("skills") List<String> skills,
            @Param("location") String location,
            @Param("minSalary") Integer minSalary,
            @Param("maxSalary") Integer maxSalary,
            @Param("title") String title,
            @Param("page") Pageable page
    );
}
