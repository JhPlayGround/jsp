<%@ page contentType="text/html; charset=UTF-8"%>

<body>
	<div align="center"> 
		<h2> 게시글 상세보기 </h2>
	</div>
	<div class="container">
		<div class="form-group">
			<label>글제목</label>
	        <p>${detail.subject}</p>
	      </div>
	      <div class="form-group">
			<label>작성자</label>
			<p>${detail.writer}</p>
	      </div>
	      <div class="form-group">
			<label>작성날짜</label>
	        <p>${detail.reg_date}</p>
	      </div>	                    
	      <div class="form-group">
	        <label>내용</label>
	        <p>${detail.content}</p>
	      </div>
	      <div class="form-group">
	        <label>첨부 파일</label>
	        <p><a href="/fileDown/${files.bno}">${files.fileOriginName}</a></p>
	      </div>
	      <button class="btn btn-primary" onclick="location.href='/list'">목록</button>
	      <button class="btn btn-primary" onclick="location.href='/update/${detail.bno}'">수정</button>	     
	      <button class="btn btn-danger" onclick="location.href='/delete/${detail.bno}'">삭제</button>	     	      
	</div>
	<%@ include file="bootstrap.jsp" %>
</body>
</html>

