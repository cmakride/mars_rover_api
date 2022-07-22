package com.chrismakrides.marsroverapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chrismakrides.marsroverapi.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {

  public MarsRoverApiResponse getRoverData(String roverType){
    RestTemplate apiCall = new RestTemplate();
    ResponseEntity<MarsRoverApiResponse> response = apiCall.getForEntity(
        "https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=2&api_key=ZnyAXCjmbr4ecRqongfksQqSWtKaVPd6divx0MEa",
        MarsRoverApiResponse.class);
    return response.getBody(); 
  }

}
