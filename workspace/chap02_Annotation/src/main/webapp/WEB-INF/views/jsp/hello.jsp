<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h2>hello page</h2>
	<p>db data : ${greeting}</p>
	<hr/>
	<a href="<%=request.getContextPath()%>/">index.jsp</a>
</body>
</html>