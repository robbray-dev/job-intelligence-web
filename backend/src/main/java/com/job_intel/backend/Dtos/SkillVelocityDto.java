package com.job_intel.backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillVelocityDto {

    private String name;
    private BigDecimal growthRateForSkill;
}
