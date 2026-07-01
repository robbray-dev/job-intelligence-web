package com.job_intel.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.job_intel.backend.job_board_apis.TechMapJobInit;

@SpringBootTest
class TechMapJobTest {

    @Test
    //test the response of the techmapjob class
    /*
    void testName
        techMapJob.init
        System.out.print res
        assert(techMapJob.res is not null)
     */
    void jobInitTest (){
       
        TechMapJobInit tech = new TechMapJobInit();
        tech.initClient();
        System.out.println(tech.getRes());
        assertNotNull(tech.getRes());

    }

}
