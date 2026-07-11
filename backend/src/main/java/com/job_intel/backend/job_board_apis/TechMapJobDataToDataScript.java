package com.job_intel.backend.job_board_apis;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;

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
            System.out.println(occupation);
        }
    }
}
