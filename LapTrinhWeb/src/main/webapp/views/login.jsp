<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"> 
<title>Đăng nhập tài khoản</title>
<!--</head> -->

<%
// String username = "";
// Cookie[] cookies = request.getCookies();
// if (cookies != null) {
// 	for (Cookie cookie : cookies) {
// 		if (cookie.getName().equals("username")) {
// 	username = cookie.getValue();
// 	break;
// 		}
// 	}
// }

String username = "";
Cookie[] cookies = request.getCookies();
Boolean remember = (Boolean) request.getAttribute("remember");
if ((remember != null && remember == false)) {
	return;
} else if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("username")) {
	username = cookie.getValue();
	break;
		}
	}
}

String password = "";
Cookie[] passwordCookies = request.getCookies();
Boolean rememberPassword = (Boolean) request.getAttribute("remember");
if ((rememberPassword != null && rememberPassword == false)) {
	return;
} else if (passwordCookies != null) {
	for (Cookie cookie : passwordCookies) {
		if (cookie.getName().equals("password")) {
	password = cookie.getValue();
	break;
		}
	}
}
%>


<body> 
	<header class="row">
		<div class="col">
			<div class="alert alert-primary col" align="center">
				<h1>LogIn</h1>
			</div>
		</div>
	</header>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-12 col-md-5">
				<form action="${pageContext.request.contextPath}/login"
					method="post">
					<c:if test="${alert != null}">
						<label class="alert alert-danger">${alert}</label>
					</c:if>

					<div class="form-group">
						<label for="username">Username:</label> <input type="text"
							id="username" name="username" class="form-control"
							value="<%=username%>" />
						<%-- 							${username != null ? username : ''} --%>
					</div>

					<div class="form-group">
						<label for="password">Password: </label> <input type="password"
							id="password" name="password" class="form-control"
							value="<%=password%>" />
					</div>

					<div class="form-group mt-3" align="center">
						<input type="checkbox" value="on" id="remember" name="remember"
							<%=(username != null && !username.isEmpty()) ? "checked" : ""%> />
						<label for="remember">Remember</label>
					</div>

					<div class="form-group mt-3" align="center">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>

					<div class="form-group mt-3" align="center">
						<button type="button" class="btn btn-secondary"
							onclick="window.location.href='${pageContext.request.contextPath}/register'">Register</button>
					</div>

					<div class="form-group mt-3" align="center">
						<a href="${pageContext.request.contextPath}/forgetPassword"
							class="btn btn-link">Forget Password?</a>
					</div>

				</form>
			</div>
		</div>
	</div>
</body> 
</html> 
