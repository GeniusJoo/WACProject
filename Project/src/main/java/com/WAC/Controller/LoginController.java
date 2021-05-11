package com.WAC.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class LoginController {

	@GetMapping("/")
	public String Main() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String getLoginInfo() throws Exception {
		
		return "login";
	}
}
