package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	//reqeust mapping 5가지 get, post, put, delete, patch
	public String home() {
		return "home";
	}
}
