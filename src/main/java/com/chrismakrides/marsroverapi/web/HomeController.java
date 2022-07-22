package com.chrismakrides.marsroverapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.chrismakrides.marsroverapi.response.MarsRoverApiResponse;
import com.chrismakrides.marsroverapi.service.MarsRoverApiService;

@Controller

public class HomeController {

  @Autowired
  // we tell spring with this annotation that we believe that this particular object or service is managed by spring, we say hey spring give us this object that you have already instantiated on our behafe spring has alredy executed code roverserver = new roverservice, spring gives us this instance in here, Instead of doing MarsRoverApiService = new MarsRoverApiService 
  private MarsRoverApiService roverService;



  @GetMapping("/")
  public String homeView(ModelMap model) {
    MarsRoverApiResponse roverData = roverService.getRoverData("opportunity");
      //now we want to grab the body of the response, control 2 is the trick used in spring boot suite, will turn roverService.getRoverData() to assign the return type to a variable quickly to MarsRoverApiResponse roverData = roverService.getRoverData();
      // then what we do is take that data in the response and put it in the model, model is key value pairs
      model.put("roverData",roverData);
      return "index";
  } 
}
