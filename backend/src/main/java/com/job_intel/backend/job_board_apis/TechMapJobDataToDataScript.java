package com.job_intel.backend.job_board_apis;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;
import org.springframework.stereotype.Component;

import com.job_intel.backend.models.Company;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.models.Skill;
import com.job_intel.backend.repositories.CompanyRepository;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.repositories.SkillRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TechMapJobDataToDataScript {

    private CompanyRepository cRepository;
    private SkillRepository sRepository;
    private JobRepository jRepository;

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
             * Job entity: id - auto gen title - title field, but may be too naunced company
             * - needs to map to the company id in its table or just store the company id
             * jsonLd - base salary - value - minValue and maxValue for min and max salary
             */
            /*
             * results at i = {occ, title, skill[], etc} - > skill{0: skill 0, 1: skill 1,
             * 2: skill 2,} get the skill id by name,
             * 
             * private String location;
             * 
             * @Column(name = "salary_min") private Integer salaryMin;
             * 
             * @Column(name = "salary_max") private Integer salaryMax;
             * 
             * @Column(nullable = false) private String description;
             * 
             * @Column(name = "job_url", nullable = false, unique = true) private String
             * jobUrl;
             */
            Job jobEntity = new Job();
            String title = arr.getJSONObject(i).getString("title");
            // use comp for company
            String locationCheck = arr.getJSONObject(i).optString("city");
            String location;
            if (locationCheck == "") {
                location = "Remote";
            } else {
                location = locationCheck;
            }

            Integer minSalary = arr.getJSONObject(i).getJSONObject("jsonLD").getJSONObject("baseSalary")
                    .getJSONObject("value").getInt("minValue");

            Integer maxSalary = arr.getJSONObject(i).getJSONObject("jsonLD").getJSONObject("baseSalary")
                    .getJSONObject("value").getInt("maxValue");

            String description = arr.getJSONObject(i).getJSONObject("jsonLD").getString("description");

            String jobUrl = arr.getJSONObject(i).getJSONObject("jsonLD").getString("url");
            System.out.println(minSalary + " " + maxSalary + " " + location + " " + jobUrl);

        }

    }

}
