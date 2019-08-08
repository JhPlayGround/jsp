<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/resources/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<div id="uList_wrap">
		<h2>회원 가입 폼</h2>
		<form method="post">
			<table id="ulist_t" border="1">
				<tr>
					<th>아이디 <input name="id"/></th>
				</tr>
				<tr>
					<th>비빌번호 <input name="pwd"/></th>
				</tr>
				<tr>
					<th>이름 <input name="name"/></th>
				</tr>
			</table>
			<div id="ulist_menu">
				<input type="submit" value="전송" class="btn">
			</div>
		</form>
	</div>
</body>
</html>
<%@ include file = "/resources/include/footer.jsp" %>