package com.job_intel.backend.controllers;

import com.job_intel.backend.DtoMapper.JobDtoMapper;
import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.services.impl.JobServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/jobs")
public class JobController {

    private JobServiceImpl jobService;
    private JobRepository jobRepository;

    @GetMapping("{id}")
    public JobDto getJobById(@PathVariable Long id){
        return jobService.getJob(id);
    }

    @GetMapping
    public List<JobDto> getAllJobs(@RequestParam(name = "page",defaultValue = "0") Integer page){
        Integer size = 2;
        Pageable pageable = PageRequest.of(page, 5);
        Page<Job> jobPage = jobRepository.findAll(pageable);

        return JobDtoMapper.listMapToDto(jobPage.getContent());
    }

    @GetMapping("/filter")
    public List<JobDto> getJobsByFilter(  @RequestParam(name = "page", defaultValue = "0") int pageNumber,
                                          @RequestParam(required = false) List<String> skills,
                                          @RequestParam(required = false) String location,
                                          @RequestParam(required = false) Integer minSalary,
                                          @RequestParam(required = false) Integer maxSalary,
                                          @RequestParam(required = false) String title) {

        Pageable jobPage = PageRequest.of(pageNumber, 5);

        return jobService.filterJobs(skills, location, minSalary, maxSalary, title, jobPage);
    }


}
