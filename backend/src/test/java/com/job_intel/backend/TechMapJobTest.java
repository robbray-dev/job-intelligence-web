package com.job_intel.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Value;

import com.job_intel.backend.job_board_apis.TechMapJobDataToDataScript;
import com.job_intel.backend.job_board_apis.TechMapJobInit;
import com.job_intel.backend.repositories.CompanyRepository;

@SpringBootTest
class TechMapJobTest {

    @Autowired
    private TechMapJobDataToDataScript tec;


    /*
    @Test
    void jobInitTest (){
       
       
        tec.initClient();
        System.out.println(tec.getRes());
        assertNotNull(tec.getRes());

    }


    @Test
    void apiTest(@Autowired RapidApiService apiService){
        String apiKey = apiService.getApiKey();
        System.out.println(apiKey);

        assertNotNull(apiKey);
    }

 */
/* 
    @Test
    void techMapJobInitConstructorTest() {

        System.out.println(TechMapJobInit.getJobDataFromApi());
    }
*/

    @Test
    void jsonTest(){
        // if company exist i need to skip it being entered
        String json = JsonEx.jsonTemp();
        tec.mapJobDataToEntity(json);
        
    }
         
}
