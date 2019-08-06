<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page </title>
</head>
<body>
	<div align="center">
		<h2> index page</h2>
		<a href="<%=request.getContextPath()%>/hello.do">steop01_controller</a> <br>
		<a href="<%=request.getContextPath()%>/autowired.do">steop02_autowired</a><br>
		<a href="<%=request.getContextPath()%>/component.do">steop03_component</a><br>
		<a href="<%=request.getContextPath()%>/receive.do">step04_receiveParam</a>
		<hr>
		<a href="<%=request.getContextPath()%>/testComponent.do">example</a>
		
	</div>
</body>
</html>