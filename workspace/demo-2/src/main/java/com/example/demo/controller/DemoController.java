package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("title","Spring boot view");
		model.addAttribute("time", new Date().toString());
		return "home";
	}
}
