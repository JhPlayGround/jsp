package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameController {
	
	@RequestMapping("/name")
	public String result(Model model)
	{
		model.addAttribute("name","park ju ho");
		model.addAttribute("age", 25);
		return "result";
	}

}
