package com.WAC.controller;

import java.util.Collections;
import java.util.List;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.WAC.Model.C_post;
import com.WAC.Model.LoginDto;
import com.WAC.Model.PostDto;
import com.WAC.Service.CreateService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	CreateService createservice;
	
	@GetMapping("/")
	public String Main() {
		return "home";
	}
	
	@GetMapping("/home")
	public String reMain() {
		return "home";
	}
	
	@GetMapping(value = "/intro1")
	public String Intro1() throws Exception {
		
		return "intro1";
	}
	
	@GetMapping(value = "/warmFeed")
	public String WarmFeed(Model model, @RequestParam(required = false) String id,  HttpSession session) throws Exception {
		if(session != null) {
			List<PostDto> resultList = createservice.getCreateList();
			Collections.reverse(resultList);
			model.addAttribute("dto", createservice.getCreate((String)session.getAttribute("result")));
			model.addAttribute("resultList", resultList);
			System.out.println(resultList);
			
		}
		return "warmFeed";
	}
	
	
	@GetMapping(value = "/coolFeed")
	public String CoolFeed(Model model, @RequestParam(required = false) String id,  HttpSession session) throws Exception {
		
		if(session != null) {
			List<C_post> resultList = createservice.getCreateListC();
			Collections.reverse(resultList);
			model.addAttribute("dto", createservice.getCreateC((String)session.getAttribute("result")));
			model.addAttribute("resultList", resultList);
			System.out.println(resultList);
			
		}
		
		
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

	@GetMapping(value = "/info")
	public String Info() throws Exception {
		
		return "info";
	}
	
	@GetMapping(value = "/todayRecommend")
	public String TodayRecommend() throws Exception {
		
		return "todayRecommend";
	}
	
	@PostMapping(value = "/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile files, PostDto dto, LoginDto vo, HttpSession session, Model model) throws Exception {
		String id = null;
		try {
            String origFilename = files.getOriginalFilename();
            String filename = MD5Generator(origFilename);
            /* ???????????? ????????? 'files' ????????? ????????? ???????????????. */
            String savePath = "C://Users//home//Documents//WACProject//Project//src//main//resources//static//gogo";
            /* ????????? ???????????? ????????? ????????? ????????? ???????????????. */
            if (!new File(savePath).exists()) {
                try{
                    new File(savePath).mkdir();
                }
                catch(Exception e){
                    e.getStackTrace();
                }
            }
            String filePath = savePath + "\\" + origFilename;
            files.transferTo(new File(filePath));

            PostDto fileDto = new PostDto();
            fileDto.setOrigin_name(origFilename);
            fileDto.setFile_name(filename);
            fileDto.setPost(dto.getPost());
            fileDto.setId((String)session.getAttribute("result"));
            createservice.uploadFile(fileDto);
            id= fileDto.getId();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
		System.out.println(String.format("id??? %s", id));
		return String.format("redirect:warmFeed?id=%s", id);
	}
	
	public String MD5Generator(String input) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
        mdMD5.update(input.getBytes("UTF-8"));
        byte[] md5Hash = mdMD5.digest();
        StringBuilder hexMD5hash = new StringBuilder();
        for(byte b : md5Hash) {
            String hexString = String.format("%02x", b);
            hexMD5hash.append(hexString);
        }
        return hexMD5hash.toString();
    }

	
	@PostMapping(value = "/uploadFileC")
	public String uploadFileC(@RequestParam("file") MultipartFile files, C_post dto, LoginDto vo, HttpSession session, Model model) throws Exception {
		String id = null;
		try {
	        String origFilename = files.getOriginalFilename();
	        String filename = MD5Generator(origFilename);
	        /* ???????????? ????????? 'files' ????????? ????????? ???????????????. */
	        String savePath = "C://Users//home//Documents//WACProject//Project//src//main//resources//static//gogo";
	        /* ????????? ???????????? ????????? ????????? ????????? ???????????????. */
	        if (!new File(savePath).exists()) {
	            try{
	                new File(savePath).mkdir();
	            }
	            catch(Exception e){
	                e.getStackTrace();
	            }
	        }
	        String filePath = savePath + "\\" + origFilename;
	        files.transferTo(new File(filePath));
	
	        C_post fileDto = new C_post();
	        fileDto.setOrigin_name(origFilename);
	        fileDto.setFile_name(filename);
	        fileDto.setPost(dto.getPost());
	        fileDto.setId((String)session.getAttribute("result"));
	        createservice.uploadFileC(fileDto);
	        id= fileDto.getId();
	        
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
		System.out.println(String.format("id??? %s", id));
		return String.format("redirect:coolFeed?id=%s", id);
	}
	
	public String MD5GeneratorC(String input) throws UnsupportedEncodingException, NoSuchAlgorithmException {
	    MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
	    mdMD5.update(input.getBytes("UTF-8"));
	    byte[] md5Hash = mdMD5.digest();
	    StringBuilder hexMD5hash = new StringBuilder();
	    for(byte b : md5Hash) {
	        String hexString = String.format("%02x", b);
	        hexMD5hash.append(hexString);
	    }
	    return hexMD5hash.toString();
	}
}
