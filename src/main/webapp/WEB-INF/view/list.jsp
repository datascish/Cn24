<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="list" items="${productList }">
	<div>
	 	<p>----------------------------------</p>
		<p>
			<a href="<c:url value="/detail?id=${list.id}"/>">${list.productName}</a>
			${list.price * ((100 - list.discount)/100)}
		</p>
	</div>
	
	</c:forEach>
	
	<a href="<c:url value="/regist"/>"   >등록</a>

</body>
</html>