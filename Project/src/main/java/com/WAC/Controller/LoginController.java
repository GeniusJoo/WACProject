package com.WAC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;
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
	public String getLoginInfo(LoginDto login, HttpSession session, Model model) throws Exception{
		LoginDto result = loginService.getLoginInfo(login);
		if(result != null) {
			session.setAttribute("result", result.getId());
			
			session.setAttribute("result1", result.getName());
			
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
		session.invalidate();
		System.out.println("성공");
		
		return "redirect:/login";
	}
	
//	@GetMapping(value = "/myinfoedit")
//	public String Myinfoedit(HttpServletRequest req, Model model, LoginDto vo) throws Exception {
//		
//		LoginDto result = loginService.Myinfoedit(vo);
//		
//		System.out.println(result.getName());
//		System.out.println(result.getNickname());
//		System.out.println(result.getPassword());
//		System.out.println(result.getEmail());
//		
//		model.addAttribute("modifyName", result.getName());
//		model.addAttribute("modifyNickname", result.getNickname());
//		model.addAttribute("modifyPassword", result.getPassword());
//		model.addAttribute("modifyEmail", result.getEmail());
//		
//		return "myinfoedit";
//	}
	
	@GetMapping(value = "/myinfoedit")
	public String Myinfoedit() throws Exception {
		
		
		return "myinfoedit";
	}

}
