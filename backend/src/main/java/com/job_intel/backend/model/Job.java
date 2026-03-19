package com.job_intel.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    private String location;

    private Integer salaryMin;

    private Integer salaryMax;

    @Column(nullable = false)
    private String description;

    @Column(name = "job_url", nullable = false, unique = true)
    private String jobUrl;

    private LocalDate postedDate;

    @Column(insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;
}