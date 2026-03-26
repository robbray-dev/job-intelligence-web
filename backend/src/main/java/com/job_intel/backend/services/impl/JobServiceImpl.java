package com.job_intel.backend.services.impl;

import com.job_intel.backend.DtoMapper.JobDtoMapper;
import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.services.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JobServiceImpl implements IJobService {

    private JobRepository jobRepository;

    @Override
    public JobDto getJob(Long id) {
       return JobDtoMapper.mapToDto(jobRepository.findJobById(id));
    }

    @Override
    public List<JobDto> getAllJobs() {
        List<JobDto> jobDtos = new ArrayList<>();

        for(Job job:jobRepository.findAll()){
            jobDtos.add(JobDtoMapper.mapToDto(job));
        }
        return jobDtos;
    }



    @Override
    public List<JobDto> filterJobs(List<String> skills, String location, Integer minSalary, Integer maxSalary, String title) {

        List<Job> jobs = jobRepository.filterJobs(skills, location, minSalary, maxSalary, title);
        List<JobDto> jobDtos = new ArrayList<>();
        for (Job job: jobs) {
            jobDtos.add(JobDtoMapper.mapToDto(job));
        }
        return jobDtos;
    }
}
