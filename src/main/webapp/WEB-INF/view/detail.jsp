<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>------------------------------------</p>
		<div>
			${detail.brand}
		</div>
		<p>------------------------------------</p>
		<div>
			${detail.productName}
		</div>
		<p>------------------------------------</p>
		<div>
			<p>${detail.discount}% ${detail.price}원</p>
			<p>${detail.price * (100-detail.discount)/100}원 즉시할인가</p>
		</div>
		<p>------------------------------------</p>
		<div>
			<a href="<c:url value ="/list" />"> [목록으로] </a> 	
			<a href="<c:url value ="/remove?id=${detail.id}" />"> [삭제] </a> 	
		</div>
	
	
	
	
	
	</div>
</body>
</html>