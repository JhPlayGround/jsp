<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form page</title>
</head>
<body>
	<h2> 회원가입 폼</h2>
	<form method="post">
		이름 : <input type="text" name="name"/><br>
		나이 : <input type="text" name="age"/><br>
		성별 : <input type="text" name="gender"/><br>
		
		<input type="submit" name="전송"/>
		<input type="reset" name="초기화"/>
	</form>
</body>
</html>