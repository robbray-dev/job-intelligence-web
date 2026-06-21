package com.job_intel.backend.Dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class datePostingDto {

    private LocalDate postedDate;
    private Long jobPostingCount;
}
