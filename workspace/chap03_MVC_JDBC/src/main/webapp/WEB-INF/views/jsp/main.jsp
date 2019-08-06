<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 화면</title>
<link rel="stylesheet" type="text/css" href="/resource/css/main.css">
</head>
<body>
	<div align="center" class="body">
		<h2>상품 목록(<a href = "<%=request.getContextPath()%>/insert.do">상품추가</a>)</h2>
		<table border="1">
			<tr class = "header">
				<th width="100">상품 ID</th>
				<th width="200">상품명</th>
				<th width="100">상품 가격</th>
			</tr>
			<!-- controller의 list key 출력 -->
			<c:forEach items="${list}" var="row">
				<tr class ="record">
					<td align="center">${row.item_id}</td>
					<td align="center"><a href="/content.do?item_id=${row.item_id}">${row.item_name}</a></td>
					<td align="center">${row.item_price}원</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<a href ="<%=request.getContextPath()%>/">
			<input type="button" value="뒤로가기">
		</a>
		
	</div>
</body>
</html>
