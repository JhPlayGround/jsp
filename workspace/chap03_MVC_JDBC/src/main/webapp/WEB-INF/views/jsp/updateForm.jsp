<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
<link rel="stylesheet" type="text/css" href="/resource/css/content.css">
</head>
<body>
	<div align="center">
		<h2 id="title">상품 수정 화면</h2>
		<form method="post" action="/updatePro">
			<table>
				<tr>
            		<th> 상품명  </th>
            		<td> <input name="item_name" value="${row.item_name}"/></td>
       	    	</tr>
       	    	<tr>
            		<th> 상품 가격</th>
            		<td> <input name="item_price" value="${row.item_price}"/></td>
            	</tr>
            	<tr>
            		<th> 상품 설명  </th>
            		<td> <input name="item_des" value="${row.item_des}"/></td>
            	</tr>    		
				<tr>
					<td colspan="2">
						<input type="hidden" name="item_id" value = "${row.item_id}"/>
						<input type="hidden" name="item_pic" value = "${row.item_pic}"/>
						<a href="<%=request.getContextPath() %>/main.do">
							<input type="button" value="목록이동" class="btn">
						</a>
						<input type="submit" value="수정완료">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>