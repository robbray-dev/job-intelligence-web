package com.job_intel.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Value;

import com.job_intel.backend.job_board_apis.RapidApiService;
import com.job_intel.backend.job_board_apis.TechMapJobInit;

@SpringBootTest
class TechMapJobTest {

    @Value("${rapid.api.key}")
    String apiKey;
   

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

    @Test
    void techMapJobInitConstructorTest() {

        TechMapJobInit tec = new TechMapJobInit(apiKey);
        System.out.println(tec.getRes().body());
    }
}
