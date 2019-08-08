<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file = "/resources/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원</title>
</head>
<body>
	<div id="uList_wrap">
		<table id ="uList_t" border = "1">
			<tr>
				<th class="id">id</th>
				<th class="name">이름</th>
				<c:forEach items="${list}" var="ulist">
					<tr>
						<td align="center">${ulist.id}</td>
						<td align="center">
							<a href="/detail.do?uid=${ulist.id}">${ulist.name}</a>
						</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
		<div id="ulist_menu" align="center">
			<input type="button" value="가입" class="btn" onclick="location.href='join.do'">
		</div>
	</div>
</body>
</html>
<%@ include file = "/resources/include/footer.jsp" %>