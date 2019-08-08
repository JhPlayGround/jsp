<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/resources/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Page</title>
</head>
<body>
	<div id="uList_wrap">
		<form method="post">
			<table id="ulist_t" border="1">
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이름</th>
				</tr>
				<tr>
					<td><input name="id" readonly value="${row.id}" size ="8"/></td>
					<td><input name="pwd" type = "password" value="${row.pwd}" size="8"/></td>
					<td><input name="name" value="${row.name}" size="8"></td>
				</tr>
				<tr>
					<td colspan="3" align="center">정말 삭제하시겠습니까?</td>
				</tr>
			</table>
			<div id="ulist_menu">
				<input type="button" value="목록이동" onclick="location.href='list.do'">
				<input type="submit" value="삭제">
			</div>
		</form>
	</div>
</body>
</html>
<%@ include file = "/resources/include/footer.jsp" %>