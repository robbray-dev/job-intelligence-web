package com.job_intel.backend.Dtos;

import com.job_intel.backend.models.Job;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {
    private Long id;
    private String title;
    private String location;
    private String companyName;
    private Integer salaryMin;
    private Integer salaryMax;
    private String description;
    private String jobUrl;
    private LocalDate postedDate;
    private List<String> skills;


}
