package com.job_intel.backend.job_board_apis;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;
import org.springframework.stereotype.Component;

import com.job_intel.backend.models.Company;
import com.job_intel.backend.repositories.CompanyRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TechMapJobDataToDataScript {

    private CompanyRepository cRepository;

    public void mapJobDataToEntity(String jobDataBody) {
    
        String jsoString = jobDataBody;
        JSONObject obj = new JSONObject(jsoString);

        JSONArray arr = obj.getJSONArray("result");

        for (int i = 0; i < arr.length(); i++) {
            String company = arr.getJSONObject(i).getString("company");

           Company comp = new Company();
           comp.setName(company);


           // if a company exist i need to skip it from being entered in the db
           cRepository.save(comp);

        }
    }

   
}
