package com.job_intel.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "combos")
public class Combo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rank_number")
    private Long rankNumber;

    @Column(name = "skills_in_combo")
    private String skillsInCombo;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Timestamp createdAt;
}
