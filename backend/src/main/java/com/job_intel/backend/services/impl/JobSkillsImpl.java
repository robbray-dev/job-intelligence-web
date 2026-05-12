package com.job_intel.backend.services.impl;

import com.job_intel.backend.Dtos.JobSkillDto;
import com.job_intel.backend.models.JobSkill;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.repositories.JobSkillRepository;
import com.job_intel.backend.services.IJobSkillsService;
import com.job_intel.backend.util.CountComparator;
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

        //stores job_skills entries from DB to a hashMap
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

        //hashset to avoid duplicate combos
        HashSet<List<Long>> containsDuplicateSet = new HashSet<>();

        //loop through the entire map set
        for (Map.Entry<Long,List<Long>> entry : jobSkillMap.entrySet()) {
            List<Long> skills = jobSkillMap.get(entry.getKey());
            for (int i = 1; i <= skills.size() ; i++) {
                List<List<Long>> combos = combinations(skills,i);
                for (List<Long> combo : combos) {
                    if(containsDuplicateSet.add(combo)) {
                        comboMap.put(comboNum, combo);
                        comboNum++;
                    }

                }
            }
        }




        //keeps the combo number and its count
        Map<Integer, Integer> countOfEachComboMap = new HashMap<>();

        //to check if the combo exist in the job_skill list
        boolean countComboFlag = true;

        //go through each combo
        for (Map.Entry<Integer, List<Long>> comboMapEntry : comboMap.entrySet()) {

            //for each combo check if exists in the job_skills list
            for (Map.Entry<Long, List<Long>> jobSkillMapEntry : jobSkillMap.entrySet()) {

                //hash set the list from j_s
                HashSet<Long> skillSet = new HashSet<>(jobSkillMapEntry.getValue());

                //loop through the combo
                for (Long skillIdInCombo : comboMapEntry.getValue()) {

                    //if the combo element appears in the job_skill mark the flag true, else false and break out the combo
                    if(skillSet.contains(skillIdInCombo)) {
                        countComboFlag = true;
                    } else {
                        countComboFlag = false;
                        break;
                    }
                }
                //if the combo was in the job_skill list
                if (countComboFlag == true) {

                    //if the combo number hasn't been seen in the count map, then put it, else increment its count by 1 via this count map
                    if(!countOfEachComboMap.containsKey(comboMapEntry.getKey())) {
                        countOfEachComboMap.put(comboMapEntry.getKey(),1);
                    } else {
                        countOfEachComboMap.put(comboMapEntry.getKey(),countOfEachComboMap.get(comboMapEntry.getKey()) + 1);
                    }
                }

            }
        }

        CountComparator countComparator = new CountComparator();

        Set<Map.Entry<Integer,Integer>> set = countOfEachComboMap.entrySet();
        System.out.println("set to string: " + set.toString());
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list,countComparator);
        System.out.println("list (sorted) to string: " + list.toString());



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
