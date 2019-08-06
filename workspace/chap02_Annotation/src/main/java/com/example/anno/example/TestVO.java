package com.example.anno.example;

import org.springframework.stereotype.Component;
/*
 * testController -> testService -> testDao
 * 요청 url <-> login -> login(id/pwd)
 * 응답 결과 : id/pwd 일치 -  name, address view page 출력
 *         id/pwd 불일치   - 로그인 실패 view page 출력 
 * 요청 url : testComponent.do
 * view page : views/example/test_result.jsp
 */
@Component
public class TestVO
{
	private String id = "hong";
	private String pwd = "1234";
	private String name = "홍길동";
	private String address = "서울시 강남구";
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
