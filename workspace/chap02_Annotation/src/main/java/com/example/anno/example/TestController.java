package com.example.anno.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@Autowired
	TestService testService;
	@Autowired
	TestVO testVO;
	
	@RequestMapping(value="/testComponent.do")
	public String callService(Model model)
	{
		String[] name_address = this.testService.login(testVO);
		model.addAttribute("name", name_address[0]);
		model.addAttribute("addr", name_address[1]);
		
		//강사님 방식
		Boolean result = this.testService.login_ver2(testVO);
		if(result)
		{
			model.addAttribute("name2", testVO.getName());
			model.addAttribute("addr2", testVO.getAddress());
		}
		else
		{
			model.addAttribute("name2", "login fail");
			model.addAttribute("addr2", "login fail");
		}
		
		
		
	
		
		return "example/test_result";
	}
}
