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
		<form method="POST">
			<input type="text" name="brand" placeholder="브랜드명"/>
			<input type="text" name="productName" placeholder="상품명"/>
			<input type="text" name="price" placeholder="가격"/>
			<input type="text" name="discount" placeholder="할인율"/>
			<input type="submit" value="등록s"/>
		</form>
	</div>
	
	<a href="<c:url value="/list"/>">취소</a>

</body>
</html>