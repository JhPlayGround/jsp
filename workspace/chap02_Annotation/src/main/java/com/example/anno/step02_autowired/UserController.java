package com.example.anno.step02_autowired;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
	@Autowired
	private UserVO userVO; //Spring bean DI <- UserVo userVO = new UserVO()
	
	@RequestMapping("/autowired.do") //요청 url
	public String login(Model model)
	{
		/*
		 *  Model : DB data Key 저장
		 */
		String id_pwd = "";
		if(userVO.getId().equals("hong") && userVO.getPwd().equals("1234"))
		{
			System.out.println("로그인 성공");
			id_pwd = userVO.getId() + userVO.getPwd();
		}
		else
		{
			System.out.println("로그인 싪패");
			id_pwd = "login fail";
		}
		model.addAttribute("id_pwd", id_pwd);
		model.addAttribute("uid", userVO.getId());
		model.addAttribute("pwd", userVO.getPwd());
		return "jsp/autowired"; 
	}
}
