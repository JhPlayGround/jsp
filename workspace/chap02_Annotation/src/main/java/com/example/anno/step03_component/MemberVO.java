package com.example.anno.step03_component;

import org.springframework.stereotype.Component;

@Component
public class MemberVO
{
	private String id = "hong";
	private String pwd = "1234";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}