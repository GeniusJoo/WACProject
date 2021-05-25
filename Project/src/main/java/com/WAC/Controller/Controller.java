package com.WAC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String Main() {
		return "home";
	}
	
	@GetMapping("/home")
	public String reMain() {
		return "home";
	}
	
	
	@GetMapping(value = "/personal")
	public String Personal() throws Exception {
			
		return "personal";		
	}	
	
	@GetMapping(value = "/info")
	public String Info() throws Exception {
			
		return "info";		
	}
	
	@GetMapping(value = "/intro1")
	public String Intro1() throws Exception {
		
		return "intro1";
	}
}
