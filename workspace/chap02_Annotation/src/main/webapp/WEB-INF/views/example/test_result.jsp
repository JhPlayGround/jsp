<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example TestResult</title>
</head>
<body>
	<h2>example page</h2>
	<p>내 방식 - String[]</p>
	<p> 이름 : <font color = "skyblue">${name}</font></p>
	<p> 주소 : <font color = "skyblue">${addr}</font></p>
	<hr>
	<p>강사님 방식 - Boolean</p>
	<p> 이름 : <font color = "skyblue">${name2}</font></p>
	<p> 주소 : <font color = "skyblue">${addr2}</font></p>
	<hr/>
	<a href="<%=request.getContextPath()%>/">index.jsp</a>
</body>
</html>