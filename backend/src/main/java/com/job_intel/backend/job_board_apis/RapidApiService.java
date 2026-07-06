package com.job_intel.backend.job_board_apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class RapidApiService {


    private String apiKey;
    //how do i initalize this class and this apiKey
    /*
    i have a class with an api field, the class will be used for getting api keys
    how do i instanite the class with the api key field being set from the .env
    what constructor is needed?
    apiService()
    this.apikey =

   this class
    apiService(key)
    this.apiKey = key

    
    the caller class (TechMapJobInit)

    @Value
    apiKey

    apiService a;

    techMapJobinit() {
        a = new apiService(apiKey)

        http client setup, with a.getApikey
    }
    */

    public RapidApiService(String key) {
        this.apiKey = key;
    }
}
