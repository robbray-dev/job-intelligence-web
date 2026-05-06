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
      //combos for the skill lists
        //call the combo method on each map entry, with n being from size 1 - list.length

        //map to hold the combos
        Map<Integer, List<Long>> comboMap = new HashMap<>();

        //int to keep track of combo number
        int comboNum = 1;

        //loop through the entire map set
        for (Map.Entry<Long,List<Long>> entry : jobSkillMap.entrySet()) {
            List<Long> skills = jobSkillMap.get(entry.getKey());
            for (int i = 1; i <= skills.size() ; i++) {
                List<List<Long>> combos = combinations(skills,i);
                for (List<Long> combo : combos) {
                    comboMap.put(comboNum, combo);
                    comboNum++;
                }
            }
        }

        System.out.println("Map for the comboMap");
        for (Map.Entry<Integer, List<Long>> entry : comboMap.entrySet()){
            System.out.println("key(combo num) : " + entry.getKey() + " | " + "value/list : " + entry.getValue());
        }

        Map<Integer, Integer> countOfEachComboMap = new HashMap<>();
        boolean countComboFlag = true;

        for (Map.Entry<Integer, List<Long>> comboMapEntry : comboMap.entrySet()) {
            for (Map.Entry<Long, List<Long>> jobSkillMapEntry : jobSkillMap.entrySet()) {
                HashSet<Long> skillSet = new HashSet<>(jobSkillMapEntry.getValue());
                for (Long skillIdInCombo : comboMapEntry.getValue()) {
                    if(skillSet.contains(skillIdInCombo)) {
                        countComboFlag = true;
                    } else {
                        countComboFlag = false;
                        break;
                    }
                }
                if (countComboFlag == true) {
                    if(!countOfEachComboMap.containsKey(comboMapEntry.getKey())) {
                        System.out.println("comboMapEntry key/comboNum = " + comboMapEntry.getKey() + " for combo : " + comboMapEntry.getValue());
                        countOfEachComboMap.put(comboMapEntry.getKey(),1);
                    } else {
                        System.out.println("comboMapEntry key/comboNum = " + comboMapEntry.getKey() + " for combo : " + comboMapEntry.getValue());
                        countOfEachComboMap.put(comboMapEntry.getKey(),countOfEachComboMap.get(comboMapEntry.getKey()) + 1);
                    }
                }

            }
        }

        System.out.println("count of combo maps, where key is combo number and value is count");
        for (Map.Entry<Integer, Integer> countOfCombo : countOfEachComboMap.entrySet()) {
            System.out.println("combo num : " +  countOfCombo.getKey() + " | " +  "combo count: " +countOfCombo.getValue());
        }

        System.out.println("testing testing");
        System.out.println("jobSkillMap.toString() = " + jobSkillMap.toString());
        System.out.println("comboMap = " + comboMap.toString());
        System.out.println("countOfEachComboMap.toString() = " + countOfEachComboMap.toString());


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
