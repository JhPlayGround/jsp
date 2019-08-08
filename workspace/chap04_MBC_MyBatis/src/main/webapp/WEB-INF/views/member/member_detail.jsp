<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/resources/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
</head>
<body>
	<div id="uList_wrap">
		<table id="ulist_t" border="1">
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
			</tr>
			<tr>
				<td>${row.id}</td>
				<td>${row.pwd}</td>
				<td>${row.name}</td>
			</tr>
		</table>
		<div id="ulist_menu">
			<input type="button" value="목록이동" onclick="location.href='list.do'"/>
			<input type="button" value="수정" onclick="location.href='update.do?uid=${row.id}'"/>
			<input type="button" value="삭제" onclick="location.href='delete.do?uid=${row.id}'"/>
		</div>
	</div>
</body>
</html>
<%@ include file = "/resources/include/footer.jsp" %>