package com.job_intel.backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalarySkillPointDto {
    String title;
    Long skillCount;
    Double salary;
}
