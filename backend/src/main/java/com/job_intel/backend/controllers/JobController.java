package com.job_intel.backend.controllers;

import com.job_intel.backend.models.Job;
import com.job_intel.backend.services.impl.JobServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/jobs")
public class JobController {

    private JobServiceImpl jobService;

    @GetMapping("{id}")
    public Optional<Job> getJobById(@PathVariable Long id){
        System.out.println("Whats going on with id, should be 1: " + id );
        Optional<Job> job = jobService.getJob(id);
        return job;
    }


}
