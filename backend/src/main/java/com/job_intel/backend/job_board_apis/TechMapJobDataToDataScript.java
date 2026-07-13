package com.job_intel.backend.job_board_apis;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;

import com.job_intel.backend.models.Company;

public class TechMapJobDataToDataScript {

    public static void mapJobDataToEntity(String jobDataBody) {
        // TODO: print out actual jobs with the correct JSON lib syntax
        // ie job 1, job 2, etc
        String jsoString = jobDataBody;
        JSONObject obj = new JSONObject(jsoString);
        String api = obj.getString("api");
        System.out.println(api);

        JSONArray arr = obj.getJSONArray("result");

        for (int i = 0; i < arr.length(); i++) {
            String occupation = arr.getJSONObject(i).getString("occupation");
            //get company and store it in a componay object and store it with its repo

            String company = arr.getJSONObject(i).getString("company");
            System.out.println(company);

            if(companyDBentry(company) == "good") {
                System.out.println("success");
            } else {
                System.out.println("false");
            }
            //pass this down and place it in a method // companyDBentry(company name) { Company companyFromJobData = new Company("company"), companyRepo.save(companyFromJobData)}
            System.out.println(occupation);
        }
    }

    private static String companyDBentry(String companyName){
        Company companyFromJobData = new Company();
        companyFromJobData.setName(companyName);
        
        if(companyFromJobData.getName() == companyName){
            return "good";
        } else {
            return "bad";
        }
    }
}
