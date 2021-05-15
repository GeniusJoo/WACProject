package com.WAC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.WAC.Model.LoginDto;
import com.WAC.Service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping(value = "/login")
	public String Login() throws Exception {
		
		return "login";
	}
	
	@PostMapping(value = "/loging")
	public String getLoginInfo(LoginDto login, Model model) throws Exception{
		LoginDto result = loginService.getLoginInfo(login);
		if(result != null) {
			model.addAttribute("result", result.getId() + "welcome.");
			
			System.out.println("success");
			
			return "redirect:/home";
			
		} else {
		model.addAttribute("fail", "check your ID, PW");
		System.out.println("fail. check your ID, PW");
		System.out.println(login.getId());
		System.out.println(login.getPassword());
		return "login";
		}
	}
}
