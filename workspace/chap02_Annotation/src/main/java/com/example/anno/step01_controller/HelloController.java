package com.example.anno.step01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	//user 요청 -> 응답
	@RequestMapping(value="/") 
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/hello.do")
	public ModelAndView hello()
	{
		/*
		 * ModelAndView
		 * - Model : DB의 DAT
		 * - View : view page
		 */
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting","안녕하세요. 홍길동씨.");
		mav.setViewName("jsp/hello");
		
		return mav;
	}
}
