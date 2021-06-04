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
	
	
	@GetMapping(value = "/info")
	public String Info() throws Exception {
			
		return "info";		
	}
	
	@GetMapping(value = "/intro1")
	public String Intro1() throws Exception {
		
		return "intro1";
	}
	
	@GetMapping(value = "/warmFeed")
	public String WarmFeed() throws Exception {
		
		return "warmFeed";
	}
	
	@GetMapping(value = "/coolFeed")
	public String CoolFeed() throws Exception {
		
		return "coolFeed";
	}
	
	@GetMapping(value = "/coolMedia")
	public String CoolMedia() throws Exception {
		
		return "coolMedia";
	}
	
	@GetMapping(value = "/intro2")
	public String Intro2() throws Exception {
		
		return "intro2";
	}
	
	@GetMapping(value = "/coolPopular")
	public String CoolPopular() throws Exception {
		
		return "coolPopular";
	}
	
	@GetMapping(value = "/coolOotd")
	public String CoolOotd() throws Exception {
		
		return "coolOotd";
	}
	
	@GetMapping(value = "/warmMedia")
	public String WarmMedia() throws Exception {
		
		return "warmMedia";
	}
	
	@GetMapping(value = "/warmOotd")
	public String WarmOotd() throws Exception {
		
		return "warmOotd";
	}
	
	@GetMapping(value = "/warmPopular")
	public String WarmPopular() throws Exception {
		
		return "warmPopular";
	}
	
	@GetMapping(value = "/myinfoedit")
	public String Myinfoedit() throws Exception {
		
		return "myinfoedit";
	}
}
