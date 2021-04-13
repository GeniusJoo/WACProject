package com.WAC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.WAC.Service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping(value = "/")
	public String Main() {
		return "home";
	}
	
}
