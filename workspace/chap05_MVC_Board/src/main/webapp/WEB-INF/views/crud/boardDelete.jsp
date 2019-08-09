<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div align="center"> 
		<h2> 게시글 삭제</h2>
	</div>
	<div class="container">
		<form action="/deletePro">
	  		<input type="hidden" name="bno" value="${bno}">
		
	   		<button type="submit" class="btn btn-danger">정말 삭제할까요?</button>
	   		<button type="reset" class="btn btn-primary" 
	                         onclick="location.href='/list'">취소</button>
	                         <!-- view의 버튼에 RequestMapping url 연결 -->
		</form>
	</div>
<%@ include file="bootstrap.jsp" %>
</body>
</html>