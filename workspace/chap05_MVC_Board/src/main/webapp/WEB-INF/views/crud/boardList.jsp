<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<div align="center">
		<h2>게시글 목록</h2>
	</div>
	<button class="btn btn-primary" onclick="location.href='/insert'">글 작성</button>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>등록날짜</th>
			</tr>
			<c:forEach items="${list}" var="row">
				<tr onclick="location.href='/detail/${row.bno}'">
					<th>${row.bno}</th>
					<th>${row.subject}</th>
					<th>${row.content}</th>
					<th>${row.writer}</th>
					<th>${row.reg_date}</th>
				</tr>
			</c:forEach>
		</table>
	</div>
	<%@ include file="bootstrap.jsp" %>
</body>
</html>