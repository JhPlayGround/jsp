<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 화면</title>
<link rel="stylesheet" type="text/css" href="/resource/css/content.css">
</head>
<body>
	<div align="center">
		<h2 id="title">상품 상세 화면</h2>
		<table>
			<tr>
				<td><img src="/resource/img/${row.item_pic}" width="100"/></td>
				<td align="center">
					<table>
                  		<tr>
                     		<th> 상품명  </th>
                     		<td> ${row.item_name } </td>
                  		</tr>
                  		<tr>
                    		 <th> 상품 가격  </th>
                     		<td> ${row.item_price } </td>
                  		</tr>
                  		<tr>
                     		<th> 상품 설명  </th>
                     		<td> ${row.item_des } </td>
                  		</tr>
                  		<tr>
                     		<td colspan="2">
                        		<a href="<%=request.getContextPath() %>/main.do">
                           			<input type="button" value="목록이동" class="btn">
                        		</a>
                        		<button onclick="location.href='update/${row.item_id}'">수정</button>
                        		<button onclick="location.href='delete/${row.item_id}'">삭제</button>
                     		</td>
                  		</tr>
               		</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>

<!-- 
<p> 선택된 item_id : ${row.item_id}</p>
		<p> 선택된 상품명 : ${row.item_name}</p>
		<p> 상품이미지 : </p>
		
		<p>상품 상세 설명 : ${row.item_des}</p>
		
-->