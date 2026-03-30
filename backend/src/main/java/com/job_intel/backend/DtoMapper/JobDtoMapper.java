package com.job_intel.backend.DtoMapper;

import com.job_intel.backend.Dtos.JobDto;
import com.job_intel.backend.models.Company;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.models.JobSkill;
import com.job_intel.backend.models.Skill;
import com.job_intel.backend.repositories.JobRepository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class JobDtoMapper {
    private JobRepository jobRepository;

    public static JobDto mapToDto(Job job){
        List<String> skillList = new ArrayList<>();
        for(JobSkill jobSkill : job.getJobSkills()) {
            skillList.add(jobSkill.getSkill().getName());
        }
        return new JobDto(
                job.getId(), job.getTitle(), job.getLocation(), job.getCompany().getName(), job.getSalaryMin(),
                job.getSalaryMax(), job.getDescription(), job.getJobUrl(), job.getPostedDate(), skillList
        );
    }

    public static List<JobDto> listMapToDto (List<Job> jobs) {
        //grab the jobskill list for the job and add the skill name to a list per job
        List<JobDto> jobDtoList = new ArrayList<>();
        for(Job job : jobs) {
           List<String> skillList = new ArrayList<>();
           for (JobSkill jobSkill: job.getJobSkills()) {
               skillList.add(jobSkill.getSkill().getName());
           }
           jobDtoList.add(new JobDto(job.getId(), job.getTitle(), job.getLocation(), job.getCompany().getName(),
                   job.getSalaryMin(), job.getSalaryMax(), job.getDescription(), job.getJobUrl(),
                   job.getPostedDate(), skillList));
        }
        return jobDtoList;
    }


}
