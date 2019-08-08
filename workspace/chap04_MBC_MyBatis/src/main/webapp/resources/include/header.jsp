<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 관리</title>
<link rel="stylesheet" href="/resources/css/user.css" type="text/css">
</head>
<body>
<table width="800" border="1"  align="center">
  <tr>
     <td colspan="2"  align="center"> <h2> Spring MVC MyBatis Test </h2> </td>
  </tr>
  <tr>
     <td align="center" width="25%"> 
        <a href="<%=request.getContextPath()%>/"><h3> 시작 페이지 </h3></a>
        <a href="<%=request.getContextPath()%>/list.do"><h3> 전체 회원 </h3></a>
      </td>  
       <td align="center">