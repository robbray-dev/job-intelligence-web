package com.job_intel.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.job_intel.backend.job_board_apis.RapidApiService;

@SpringBootTest
class RapidApiServiceTest {

    @Autowired 
    private RapidApiService apiService;

    
    @Test
    void apiServiceTest(){
/*
        String key = this.apiService.getApiKey();
        System.out.println(key);
        assertNotNull(key);
   */

        
        }
}
