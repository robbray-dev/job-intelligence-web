package com.job_intel.backend.services;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
import com.job_intel.backend.Dtos.SalarySkillPointDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAnalyticService {

    List<SalarySkillPointDto> getSalarySkill();
    List<HiringCompaniesDto> getHiringCompanies(Pageable p);
}
