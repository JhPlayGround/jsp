 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autowired page</title>
</head>
<body>
	<h2>autowired page</h2>
	<p> 로그인 결과 : ${id_pwd}</p>
	<p> 아이디 : ${uid}</p>
	<p> 비밀번호 : ${pwd}</p>
	<hr/>
	<a href="<%=request.getContextPath()%>/">index.jsp</a>
</body>
</html>