package com.job_intel.backend.controllers;

import com.job_intel.backend.Dtos.HiringCompaniesDto;
import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.services.impl.AnalyticServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/analytics")
public class AnalyticsController {
    //service instance
    private AnalyticServiceImpl analyticService;

    //mapping to salary v skill
    @GetMapping("/salary-skill")
    public List<SalarySkillPointDto> getSalarySkillAnalytic() {
        return analyticService.getSalarySkill();
    }

    @GetMapping("/hiring-companies")
    public List<HiringCompaniesDto> getHiringCompanyAnalytic(@RequestParam(name = "page", defaultValue = "0") int pageNumber){

        Pageable pageable = PageRequest.of(pageNumber, 5, Sort.by("jobGrowthRate").descending());

        return analyticService.getHiringCompanies(pageable);
    }

}
