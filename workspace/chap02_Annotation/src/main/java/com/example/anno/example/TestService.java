package com.example.anno.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService
{
	@Autowired
	TestDao testDao;
	
	public String[] login(TestVO vo)
	{
		String[] name_addr = this.testDao.login(vo);
		
		return name_addr;
	}
	
	public Boolean login_ver2(TestVO vo)
	{
		Boolean result = this.testDao.login_ver2(vo);
		
		return result;
	}
}