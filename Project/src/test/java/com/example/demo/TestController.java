package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		
		java.util.List<TestVo> testList = testService.selectTest();
		mav.addObject("list", testList);
		
		return mav;
		
		
	}
}
