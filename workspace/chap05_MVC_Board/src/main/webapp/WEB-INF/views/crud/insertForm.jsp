<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Form</title>
<!-- Jquery library 추가 -->
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
function insertCheck()
{	
    // Jquery 이용 공백 체트 
	if($.trim($("#subject").val())=="")
		{
		alert("제목을 입력하세요!");
		$("#subject").val("").focus();
		return false;
	}
	
	if($.trim($("#writer").val())=="")
		{
		alert("작성자를 입력하세요!");
		$("#writer").val("").focus();
		return false;
	}
	
	if($.trim($("#content").val())=="")
		{
		alert("내용을 입력하세요!");
		$("#content").val("").focus();
		return false;
	}
	return true; // submit 전송 
}
</script>

</head>
<body>
	<div align="center">
  		<h2> 게시글 작성 </h2>
  	</div>
	<div class="container">	    
	    <form action="/insertPro" method="post" onsubmit="return insertCheck()" enctype="multipart/form-data"> 
	      <div class="form-group">
	        <label for="subject">제목</label>
	        <input type="text" class="form-control" id="subject" name="subject" placeholder="제목을 입력하세요."/>
	      </div>
	      <div class="form-group">
	        <label for="writer">작성자</label>
	        <input type="text" class="form-control" id="writer" name="writer" placeholder="작성자를 입력하세요."/>
	      </div>
	      <div class="form-group">
	        <label for=content>내용</label>
	        <textarea class="form-control" id="content" name="content" rows="3" placeholder="내용을 입력하세요."></textarea>
	      </div>
	      <input type="file" id="files" name="files">
	      <button type="submit" class="btn btn-primary">작성</button>
	    </form>
	</div>
	<%@ include file="bootstrap.jsp" %>
</body>