package com.job_intel.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    @Column(name = "title")
    private String title;

    //look up the foreign key stuff in entity classes
    @Column(name = "company_id")
    private long companyId;

    @Column(name = "location")
    private String location;

    @Column(name = "salary_min")
    private int salaryMin;

    @Column(name = "salary_max")
    private int salaryMax;

    @Column(name = "description")
    private String description;

    @Column(name = "job_url")
    private String jobUrl;

    @Column(name = "posted_date")
    private LocalDate postedDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;




}
