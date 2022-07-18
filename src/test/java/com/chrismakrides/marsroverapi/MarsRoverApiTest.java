package com.chrismakrides.marsroverapi;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverApiTest {

  @Test
  public void smallTest() {
    RestTemplate apiCall = new RestTemplate();
    ResponseEntity<String> response = apiCall.getForEntity(
        "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=ZnyAXCjmbr4ecRqongfksQqSWtKaVPd6divx0MEa",
        String.class);
    System.out.println(response.getBody()); 
  }

}
