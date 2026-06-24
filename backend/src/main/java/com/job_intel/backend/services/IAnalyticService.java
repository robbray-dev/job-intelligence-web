package com.job_intel.backend.services;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.Dtos.SkillVelocityDto;
import com.job_intel.backend.Dtos.datePostingDto;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAnalyticService {

    List<SalarySkillPointDto> getSalarySkill();
    List<HiringCompaniesDto> getHiringCompanies(Pageable p);

    List<SkillVelocityDto> getSkillVelocities(Pageable p);

    List<datePostingDto> getJobDatePosting(Pageable p);

    List<Long> getDummies(Pageable p);
}
