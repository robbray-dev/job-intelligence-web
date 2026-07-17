package com.job_intel.backend.job_board_apis;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;
import org.springframework.stereotype.Component;

import com.job_intel.backend.models.Company;
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

        for (int i = 0; i < arr.length(); i++) {
            String company = arr.getJSONObject(i).getString("company");

            //company table setup and insertion 
           Company comp = new Company();
           comp.setName(company);

           if(cRepository.existsByName(comp.getName())){
            continue;
           } else {
            cRepository.save(comp);
           }

           //skills table setup and insertion
           // skills [3] --> 0: JAVA, 1: SQL, 2: Python

           

        }
    }

   
}
