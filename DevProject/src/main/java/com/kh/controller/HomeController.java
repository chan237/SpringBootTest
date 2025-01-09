package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;
@Log
@Controller
public class HomeController {
	@GetMapping(value = "/ajaxHome2") 
	public String formHome() { 
	log.info("GET 방식 ajaxHome2"); 
	return "ajaxHome2"; 
	} 
}
