<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix= "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<%@include file = "/commons/web/header.jsp" %>
	</div>
	<div>
	<sitemesh:write property="body"/>
	</div>
	<div>
	<%@include file = "/commons/web/footer.jsp" %>
	</div>
	
	
	
</body>
</html>