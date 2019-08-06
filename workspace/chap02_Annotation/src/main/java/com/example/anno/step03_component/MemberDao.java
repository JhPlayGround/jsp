package com.example.anno.step03_component;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao
{
	public String login(MemberVO vo)
	{
		System.out.println("MemberDao");
		
		if(vo.getId().equals("hong") && vo.getPwd().equals("1234"))
		{
			return "login success!";
		}
		else
		{
			return "login fail!";
		}
	}
}
