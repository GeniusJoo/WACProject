package com.WAC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String Main() {
		return "home";
	}
	
	@PostMapping(value = "/login")
	public String Login() throws Exception {
		
		return "login";
	}
}
