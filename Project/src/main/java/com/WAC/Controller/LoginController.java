package com.WAC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WAC.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping(value = "/")
	public String Main() {
		System.out.println("test");
		return "testtt";
	}
	
}
