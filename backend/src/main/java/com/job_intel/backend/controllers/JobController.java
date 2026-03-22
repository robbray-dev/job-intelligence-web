package com.job_intel.backend.controllers;

import com.job_intel.backend.DtoMapper.JobDtoMapper;
import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.services.impl.JobServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/jobs")
public class JobController {

    private JobServiceImpl jobService;

    @GetMapping("{id}")
    public JobDto getJobById(@PathVariable Long id){
        return jobService.getJob(id);
    }

    @GetMapping
    public List<JobDto> getAllJobs(){
        return jobService.getAllJobs();
    }



    @GetMapping("/filterBySkills")
    public List<JobDto> getJobsBySkills(@RequestParam String[] skills) {
        return jobService.getJobsByMultiSkill(skills);
    }


}
