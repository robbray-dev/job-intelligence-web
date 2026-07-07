package com.job_intel.backend.job_board_apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TechMapJobInit {

   

    public static String getJobDataFromApi() {
        String key = System.getenv("RAPID_API_KEY");
         HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://daily-international-job-postings.p.rapidapi.com/api/v2/jobs/search?format=json&countryCode=us&hasSalary=true&page=1"))
            .header("x-rapidapi-key", key)
            .header("x-rapidapi-host", "daily-international-job-postings.p.rapidapi.com")
            .header("Content-Type", "application/json")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
            

        try{
            HttpResponse<String> res = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return res.body();
        } catch (IOException e) {
            System.out.println("Something went wrong. IO exception");
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Interrupted exception");
        }
        return null;

    }


    //what fields for this object
    // i want this object to have methods that ...
    /*
        initalize http client - TechMapJobInit.initClient();
        should this have a client field passed in? initClient(HttpRequest obj)
        yes this allows for the global field to be used in the class -> nope, just needed to set this.request = builder
        will it need to be used in another class ie a extraction class, yes id say so
        can a getter save the state of a classes field in other classes - yes for now at least
        
        private Http request obj;
        initClient(obj)
        /
            init logic here
        /

     */
   

  

 
    

    
}
