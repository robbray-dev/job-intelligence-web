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
        for (int i = 0; i < arr.length(); i++) {
            JSONArray skillsArray = arr.getJSONObject(i).optJSONArray("skills");
            /*
             * if( skillsArray != null) { System.out.println(l + ": " + skillsArray); }
             */

            if (skillsArray != null) {
                for (int j = 0; j < skillsArray.length(); j++) {

                    String skillName = skillsArray.getString(j);
                    Skill skillObj = new Skill();
                    skillObj.setName(skillName);

                    if (!sRepository.existsByName(skillObj.getName())) {
                        sRepository.save(skillObj);
                    }

                }
            }

            String company = arr.getJSONObject(i).getString("company");

            // company table setup and insertion
            Company comp = new Company();
            comp.setName(company);

            if (!cRepository.existsByName(comp.getName())) {
                cRepository.save(comp);
            }

            // gotta do the job skill entry BUT after jobs are inserted
            // id, job_id, skill_id
            /*
             * results at i = {occ, title, skill[], etc} - > skill{0: skill 0, 1: skill 1,
             * 2: skill 2,} get the skill id by name,
             */

        }

    }

}
