package com.WAC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.WAC.Model.ColorDto;
import com.WAC.Model.LoginDto;
import com.WAC.Service.CreateService;

@Controller
public class CreateController {
	
	@Autowired
	CreateService createservice;
	
	@GetMapping(value = "/signup")
	public String Signup() throws Exception {
			
		return "signup";		
	}
	
	@PostMapping(value = "/signupp")
	public String setCreateInfo(LoginDto create, Model model) throws Exception{
		
		createservice.getCreateInfo(create);
		System.out.println("test");
		return "redirect:/home";
	}
	
	@GetMapping(value = "/personal")
	public String Personal() throws Exception {
			
		return "personal";		
	}
	
	@PostMapping(value = "/person")
	public String PersonInfo(ColorDto color, Model model) throws Exception {
		createservice.getPersonInfo(color);
		System.out.println(color.getColor());
		
		return "redirect:/home";
	}
}
