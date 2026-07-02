package com.job_intel.backend.job_board_apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Component
public class TechMapJobInit {

    //might get removed cuz i dont need it
    private HttpRequest request;

    private HttpResponse<String> res;

    @Value("${rapid.api.key}")
    private String apiKey;

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
    public void initClient (){
        this.request = HttpRequest.newBuilder()
            .uri(URI.create("https://daily-international-job-postings.p.rapidapi.com/api/v2/jobs/search?format=json&countryCode=us&hasSalary=true&page=1"))
            .header("x-rapidapi-key", apiKey)
            .header("x-rapidapi-host", "daily-international-job-postings.p.rapidapi.com")
            .header("Content-Type", "application/json")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
                       //try catch block
        try{
            this.res = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(this.res.body());
        } catch (IOException e) {
            System.out.println("Something went wrong. IO exception");
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Interrupted exception");
        }

    }

  

 
    

    
}
