<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품  추가</title>
<script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous">
</script>
<script type="text/javascript">
	function dataCheck()
	{
		if($.trim($("#item_price").val()) =="")
		{
			alert("상품의 가격을 입력하세요.");
			$("#item_price").val("").focus();
			return false; //server data 전송 차단
		}
		if($.trim($("#item_des").val()) =="")
		{
			alert("상품의 설명을 입력하세요.");
			$("#item_des").val("").focus();
			return false;
		}
	}
</script>
</head>
<body>
	<div align ="center">
		<h2>상품  추가 폼</h2>
		<form method="post" onsubmit="return dataCheck()">
			상품 아이디 : <input id = "item_id" name = "item_id" ><br>
 			상품명 : <input id = "item_name" name = "item_name"  ><br>
			상품 가격 : <input id = "item_price" name = "item_price"><br>
			상품 설명 : <input id = "item_des" name = "item_des"><br>
			상품 이미지 : <input id = "item_pic" name = "item_pic"><br>
			<input type ="submit" value = "삽입"/>
			<input type ="reset" value = "취소"/>
		</form>
		<a href = "<%=request.getContextPath() %>/main.do">
			<input type ="button" value = "뒤로 돌아가기"/>
		</a>
	</div>
</body>
</html>