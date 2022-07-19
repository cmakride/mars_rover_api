package com.chrismakrides.marsroverapi;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.chrismakrides.marsroverapi.response.MarsRoverApiResponse;

public class MarsRoverApiTest {

  @Test
  public void smallTest() {
    RestTemplate apiCall = new RestTemplate();
    ResponseEntity<MarsRoverApiResponse> response = apiCall.getForEntity(
        "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=ZnyAXCjmbr4ecRqongfksQqSWtKaVPd6divx0MEa",
        MarsRoverApiResponse.class);
    System.out.println(response.getBody()); 
  }

}
