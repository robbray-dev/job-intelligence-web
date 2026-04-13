package com.job_intel.backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HiringCompaniesDto {

    String companyName;
    Double jobGrowthRate;
    Long numOfJobs;

}
