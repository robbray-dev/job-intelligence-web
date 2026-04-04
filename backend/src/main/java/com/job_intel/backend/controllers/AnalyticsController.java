package com.job_intel.backend.controllers;

import com.job_intel.backend.Dtos.SalarySkillPointDto;
import com.job_intel.backend.services.impl.AnalyticServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
