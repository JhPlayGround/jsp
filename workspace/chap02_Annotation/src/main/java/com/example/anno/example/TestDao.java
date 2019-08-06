package com.example.anno.example;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao
{
	public String[] login(TestVO vo)
	{
		String[] result = new String[2];
		if(vo.getId().equals("hong") && vo.getPwd().equals("1234"))
		{
			result[0] = vo.getName();
			result[1] = vo.getAddress();
			return result;
		}
		else
		{
			result[0] = "login_fail";
			result[1] = "login_fail";
			return result;
		}
	}
	
	public Boolean login_ver2(TestVO vo)
	{
		if(vo.getId().equals("hong") && vo.getPwd().equals("1234"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
