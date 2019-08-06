package com.example.anno.step03_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController
{
	@Autowired
	MemberService memberService;
	@Autowired
	MemberVO memberVO; 
	
	@RequestMapping(value="/component.do")
	public String callService(Model model)
	{
		System.out.println("MemberController 호출");
		
		String id_pwd = this.memberService.login(memberVO);
		model.addAttribute("id_pwd", id_pwd);
		return "jsp/component";
	}
	
}
