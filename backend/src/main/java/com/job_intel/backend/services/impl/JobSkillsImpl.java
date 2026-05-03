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
        List<List<Long>> comboOne = combinations(List.of(1L,2L,3L),1);

        for (List<Long> list : comboOne) {
            System.out.println("list.toString() = " + list.toString());
        }

    }

    // Source - https://stackoverflow.com/a/69688477
// Posted by user17201277, modified by community. See post 'Timeline' for change history
// Retrieved 2026-05-03, License - CC BY-SA 4.0

    static <T> List<List<T>> combinations(List<T> list, int n) {
        int length = list.size();
        List<List<T>> result = new ArrayList<>();
        T[] selections = (T[])new Object[n];
        new Object() {
            void select(int start, int index) {
                if (index >= n)
                    result.add(List.of(selections));
                else if (start < length){
                    selections[index] = list.get(start);
                    select(start + 1, index + 1);
                    select(start + 1, index);
                }
            }
        }.select(0, 0);
        return result;
    }




}
