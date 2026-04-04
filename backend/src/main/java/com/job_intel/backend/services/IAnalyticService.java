package com.job_intel.backend.services;

import com.job_intel.backend.Dtos.SalarySkillPointDto;

import java.util.List;

public interface IAnalyticService {

    List<SalarySkillPointDto> getSalarySkill();
}
