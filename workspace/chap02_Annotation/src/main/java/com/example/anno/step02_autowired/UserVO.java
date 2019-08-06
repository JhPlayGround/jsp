package com.example.anno.step02_autowired;

import org.springframework.stereotype.Component;

@Component
public class UserVO //DT0 =Value Object
{
	//id, pwd, name
	private String id = "hong";
	private String pwd = "1234";
	private String name = "홍길동";
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
