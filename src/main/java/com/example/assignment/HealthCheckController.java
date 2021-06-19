package com.example.assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheckController {
	
  @Value("${spring.application.name}")
  String appName;

  @GetMapping("/healthz")
  public String homePage(Model model) {
	  model.addAttribute("appName", appName);
	  return "home";
  }

}
