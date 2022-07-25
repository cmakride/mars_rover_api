package com.chrismakrides.marsroverapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chrismakrides.marsroverapi.response.MarsRoverApiResponse;
import com.chrismakrides.marsroverapi.service.MarsRoverApiService;

@Controller

public class HomeController {

  @Autowired
  // we tell spring with this annotation that we believe that this particular
  // object or service is managed by spring, we say hey spring give us this object
  // that you have already instantiated on our behafe spring has alredy executed
  // code roverserver = new roverservice, spring gives us this instance in here,
  // Instead of doing MarsRoverApiService = new MarsRoverApiService
  private MarsRoverApiService roverService;

  @GetMapping("/")
  public String homeView(ModelMap model, @RequestParam(required = false) String marsApiRoverData) {
    // if request param is empty, then set a default value
    if (StringUtils.hasLength(marsApiRoverData)) {

    } else {
      marsApiRoverData = "opportunity";
    }
    MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
    // now we want to grab the body of the response, control 2 is the trick used in
    // spring boot suite, will turn roverService.getRoverData() to assign the return
    // type to a variable quickly to MarsRoverApiResponse roverData =
    // roverService.getRoverData();
    // then what we do is take that data in the response and put it in the model,
    // model is key value pairs
    model.put("roverData", roverData);
    return "index";
  }

  // what to do if wanted to view the form data after the index has been loaded
  // this way requires to refresh the page
  // @PostMapping("/")
  // public String postHomeView(ModelMap model, @RequestParam String
  // marsApiRoverData){
  // MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);

  // model.put("roverData",roverData);

  // return "index";

  // }

}
