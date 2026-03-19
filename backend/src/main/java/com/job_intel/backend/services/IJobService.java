package com.job_intel.backend.services;

import com.job_intel.backend.models.Job;

import java.util.Optional;

public interface IJobService {
    Optional<Job> getJob(Long id);
}
