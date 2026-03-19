package com.job_intel.backend.services.impl;

import com.job_intel.backend.models.Job;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.services.IJobService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class JobServiceImpl implements IJobService {

    private JobRepository jobRepository;

    @Override
    public Optional<Job> getJob(Long id) {
       return jobRepository.findById(id);
    }
}
