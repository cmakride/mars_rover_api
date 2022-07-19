package com.chrismakrides.marsroverapi.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
  @GetMapping("/")
  public String homeView(ModelMap model) {
    
      return "index";
  } 
}
