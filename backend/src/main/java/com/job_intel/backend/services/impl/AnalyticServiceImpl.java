package com.job_intel.backend.services.impl;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.Dtos.SkillVelocityDto;
import com.job_intel.backend.Dtos.datePostingDto;
import com.job_intel.backend.repositories.AnalyticRepository;
import com.job_intel.backend.services.IAnalyticService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnalyticServiceImpl implements IAnalyticService {
    private AnalyticRepository analyticRepository;

    @Override
    public List<SalarySkillPointDto> getSalarySkill() {
        return analyticRepository.getSalaryVsSkills();
    }

    @Override
    public List<HiringCompaniesDto> getHiringCompanies(Pageable p) {
        return analyticRepository.getHiringCompanies(p);
    }

    @Override
    public List<SkillVelocityDto> getSkillVelocities(Pageable p) {
        return analyticRepository.getSkillVelocity(p);
    }

    @Override
    public List<datePostingDto> getJobDatePosting(Pageable p) {
        return analyticRepository.getDatesPosting(p);
    }

    @Override
    public List<Long> getDummies(Pageable p) {
        
        return analyticRepository.getDummy(p);
    }
}
