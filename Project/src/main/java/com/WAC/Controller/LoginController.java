package com.WAC.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping(value = "/info")
	public String Info(LoginDto id, HttpSession session, Model model) throws Exception {
		
		session.getAttribute("result");
		System.out.println(session.getAttribute("result"));
		
		return "info";		
	}
	
	
	@PostMapping(value = "/loging")
	public String getLoginInfo(LoginDto login, HttpSession session, Model model) throws Exception{
		LoginDto result = loginService.getLoginInfo(login);
		if(result != null) {
			session.setAttribute("result", result.getId());
			
			System.out.println("success");
			System.out.println(login.getId());
			System.out.println(login.getPassword());
			
			return "redirect:/home";
			
		} else {
			session.setAttribute("fail", "check your ID, PW");
			System.out.println("fail. check your ID, PW");
			System.out.println(login.getId());
			System.out.println(login.getPassword());
			return "login";
		}
		
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("result");
		System.out.println("성공");
		
		return "redirect:/login";
	}
}
