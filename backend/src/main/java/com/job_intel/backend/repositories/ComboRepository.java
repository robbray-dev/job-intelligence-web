package com.job_intel.backend.repositories;

import com.job_intel.backend.Dtos.comboDTO;
import com.job_intel.backend.models.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComboRepository extends JpaRepository<Combo,Long> {


}
