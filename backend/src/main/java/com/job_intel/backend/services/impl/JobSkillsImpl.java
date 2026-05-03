package com.job_intel.backend.services.impl;

import com.job_intel.backend.Dtos.JobSkillDto;
import com.job_intel.backend.models.JobSkill;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.repositories.JobSkillRepository;
import com.job_intel.backend.services.IJobSkillsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class JobSkillsImpl implements IJobSkillsService {

    private JobSkillRepository jobSkillRepository;


    @Override
    public JobSkill getJobSkill(Long id) {
        return null;
    }

    @Override
    public void mapJobSkills() {
        Map<Long,List<Long>> jobSkillMap = new HashMap<>();
        List<JobSkillDto> jobSkillDtos = jobSkillRepository.findAllAsDto();
        List<Long> l = new ArrayList<>();

        for (JobSkillDto js : jobSkillDtos){
            if(!jobSkillMap.containsKey(js.getJobId())) {
                l = new ArrayList<>();
                l.add(js.getSkillId());
                jobSkillMap.put(js.getJobId(), l);
            } else {
                l.add(js.getSkillId());
            }
        }




    }


}
