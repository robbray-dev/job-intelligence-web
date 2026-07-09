package com.job_intel.backend.job_board_apis;

import org.json.*;

public class TechMapJobDataToDataScript {

    public static void mapJobDataToEntity(String jobDataBody) {
        // TODO: print out actual jobs with the correct JSON lib syntax
        // ie job 1, job 2, etc
        String jsoString = jobDataBody;
        JSONObject obj = new JSONObject(jsoString);
        String api = obj.getString("api");
        System.out.println(api);
    }
}
