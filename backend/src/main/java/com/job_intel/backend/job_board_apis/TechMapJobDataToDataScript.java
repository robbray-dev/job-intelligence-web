package com.job_intel.backend.job_board_apis;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;
import org.springframework.stereotype.Component;

import com.job_intel.backend.models.Company;
import com.job_intel.backend.models.Skill;
import com.job_intel.backend.repositories.CompanyRepository;
import com.job_intel.backend.repositories.SkillRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TechMapJobDataToDataScript {

    private CompanyRepository cRepository;
    private SkillRepository sRepository;

    public void mapJobDataToEntity(String jobDataBody) {

        String jsoString = jobDataBody;
        JSONObject obj = new JSONObject(jsoString);

        JSONArray arr = obj.getJSONArray("result");

        // results [10]
        // results at i = {occ, title, skill[], etc}
        for (int l = 0; l < arr.length(); l++) {
            JSONArray skillsArray = arr.getJSONObject(l).optJSONArray("skills");
            /*
             * if( skillsArray != null) { System.out.println(l + ": " + skillsArray); }
             */

            if (skillsArray != null) {
                System.out.println(arr.getJSONObject(l).get("occupation") + " needs skills ...");
                for (int j = 0; j < skillsArray.length(); j++) {

                    System.out.println(l + ": " + skillsArray.getString(j));
                }
            }

        }

        for (int i = 0; i < arr.length(); i++) {
            String company = arr.getJSONObject(i).getString("company");

            // company table setup and insertion
            Company comp = new Company();
            comp.setName(company);

            if (!cRepository.existsByName(comp.getName())) {
                cRepository.save(comp);
            }
            // skills table setup and insertion
            // skills [3] --> 0: JAVA, 1: SQL, 2: Python

            /*
             * JSONArray skillArray = obj.getJSONArray("results");
             * 
             * for (int j = 0; j < skillArray.length(); j++) { String skill =
             * skillArray.getJSONObject(j).getString(String.valueOf(j));
             * System.out.println(skill); Skill skillObj = new Skill();
             * skillObj.setName(skill);
             * 
             * if(sRepository.existsByName(skillObj.getName())) { continue; } else {
             * sRepository.save(skillObj); } }
             * 
             */

        }
    }

}
