<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update form</title>
</head>
<body>
	<div align="center">
		<h2> 게시글 수정 </h2>	 
	</div>
	<div class="container">
	    <form action="/updatePro" method="post">
	      <div class="form-group">
	        <label for="subject">글제목</label>
	        <input type="text" class="form-control" id="subject" name="subject" value="${update.subject}">
	      </div>
	      <div class="form-group">
	        <label for="content">내용</label>
	        <textarea class="form-control" id="content" name="content" rows="3">${update.content}</textarea>
	      </div>
	      <input type="hidden" name="bno" value="${update.bno}"/>
	      <button type="submit" class="btn btn-primary">수정</button>
	    </form>
	</div>	 
    <%@ include file="bootstrap.jsp" %>
</body>
</html>