package com.chrismakrides.marsroverapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
  @GetMapping("/")
  public String homeView() {
      return "index";
  } 
}
