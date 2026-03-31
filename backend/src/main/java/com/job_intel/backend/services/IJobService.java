package com.job_intel.backend.services;

import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Job;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IJobService {
    JobDto getJob(Long id);
    List<JobDto> getAllJobs(Pageable p);
    List<JobDto> filterJobs(
            List<String> skills,
            String location,
            Integer minSalary,
            Integer maxSalary,
            String title,
            Pageable p
    );
}
