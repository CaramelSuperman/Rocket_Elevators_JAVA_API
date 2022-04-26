package com.example.rocket_elevators_java_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class checkHTTP {
    @LocalServerPort
    private int port;

    @Autowired //
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassIfStringsMatches(){
      //  assertEquals(expected: "Hello", testRestTemplate.getForObject( url: "http://localhost:" + port + "/",
        //        String.class));
    }
}
