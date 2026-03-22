package com.job_intel.backend.services;

import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Job;

import java.util.List;
import java.util.Optional;

public interface IJobService {
    JobDto getJob(Long id);
    List<JobDto> getAllJobs();
    List<JobDto> getJobsByMultiSkill(String[] names);
}
